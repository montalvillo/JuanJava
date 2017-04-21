


public class Factura {
    String idFactura;
    String Fecha;
    String nombreCliente;
    String direccionCliente;
    String descripcionSevicio;
    String precio;

   


public String getFacturaCSV() {
        
     String Factura = idFactura+";"+Fecha+";"+nombreCliente+";"+direccionCliente+
        ";"+descripcionSevicio+";"+precio+"\n";
             
      return Factura;
}
    }

   