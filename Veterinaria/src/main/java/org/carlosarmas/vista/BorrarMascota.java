/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeMascota;

/**
 *
 * @author Carlos
 */
public class BorrarMascota extends javax.swing.JInternalFrame {
public static ControlDeMascota controlador = ControlDeMascota.getInstancia();

    /**
     * metodo VistaBorrarMascota
     */
    public BorrarMascota() {
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

        panelBorrarMascota = new javax.swing.JPanel();
        lblBorraMascota = new javax.swing.JLabel();
        txtBorrarMascota = new javax.swing.JTextField();
        botonBorrarMascota = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblBorraMascota.setText("Ingrese ID:");

        botonBorrarMascota.setText("Borrar");
        botonBorrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorrarMascotaLayout = new javax.swing.GroupLayout(panelBorrarMascota);
        panelBorrarMascota.setLayout(panelBorrarMascotaLayout);
        panelBorrarMascotaLayout.setHorizontalGroup(
            panelBorrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorrarMascotaLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(txtBorrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelBorrarMascotaLayout.createSequentialGroup()
                .addGroup(panelBorrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorrarMascotaLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(botonBorrarMascota))
                    .addGroup(panelBorrarMascotaLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblBorraMascota)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorrarMascotaLayout.setVerticalGroup(
            panelBorrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarMascotaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblBorraMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBorrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botonBorrarMascota)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBorrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarMascotaActionPerformed
        controlador.eliminarMascota(Integer.parseInt(txtBorrarMascota.getText()));    
        this.setVisible(false);  
        txtBorrarMascota.setText("");       
 // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarMascota;
    private javax.swing.JLabel lblBorraMascota;
    private javax.swing.JPanel panelBorrarMascota;
    private javax.swing.JTextField txtBorrarMascota;
    // End of variables declaration//GEN-END:variables
}
