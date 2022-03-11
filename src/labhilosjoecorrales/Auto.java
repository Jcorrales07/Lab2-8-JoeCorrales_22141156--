package labhilosjoecorrales;

import java.util.ArrayList;

public class Auto {
    public static ArrayList<Auto> autos = new ArrayList<>();
    
    private int id;
    private int RGB;
    private long distancia;
    private String nombre;
    private String tipo;

    public Auto(int id, int RGB, long distancia, String nombre, String tipo) {
        this.id = id;
        this.RGB = RGB;
        this.distancia = distancia;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public static ArrayList<Auto> getAutos() {
        return autos;
    }

    public static void setAutos(ArrayList<Auto> autos) {
        Auto.autos = autos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getRGB() {
        return id;
    }

    public void setRGB(int RGB) {
        this.RGB = RGB;
    }

    public long getDistancia() {
        return distancia;
    }

    public void setDistancia(long distancia) {
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static void cleanArray() {
        Auto.autos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", distancia=" + distancia + ", nombre=" + nombre + '}';
    }
    
    
}
