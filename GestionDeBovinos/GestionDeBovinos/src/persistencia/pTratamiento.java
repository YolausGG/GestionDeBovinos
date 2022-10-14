package persistencia;

import clases.Bovino;
import clases.Enfermedad;
import clases.Tratamiento;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class pTratamiento {

    private static final String INSERT_TRATAMIENTO_FECHA_INICIO = "INSERT INTO TRATAMIENTO (IDBOVINO, IDENFERMEDAD, DETALLE, FECHAINICIO) " +
            " VALUES ( ?, ?, ?, ? )";
    private static final String INSERT_TRATAMIENTO = "INSERT INTO TRATAMIENTO (IDBOVINO, IDENFERMEDAD, DETALLE, FECHAINICIO, FECHAFINALIZACION) " +
            " VALUES ( ?, ?, ?, ?, ? )";
    private static final String DELETE_TRATAMIENTO = "DELETE FROM TRATAMIENTO WHERE IDTRATAMIENTO = ?";
    private static final String UPDATE_TRATAMIENTO = "UPDATE TRATAMIENTO SET IDBOVINO = ?, IDENFERMEDAD = ?, DETALLE = ?, FECHAINICIO = ? FECHAFINALIZACION = ? "+
            " WHERE IDTRATAMIENTO = ? ";
    private static final String BUSCAR_TRATAMIENTO = "SELECT * FROM TRATAMIENTO WHERE IDTRATAMIENTO = ? ";
    private static final String LISTAR_TRATAMIENTOS = "SELECT * FROM TRATAMIENTO";
    private static final String LISTAR_TRATAMIENTOS_BOVINO = "SELECT * FROM TRATAMIENTO WHERE IDBOVINO = ?";
    private static final String LISTAR_TRATAMIENTOS_ACTIVOS = "SELECT * FROM TRATAMINETO " +
            "WHERE FECHAINICIO <= CURDATE() AND FECHAFINALIZACION >= CURDATE()";

    public static boolean altaTratamientoFechaInicio(Tratamiento pTratamiento){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_TRATAMIENTO_FECHA_INICIO);
            statement.setInt(1, pTratamiento.getBovino().getIdBovino());
            statement.setInt(2, pTratamiento.getEnfermedad().getIdEnfermedad());
            statement.setString(3, pTratamiento.getDetalle());
            statement.setDate(4, (java.sql.Date)pTratamiento.getFechaInicio());

            int retorno = statement.executeUpdate();

            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean altaTratamiento(Tratamiento pTratamiento){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(INSERT_TRATAMIENTO);
            statement.setInt(1, pTratamiento.getBovino().getIdBovino());
            statement.setInt(2, pTratamiento.getEnfermedad().getIdEnfermedad());
            statement.setString(3, pTratamiento.getDetalle());
            statement.setDate(4, (java.sql.Date)pTratamiento.getFechaInicio());
            statement.setDate(5, (java.sql.Date)pTratamiento.getFechaFinalizacion());

            int retorno = statement.executeUpdate();

            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean bajaTratamiento(int idTratamiento){
        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(DELETE_TRATAMIENTO);
            statement.setInt(1, idTratamiento);

            int retorno = statement.executeUpdate();
            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarTratamiento(Tratamiento pTratamiento){

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(UPDATE_TRATAMIENTO);
            statement.setInt(1, pTratamiento.getBovino().getIdBovino());
            statement.setInt(2, pTratamiento.getEnfermedad().getIdEnfermedad());
            statement.setString(3, pTratamiento.getDetalle());
            statement.setDate(4, (java.sql.Date)pTratamiento.getFechaInicio());
            statement.setDate(5, (java.sql.Date)pTratamiento.getFechaFinalizacion());
            statement.setInt(6, pTratamiento.getIdTratamiento());

            int retorno = statement.executeUpdate();
            return retorno>0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Tratamiento buscarTratamiento(int idTratamiento){

        try {
            PreparedStatement statement = Conexion.getConnection().prepareStatement(BUSCAR_TRATAMIENTO);
            statement.setInt(1, idTratamiento);

            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento = null;
            if(resultado.next()){
                tratamiento = getTratamientoFromResultSet(resultado);
            }
            return tratamiento;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<Tratamiento> listarTratamientos(){

        ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TRATAMIENTOS);
            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento;


            while (resultado.next()) {
                tratamiento = getTratamientoFromResultSet(resultado);
                listaTratamientos.add(tratamiento);
            }
            return listaTratamientos;

        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static ArrayList<Tratamiento> listarTratamientosActivos(){

        ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TRATAMIENTOS_ACTIVOS);
            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento;


            while (resultado.next()) {
                tratamiento = getTratamientoFromResultSet(resultado);
                listaTratamientos.add(tratamiento);
            }
            return listaTratamientos;

        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static ArrayList<Tratamiento> listarTratamientosBovino(int idBovino){

        ArrayList<Tratamiento> listaTratamientos = new ArrayList<>();
        try {
            PreparedStatement statement = Conexion.getConnection().prepareCall(LISTAR_TRATAMIENTOS_BOVINO);
            statement.setInt(1, idBovino);
            ResultSet resultado = statement.executeQuery();
            Tratamiento tratamiento;

            while (resultado.next()) {
                tratamiento = getTratamientoFromResultSet(resultado);
                listaTratamientos.add(tratamiento);
            }
            return listaTratamientos;

        }catch(SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Tratamiento getTratamientoFromResultSet(ResultSet resultado) throws SQLException {

        int idBovino = resultado.getInt("IDBOVINO");
        Bovino bovino = pBovino.buscarBovinoId(idBovino);

        int idEnfermedad = resultado.getInt("IDENFERMEDAD");
        Enfermedad enfermedad = pEnfermedad.buscarEnfermedad(idEnfermedad);

        String detalle = resultado.getString("DETALLE");
        Date fechaInicio = resultado.getDate("FECHAINICIO");
        Date fechaFinalizacion = resultado.getDate("FECHAFINALIZACION");


        Tratamiento tratamiento = new Tratamiento (bovino, enfermedad, detalle, fechaInicio, fechaFinalizacion);
        return tratamiento;
    }
    
}
