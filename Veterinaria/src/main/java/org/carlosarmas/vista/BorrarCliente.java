/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeCliente;

/**
 *
 * @author Carlos
 */
public class BorrarCliente extends javax.swing.JInternalFrame {
public static ControlDeCliente controlador = ControlDeCliente.getInstancia();

    /**
     * metodo VistaBorrarCliente
     */
    public BorrarCliente() {
        initComponents();
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar.
     * NO modifique este código. El contenido de este método es siempre
     * Regenerada por los metodos.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorrarCliente = new javax.swing.JPanel();
        lblBorrarCliente = new javax.swing.JLabel();
        txtBorrarCliente = new javax.swing.JTextField();
        botonBorrarCliente = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblBorrarCliente.setText("Ingrese ID:");

        botonBorrarCliente.setText("Borrar");
        botonBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorrarClienteLayout = new javax.swing.GroupLayout(panelBorrarCliente);
        panelBorrarCliente.setLayout(panelBorrarClienteLayout);
        panelBorrarClienteLayout.setHorizontalGroup(
            panelBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorrarClienteLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(txtBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                .addGroup(panelBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(botonBorrarCliente))
                    .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblBorrarCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorrarClienteLayout.setVerticalGroup(
            panelBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblBorrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botonBorrarCliente)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarClienteActionPerformed
        controlador.eliminarCliente(Integer.parseInt(txtBorrarCliente.getText()));    
        this.setVisible(false);  
        txtBorrarCliente.setText("");       
 // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarCliente;
    private javax.swing.JLabel lblBorrarCliente;
    private javax.swing.JPanel panelBorrarCliente;
    private javax.swing.JTextField txtBorrarCliente;
    // End of variables declaration//GEN-END:variables
}
