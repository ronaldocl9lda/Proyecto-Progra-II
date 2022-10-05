package capaGrafica;

import capaLogica.*; //Se importan las clases de la capaLogica
import capaPersistencias.*; //Se importan las clases de la capaPersistencia
import javax.swing.JOptionPane; //Se importa la clase JOptionPane

/**
 *
 * @author ronaldoucl
 */
public class jFrmAgregarCliente extends javax.swing.JFrame {

    
    public jFrmAgregarCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtCedula = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jTxtDireccion = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCboTipoCliente = new javax.swing.JComboBox<>();
        jBtnSalir = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Cédula:");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Tipo de Cliente");

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jCboTipoCliente, 0, 138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTxtNombre)
                            .addComponent(jTxtDireccion)
                            .addComponent(jTxtTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCboTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (TipoCliente tipoCliente : TipoCliente.values()) { //Se abre ciclo for each
            jCboTipoCliente.addItem(tipoCliente); //Al abrise la ventana se agrega al combo box el objeto tipoCliente
        } //Se cierra el ciclo for each
        jCboTipoCliente.setSelectedIndex(-1); //Al abrirse la ventana, el combo box mostrará la posicion -1, osea una posición vacía
    }//GEN-LAST:event_formWindowOpened

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        String cedula = jTxtCedula.getText(); //Se guarda en una variable String el valor del jTxtCedula
        String nombre = jTxtNombre.getText(); //Se guarda en una variable String el valor del jTxtNombre
        String direccion = jTxtDireccion.getText(); //Se guarda en una variable String el valor del jTxtDireccion
        String telefono = jTxtTelefono.getText(); //Se guarda en una variable String el valor del jTxtTelefono
        TipoCliente tipoCliente = (TipoCliente) jCboTipoCliente.getSelectedItem(); //Se guarda en el objeto tipoCliente el objeto guardado en el combo box seleccionado
        
        if (tipoCliente == null) { //Se abre condicion if que dará instrucciones en caso de que no se haya seleccionado una de las opciones del combo box
            JOptionPane.showMessageDialog(this, "Debe seleccionar el tipo de ciente"); //Por medio de un JOptionPane, se mostrará un mensaje de alerta
            return;
        } //Se cierra la condición
        
        if (jTxtCedula.getText().trim().equals("")){ //Se abre condicion if que dará instrucciones en caso de que jTxtCedula no tenga nada escrito
            JOptionPane.showMessageDialog(this, "Debe digitar la cédula del cliente"); //Por medio de un JOptionPane, se mostrará un mensaje de alerta
            jTxtCedula.requestFocus(); //El programa se enfocará en el jTxtCedula para editarlo
            return;
        } //Se cierra la condición
        if (jTxtNombre.getText().trim().equals("")){ //Se abre condicion if que dará instrucciones en caso de que jTxtNombre no tenga nada escrito
            JOptionPane.showMessageDialog(this, "Debe digitar el nombre del cliente"); //Por medio de un JOptionPane, se mostrará un mensaje de alerta
            jTxtNombre.requestFocus(); //El programa se enfocará en el jTxtNombre para editarlo
            return;
        } //Se cierra la condición
        if (jTxtDireccion.getText().trim().equals("")){ //Se abre condicion if que dará instrucciones en caso de que jTxtDireccion no tenga nada escrito
            JOptionPane.showMessageDialog(this, "Debe digitar la dirección del cliente"); //Por medio de un JOptionPane, se mostrará un mensaje de alerta
            jTxtDireccion.requestFocus(); //El programa se enfocará en el jTxtDireccion para editarlo
            return;
        } //Se cierra la condición
        if (jTxtTelefono.getText().trim().equals("")){ //Se abre condicion if que dará instrucciones en caso de que jTxtTelefono no tenga nada escrito
            JOptionPane.showMessageDialog(this, "Debe digitar el telefono del cliente"); //Por medio de un JOptionPane, se mostrará un mensaje de alerta
            jTxtTelefono.requestFocus(); //El programa se enfocará en el jTxtTelefono para editarlo
            return;
        } //Se cierra la condición
        
        Cliente cliente = new Cliente (cedula, nombre, direccion, telefono, tipoCliente); //Se crea un objeto de la clase Cliente
        PersistenciaCliente.agregarCliente(cliente); //Se guarda el objeto cliente en la clase PersistenciaCliente
        JOptionPane.showMessageDialog(this, "Cliente agregado con éxito"); //Por medio de un JOptionPane, mostrará un mensaje
        jCboTipoCliente.setSelectedIndex(-1); //Se pondrá el combo box en la posición -1, osea una posición vacía
        jTxtCedula.setText(""); //Se limpiará la caja de texto jTxtCedula
        jTxtNombre.setText(""); //Se limpiará la caja de texto jTxtNombre
        jTxtDireccion.setText(""); //Se limpiará la caja de texto jTxtDireccion
        jTxtTelefono.setText(""); //Se limpiará la caja de texto jTxtTelefono
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose(); //Se cierra la ventana
    }//GEN-LAST:event_jBtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmAgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmAgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JComboBox<TipoCliente> jCboTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
