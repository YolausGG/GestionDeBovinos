package dominio;

import clases.Aborto;
import clases.BajaLogicaBovino;
import clases.Raza;
import clases.EstadoDelBovino;
import clases.Enfermedad;
import clases.Bovino;
import clases.Celo;
import clases.EstadoBovino;
import clases.Produccion;
import clases.EventoDeSanidad;
import clases.EventoFuturo;
import clases.Hembra;
import clases.Inseminacion;
import clases.Macho;
import clases.Padece;
import clases.Parentesco;
import clases.Parto;
import clases.Pedigree;
import clases.Secado;
import clases.Tacto;
import clases.Tratamiento;

import java.util.ArrayList;
import persistencia.pParentesco;

public class dControladora {

    //private static ArrayList<Bovino> listaBovinos = new ArrayList<>();
    private static ArrayList<Tratamiento> listaTratamientos;
    private static ArrayList<Enfermedad> listaEnfermedades;
    private static ArrayList<Produccion> listaProduccionesHembra;
    private static ArrayList<EstadoDelBovino> listaEstadosDelBovino;
    private static ArrayList<EventoDeSanidad> listaEventosDeSanidad;
    private static ArrayList<Raza> listaRazas;

    // <editor-fold defaultstate="collapsed" desc="Cargar Listas">
    /* public static void cargarBovinos(){
        
        for (Macho macho : dMacho.listarMachos()) {
            
            listaBovinos.add(macho);
        }
        for (Hembra hembra : dHembra.listarHembras()) {
            
            listaBovinos.add(hembra);
        }
        
    }*/
 /*  public static void agregarBovino(Bovino pBovino){
        
        listaBovinos.add(pBovino);
    }*/
    public static void cargarRazas() {
        listaRazas = dRaza.listarRazas();
    }

    public static void cargarTratamientos() {
        listaTratamientos = dTratamiento.listarTratamientos();
    }

    public static void agregarTrataniento(Tratamiento pTratamiento) {

        listaTratamientos.add(pTratamiento);
    }

    public static void cargarEnfermedades() {
        listaEnfermedades = dEnfermedad.listarEnfermedades();
    }

    public static void agregarEnfermedad(Enfermedad penfermedad) {

        listaEnfermedades.add(penfermedad);
    }

    /*public static void cargarProducciones(){
        listaProducciones = dProduccion.listarProducciones();
    }*/
 /*public static void agregarProduccion(Produccion pProduccion){
        
        listaProducciones.add(pProduccion);
    }*/
    public static void cargarEstadosDelBovino() {
        listaEstadosDelBovino = dEstadoDelBovino.listarEstadosDelBovino();
    }

    public static void agregarEstadoDelBovino(EstadoDelBovino pEestadoDelBovino) {

        listaEstadosDelBovino.add(pEestadoDelBovino);
    }

    public static void cargarEventosDeSanidad() {

        for (Celo celo : dCelo.listarCelos()) {

            listaEventosDeSanidad.add(celo);
        }
        for (Aborto aborto : dAborto.listarAbortos()) {

            listaEventosDeSanidad.add(aborto);
        }
        for (Inseminacion inseminacion : dInseminacion.listarInseminaciones()) {

            listaEventosDeSanidad.add(inseminacion);
        }
        for (Parto parto : dParto.listarPartos()) {

            listaEventosDeSanidad.add(parto);
        }
        for (Secado secado : dSecado.listarSecados()) {

            listaEventosDeSanidad.add(secado);
        }
        for (Tacto tacto : dTacto.listarTactos()) {

            listaEventosDeSanidad.add(tacto);
        }

    }

    public static void agregarEventoDeSanidad(EventoDeSanidad pEventoDeSanidad) {

        listaEventosDeSanidad.add(pEventoDeSanidad);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Devolver Listas">
    /*public static ArrayList<EventoDeSanidad> listarEventosDeSanidad() {
        return listaEventosDeSanidad;
    }*/
    public static ArrayList<Enfermedad> listarEnfermedads() {
        return listaEnfermedades;
    }

    public static ArrayList<Bovino> listarBovinos() {

        ArrayList<Bovino> listaBovinos = new ArrayList<>();

        for (Macho macho : dMacho.listarMachos()) {

            listaBovinos.add(macho);
        }
        for (Hembra hembra : dHembra.listarHembras()) {

            listaBovinos.add(hembra);
        }
        return listaBovinos;
    }

    /* public static ArrayList<EstadoDelBovino> listarEstadosDelBovino() {
        return listaEstadosDelBovino;
    }*/
    public static ArrayList<Raza> listarRazas() {
        return listaRazas;
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Evento Futuro">
    public static boolean altaEventoFuturo(EventoFuturo pEventoFuturo) {

        return dEventoFuturo.altaEventoFuturo(pEventoFuturo);
    }

    public static boolean bajaEventoFuturo(int idEventoFuturo) {

        return dEventoFuturo.bajaEventoFuturo(idEventoFuturo);
    }

    public static boolean modificarEventoFuturo(int idEventoFuturo, EventoFuturo pEventoFuturo) {

        return dEventoFuturo.modificarEventoFuturo(idEventoFuturo, pEventoFuturo);
    }

    public static EventoFuturo buscarEventoFuturo(int idEventoFuturo) {

        return dEventoFuturo.buscarEventoFuturo(idEventoFuturo);
    }

    public static ArrayList<EventoFuturo> listarEventosFuturos() {

        return dEventoFuturo.listarEventosFuturos();
    }

    public static ArrayList<EventoFuturo> listarEventosFuturosPorCaravana(String pCaravanaHembra) {

        return dEventoFuturo.listarEventosFuturosPorCaravana(pCaravanaHembra);
    }
    // </editor-fold>

    //Todos los Eventos de Sanidad
    // <editor-fold defaultstate="collapsed" desc="EventoDeSanidad">
    public static boolean altaEventoDeSanidad(EventoDeSanidad pEventoDeSanidad) {

        return dEventoDeSanidad.altaEventoDeSanidad(pEventoDeSanidad);
    }

    public static boolean bajaEventoDeSanidad(int idEventoDeSanidad) {

        return dEventoDeSanidad.bajaEventoDeSanidad(idEventoDeSanidad);
    }

    public static boolean modificarEventoDeSanidad(int idEventoDesanidad, EventoDeSanidad pEventoDeSanidad) {

        return dEventoDeSanidad.modificarEventoDeSanidad(idEventoDesanidad, pEventoDeSanidad);
    }

    public static EventoDeSanidad buscarEventoDeSanidadId(int idEventoDeSanidad) {

        return dEventoDeSanidad.buscarEventoDeSanidadId(idEventoDeSanidad);
    }

    public static EventoDeSanidad buscarEventoDeSanidadUltimo() {

        return dEventoDeSanidad.buscarEventoDeSanidadUltimo();
    }

    public static ArrayList<EventoDeSanidad> listarEventosDeSanidad() {

        return dEventoDeSanidad.listarEventosDeSanidad();
    }

    public static ArrayList<EventoDeSanidad> listarEventosDeSanidadPorCaravana(String pCaravanaHembra) {

        return dEventoDeSanidad.listarEventosDeSanidadPorCaravana(pCaravanaHembra);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Enfermedad">  
    public static boolean altaEnfermedad(Enfermedad pEnfermedad) {

        return dEnfermedad.altaEnfermedad(pEnfermedad);
    }

    public static boolean bajaEnfermedad(int idEnfermedad) {

        return dEnfermedad.bajaEnfermedad(idEnfermedad);
    }

    public static boolean modificarEnfermedad(int idEnfermedad, Enfermedad pEnfermedad) {

        return dEnfermedad.modificarEnfermedad(idEnfermedad, pEnfermedad);
    }

    public static Enfermedad buscarEnfermedad(int idEnfermedad) {

        return dEnfermedad.buscarEnfermedad(idEnfermedad);
    }

    public static Enfermedad buscarUltimaEnfermedad() {

        return dEnfermedad.buscarUltimaEnfermedad();
    }

    public static ArrayList<Enfermedad> listarEnfermedades() {

        return dEnfermedad.listarEnfermedades();
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="EstadoDelBovino">  
    public static boolean altaEstadoDelBovino(EstadoDelBovino pEstadoDelBovino) {

        return dEstadoDelBovino.altaEstadoDelBovino(pEstadoDelBovino);
    }

    public static boolean bajaEstadoDelBovino(int idEstadoDelBovino) {

        return dEstadoDelBovino.bajaEstadoDelBovino(idEstadoDelBovino);
    }

    public static boolean modificarEstadoDelBovino(int idEstadoDelBovino, EstadoDelBovino pEstadoDelBovino) {

        return dEstadoDelBovino.modificarEstadoDelBovino(idEstadoDelBovino, pEstadoDelBovino);
    }

    public static EstadoDelBovino buscarEstadoDelBovino(int idEstadoDelBovino) {

        return dEstadoDelBovino.buscarEstadoDelBovino(idEstadoDelBovino);
    }

    public static ArrayList<EstadoDelBovino> listarEstadoDelBovino() {

        return dEstadoDelBovino.listarEstadosDelBovino();
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Aborto">
    public static boolean altaAborto(Aborto pAborto) {

        return dAborto.altaAborto(pAborto);
    }

    public static boolean bajaAborto(int idAborto) {

        return dAborto.bajaAborto(idAborto);
    }

    public static boolean modificarAborto(int idAborto, Aborto pAborto) {

        return dAborto.modificarAborto(idAborto, pAborto);
    }

    public static Aborto buscarAborto(int idAborto) {

        return dAborto.buscarAborto(idAborto);
    }

    public static ArrayList<Aborto> listarAbortos() {

        return dAborto.listarAbortos();
    }

    public static ArrayList<Aborto> listarAbortosPorCaravana(String pCaravanaHembra) {

        return dAborto.listarAbortosPorCaravana(pCaravanaHembra);
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Celo">
    public static boolean altaCelo(Celo pCelo) {

        return dCelo.altaCelo(pCelo);
    }

    public static boolean bajaCelo(int idCelo) {

        return dCelo.bajaCelo(idCelo);
    }

    public static boolean modificarCelo(int idCelo, Celo pCelo) {

        return dCelo.modificarCelo(idCelo, pCelo);
    }

    public static Celo buscarCelo(int idCelo) {

        return dCelo.buscarCelo(idCelo);
    }

    public static ArrayList<Celo> listarCelos() {

        return dCelo.listarCelos();
    }

    public static ArrayList<Celo> listarCelosPorCaravana(String pCaravanaHembra) {

        return dCelo.listarCelosPorCaravana(pCaravanaHembra);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Inseminacion">
    public static boolean altaInseminacion(Inseminacion pInseminacion) {

        return dInseminacion.altaInseminacion(pInseminacion);
    }

    public static boolean bajaInseminacion(int idInseminacion) {

        return dInseminacion.bajaInseminacion(idInseminacion);
    }

    public static boolean modificarInseminacion(int idInseminacion, Inseminacion pInseminacion) {

        return dInseminacion.modificarInseminacion(idInseminacion, pInseminacion);
    }

    public static Inseminacion buscarInseminacion(int idInseminacion) {

        return dInseminacion.buscarInseminacion(idInseminacion);
    }

    public static ArrayList<Inseminacion> listarInseminaciones() {

        return dInseminacion.listarInseminaciones();
    }

    public static ArrayList<Inseminacion> listarInseminacionesPorCaravana(String pCaravana) {

        return dInseminacion.listarInseminacionesPorCaravana(pCaravana);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Parto">
    public static boolean altaParto(Parto pParto) {

        return dParto.altaParto(pParto);
    }

    public static boolean bajaParto(int idParto) {

        return dParto.bajaParto(idParto);
    }

    public static boolean modificarParto(int idParto, Parto pParto) {

        return dParto.modificarParto(idParto, pParto);
    }

    public static Parto buscarParto(int idParto) {

        return dParto.buscarParto(idParto);
    }

    public static ArrayList<Parto> listarPartos() {

        return dParto.listarPartos();
    }

    public static ArrayList<Parto> listarPartosPorCaravana(String pCaravanaHembra) {

        return dParto.listarPartosPorCaravana(pCaravanaHembra);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Secado">
    public static boolean altaSecado(Secado pSecado) {

        return dSecado.altaSecado(pSecado);
    }

    public static boolean bajaSecado(int idSecado) {

        return dSecado.bajaSecado(idSecado);
    }

    public static boolean modificarSecado(int idSecado, Secado pSecado) {

        return dSecado.modificarSecado(idSecado, pSecado);
    }

    public static Secado buscarSecado(int idSecado) {

        return dSecado.buscarSecado(idSecado);
    }

    public static ArrayList<Secado> listarSecados() {

        return dSecado.listarSecados();
    }

    public static ArrayList<Secado> listarSecadosPorCaravana(String pCaravanaHembra) {

        return dSecado.listarSecadosPorCaravana(pCaravanaHembra);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Tacto">
    public static boolean altaTacto(Tacto pTacto) {

        return dTacto.altaTacto(pTacto);
    }

    public static boolean bajaTacto(int idTacto) {

        return dTacto.bajaTacto(idTacto);
    }

    public static boolean modificarTacto(int idTacto, Tacto pTacto) {

        return dTacto.modificarTacto(idTacto, pTacto);
    }

    public static Tacto buscarTacto(int idTacto) {

        return dTacto.buscarTacto(idTacto);
    }

    public static ArrayList<Tacto> listarTactos() {

        return dTacto.listarTactos();
    }

    public static ArrayList<Tacto> listarTactosPorCaravana(String pCaravanaHembra) {

        return dTacto.listarTactosPorCaravana(pCaravanaHembra);
    }
    // </editor-fold>

    //Relaciones
    // <editor-fold defaultstate="collapsed" desc="Padece">
    public static boolean altaPadeceFechaInicio(Padece pPadece) {

        return dPadece.altaPadeceFechaInicio(pPadece);
    }

    public static boolean altaPadece(Padece pPadece) {

        return dPadece.altaPadece(pPadece);
    }

    public static boolean deletePadece(Padece pPadece) {

        return dPadece.deletePadece(pPadece);
    }

    public static boolean bajaPadece(Padece pPadece) {

        return dPadece.bajaPadece(pPadece);
    }

    public static boolean modificarPadece(Padece pPadeceNuevo, Padece pPadeceViejo) {

        return dPadece.modificarPadece(pPadeceNuevo, pPadeceViejo);
    }

    public static boolean modificarPadeceFechaInicio(Padece pPadeceNuevo, Padece pPadeceViejo) {

        return dPadece.modificarPadeceFechaInicio(pPadeceNuevo, pPadeceViejo);
    }

    public static Padece buscarPadece(Padece pPadece) {

        return persistencia.pPadece.buscarPadece(pPadece);
    }

    public static ArrayList<Padece> listarContagios() {

        return dPadece.listarContagios();
    }

    public static ArrayList<Padece> listarContagiosActivos() {

        return dPadece.listarContagiosActivos();
    }

    public static ArrayList<Padece> listarContagiosPorBovino(int idBovino) {

        return dPadece.listarContagiosPorBovino(idBovino);
    }

    public static ArrayList<Padece> listarContagiosBovinoPorEnfermedad(int idEnfermedad) {

        return dPadece.listarContagiosBovinoPorEnfermedad(idEnfermedad);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="EstadoBovino">
    public static boolean altaEstadoBovinoFechaInicio(EstadoBovino pEstadoBovino) {

        return dEstadoBovino.altaEstadoBovinoFechaInicio(pEstadoBovino);
    }

    public static boolean altaEstadoBovino(EstadoBovino pEstadoBovino) {

        return dEstadoBovino.altaEstadoBovino(pEstadoBovino);
    }

    public static boolean bajaEstadoBovino(EstadoBovino pEstadoBovino) {

        return dEstadoBovino.bajaEstadoBovino(pEstadoBovino);
    }

    public static boolean deleteEstadoBovino(EstadoBovino pEstadoBovino) {

        return dEstadoBovino.deleteEstadoBovino(pEstadoBovino);
    }

    public static boolean modificarEstadoBovino(EstadoBovino pEstadoBovinoNuevo, EstadoBovino pEstadoBovinoViejo) {

        return dEstadoBovino.modificarEstadoBovino(pEstadoBovinoNuevo, pEstadoBovinoViejo);
    }

    public static boolean modificarEstadoBovinoFechaInicio(EstadoBovino pEstadoBovinoNuevo, EstadoBovino pEstadoBovinoViejo) {

        return dEstadoBovino.modificarEstadoBovinoFechaInicio(pEstadoBovinoNuevo, pEstadoBovinoViejo);
    }

    public static EstadoBovino buscarEstadoBovino(EstadoBovino pEstadoBovino) {

        return dEstadoBovino.buscarEstadoBovino(pEstadoBovino);
    }

    public static ArrayList<EstadoBovino> listarEstadosBovino() {

        return dEstadoBovino.listarEstadosBovino();
    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoPorBovino(int idBovino) {

        return dEstadoBovino.listarEstadosBovinoPorBovino(idBovino);
    }

    public static ArrayList<EstadoBovino> listarEstadosBovinoPorEstado(int idEstadoDelBovino) {

        return dEstadoBovino.listarEstadosBovinoPorEstado(idEstadoDelBovino);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Parentesco">
    public static boolean altaParentesco(int idBovinoHijo, int idBovinoPadre, String pParentesco) {

        return dParentesco.altaParentesco(idBovinoHijo, idBovinoPadre, pParentesco);
    }

    public static boolean bajaParentesco(int idBovinoHijo, int idBovinoPadre) {

        return dParentesco.bajaParentesco(idBovinoHijo, idBovinoPadre);
    }

    public static boolean bajaParentescos(int idBovinoPadre) {

        return dParentesco.bajaParentescos(idBovinoPadre);
    }

    public static boolean modificarParentesco(int idBovinoHijo, int idBovinoPadre, String pParentesco) {

        return dParentesco.modificarParentesco(idBovinoHijo, idBovinoPadre, pParentesco);
    }

    public static Parentesco buscarParentesco(int idBovinoHijo, int idBovinoPadre) {

        return dParentesco.buscarParentesco(idBovinoHijo, idBovinoPadre);
    }

    public static Parentesco buscarParentescoMadre(int idBovinoHijo) {

        return dParentesco.buscarParentescoMadre(idBovinoHijo);
    }

    public static Parentesco buscarParentescoPadre(int idBovinoHijo) {

        return dParentesco.buscarParentescoPadre(idBovinoHijo);
    }

    public static ArrayList<Bovino> buscarPadres(int pIdBovino) {

        return dParentesco.buscarPadres(pIdBovino);
    }

    public static ArrayList<Bovino> buscarHijos(int pIdBovino) {

        return dParentesco.buscarHijos(pIdBovino);
    }

    // </editor-fold>
    //Bovinos
    // <editor-fold defaultstate="collapsed" desc="Bovino">
    public static boolean altaBovino(Bovino pBovino) {

        return dBovino.altaBovino(pBovino);
    }

    public static boolean bajaBovino(int idBovino) {

        return dBovino.bajaBovino(idBovino);
    }

    public static boolean bajaRealBovino(int idBovino) {

        return dBovino.bajaRealBovino(idBovino);
    }

    public static boolean altaLogicaBovino(int idBovino) {

        return dBovino.altaLogicaBovino(idBovino);
    }

    public static boolean modificarBovino(Bovino pBovino) {

        return dBovino.modificarBovino(pBovino);
    }

    public static Bovino buscarBovinoCaravana(String pCaravanaBovino) {

        return dBovino.buscarBovinoCaravana(pCaravanaBovino);
    }

    public static Bovino buscarBovinoCaravanaCompleto(String pCaravanaBovino) {

        return dBovino.buscarBovinoCaravanaCompleto(pCaravanaBovino);
    }

    public static Bovino buscarBovinoId(int idBovino) {

        return dBovino.buscarBovinoId(idBovino);
    }

    public static ArrayList<Bovino> buscarBovinoCaravanaLIKE(String pCaravana) {

        return dBovino.buscarBovinoCaravanaLIKE(pCaravana);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Macho">
    public static boolean altaMacho(Macho pMacho) {

        return dMacho.altaMacho(pMacho);
    }

    public static boolean bajaMacho(int idMacho) {

        return dMacho.bajaMacho(idMacho);
    }

    public static boolean modificarMacho(Macho pMacho) {

        return dMacho.modificarMacho(pMacho);
    }

    public static Macho buscarMachoPorId(int idMacho) {

        return dMacho.buscarMachoPorId(idMacho);
    }

    public static Macho buscarMachoPorCaravana(String pCaravanaMacho) {

        return dMacho.buscarMachoPorCaravana(pCaravanaMacho);
    }

    public static Macho buscarUltimoMacho() {

        return dMacho.buscarUltimoMacho();
    }

    public static ArrayList<Macho> buscarMachosCaravanaLIKE(String pCaravana) {

        return dMacho.buscarMachosCaravanaLIKE(pCaravana);
    }

    public static ArrayList<Macho> listarMachos() {

        return dMacho.listarMachos();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Hembra">
    public static boolean altaHembra(Hembra pHembra) {

        return dHembra.altaHembra(pHembra);
    }

    public static boolean bajaHembra(int idHembra) {

        return dHembra.bajaHembra(idHembra);
    }
    //public static boolean modificarHembra(Hembra pHembra){

    //    return dHembra.modificarHembra(pHembra);
    //}
    public static Hembra buscarHembraPorId(int idHembra) {

        return dHembra.buscarHembraPorId(idHembra);
    }

    public static Hembra buscarHembraPorCaravana(String pCaravanaHembra) {

        return dHembra.buscarHembraPorCaravana(pCaravanaHembra);
    }

    public static Hembra buscarUltimaHembra() {

        return dHembra.buscarUltimaHembra();
    }

    public static ArrayList<Hembra> buscarHembrasCaravanaLIKE(String pCaravana) {

        return dHembra.buscarHembrasCaravanaLIKE(pCaravana);
    }

    public static ArrayList<Hembra> listarHembras() {

        return dHembra.listarHembras();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Pedigree">
    public static boolean altaPedigree(Pedigree pPedigree) {

        return dPedigree.altaPedigree(pPedigree);
    }

    public static boolean bajaPedigree(int idBovino) {

        return dPedigree.bajaPedigree(idBovino);
    }

    public static boolean modificarPedigree(Pedigree pPedigree) {

        return dPedigree.modificarPedigree(pPedigree);
    }

    public static Pedigree buscarPedigreeIdBovino(int idBovino) {

        return dPedigree.buscarPedigreeIdBovino(idBovino);
    }

    public static Pedigree buscarPedigreeNumeroPedigree(String numeroPedigree) {

        return dPedigree.buscarPedigreeNumeroPedigree(numeroPedigree);
    }

    public static ArrayList<Pedigree> listarPedigrees() {

        return dPedigree.listarPedigrees();
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="BajaLogicaBovino">
    public static boolean altaBajaLogicaBovino(BajaLogicaBovino pBajaLogicaBovino) {

        return dBajaLogicaBovino.altaBajaLogicaBovino(pBajaLogicaBovino);
    }

    public static BajaLogicaBovino buscarBajaLogicaBovino(int idBajaLogicaBovino) {

        return dBajaLogicaBovino.buscarBajaLogicaBovino(idBajaLogicaBovino);
    }

    public static ArrayList<BajaLogicaBovino> listarBajasLogicaBovinos() {

        return dBajaLogicaBovino.listarBajasLogicaBovinos();
    }
    // </editor-fold>

    //Demas
    // <editor-fold defaultstate="collapsed" desc="Produccion">
    public static boolean altaProduccion(Produccion pProduccion) {

        return dProduccion.altaProduccion(pProduccion);
    }

    public static boolean bajaProduccion(int idProduccion) {

        return dProduccion.bajaProduccion(idProduccion);
    }

    public static boolean modificarProduccion(Produccion pProduccion) {

        return dProduccion.modificarProduccion(pProduccion);
    }

    public static Produccion buscarProduccion(int idProduccion) {

        return dProduccion.buscarProduccion(idProduccion);
    }

    public static Produccion buscarProduccionHembra(int idHembra) {

        return dProduccion.buscarProduccionHembra(idHembra);
    }

    public static ArrayList<Produccion> listarProducciones() {

        return dProduccion.listarProducciones();
    }

    public static ArrayList<Produccion> listarProduccionesHembra(int idHembra) {

        return dProduccion.listarProduccionesHembra(idHembra);
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Tratamiento">
    public static boolean altaTratamientoFechaInicio(Tratamiento pTratamiento) {

        return dTratamiento.altaTratamientoFechaInicio(pTratamiento);
    }

    public static boolean altaTratamiento(Tratamiento pTratamiento) {

        return dTratamiento.altaTratamiento(pTratamiento);
    }

    public static boolean bajaTratamiento(int idTratamiento) {

        return dTratamiento.bajaTratamiento(idTratamiento);
    }

    public static boolean modificarTratamiento(Tratamiento pTratamiento) {

        return dTratamiento.modificarTratamiento(pTratamiento);
    }

    public static boolean modificarTratamientoFechaInicio(Tratamiento pTratamiento) {

        return dTratamiento.modificarTratamientoFechaInicio(pTratamiento);
    }

    public static Tratamiento buscarTratamiento(int idTratamiento) {

        return dTratamiento.buscarTratamiento(idTratamiento);
    }

    public static ArrayList<Tratamiento> listarTratamientosActivos() {

        return dTratamiento.listarTratamientosActivos();
    }

    public static ArrayList<Tratamiento> listarTratamientos() {
        return dTratamiento.listarTratamientos();
    }

    public static ArrayList<Tratamiento> listarTratamientosBovino(int idBovino) {

        return dTratamiento.listarTratamientosBovino(idBovino);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Copia">
    // </editor-fold>
    
    
    
    public static ArrayList<Bovino> parentescos_Hermanos_Sobrinos_SobrinoNieto(int contador, Bovino bovino, ArrayList<Bovino> hijos) {

        System.out.println(contador);
        if (!enLista(bovino, hijos)) {
            hijos.add(bovino);
        }

        ArrayList<Bovino> bovinosHijos = buscarHijos(bovino.getIdBovino());

        if (contador >= 3 || bovinosHijos.size() < 1) {
            return hijos;
        } else {

            for (Bovino bovinoHijo : bovinosHijos) {
                
                if (enLista(bovinoHijo, parentescos_Hermanos_Sobrinos_SobrinoNieto(contador+1,bovinoHijo,hijos))) {
                    
                }
            }
        }
        return hijos;

    }

    public static ArrayList<Bovino> arbolGenealogico(int contador, Bovino bovino, ArrayList<Bovino> arbolGenealogico) {

        ArrayList<Bovino> bovinosFinal = new ArrayList();

        if (!enLista(bovino, arbolGenealogico)) {
            arbolGenealogico.add(bovino);
        }
        if (contador >= 3 || bovino.getPadre() == null && bovino.getMadre() == null) {
            return arbolGenealogico;
        } else {
            if (bovino.getPadre() != null && contador <= 3) {
                Bovino padre = buscarBovinoCaravanaCompleto(bovino.getPadre().getCaravanaBovino());
                bovinosFinal = arbolGenealogico(contador + 1, padre, arbolGenealogico);
            }

            if (bovino.getMadre() != null && contador <= 3) {
                Bovino madre = buscarBovinoCaravanaCompleto(bovino.getMadre().getCaravanaBovino());
                bovinosFinal = arbolGenealogico(contador + 1, madre, arbolGenealogico);
            }
        }
        return bovinosFinal;

    }
    
    public static ArrayList<Bovino> noApareables(int contador, Bovino bovino, ArrayList<Bovino> noApareables) {

        ArrayList<Bovino> bovinosFinal = new ArrayList<Bovino>();

        if (!enLista(bovino, noApareables)) {
            
            int contadorHijos = contador*-1;
            ArrayList<Bovino> hijos = parentescos_Hermanos_Sobrinos_SobrinoNieto(contadorHijos, bovino, new ArrayList<Bovino>());
            if(hijos.size() > 0){
                for (Bovino hijo : hijos) {
                    if(!enLista(hijo, noApareables)){
                        noApareables.add(hijo);
                    }
                }
                
            }
        }
        if (contador >= 3 || bovino.getPadre() == null && bovino.getMadre() == null) {
            return noApareables;
        } else {
            if (bovino.getPadre() != null && contador <= 3) {
                Bovino padre = buscarBovinoCaravanaCompleto(bovino.getPadre().getCaravanaBovino());
                bovinosFinal = noApareables(contador + 1, padre, noApareables);
            }

            if (bovino.getMadre() != null && contador <= 3) {
                Bovino madre = buscarBovinoCaravanaCompleto(bovino.getMadre().getCaravanaBovino());
                bovinosFinal = noApareables(contador + 1, madre, noApareables);
            }
        }
        return bovinosFinal;

    }

    public static boolean enLista(Bovino pBovino, ArrayList<Bovino> enLista) {

        for (Bovino bovino : enLista) {

            if (bovino.getCaravanaBovino().equals(pBovino.getCaravanaBovino())) {
                return true;
            }
        }
        return false;
    }
}
