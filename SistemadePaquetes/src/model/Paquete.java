package model;

public class Paquete {

    private int Codigo;
    private String Destinatario;
    private double Peso;
    private String Destino;


    public Paquete(int codigo, String destinatario, double peso, String destino) {
        Codigo = codigo;
        Destinatario = destinatario;
        Peso = peso;
        Destino = destino;
    }


    public int getCodigo() {
        return Codigo;
    }


    public void setCodigo(int codigo) {
        Codigo = codigo;
    }


    public String getDestinatario() {
        return Destinatario;
    }


    public void setDestinatario(String destinatario) {
        Destinatario = destinatario;
    }


    public double getPeso() {
        return Peso;
    }


    public void setPeso(double peso) {
        Peso = peso;
    }


    public String getDestino() {
        return Destino;
    }


    public void setDestino(String destino) {
        Destino = destino;
    }

    

    
    
}
