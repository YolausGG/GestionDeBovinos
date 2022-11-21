/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Godoy
 */
public class BovinoPosicion {
    
    private Bovino bovino;
    private int posicion;

    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public BovinoPosicion(Bovino bovino, int posicion) {
        this.bovino = bovino;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return bovino.getCaravanaBovino() + " " + posicion ;
    }
    
    
    
}
