/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import clases.EstadoBovino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nico_
 */

public class pEstadoBovino {
    
     private static final String INSERT_ESTADOBOVINO_FECHA_INICIO = " INSERT INTO ESTADOBOVINO (IDESTADODELBOVINO, IDBOVINO, FECHAINICIO ) " +
            " VALUES ( ?, ?, ? )";
    private static final String INSERT_ESTADOBOVINO = " INSERT INTO ESTADOBOVINO (IDESTADODELBOVINO, IDBOVINO, FECHAINICIO, FECHAFINALIZACION ) " +
            " VALUES ( ?, ?, ?, ? )";
    private static final String DELETE_ESTADOBOVINO = "DELETE FROM ESTADOBOVINO WHERE IDESTADODELBOVINO = ? AND IDBOVINO = ? AND FECHAINICIO = ? ";
    private static final String BAJA_ESTADOBOVINO = "UPDATE ESTADOBOVINO SET FECHAFINALIZACION = CURDATE() " +
            " WHERE IDESTADODELBOVINO = ? AND IDBOVINO = ? AND FECHAINICIO = ?";
    private static final String UPDATE_ESTADOBOVINO= "UPDATE ESTADOBOVINO SET IDESTADODELBOVINO = ?, IDBOVINO = ?, FECHAINICIO = ?, FECHAFINALIZACION = ? " +
            " WHERE IDESTADODELBOVINO = ? AND IDBOVINO = ? AND FECHAINICIO = ?";
    private static final String BUSCAR_ESTADOBOVINO = "SELECT * FROM ESTADOBOVINO WHERE IDESTADODELBOVINO = ? AND IDBOVINO = ? AND FECHAINICIO = ?";
    private static final String LISTAR_ESTADOBOVINO = "SELECT * FROM ESTADOBOVINO";
    private static final String LISTAR_ESTADOBOVINO_BOVINO = "SELECT * FROM ESTADOBOVINO "+
            " WHERE IDBOVINO = ?";
    private static final String LISTAR_ESTADOBOVINO_ESTADO = "SELECT * FROM ESTADOBOVINO "+
            " WHERE IDESTADODELBOVINO = ?";
    
    public static boolean altaEstadoBovinoFechaInicio(EstadoBovino pEstadoBovino){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_ESTADOBOVINO_FECHA_INICIO);
            statement.setInt(1, pEstadoBovino.getIdEstadoDelBovino());
            statement.setInt(2, pEstadoBovino.getIdBovino());
            statement.setDate(3, (java.sql.Date) pEstadoBovino.getFechaInicio());

            int retorno = statement.executeUpdate();

            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
    public static boolean altaEstadoBovino(EstadoBovino pEstadoBovino){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_ESTADOBOVINO);
            statement.setInt(1, pEstadoBovino.getIdEstadoDelBovino());
            statement.setInt(2, pEstadoBovino.getIdBovino());
            statement.setDate(3, (java.sql.Date) pEstadoBovino.getFechaInicio());
            statement.setDate(4, (java.sql.Date) pEstadoBovino.getFechaFinalizacion());
            int retorno = statement.executeUpdate();

            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean bajaEstadoBovino(EstadoBovino pEstadoBovino){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BAJA_ESTADOBOVINO);
            statement.setInt(1, pEstadoBovino.getIdEstadoDelBovino());
            statement.setInt(2, pEstadoBovino.getIdBovino());
            statement.setDate(3, (java.sql.Date) pEstadoBovino.getFechaInicio());
            
            int retorno = statement.executeUpdate();
            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
     
    public static boolean deleteEstadoBovino(EstadoBovino pEstadoBovino){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_ESTADOBOVINO);
            statement.setInt(1, pEstadoBovino.getIdEstadoDelBovino() );
            statement.setInt(2, pEstadoBovino.getIdBovino());
            statement.setDate(3, (java.sql.Date) pEstadoBovino.getFechaInicio());

            int retorno = statement.executeUpdate();
            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } 

    public static boolean modificarEstadoBovino(EstadoBovino pEstadoBovinoNuevo, EstadoBovino pEstadoBovinoViejo){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_ESTADOBOVINO);
            statement.setInt(1, pEstadoBovinoNuevo.getIdEstadoDelBovino());
            statement.setInt(2, pEstadoBovinoNuevo.getIdBovino());
            statement.setDate(3, (java.sql.Date) pEstadoBovinoNuevo.getFechaInicio());
            statement.setDate(4, (java.sql.Date) pEstadoBovinoNuevo.getFechaFinalizacion());
            statement.setInt(5, pEstadoBovinoViejo.getIdEstadoDelBovino());
            statement.setInt(6, pEstadoBovinoViejo.getIdBovino());
            statement.setDate(7, (java.sql.Date) pEstadoBovinoViejo.getFechaInicio());

            int retorno = statement.executeUpdate();
            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static EstadoBovino buscarEstadoBovino(EstadoBovino pEstadoBovino){

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_ESTADOBOVINO);
            statement.setInt(1, pEstadoBovino.getIdEstadoDelBovino());
            statement.setInt(2, pEstadoBovino.getIdBovino());
            statement.setDate(3, (java.sql.Date) pEstadoBovino.getFechaInicio());

            ResultSet resultado = statement.executeQuery();
            EstadoBovino estadoBobino = null;
            if(resultado.next()){
                estadoBobino = getEstadoBovinoFromResultSet(resultado);
            }
            return estadoBobino;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static ArrayList<EstadoBovino> listarEstadosBovino(){

        ArrayList<EstadoBovino> listaEstadoBovino = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ESTADOBOVINO);
            ResultSet resultado = statement.executeQuery();
            EstadoBovino estadoBovino = null;
            
            while (resultado.next()) {
                estadoBovino = getEstadoBovinoFromResultSet(resultado);
                listaEstadoBovino.add(estadoBovino);
            }
            return listaEstadoBovino;

        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static ArrayList<EstadoBovino> listarEstadosBovinoPorBovino(int idBovino){
        
        ArrayList<EstadoBovino> listaEstadosBovino = new ArrayList<>();
        try {
            
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ESTADOBOVINO_BOVINO);
            statement.setInt(1, idBovino);
            ResultSet resultado = statement.executeQuery();
            EstadoBovino estadoBovino = null;
            
            while (resultado.next()) {
                estadoBovino = getEstadoBovinoFromResultSet(resultado);
                listaEstadosBovino.add(estadoBovino);
            }
            return listaEstadosBovino;

        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
               
    }
     
    public static ArrayList<EstadoBovino> listarEstadosBovinoPorEstado(int idEstadoDelBovino){
        
        ArrayList<EstadoBovino> listaEstadosBovino = new ArrayList<>();
        try {
            
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_ESTADOBOVINO_ESTADO);
            statement.setInt(1, idEstadoDelBovino);
            ResultSet resultado = statement.executeQuery();
            EstadoBovino estadoBovino = null;
            
            while (resultado.next()) {
                estadoBovino = getEstadoBovinoFromResultSet(resultado);
                listaEstadosBovino.add(estadoBovino);
            }
            return listaEstadosBovino;

        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
               
    }
    
    private static EstadoBovino getEstadoBovinoFromResultSet(ResultSet resultado) throws SQLException {

        int idEstadoDelBovino = resultado.getInt("IDESTADODELBOVINO");
        int idBovino = resultado.getInt("IDBOVINO");
        Date fechaInicio = (java.util.Date)resultado.getDate("FECHAINCIO");
        Date fechaFinalizacion = (java.util.Date)resultado.getDate("FECHAINCIO");
        

        EstadoBovino estadoBovino = new EstadoBovino (idEstadoDelBovino, idBovino, fechaInicio, fechaFinalizacion);
        return estadoBovino;
    }
}
