package labhilosjoecorrales;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    Color color;
    RegistroCarros rc = new RegistroCarros();
    
    public Principal() throws FileNotFoundException, IOException {
        initComponents();
        llenarComboYArrayAutos();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnComenzar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombrePista = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        largoPista = new javax.swing.JLabel();
        progresoDeCarro = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeCarros = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        txtNombrePista = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLargoPista = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroIdentificador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombreCorredor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcTipoCarro = new javax.swing.JComboBox<>();
        btnColor = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnUsarPista = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jcSeleccionarCarro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnComenzar.setText("Comenzar");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnPausar.setText("Pausar");

        jLabel1.setText("Pista: ");

        nombrePista.setText("______");

        jLabel3.setText("Largo: ");

        largoPista.setText("_______");

        tablaDeCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(tablaDeCarros);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtNombrePista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePistaActionPerformed(evt);
            }
        });

        jLabel5.setText("Largo: ");

        txtLargoPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLargoPistaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre Pista: ");

        txtNumeroIdentificador.setEditable(false);
        txtNumeroIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroIdentificadorActionPerformed(evt);
            }
        });

        jLabel7.setText("Numero Identificador");

        txtNombreCorredor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreCorredorFocusGained(evt);
            }
        });
        txtNombreCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCorredorActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre Corredor");

        jcTipoCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));

        btnColor.setText("Color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnUsarPista.setText("Usar Pista");
        btnUsarPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarPistaActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnComenzar)
                        .addGap(18, 18, 18)
                        .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombrePista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(largoPista, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jcTipoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcSeleccionarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumeroIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombrePista, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsarPista, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLargoPista, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addComponent(progresoDeCarro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComenzar)
                    .addComponent(btnPausar)
                    .addComponent(jLabel1)
                    .addComponent(nombrePista)
                    .addComponent(jLabel3)
                    .addComponent(largoPista))
                .addGap(26, 26, 26)
                .addComponent(progresoDeCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(jcSeleccionarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtNumeroIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtNombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnColor)
                            .addComponent(jcTipoCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombrePista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLargoPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btnUsarPista)
                        .addGap(18, 18, 18)
                        .addComponent(btnReiniciar)))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePistaActionPerformed

    private void txtLargoPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLargoPistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLargoPistaActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        JColorChooser SeleccionColor = new JColorChooser();
        color = SeleccionColor.showDialog(null, "Seleccione el color del auto: ", Color.BLUE);
        btnColor.setBackground(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int intCarro = jcSeleccionarCarro.getSelectedIndex();
        String tipoCarro;
        String nombreCorredor = txtNombreCorredor.getText();
        int RGB = color.getRGB();
        
        switch (intCarro) {
            case 0: tipoCarro = "McQueen"; break;
            case 1: tipoCarro = "Convertible"; break;
            default: tipoCarro = "Nascar"; break;
        }
        
        try {
            RegistroCarros.agregarCorredor(tipoCarro, nombreCorredor, RGB);
        } catch (IOException ex) { System.out.println("Ocurrio un error!"); }
        
        jcSeleccionarCarro.removeAllItems();
        Auto.cleanArray();
        try { llenarComboYArrayAutos(); } catch (IOException ex) {}
        JOptionPane.showMessageDialog(null, "Corredor creado!");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNumeroIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroIdentificadorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNumeroIdentificadorActionPerformed

    private void txtNombreCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCorredorActionPerformed
        
        
    }//GEN-LAST:event_txtNombreCorredorActionPerformed

    private void txtNombreCorredorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCorredorFocusGained
        // TODO add your handling code here:
        int numero = 0;
        try {
            numero = RegistroCarros.actualCode();
        } catch (IOException ex) {}
        txtNumeroIdentificador.setText(String.valueOf(numero));
    }//GEN-LAST:event_txtNombreCorredorFocusGained

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //HACER VALIDACION PARA QUE NO SE AGREGUE UNO VARIAS VECES
        int carro = jcSeleccionarCarro.getSelectedIndex();
        DefaultTableModel modelo = (DefaultTableModel) tablaDeCarros.getModel();
        Object[] fila = new Object[3];
        
        for(Auto auto : Auto.autos) {
            if(carro == auto.getId()-1) {
                fila[0] = auto.getId();
                fila[1] = auto.getNombre();
                fila[2] = auto.getDistancia();
                modelo.addRow(fila);
                tablaDeCarros.setModel(modelo);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    int lPista;
    
    private void btnUsarPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarPistaActionPerformed
        String nombreTrack = txtNombrePista.getText();
        //Usar para el limite del progress bar
        lPista = Integer.parseInt(txtLargoPista.getText());
        nombrePista.setText(nombreTrack);
        this.largoPista.setText(txtLargoPista.getText());
    }//GEN-LAST:event_btnUsarPistaActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        for (int i = 0; i < tablaDeCarros.getRowCount(); i++) {
            int id = (int) tablaDeCarros.getValueAt(i, 0);
            threadFor1(id);
        }
    }//GEN-LAST:event_btnComenzarActionPerformed

    private void llenarComboYArrayAutos() throws FileNotFoundException, IOException {
        if(RegistroCarros.autos.length() > 0) {
            RegistroCarros.autos.seek(0);
            
            while(RegistroCarros.autos.getFilePointer() < RegistroCarros.autos.length()) {
                int codigo = RegistroCarros.autos.readInt();
                jcSeleccionarCarro.addItem(String.valueOf(codigo));
                long dist = RegistroCarros.autos.readLong();
                String nombre = RegistroCarros.autos.readUTF();
                int RGB = RegistroCarros.autos.readInt();
                String tipoCarro = RegistroCarros.autos.readUTF();
                Auto.autos.add(new Auto(codigo, RGB, dist, nombre, tipoCarro));
            }
            
            System.out.println("\n\n[=== ArrayList Actualizado ===]\n");
            for(Auto auto : Auto.autos ) { System.out.println(auto); }
        }
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    System.out.println("Error en el main");
                }
            }
        });
    }
    
    public Auto searchCarWith(int id) {
        for(Auto auto : Auto.autos) {
            if(auto.getId() == id) {
                return auto;
            }
        }
        return null;
    }
    
    
    public void threadFor1(int id) {
        hiloProgress hilo = new hiloProgress();
        hilo.start();
        
        Auto auto = searchCarWith(id);
        int RGB = auto.getRGB();
        int min;
        int max;
        long autoDist;
        
        if(auto.getTipo().equals("McQueen")) {
            min = 30;
            max = 190;
        } else if(auto.getTipo().equals("Convertible")) {
            min = 20;
            max = 200;
        } else { min = 40; max = 180;}
        
        progresoDeCarro.setForeground(new Color(RGB));
        autoDist = auto.getDistancia();
        long randomDist = (long) (Math.random() * (max - min));
        autoDist += randomDist;
        progresoDeCarro.setValue((int)autoDist);
    }
    
    
    class hiloProgress extends Thread {
        public void run() {
            for (int i = 0; i < lPista; i++) {
                progresoDeCarro.setValue(i);
                try {
                    Thread.sleep(1500);
                    progresoDeCarro.repaint();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnUsarPista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcSeleccionarCarro;
    private javax.swing.JComboBox<String> jcTipoCarro;
    private javax.swing.JLabel largoPista;
    private javax.swing.JLabel nombrePista;
    private javax.swing.JProgressBar progresoDeCarro;
    private javax.swing.JTable tablaDeCarros;
    private javax.swing.JTextField txtLargoPista;
    private javax.swing.JTextField txtNombreCorredor;
    private javax.swing.JTextField txtNombrePista;
    private javax.swing.JTextField txtNumeroIdentificador;
    // End of variables declaration//GEN-END:variables
}
