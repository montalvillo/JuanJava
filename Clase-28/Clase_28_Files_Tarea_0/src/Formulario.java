
import com.sun.prism.impl.BaseMesh;
import java.applet.Applet;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.awt.JobAttributes;
import static java.awt.SystemColor.text;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import sun.java2d.pipe.BufferedContext;
import java.text.SimpleDateFormat;

public class Formulario extends javax.swing.JFrame {
    
   
 public Formulario() {
      
        

     initComponents();
     
          
          jTextField1.setVisible(false);
         // jLabel2.setVisible(false);
         //jLabel2.setOpaque(false);
        jTextField1.setEnabled(false);
          
        jFormattedTextField1Fecha.setText(fechaActual());
        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabelIDFactura = new javax.swing.JLabel();
        jFormattedTextField1ID = new javax.swing.JFormattedTextField();
        btGenerar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jFormattedTextField1Fecha = new javax.swing.JFormattedTextField();
        jTextField1Dire = new javax.swing.JTextField();
        jTextField1Servicio = new javax.swing.JTextField();
        jFormattedTextField1Precio = new javax.swing.JFormattedTextField();
        jButton3Limpiar = new javax.swing.JButton();
        jButton3LeerFactura = new javax.swing.JButton();
        btnGenerarNumero = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setText("Servicio");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Formulario Factura");
        setBackground(new java.awt.Color(158, 190, 213));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Courier 10 Pitch", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(211, 199, 199));

        jLabelIDFactura.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabelIDFactura.setText("ID Factura");

        jFormattedTextField1ID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextField1ID.setToolTipText("");
        jFormattedTextField1ID.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        btGenerar.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btGenerar.setForeground(new java.awt.Color(55, 50, 119));
        btGenerar.setText("Generar factura");
        btGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGenerarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(239, 12, 12));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextAreaTexto.setColumns(20);
        jTextAreaTexto.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jTextAreaTexto.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTexto);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setText("Direccion cliente");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel6.setText("Precio");

        jTextFieldNombre.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jFormattedTextField1Fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        jFormattedTextField1Fecha.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jTextField1Dire.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jTextField1Servicio.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jFormattedTextField1Precio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextField1Precio.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jButton3Limpiar.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jButton3Limpiar.setText("Nueva Factura");
        jButton3Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3LimpiarActionPerformed(evt);
            }
        });

        jButton3LeerFactura.setText("Leer Factura");
        jButton3LeerFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3LeerFacturaActionPerformed(evt);
            }
        });

        btnGenerarNumero.setText("Generar ID Factura");
        btnGenerarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumeroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(24, 163, 239));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Buscar por ID");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Buscar por Apellidos");

        jTextField1.setBackground(new java.awt.Color(218, 86, 59));
        jTextField1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.setEnabled(false);
        jTextField1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(242, 283, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(9, 9, 9)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(java.awt.Color.red);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnGenerarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3LeerFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(117, 117, 117)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(212, 212, 212)
                                    .addComponent(jTextField1Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1Dire, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGenerar)
                    .addComponent(jButton3Limpiar)
                    .addComponent(jButton3LeerFactura)
                    .addComponent(btnGenerarNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jTextField1Dire, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(jTextField1Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)))
                .addGap(24, 24, 24)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public static String  fechaActual(){
        

     Date fecha = new Date();
       
     SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
       
        
       return formatoFecha.format(fecha);
        
    }
    private void btGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGenerarActionPerformed
     
        Factura f = new Factura();
        
        
        f.idFactura = jFormattedTextField1ID.getText();
        f.Fecha = jFormattedTextField1Fecha.getText();
        f.nombreCliente = jTextFieldNombre.getText();
        f.direccionCliente = jTextField1Dire.getText();
        f.descripcionSevicio = jTextField1Servicio.getText();
        f.precio = jFormattedTextField1Precio.getText();
       
        guardarFactura(f,"Factura.txt");
      
 
    }//GEN-LAST:event_btGenerarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3LimpiarActionPerformed
       jFormattedTextField1ID.setText("");
       jFormattedTextField1Fecha.setText(null);
       jTextFieldNombre.setText(null);
       jTextField1Dire.setText(null);
       jTextField1Servicio.setText(null);
       jFormattedTextField1Precio.setText(null);
       jFormattedTextField1Fecha.setText(fechaActual());
       
       
    }//GEN-LAST:event_jButton3LimpiarActionPerformed

    private void jButton3LeerFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3LeerFacturaActionPerformed
   
      ArrayList<Factura> miFacturas = leerFacturas("Factura.txt");
       
      for(Factura miFactura : miFacturas){
           
   jTextAreaTexto.setText(jTextAreaTexto.getText()+"IDFactura:\n"+miFactura.idFactura+"\n"+
               "Fecha"+miFactura.Fecha+"\n"+"Nombre"+miFactura.nombreCliente+
              "\n"+miFactura.nombreCliente+"\n"+miFactura.direccionCliente+
              "\n"+miFactura.descripcionSevicio+"\n"+miFactura.precio+"\n\n");
}
       
    }//GEN-LAST:event_jButton3LeerFacturaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      ArrayList<Factura> miFacturas = leerFacturas("Factura.txt");
      
      String buscar = jTextField1.getText();
     
    for(Factura miFactura : miFacturas){
          
       
       if(miFactura.nombreCliente.equals(buscar)){
           System.out.println( miFactura.nombreCliente+miFactura.Fecha+
                   
                   miFactura.descripcionSevicio);
           
      jTextAreaTexto.setText(jTextAreaTexto.getText()+buscar+"\n"+miFactura.descripcionSevicio);
       
       
       } }   
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGenerarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNumeroActionPerformed
        // TODO add your handling code here:
        int numeroAleatorio = (int) (Math.random()*10000+1);
        
        String cadena ;
        
        cadena = String.valueOf(numeroAleatorio);
        
        jFormattedTextField1ID.setText(cadena);
        
        
 ArrayList<Factura> miFacturas = leerFacturas("Factura.txt");
      
      String buscar = jFormattedTextField1ID.getText();
     
    for(Factura miFactura : miFacturas){
          
        try {
             if(miFactura.idFactura.equals(buscar)){
        
           
           System.out.println("Factura existe");}
        } catch (Exception e) {
           
           
        }
     
       }
          
    }//GEN-LAST:event_btnGenerarNumeroActionPerformed

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:
         jTextField1.setVisible(true);
        
         jTextField1.setEnabled(true);
      
        
     jLabel2.setText("Introduce");
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGenerar;
    private javax.swing.JButton btnGenerarNumero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton3LeerFactura;
    private javax.swing.JButton jButton3Limpiar;
    private javax.swing.JFormattedTextField jFormattedTextField1Fecha;
    private javax.swing.JFormattedTextField jFormattedTextField1ID;
    private javax.swing.JFormattedTextField jFormattedTextField1Precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelIDFactura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTexto;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField1Dire;
    private javax.swing.JTextField jTextField1Servicio;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

  
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
  
  
  static  ArrayList<Factura> leerFacturas(String fString){
      
      BufferedReader br = null;
      
      ArrayList<Factura> arrayFacturas = new ArrayList();
     
      
      try {
          br = new BufferedReader(new FileReader(fString));
         
          String line = null;
          
          while((line = br.readLine()) != null){
             
             
              Factura miFactura = new Factura();
              
              String facturaEnLinea = line;
            
             
             
       String [] facturasPorPartes = facturaEnLinea.split(";");
             
               
            miFactura.idFactura = facturasPorPartes[0];
            miFactura.Fecha = facturasPorPartes[1];
            miFactura.nombreCliente = facturasPorPartes[2];
            miFactura.direccionCliente = facturasPorPartes[3];
            miFactura.descripcionSevicio = facturasPorPartes[4];
            miFactura.precio = facturasPorPartes[5];
              
              arrayFacturas.add(miFactura);
            //  System.out.println(line); 
              
             
          }
          
          } catch (Exception e) {
              
             }finally{
          
          try {
              br.close();
          } catch (Exception e) {
          }
      }
      
    return arrayFacturas;
     }

   
   }



