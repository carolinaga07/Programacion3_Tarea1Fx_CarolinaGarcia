package model;

public class Destino {

    private String Nombre;

    public Destino(String nombre) {
        this.Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    @Override
    public String toString(){
        return Nombre;
    }
    
}
