
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Metodos {
    //metodo para guardar los datos en un array
    Vector texArray = new Vector();
    
    public void guardar(Factura miFactura){
        
        texArray.addElement(miFactura);
        
        
    }
    
    public void guardarArchivo (Factura factura){
        
        Writer fw = null;
        
        
        try {
             fw = new FileWriter("mio.txt");
            
            //BufferedWriter bw = new BufferedWriter(fw);
            
            PrintWriter pw = new PrintWriter(fw);
           
            pw.print(factura.getIdFactura());
            pw.print(factura.getFecha());
            pw.print(factura.getNombreCliente());
            pw.print(factura.getDireccionCliente());
            pw.print(factura.getDescripcionSevicio());
            pw.print(factura.getPrecio());
            
            
           
          
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally{
            try {
                fw.close();
            } catch (Exception e) {
            }
        }
        
        
   }

}
