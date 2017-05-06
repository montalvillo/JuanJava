
import java.text.SimpleDateFormat;
import java.util.Date;




public class Fecha {
    public static String  fechaActual(){
        
        Date fecha = new Date();
       
     SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
       
        
       return formatoFecha.format(fecha);
        
    }

}
