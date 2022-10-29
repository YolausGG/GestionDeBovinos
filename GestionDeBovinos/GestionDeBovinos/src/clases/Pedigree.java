/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


/**
 *
 * @author Godoy
 */
public class Pedigree {
    
    private Bovino bovino;
    private String numeroPedigree;

    public Bovino getBovino() {
        return bovino;
    }
    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }

    public String getNumeroPedigree() {
        return numeroPedigree;
    }
    public void setNumeroPedigree(String numeroPedigree) {
        this.numeroPedigree = numeroPedigree;
    }

    @Override
    public String toString() {
        return "Pedigree{" + "bovino=" + bovino + ", numeroPedigree=" + numeroPedigree + '}';
    }

    public Pedigree(Bovino bovino, String numeroPedigree) {
        this.bovino = bovino;
        this.numeroPedigree = numeroPedigree;
    }
    
}
