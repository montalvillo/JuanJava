
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;




public class guardarFactura {
     static  void guardarFactura(Factura f,String nombreArchivoString){
      
            Writer writer = null;
       
         try{
       
            writer = new FileWriter("Factura.txt",true);
            writer.write(f.getFacturaCSV());
           
          }catch(IOException e){
                //do something with e... log, perhaps rethrow etc.
        } finally {
            try {
               writer.close();
                } catch (IOException ex) {
                
            } }}
  
  
    
    
    

}
