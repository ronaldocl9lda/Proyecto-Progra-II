package capaGrafica;

import capaPersistencias.PersistenciaPais;

/**
 *
 * @author ronaldoucl
 */
public class jFrmMantenimientoPais extends javax.swing.JFrame {

    
    public jFrmMantenimientoPais() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtPaises = new javax.swing.JTextArea();
        jBtnAgregarPais = new javax.swing.JButton();
        jBtnActualizarPais = new javax.swing.JButton();
        jBtnActivarDesactivar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento de Paises");
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

        jTxtPaises.setEditable(false);
        jTxtPaises.setColumns(20);
        jTxtPaises.setRows(5);
        jScrollPane1.setViewportView(jTxtPaises);

        jBtnAgregarPais.setText("Agregar País");
        jBtnAgregarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarPaisActionPerformed(evt);
            }
        });

        jBtnActualizarPais.setText("Actualizar País");
        jBtnActualizarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarPaisActionPerformed(evt);
            }
        });

        jBtnActivarDesactivar.setText("Activar o Desactivar País");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnAgregarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnActualizarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnActivarDesactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnAgregarPais)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnActualizarPais)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnActivarDesactivar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarPaisActionPerformed
        jFrmAgregarPais ventana = new jFrmAgregarPais(); //Se instancia el jFrame
        ventana.setVisible(true); //Muestra el objeto ventana
        ventana.setLocationRelativeTo(null); //Pone la ventana en el centro de la pantalla
    }//GEN-LAST:event_jBtnAgregarPaisActionPerformed

    private void jBtnActualizarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarPaisActionPerformed
        jFrmActualizarPais ventana = new jFrmActualizarPais(); //Se instancia el jFrame
        ventana.setVisible(true); //Muestra el objeto ventanav
        ventana.setLocationRelativeTo(null); //Pone la ventana en el centro de la pantalla
    }//GEN-LAST:event_jBtnActualizarPaisActionPerformed

    private void jBtnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActivarDesactivarActionPerformed
        jFrmActivarDesactivarPais ventana = new jFrmActivarDesactivarPais(); //Se instancia el jFrame
        ventana.setVisible(true); //Muestra el objeto ventana
        ventana.setLocationRelativeTo(null); //Instrucción para cerrar la ventana
    }//GEN-LAST:event_jBtnActivarDesactivarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose(); //Instrucción para cerrar la ventana
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTxtPaises.setText(PersistenciaPais.listaPaises()); //Al abrir la ventana el jTxtPaises imprimirá la lista de Paises
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jTxtPaises.setText(PersistenciaPais.listaPaises());
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
            java.util.logging.Logger.getLogger(jFrmMantenimientoPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmMantenimientoPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmMantenimientoPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmMantenimientoPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmMantenimientoPais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActivarDesactivar;
    private javax.swing.JButton jBtnActualizarPais;
    private javax.swing.JButton jBtnAgregarPais;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtPaises;
    // End of variables declaration//GEN-END:variables
}
