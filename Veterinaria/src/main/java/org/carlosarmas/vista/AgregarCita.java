/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeCitas;
import org.carlosarmas.modelo.Citas;

/**
 *
 * @author Carlos
 */
public class AgregarCita extends javax.swing.JInternalFrame {
public static ControlDeCitas controlador = ControlDeCitas.getInstancia();

    /**
     *metodo VistaAgregarCita
     */
    public AgregarCita() {
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

        panelAgregarCita = new javax.swing.JPanel();
        lblIdCitaAgregar = new javax.swing.JLabel();
        txtIdAgregarCita = new javax.swing.JTextField();
        lblNombreClienteCita = new javax.swing.JLabel();
        txtNombreClienteCita = new javax.swing.JTextField();
        lblCita = new javax.swing.JLabel();
        txtDiaCita = new javax.swing.JTextField();
        lblDiaCita = new javax.swing.JLabel();
        txtMesCita = new javax.swing.JTextField();
        lblMesCita = new javax.swing.JLabel();
        txtServicioCita = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonAceptarCita = new javax.swing.JButton();
        botonCancelarCita = new javax.swing.JButton();
        lblServicioCita = new javax.swing.JLabel();
        txtNombreMascotaCita = new javax.swing.JTextField();
        lblNombreMascotaCita = new javax.swing.JLabel();
        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblIdCitaAgregar.setText("ID Cita:");

        lblNombreClienteCita.setText("Nombre Cliente:");

        lblCita.setText("Fecha Cita");

        lblDiaCita.setText("Dia:");

        lblMesCita.setText("Mes:");

        botonAceptarCita.setText("Aceptar");
        botonAceptarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarCitaActionPerformed(evt);
            }
        });

        botonCancelarCita.setText("Cancelar");
        botonCancelarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarCitaActionPerformed(evt);
            }
        });

        lblServicioCita.setText("Servicio");

        lblNombreMascotaCita.setText("Nombre Mascota");

        lblNota1.setText("DEBES ESCRIBIR EL TIPO DE SERVICIO QUE QUIERES PARA ");

        lblNota2.setText("TU MASCOTA:");

        javax.swing.GroupLayout panelAgregarCitaLayout = new javax.swing.GroupLayout(panelAgregarCita);
        panelAgregarCita.setLayout(panelAgregarCitaLayout);
        panelAgregarCitaLayout.setHorizontalGroup(
            panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                        .addComponent(botonAceptarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelarCita))
                    .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCita)
                                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreMascotaCita, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(txtServicioCita))))
                        .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNombreClienteCita)
                                .addComponent(lblIdCitaAgregar))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreClienteCita, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(txtIdAgregarCita))))
                    .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNota1)
                            .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblDiaCita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(lblMesCita)
                                .addGap(18, 18, 18)
                                .addComponent(txtMesCita, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblServicioCita))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblNota2))
                    .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNombreMascotaCita)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAgregarCitaLayout.setVerticalGroup(
            panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCitaAgregar)
                    .addComponent(txtIdAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreClienteCita)
                    .addComponent(txtNombreClienteCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(lblCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaCita)
                    .addComponent(txtMesCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMesCita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNota2)
                .addGap(9, 9, 9)
                .addComponent(lblServicioCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtServicioCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreMascotaCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMascotaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgregarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarCita)
                    .addComponent(botonAceptarCita))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarCitaActionPerformed
    this.setVisible(false);   
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarCitaActionPerformed

    private void botonAceptarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarCitaActionPerformed
        Citas cita = new Citas();      
        cita.setId(Integer.parseInt(txtIdAgregarCita.getText()));
        cita.setNombre(txtNombreClienteCita.getText());
        cita.setDia(Integer.parseInt(txtDiaCita.getText())); 
        cita.setMes(Integer.parseInt(txtMesCita.getText()));
        cita.setServicio(txtServicioCita.getText());
        cita.setNombreMascota(txtNombreMascotaCita.getText());

        controlador.agregarCitas(cita); 

        this.setVisible(false);
        txtIdAgregarCita.setText("");
        txtNombreClienteCita.setText("");
        txtDiaCita.setText("");
        txtMesCita.setText("");
        txtServicioCita.setText("");
        txtNombreMascotaCita.setText("");

  // TODO add your handling code here:
    }//GEN-LAST:event_botonAceptarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarCita;
    private javax.swing.JButton botonCancelarCita;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCita;
    private javax.swing.JLabel lblDiaCita;
    private javax.swing.JLabel lblIdCitaAgregar;
    private javax.swing.JLabel lblMesCita;
    private javax.swing.JLabel lblNombreClienteCita;
    private javax.swing.JLabel lblNombreMascotaCita;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblServicioCita;
    private javax.swing.JPanel panelAgregarCita;
    private javax.swing.JTextField txtDiaCita;
    private javax.swing.JTextField txtIdAgregarCita;
    private javax.swing.JTextField txtMesCita;
    private javax.swing.JTextField txtNombreClienteCita;
    private javax.swing.JTextField txtNombreMascotaCita;
    private javax.swing.JTextField txtServicioCita;
    // End of variables declaration//GEN-END:variables

   
}
