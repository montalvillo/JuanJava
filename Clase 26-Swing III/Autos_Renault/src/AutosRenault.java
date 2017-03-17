
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanito
 */
public class AutosRenault extends javax.swing.JFrame {

    /**
     * Creates new form AutosRenault
     */
    public AutosRenault() {
        initComponents();
         jComboBox1Modelos.setBackground(Color.YELLOW);
          jComboBox1Modelos.setToolTipText("Renault prestigio y calidad");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 Cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1Modelos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                             Autos Antiguos Renault");
        setBackground(new java.awt.Color(254, 201, 149));
        setForeground(new java.awt.Color(136, 94, 94));

        jComboBox1Modelos.setFont(new java.awt.Font("Lucida Bright", 0, 24)); // NOI18N
        jComboBox1Modelos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ModelosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1Modelos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 125, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jComboBox1Modelos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ModelosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ModelosItemStateChanged
      
     int posicion;
     String lugarImagen;
     URL url;
     posicion = jComboBox1Modelos.getSelectedIndex();
     
   switch(posicion){
       
       case 1 : lugarImagen ="/Imagenes/1899-renault.jpg";
       url = this.getClass().getResource(lugarImagen);
       ImageIcon imagen = new ImageIcon(url);
        
        Icon icono =new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(),
         jLabel1.getHeight(),Image.SCALE_DEFAULT));
        
        jLabel1.setIcon(icono);
      jLabel2.setText("Modelo Renault en el año 1899");
           
  break;
  
  case 2 : lugarImagen ="/Imagenes/1903.jpg";
       url = this.getClass().getResource(lugarImagen);
      
       ImageIcon imagen1 = new ImageIcon(url);
        
        Icon icono1 =new ImageIcon(imagen1.getImage().getScaledInstance(jLabel1.getWidth(),
         jLabel1.getHeight(),Image.SCALE_DEFAULT));
        
        jLabel1.setIcon(icono1);
      jLabel2.setText("Modelo Renault en el año 1903");
      
      break;
      
  case 3 : lugarImagen ="/Imagenes/1929.jpg";
       url = this.getClass().getResource(lugarImagen);
      
       ImageIcon imagen2 = new ImageIcon(url);
        
        Icon icono2 =new ImageIcon(imagen2.getImage().getScaledInstance(jLabel1.getWidth(),
         jLabel1.getHeight(),Image.SCALE_DEFAULT));
        
        jLabel1.setIcon(icono2);
      jLabel2.setText("Modelo Renault en el año 1929");
      
      break;
      
   case 4 : lugarImagen ="/Imagenes/Renault_Celtaquatre.JPG";
       url = this.getClass().getResource(lugarImagen);
      
       ImageIcon imagen3 = new ImageIcon(url);
        
        Icon icono3 =new ImageIcon(imagen3.getImage().getScaledInstance(jLabel1.getWidth(),
         jLabel1.getHeight(),Image.SCALE_DEFAULT));
        
        jLabel1.setIcon(icono3);
      jLabel2.setText("Modelo Renault Celtaquatre");
      
      break;
  
       
  }
          
        
    }//GEN-LAST:event_jComboBox1ModelosItemStateChanged

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutosRenault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutosRenault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutosRenault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutosRenault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutosRenault().setVisible(true);
            }
        });
    }

    
    public  void Cargar(){
    
  String [] nombres = {"Selcciona modelo" ,"1899","1903","1929","1936 Celtacuatro"
          , "1937","1958 Floride","Caravell","R4 Coupe","Deuphine","R4",
  "R8","R5","R6","R12","R15","R17"};
   DefaultComboBoxModel   modelo = new DefaultComboBoxModel(nombres);
   jComboBox1Modelos.setModel(modelo);
}

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1Modelos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}



   
