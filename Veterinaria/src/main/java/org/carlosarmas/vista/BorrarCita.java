/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeCitas;

/**
 *
 * @author Carlos
 */
public class BorrarCita extends javax.swing.JInternalFrame {
public static ControlDeCitas controlador = ControlDeCitas.getInstancia();

    /**
     * metodo VistaBorrarCita
     */
    public BorrarCita() {
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

        panelBorrarCita = new javax.swing.JPanel();
        lblBorrarCita = new javax.swing.JLabel();
        txtBorrarCita = new javax.swing.JTextField();
        botonBorrarCita = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblBorrarCita.setText("Ingrese ID:");

        botonBorrarCita.setText("Borrar");
        botonBorrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorrarCitaLayout = new javax.swing.GroupLayout(panelBorrarCita);
        panelBorrarCita.setLayout(panelBorrarCitaLayout);
        panelBorrarCitaLayout.setHorizontalGroup(
            panelBorrarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorrarCitaLayout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(txtBorrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(panelBorrarCitaLayout.createSequentialGroup()
                .addGroup(panelBorrarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorrarCitaLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(botonBorrarCita))
                    .addGroup(panelBorrarCitaLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblBorrarCita)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorrarCitaLayout.setVerticalGroup(
            panelBorrarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarCitaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblBorrarCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBorrarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botonBorrarCita)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorrarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBorrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarCitaActionPerformed
        controlador.eliminarCita(Integer.parseInt(txtBorrarCita.getText()));    
        this.setVisible(false);  
        txtBorrarCita.setText("");       
 // TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrarCita;
    private javax.swing.JLabel lblBorrarCita;
    private javax.swing.JPanel panelBorrarCita;
    private javax.swing.JTextField txtBorrarCita;
    // End of variables declaration//GEN-END:variables
}
