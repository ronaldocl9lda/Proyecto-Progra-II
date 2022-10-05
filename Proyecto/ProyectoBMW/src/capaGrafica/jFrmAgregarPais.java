package capaGrafica;

import capaLogica.*; //Se importan las clases de la capaLogica
import capaPersistencias.*; //Se importan las clases de la capaPersistencias
import javax.swing.JOptionPane; //Se importa la clase JOptionPane

/**
 *
 * @author ronaldoucl
 */
public class jFrmAgregarPais extends javax.swing.JFrame {

    
    public jFrmAgregarPais() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Pais");
        setResizable(false);

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Código: ");

        jLabel2.setText("Nombre: ");

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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jTxtCodigo)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnSalir))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose(); //Se cierra la ventana actual
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        int codigo; //Se declara una variable codigo de tipo int
        String codigoString; //Se declara una variablle codigoString de tipo String
        try { //Se abre el try para las excepciones
            codigo = Integer.parseInt(jTxtCodigo.getText()); //Se guardará en una variable int los datos ingresados en el jTxtCodigo
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
        
        Pais pais = new Pais(codigoString, jTxtNombre.getText()); //Crea un objeto pais de la clase Pais
        PersistenciaPais.agregarPais(pais); //Se guarda el objeto pais en la clase PersistenciaPais
        JOptionPane.showMessageDialog(this, "País agregado con éxito"); //Manda un mensaje que se ha realizado con exito la instruccion
        jTxtCodigo.setText(""); //Se limpiará la caja de texto
        jTxtNombre.setText(""); //Se limpiará la caja de texto
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
            java.util.logging.Logger.getLogger(jFrmAgregarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmAgregarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmAgregarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmAgregarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmAgregarPais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
