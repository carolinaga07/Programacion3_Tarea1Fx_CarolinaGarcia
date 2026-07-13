package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Destino;
import model.Paquete;

public class ArchivoUtil {

    public static void guardarPaquete (Paquete paquete){
        try {
            FileWriter archivo = new FileWriter("Paquete.txt", true);
            archivo.write(paquete.getCodigo() + ";" +
             paquete.getDestinatario() + ";" +
             paquete.getPeso() + ";" +
             paquete.getDestino() + "\n");
            archivo.close();
            System.out.println("Paquete guardado en el archivo");
        } catch (Exception e) {
            System.out.println("Error al guardar el paquete: " + e.getMessage());
        }
    }

    public static void guardarDestino(String destino){
        try {
            FileWriter archivo = new FileWriter("Destino.txt", true);
            archivo.write(destino + "\n");
            archivo.close();
            System.out.println("Destino guardado en el archivo");
        } catch (Exception e) {
            System.out.println("Error al guardar el destino: " + e.getMessage());
        }
    }

    public static ArrayList<Paquete> leerListaPaquete(){
        ArrayList<Paquete> paquetes = new ArrayList<>();
        try {
            FileReader archivo = new FileReader("Paquete.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] partes = linea.split(";");

                if(partes.length == 4){
                    Paquete paquete = new Paquete(
                        partes[0], 
                        partes[1], 
                        Double.parseDouble(partes[2]), 
                        partes[3]
                    );
                    paquetes.add(paquete);
                }
                
            }

            lector.close();
            archivo.close();
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }

        return paquetes;
    }


    public static ArrayList<Destino> leerListaDestino(){
        ArrayList<Destino> destinos = new ArrayList<>();
        try {
            FileReader archivo = new FileReader("Destino.txt");
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            while ((linea = lector.readLine()) != null) {
        
                    Destino destino = new Destino(linea);
                    destinos.add(destino);
           
                
            }

            lector.close();
            archivo.close();
        } catch (IOException e) {
            System.out.println("No se pudo leer el destino: " + e.getMessage());
        }

        return destinos;
    }
    
}
