package capaGrafica;

import capaPersistencias.PersistenciaCliente; //Se importa la clase PersistenciaCliente de la capaPersistencias

/**
 *
 * @author ronaldoucl
 */
public class jFrmMantenimientoCliente extends javax.swing.JFrame {

    
    public jFrmMantenimientoCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtClientes = new javax.swing.JTextArea();
        jBtnAgregarCliente = new javax.swing.JButton();
        jBtnActualizarCliente = new javax.swing.JButton();
        jBtnActivarDesactivar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();

        jButton2.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimientos de Clientes");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTxtClientes.setEditable(false);
        jTxtClientes.setColumns(20);
        jTxtClientes.setRows(5);
        jScrollPane1.setViewportView(jTxtClientes);

        jBtnAgregarCliente.setText("Agregar Cliente");
        jBtnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarClienteActionPerformed(evt);
            }
        });

        jBtnActualizarCliente.setText("Actualizar Cliente");
        jBtnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarClienteActionPerformed(evt);
            }
        });

        jBtnActivarDesactivar.setText("Activar o Desactivar Cliente");
        jBtnActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActivarDesactivarActionPerformed(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnActivarDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnAgregarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnActualizarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnActivarDesactivar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSalir)
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarClienteActionPerformed
        jFrmAgregarCliente ventana = new jFrmAgregarCliente(); //Se instancia el jFrame
        ventana.setVisible(true); //Muestra el objeto ventana
        ventana.setLocationRelativeTo(null); //Pone la ventana en el centro de la pantalla
    }//GEN-LAST:event_jBtnAgregarClienteActionPerformed

    private void jBtnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarClienteActionPerformed
        jFrmActualizarCliente ventana = new jFrmActualizarCliente(); //Se instancia el jFrame
        ventana.setVisible(true); //Muestra el objeto ventana
        ventana.setLocationRelativeTo(null);  //Pone la ventana en el centro de la pantalla
    }//GEN-LAST:event_jBtnActualizarClienteActionPerformed

    private void jBtnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActivarDesactivarActionPerformed
        jFrmActivarDesactivarCliente ventana = new jFrmActivarDesactivarCliente(); //Se instancia el jFrame
        ventana.setVisible(true); //Muestra el objeto ventana
        ventana.setLocationRelativeTo(null); //Pone la ventana en el centro de la pantalla
    }//GEN-LAST:event_jBtnActivarDesactivarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose(); //Instrucción para cerrar la ventana
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTxtClientes.setText(PersistenciaCliente.listaClientes()); //Al momento de abrirse la ventana la caja de texto mostrará la lista de Clientes
    }//GEN-LAST:event_formWindowOpened

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.jTxtClientes.setText(PersistenciaCliente.listaClientes());
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(jFrmMantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmMantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmMantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmMantenimientoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmMantenimientoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActivarDesactivar;
    private javax.swing.JButton jBtnActualizarCliente;
    private javax.swing.JButton jBtnAgregarCliente;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtClientes;
    // End of variables declaration//GEN-END:variables
}
