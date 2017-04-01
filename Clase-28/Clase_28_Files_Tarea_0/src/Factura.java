


public class Factura {
    String idFactura;
    String Fecha;
    String nombreCliente;
    String direccionCliente;
    String descripcionSevicio;
    String precio;
    
public Factura(String idFactura, String Fecha, String nombreCliente, String direccionCliente, String descripcionSevicio, String precio) {
        this.idFactura = idFactura;
        this.Fecha = Fecha;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.descripcionSevicio = descripcionSevicio;
        this.precio = precio;}

    Factura() {
       
    }
 
        public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getDescripcionSevicio() {
        return descripcionSevicio;
    }

    public void setDescripcionSevicio(String descripcionSevicio) {
        this.descripcionSevicio = descripcionSevicio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

   
   

}
