package capaGrafica;

import capaLogica.*; //Se importan las clases de la capaLogica
import capaPersistencias.*; //Se importan las clases de la capaPersistencia
import java.util.ArrayList; //Se importa la clase ArrayList
import javax.swing.JOptionPane; //Se importa la clase JOptionPane

/**
 *
 * @author ronaldoucl
 */
public class jFrmActualizarPais extends javax.swing.JFrame {

    
    public jFrmActualizarPais() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jCboPais = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Pais");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel1.setText("Código: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel2.setText("Nombre: ");

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Seleccione País a Actualizar");

        jCboPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboPaisItemStateChanged(evt);
            }
        });
        jCboPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jCboPais, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(jTxtCodigo))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalir)
                    .addComponent(jBtnGuardar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (Pais pais : PersistenciaPais.getArrayPaises()) { //ciclo for each para llenar un combo box
            jCboPais.addItem(pais.getNombre()); //Se agrega al combo box el nombre del objeto pais
        } //Se cierra el ciclo for each
        jCboPais.setSelectedIndex(-1); //Al abrir la ventana, el combo box estará en la posición -1, osea, vacio
    }//GEN-LAST:event_formWindowOpened

    private void jCboPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboPaisActionPerformed
        
    }//GEN-LAST:event_jCboPaisActionPerformed

    private void jCboPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboPaisItemStateChanged
        ArrayList<Pais> arrayPais = PersistenciaPais.getArrayPaises(); //Se crea un arrayList y se guardará arrayList creado en la clase PersistenciaPais
        
        if (jCboPais.getSelectedIndex() == -1) { //Condición en caso de que el combo box esté en la posición -1
            jTxtCodigo.setText(""); //Se limpia la caja de texto
            jTxtNombre.setText(""); //Se limpia la caja de texto
        } //Se cierra la condición if
        else { //Se abre un else
            jTxtCodigo.setText(arrayPais.get(jCboPais.getSelectedIndex()).getCodigo()); //Se fijará en la caja de texto el atributo codigo del objeto guardado en el arrayList seleccionado
            jTxtNombre.setText(arrayPais.get(jCboPais.getSelectedIndex()).getNombre()); //Se fijará en la caja de texto el atributo nombre del objeto guardado en el arrayList seleccionado
        } //Se cierra el else
    }//GEN-LAST:event_jCboPaisItemStateChanged

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose(); //Se cierra la ventana
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        if(jCboPais.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar un Pais");
            jCboPais.requestFocus();
            return;
        }
        
        int codigo; //Se declara una variable codigo de tipo int
        String codigoString; //Se declara una variablle codigoString de tipo String
        try { //Se abre el try para las excepciones
            codigo = Integer.parseInt(this.jTxtCodigo.getText()); //Se guardará en una variable int los datos ingresados en el jTxtCodigo
            codigoString = jTxtCodigo.getText(); //Se guardará en una variable String los datos ingresados en el jTxtCodigo
        } //Se cierra el try
        catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "El Código de País debe ser un número"); //Muestra mensaje de alerta por medio de un JOptionPane
            jTxtCodigo.requestFocus(); //Se enfoca en el jTxtCodigo
            jTxtCodigo.selectAll();
            return;
        } //Se cierra la instrucción catch
        
        if (this.jTxtNombre.getText().trim().equals("")){ //Si el jTxtNombre está vació, el programa mandará una alerta
            JOptionPane.showMessageDialog(this, "Debe digitar el nombre del país"); //JOptionPane que mostrará un mensaje de alerta
            jTxtNombre.requestFocus(); //El programa se enfocará en el jTxtNombre para que lo editemos
            return;
        } //Se cierra la condición
        
        Pais pais = new Pais (jTxtCodigo.getText(), jTxtNombre.getText()); //Crea un objeto pais de la clase Pais
        PersistenciaPais.actualizarPais(jCboPais.getSelectedIndex(), pais); //Se actualiza el objeto pais en la clase PersistenciaPais
        JOptionPane.showMessageDialog(this, "País actualizado la información del país"); //Manda un mensaje que se ha realizado con exito la instruccion
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
            java.util.logging.Logger.getLogger(jFrmActualizarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmActualizarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmActualizarPais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JComboBox<String> jCboPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
