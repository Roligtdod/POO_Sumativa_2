package model;

import java.util.ArrayList;

public class Trabajadores {
    private String id;
    private String nombre;
    private String apellido;
    private String cargo;
    private ArrayList<Tour> tourslist = new ArrayList<>();

    public Trabajadores(){} // constuctor vacio, permite crear un trabajador pidiendole datos al usuario
    public Trabajadores(String nombre, String apellido, String cargo, String id){

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.tourslist = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Tour> getTourslist() {
        return tourslist;
    }

    public void addTour(Tour tour){
        tourslist.add(tour);
    }

    public void removeTour(Tour tour){
        tourslist.remove(tour);
    }

}

