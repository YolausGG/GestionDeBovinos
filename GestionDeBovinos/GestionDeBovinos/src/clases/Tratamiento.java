package clases;

import java.util.Date;

public class Tratamiento {

    private int idTratamiento;
    private Bovino bovino;
    private Enfermedad enfermedad;
    private String detalle;
    private Date fechaInicio;
    private Date fechaFinalizacion;

    public int getIdTratamiento() {
        return idTratamiento;
    }
    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public Bovino getBovino() {
        return bovino;
    }
    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }
    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }
    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "idTratamiento=" + idTratamiento +
                ", bovino=" + bovino +
                ", enfermedad=" + enfermedad +
                ", detalle='" + detalle + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinalizacion=" + fechaFinalizacion +
                '}';
    }

    public Tratamiento(int idTratamiento, Bovino bovino, Enfermedad enfermedad, String detalle, Date fechaInicio, Date fechaFinalizacion) {
        this.idTratamiento = idTratamiento;
        this.bovino = bovino;
        this.enfermedad = enfermedad;
        this.detalle = detalle;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }
    public Tratamiento(Bovino bovino, Enfermedad enfermedad, String detalle, Date fechaInicio, Date fechaFinalizacion) {
        this.bovino = bovino;
        this.enfermedad = enfermedad;
        this.detalle = detalle;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    
}
