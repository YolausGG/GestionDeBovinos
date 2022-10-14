/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Godoy
 */
public class Parentesco {
    
    private Bovino bovinoHijo;
    private Bovino bovinoPadre;
    private String parentesco;

    public Bovino getBovinoHijo() {
        return bovinoHijo;
    }
    public void setBovinoHijo(Bovino bovinoHijo) {
        this.bovinoHijo = bovinoHijo;
    }

    public Bovino getBovinoPadre() {
        return bovinoPadre;
    }
    public void setBovinoPadre(Bovino bovinoPadre) {
        this.bovinoPadre = bovinoPadre;
    }

    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Parentesco(Bovino bovinoHijo, Bovino bovinoPadre, String parentesco) {
        this.bovinoHijo = bovinoHijo;
        this.bovinoPadre = bovinoPadre;
        this.parentesco = parentesco;
    }
        
}
