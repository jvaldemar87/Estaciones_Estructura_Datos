/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author np002
 */
public class Estacion {
    private int IDMaestro, ID, tipo;
    private String Nombre, PInteres;

    public int getIDMaestro() {
        return IDMaestro;
    }

    public int getID() {
        return ID;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPInteres() {
        return PInteres;
    }

    public void setIDMaestro(int IDMaestro) {
        this.IDMaestro = IDMaestro;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPInteres(String PInteres) {
        this.PInteres = PInteres;
    }

    public Estacion() {
    }

    public Estacion(int IDMaestro, int ID, int tipo, String Nombre, String PInteres) {
        this.IDMaestro = IDMaestro;
        this.ID = ID;
        this.tipo = tipo;
        this.Nombre = Nombre;
        this.PInteres = PInteres;
    } 
}
