package OfertaAcademica;

import java.io.Serializable;

public class Carrera implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private String id;
    private String regimen;
    private String duracion;

    public Carrera(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Carrera(String nombre, String id, String regimen, String duracion) {
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}