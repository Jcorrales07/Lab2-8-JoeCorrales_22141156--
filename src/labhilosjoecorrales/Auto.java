package labhilosjoecorrales;

import java.util.ArrayList;

public class Auto {
    public static ArrayList<Auto> autos = new ArrayList<>();
    
    private int id;
    private double distancia;
    private String nombre;

    public Auto(int id, double distancia, String nombre) {
        this.id = id;
        this.distancia = distancia;
        this.nombre = nombre;
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

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void cleanArray() {
        Auto.autos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", distancia=" + distancia + ", nombre=" + nombre + '}';
    }
    
    
}
