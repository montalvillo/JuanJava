
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
import java.util.InputMismatchException;

public class Formulario extends javax.swing.JFrame {
    
   
 public Formulario() {
      
        

     initComponents();
    // Menu.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
     
     Fecha.fechaActual();
     jLabel8.setVisible(false);
     jTextBuscarApellidos.setVisible(false);
     jTextBuscarID.setVisible(false);
     
     jFormattedTextField1Fecha.setText(Fecha.fechaActual());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioBuscarApellidos = new javax.swing.JRadioButton();
        jRadioBuscarID = new javax.swing.JRadioButton();
        jTextBuscarApellidos = new javax.swing.JTextField();
        jTextBuscarID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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
        btGenerar.setText("Generar Factura");
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
        jLabel6.setText("Total Factura");

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

        jButton3LeerFactura.setText("Leer Fichero Factura");
        jButton3LeerFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3LeerFacturaActionPerformed(evt);
            }
        });

        btnGenerarNumero.setText("Asignar ID Factura");
        btnGenerarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNumeroActionPerformed(evt);
            }
        });

        jLabel2.setBackground(java.awt.Color.red);
        jLabel2.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.blue);
        jLabel7.setText("Tarea Realizada");

        jPanel1.setBackground(new java.awt.Color(108, 108, 248));

        buttonGroup1.add(jRadioBuscarApellidos);
        jRadioBuscarApellidos.setText("Buscar por Apellidos");
        jRadioBuscarApellidos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioBuscarApellidosItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioBuscarID);
        jRadioBuscarID.setText("Buscar por ID ");
        jRadioBuscarID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioBuscarIDItemStateChanged(evt);
            }
        });

        jTextBuscarApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarApellidosActionPerformed(evt);
            }
        });

        jTextBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioBuscarApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jTextBuscarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBuscarApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioBuscarApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioBuscarID)
                    .addComponent(jTextBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jLabel8.setText("jLabel8");
        jLabel8.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(227, 143, 59));
        jPanel2.setForeground(new java.awt.Color(188, 96, 96));

        jLabel9.setText("IVA Entre Fechas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel10.setText("Coste Materiales Empleados");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel11.setText("Horas Empleadas");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel12.setText("IVA");

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Leer Facturas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(46, 46, 46))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(475, 475, 475)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jFormattedTextField1Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(273, 273, 273))))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFormattedTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1Dire, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFormattedTextField1Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(293, 293, 293)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(btGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jButton3Limpiar)
                                .addGap(46, 46, 46)))
                        .addComponent(jButton3LeerFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3Limpiar)
                                .addComponent(btGenerar))
                            .addComponent(btnGenerarNumero)))
                    .addComponent(jButton3LeerFactura))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabelIDFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextField1Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Dire, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
       jFormattedTextField1Fecha.setText(Fecha.fechaActual());
       
       
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
           
        } }
          
    }//GEN-LAST:event_btnGenerarNumeroActionPerformed

    private void jRadioBuscarApellidosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioBuscarApellidosItemStateChanged
        jTextBuscarApellidos.setVisible(true);
        jLabel8.setText("");

    }//GEN-LAST:event_jRadioBuscarApellidosItemStateChanged

    private void jTextBuscarApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarApellidosActionPerformed
      
        ArrayList<Factura> miFacturas = leerFacturas("Factura.txt");
        
        String  cabecera = "FACTURA\n";
         jTextAreaTexto.setText(cabecera);
       
        String buscar = jTextBuscarApellidos.getText();
          
       for(Factura mFactura : miFacturas){
           
           if(mFactura.nombreCliente.equals(buscar)){
 jTextAreaTexto.setText(jTextAreaTexto.getText()+"ID Factura: "+mFactura.idFactura+
       "\n "+"Fecha: "+mFactura.Fecha+"\n"+"Nombre Cliente: "+mFactura.nombreCliente+
         "\n"+"Direccion Cliente: "+mFactura.direccionCliente+"\n"+"Descripcion Servicio. "+
         mFactura.descripcionSevicio+"\n"+"Precio: "+mFactura.precio+"\n");
              
} }
    }//GEN-LAST:event_jTextBuscarApellidosActionPerformed

    private void jRadioBuscarIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioBuscarIDItemStateChanged
        // TODO add your handling code here:
        jTextBuscarID.setVisible(true);
        jLabel8.setText("");
    }//GEN-LAST:event_jRadioBuscarIDItemStateChanged

    private void jTextBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarIDActionPerformed
        // TODO add your handling code here:
     
      
     ArrayList<Factura> miFacturas = leerFacturas("Factura.txt");
        
        String buscar = jTextBuscarID.getText();  
          
      for(Factura mFactura : miFacturas){
         
         if(mFactura.idFactura.equals(buscar)){

       jTextAreaTexto.setText(jTextAreaTexto.getText()+"ID Factura: "+mFactura.idFactura+
       "\n "+"Fecha: "+mFactura.Fecha+"\n"+"Nombre Cliente: "+mFactura.nombreCliente+
         "\n"+"Direccion Cliente: "+mFactura.direccionCliente+"\n"+"Descripcion Servicio. "+
               mFactura.descripcionSevicio+"\n"+"Precio: "+mFactura.precio+"\n");
         
  }
      } 
    }//GEN-LAST:event_jTextBuscarIDActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Listado mi = new Listado();
        
        mi.setVisible(rootPaneCheckingEnabled);
        ArrayList<Factura> miFacturas = leerFacturas("Factura.txt");
       
      for(Factura miFactura : miFacturas){
           
   jTextAreaTexto.setText(jTextAreaTexto.getText()+"IDFactura:\n"+miFactura.idFactura+"\n"+
               "Fecha"+miFactura.Fecha+"\n"+"Nombre"+miFactura.nombreCliente+
              "\n"+miFactura.nombreCliente+"\n"+miFactura.direccionCliente+
              "\n"+miFactura.descripcionSevicio+"\n"+miFactura.precio+"\n\n");
}
        
        
        
         

       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton jButton3LeerFactura;
    private javax.swing.JButton jButton3Limpiar;
    private javax.swing.JFormattedTextField jFormattedTextField1Fecha;
    private javax.swing.JFormattedTextField jFormattedTextField1ID;
    private javax.swing.JFormattedTextField jFormattedTextField1Precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIDFactura;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioBuscarApellidos;
    private javax.swing.JRadioButton jRadioBuscarID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTexto;
    private javax.swing.JTextField jTextBuscarApellidos;
    private javax.swing.JTextField jTextBuscarID;
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



