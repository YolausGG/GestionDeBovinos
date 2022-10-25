package presentacion;

import clases.EstadoDelBovino;
import clases.Raza;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class PrincipalPrueba {
    
    public static void main(String[] args) throws ParseException {
        Raza holando = new Raza(1,"Holando");
        ArrayList<EstadoDelBovino> estadoDelBovinos = new ArrayList<>();
        String fechaS = "21/06/2021";

        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Date fechaDate = formato.parse(fechaS);

        System.out.println(fechaDate);

        
        
        //Hembra hembra1 = new Hembra(1,"2030",fechaDate,holando);

       // Produccion produccion1 = new Produccion(10.20,8.2,4.2,2.3,200300,fechaDate,hembra1);

        //System.out.println(produccion1);

       // System.out.println(hembra1.getClass().getSimpleName());
        
        LocalDate fecha5 = LocalDate.now();
        System.out.println(fecha5);
    }
}
