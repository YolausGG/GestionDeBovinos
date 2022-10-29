/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import clases.Padece;
import java.util.ArrayList;


/**
 *
 * @author Godoy
 */
public class dPadece {
    
    public static boolean altaPadeceFechaInicio(Padece pPadece){
        
        return persistencia.pPadece.altaPadeceFechaInicio(pPadece);
    }
    
    public static boolean altaPadece(Padece pPadece){
        
        return persistencia.pPadece.altaPadece(pPadece);
    }

    public static boolean deletePadece(Padece pPadece){
       
        return persistencia.pPadece.deletePadece(pPadece);
    }
    
     public static boolean bajaPadece(Padece pPadece){
        
        return persistencia.pPadece.bajaPadece(pPadece);
    }

    public static boolean modificarPadece(Padece pPadeceNuevo, Padece pPadeceViejo){
        
        return persistencia.pPadece.modificarPadece(pPadeceNuevo, pPadeceViejo);
    } 
    
    public static boolean modificarPadeceFechaInicio(Padece pPadeceNuevo, Padece pPadeceViejo){
        
        return persistencia.pPadece.modificarPadeceFechaInicio(pPadeceNuevo, pPadeceViejo);
    }  

    public static Padece buscarPadece(Padece pPadece){

        return persistencia.pPadece.buscarPadece(pPadece);
    }

    public static ArrayList<Padece> listarContagios(){

        return persistencia.pPadece.listarContagios();
    }
    
    public static ArrayList<Padece> listarContagiosActivos(){
        
        return persistencia.pPadece.listarContagiosActivos();
    }
    
    public static ArrayList<Padece> listarContagiosPorBovino(int idBovino){
        
        return persistencia.pPadece.listarContagiosPorBovino(idBovino);
    }
    
    public static ArrayList<Padece> listarContagiosBovinoPorEnfermedad(int idEnfermedad){
        
        return persistencia.pPadece.listarContagiosBovinoPorEnfermedad(idEnfermedad);
    }
        
}
