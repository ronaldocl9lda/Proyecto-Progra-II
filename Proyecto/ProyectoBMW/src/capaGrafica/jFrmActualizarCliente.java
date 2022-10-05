package capaGrafica;

import capaLogica.*; //Se importan las clases de la capaLogica
import capaPersistencias.*; //Se importan las clases de la capaPersistencia
import java.util.ArrayList; //Se importa la clase ArrayList
import javax.swing.JOptionPane; //Se importa el JOptionPane

/**
 *
 * @author ronaldoucl
 */
public class jFrmActualizarCliente extends javax.swing.JFrame {

    
    public jFrmActualizarCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jCboTipoCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtCedula = new javax.swing.JTextField();
        jBtnSalir = new javax.swing.JButton();
        jTxtNombre = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jTxtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCboCliente = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("Dirección:");

        jLabel4.setText("Telefono:");

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

        jLabel1.setText("Cédula:");

        jLabel2.setText("Nombre: ");

        jLabel5.setText("Tipo de Cliente");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Seleccione el Cliente a Actualizar");

        jCboCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboClienteItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBtnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtTelefono)
                            .addComponent(jTxtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboTipoCliente, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE)
                            .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jCboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCboTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        for (Cliente cliente : PersistenciaCliente.getArrayClientes()) { //Ciclo for each para llenar el combo box jCboCliente
            jCboCliente.addItem(cliente); //Se guarda en el jCboCliente el toString del objeto cliente
        } //Se cierra el ciclo for each
        jCboCliente.setSelectedIndex(-1); //Posiciona el jCboCliente en la posición -1, una posicion vacía
        
        for (TipoCliente tipoCliente : TipoCliente.values()) { //Ciclo for each para llenar el combo box jCboCliente
            jCboTipoCliente.addItem(tipoCliente); //Se guarda en el jCboTipoCliente el objeto tipoCliente
        } //Se cierra el ciclo for each
        jCboTipoCliente.setSelectedIndex(-1); //Posiciona el jCboTipoCliente en la posición -1, una posicion vacía
    }//GEN-LAST:event_formWindowOpened

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose(); //Instruccion para cerrar la ventana
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jCboClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboClienteItemStateChanged
        ArrayList <Cliente> arrayClientes = PersistenciaCliente.getArrayClientes(); //Se crea un arrayList y se guardará arrayList creado en la clase PersistenciaCliente
        
        if (jCboCliente.getSelectedIndex() == -1) { //Condición en caso de que el combo box esté en la posición -1
            jTxtCedula.setText(""); //Se limpia la caja de texto
            jTxtNombre.setText(""); //Se limpia la caja de texto
            jTxtDireccion.setText(""); //Se limpia la caja de texto
            jTxtTelefono.setText(""); //Se limpia la caja de texto
            jCboTipoCliente.setSelectedIndex(-1);
        } //Se cierra la condicion if
        else { //Se abre un else
            jCboTipoCliente.setSelectedItem(arrayClientes.get(jCboCliente.getSelectedIndex()).getTipoCliente());
            jTxtCedula.setText(arrayClientes.get(jCboCliente.getSelectedIndex()).getCedula()); //Pondrá en el jTxtCedula el atributo cedula del objeto seleccionado
            jTxtNombre.setText(arrayClientes.get(jCboCliente.getSelectedIndex()).getNombre()); //Pondrá en el jTxtNombre el atributo nombre del objeto seleccionado
            jTxtDireccion.setText(arrayClientes.get(jCboCliente.getSelectedIndex()).getDireccion()); //Pondrá en el jTxtDireccion el atributo direccion del objeto seleccionado
            jTxtTelefono.setText(arrayClientes.get(jCboCliente.getSelectedIndex()).getTelefono()); //Pondrá en el jTxtTelefono el atributo telefono del objeto seleccionado
        }
    }//GEN-LAST:event_jCboClienteItemStateChanged

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        String cedula = jTxtCedula.getText(); //Guarda en una variable cedula de tipo String el valor de jTxtCedula
        String nombre = jTxtNombre.getText(); //Guarda en una variable nombre de tipo String el valor de jTxtNombre
        String direccion = jTxtDireccion.getText(); //Guarda en una variable direccion de tipo String el valor de jTxtDireccion
        String telefono = jTxtTelefono.getText(); //Guarda en una variable telefono de tipo String el valor de jTxtTelefono
        TipoCliente tipoCliente = (TipoCliente) jCboTipoCliente.getSelectedItem();
        
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
            return; //Se cierra la condición
        }
        if (jTxtTelefono.getText().trim().equals("")){ //Se abre condicion if que dará instrucciones en caso de que jTxtTelefono no tenga nada escrito
            JOptionPane.showMessageDialog(this, "Debe digitar el telefono del cliente"); //Por medio de un JOptionPane, se mostrará un mensaje de alerta
            jTxtTelefono.requestFocus(); //El programa se enfocará en el jTxtTelefono para editarlo
            return;
        } //Se cierra la condicion
        if (tipoCliente == null) { //Se abre condicion if que dará instrucciones en caso de que no se haya seleccionado una de las opciones del combo box
            JOptionPane.showMessageDialog(this, "Debe seleccionar el tipo de ciente"); //Por medio de un JOptionPane, se mostrará un mensaje de alerta
            return;
        } //Se cierra la condición
        
        int indice = jCboCliente.getSelectedIndex(); //Guarda en una variable indice de tipo int, el indice seleccionado del combo box
        Cliente cliente = (Cliente)jCboCliente.getSelectedItem();
        cliente.setCedula(cedula);
        cliente.setDireccion(direccion);
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setTipoCliente(tipoCliente);
        PersistenciaCliente.actualizarCliente(indice, cliente); //Actualiza el objeto y lo guarda en la clase PersistenciaCliente
        JOptionPane.showMessageDialog(this, "Se ha actualizado la información del cliente"); //Imprime un mensaje de que la accion se ha realizado con exito
        
        jCboCliente.removeAllItems();
        for (Cliente c:PersistenciaCliente.getArrayClientes()){
            jCboCliente.addItem(c);
        }
        
        jCboCliente.setSelectedIndex(-1);
        jCboCliente.requestFocus();
    }//GEN-LAST:event_jBtnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmActualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmActualizarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JComboBox<Cliente> jCboCliente;
    private javax.swing.JComboBox<TipoCliente> jCboTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
