package com.mycompany.ofertaacademica2;

public class Carrera {

    private String nombre;
    private String id;
    private String regimen;
    private int duracion;

    public Carrera() {
    }

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public Carrera(String nombre, String id, String regimen, int duracion) {
        this.nombre = nombre;
        this.id = id;
        this.regimen = regimen;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}