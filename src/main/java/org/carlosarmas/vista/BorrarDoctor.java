/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeMedico;

/**
 *
 * @author Carlos
 */
public class BorrarDoctor extends javax.swing.JInternalFrame {
public static ControlDeMedico controlador = ControlDeMedico.getInstancia();

    /**
     * metodo VistaBorrarDoctor
     */
    public BorrarDoctor() {
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

        panelBorrarDoctor = new javax.swing.JPanel();
        lblBorrarDoctor = new javax.swing.JLabel();
        txtBorrarDoctor = new javax.swing.JTextField();
        botonBorrarDoctor = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblBorrarDoctor.setText("Ingrese ID:");

        botonBorrarDoctor.setText("Borrar");
        botonBorrarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorrarDoctorLayout = new javax.swing.GroupLayout(panelBorrarDoctor);
        panelBorrarDoctor.setLayout(panelBorrarDoctorLayout);
        panelBorrarDoctorLayout.setHorizontalGroup(
            panelBorrarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorrarDoctorLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(txtBorrarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelBorrarDoctorLayout.createSequentialGroup()
                .addGroup(panelBorrarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorrarDoctorLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(botonBorrarDoctor))
                    .addGroup(panelBorrarDoctorLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblBorrarDoctor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorrarDoctorLayout.setVerticalGroup(
            panelBorrarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarDoctorLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblBorrarDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBorrarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botonBorrarDoctor)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBorrarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarDoctorActionPerformed
        controlador.eliminarMedico(Integer.parseInt(txtBorrarDoctor.getText()));    
        this.setVisible(false);  
        txtBorrarDoctor.setText("");       
 // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarDoctor;
    private javax.swing.JLabel lblBorrarDoctor;
    private javax.swing.JPanel panelBorrarDoctor;
    private javax.swing.JTextField txtBorrarDoctor;
    // End of variables declaration//GEN-END:variables
}
