/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeEmpleado;

/**
 *
 * @author Carlos
 */
public class BorrarEmpleado extends javax.swing.JInternalFrame {
public static ControlDeEmpleado controlador = ControlDeEmpleado.getInstancia();

    /**
     * metodo VistaBorrarEmpleado
     */
    public BorrarEmpleado() {
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
        lblBorrarEmpleado = new javax.swing.JLabel();
        txtBorrarEmpleado = new javax.swing.JTextField();
        botonBorrarEmpleado = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblBorrarEmpleado.setText("Ingrese ID:");

        botonBorrarEmpleado.setText("Borrar");
        botonBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorrarClienteLayout = new javax.swing.GroupLayout(panelBorrarCliente);
        panelBorrarCliente.setLayout(panelBorrarClienteLayout);
        panelBorrarClienteLayout.setHorizontalGroup(
            panelBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorrarClienteLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(txtBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                .addGroup(panelBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(botonBorrarEmpleado))
                    .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblBorrarEmpleado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorrarClienteLayout.setVerticalGroup(
            panelBorrarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarClienteLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblBorrarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botonBorrarEmpleado)
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

    private void botonBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarEmpleadoActionPerformed
        controlador.eliminarEmpleado(Integer.parseInt(txtBorrarEmpleado.getText()));    
        this.setVisible(false);  
        txtBorrarEmpleado.setText("");       
 // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarEmpleado;
    private javax.swing.JLabel lblBorrarEmpleado;
    private javax.swing.JPanel panelBorrarCliente;
    private javax.swing.JTextField txtBorrarEmpleado;
    // End of variables declaration//GEN-END:variables
}
