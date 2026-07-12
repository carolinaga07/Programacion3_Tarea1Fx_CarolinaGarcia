package model;

public class Paquete {

    private String Codigo;
    private String Destinatario;
    private double Peso;
    private String Destino;


    public Paquete(String codigo, String destinatario, double peso, String destino) {
        this.Codigo = codigo;
        this.Destinatario = destinatario;
        this.Peso = peso;
        this.Destino = destino;
    }


    public String getCodigo() {
        return Codigo;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public double getPeso() {
        return Peso;
    }

    public String getDestino() {
        return Destino;
    }

    @Override
    public String toString(){
        return Codigo + "-" + Destinatario + "-" + Peso + "-" + Destino;
    }
 
    
}
