package capaGrafica;

import capaLogica.*; //Se importan las clases de la capaLogica
import capaPersistencias.*; //Se importan las clases de la capaPersistencia
import java.util.ArrayList; //Se importa la clase ArrayList
import javax.swing.DefaultListModel; //Se importa la clase DefaultListModel
import javax.swing.JOptionPane; //Se importa la clase JOptionPane

/**
 *
 * @author ronaldoucl
 */
public class jFrmActivarDesactivarPais extends javax.swing.JFrame {

    DefaultListModel listaPais = new DefaultListModel(); //Se inicializa y se crea un objeto de la clase DefaultListModel

    public jFrmActivarDesactivarPais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLstPaises = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        jBtnActivarDesactivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Activar o Desactivar Pais");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportView(jLstPaises);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Lista de Países");

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnActivarDesactivar.setText("Activar o Desactivar");
        jBtnActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActivarDesactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnActivarDesactivar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnActivarDesactivar)
                    .addComponent(jBtnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLstPaises.setModel(listaPais); //Se crea una conexion entre el DefaultListModel y el jLstPaises
        llenarLista(); //Al abrirse la ventana se ejecutará el método llenarLista()
    }//GEN-LAST:event_formWindowOpened

    public void llenarLista() { //Método llenarLista con el propósito de llenar o actualizar el jLstPaises
        listaPais.removeAllElements(); //Antes de llenar el jLstClientes, primera se limpiará
        for (Pais pais : PersistenciaPais.getArrayPaises()) { //ciclo for each
            String hilera = pais.toStringEstado(); //Concatenación de los atributos que se mostrarán en el jLstPaises
            listaPais.addElement(hilera); //Se agrega la variable hilera a la posición del jLstPaises
        } //Se cierra el ciclo for each
    } //Se cierra el método llenarLista

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose(); //Instruccion para cerrar la ventana
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActivarDesactivarActionPerformed
        int indice = jLstPaises.getSelectedIndex(); //Variable indice de tipo int que guardará la posición seleccionada
        Status status = null; //Se inicializa una variable de la clase enumerador y se le dará un valor null
        ArrayList<Pais> arrayPais = PersistenciaPais.getArrayPaises(); //Se inicializa un arrayList y guardará el arrayList de la clase PersistenciaPais

        if (indice == -1) { //Si el indice seleccionado es -1, osea, no hay nada seleccionado
            JOptionPane.showMessageDialog(this, "Seleccione el país que desea Activar/Desactivar"); //Mostrará un mensaje de alerta por medio de un JOptionPane
        } //Se cierra la condición if
        else {
            if (arrayPais.get(indice).getStatus() == status.ACTIVO) { //Condicion que se aplicará Si el status del objeto es ACTIVO
                PersistenciaPais.desactivarPais(indice); //Instrucción para cambiar el estado del objeto a INACTIVO
                JOptionPane.showMessageDialog(this, "Se ha actualizado la información del País"); //Mensaje de confirmación
                llenarLista(); //Método para llenar o actualizar el jLstPaises
            }  //Se cierra la condicion if
            else {
                PersistenciaPais.activarPais(indice); //Instrucción para cambiar el status del objeto a ACTIVO
                JOptionPane.showMessageDialog(this, "Se ha actualizado la información del País"); //Mensaje de confirmación
                llenarLista(); //Método para llenar o actualizar el jLstPaises
            } //Se cierra la condición else
        } //Se cierra la condicion else
    }//GEN-LAST:event_jBtnActivarDesactivarActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmActivarDesactivarPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmActivarDesactivarPais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActivarDesactivar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLstPaises;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
