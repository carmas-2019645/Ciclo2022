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
public class ActualizarCita extends javax.swing.JInternalFrame {
public static ControlDeCitas controladorActualizar = ControlDeCitas.getInstancia();

    /**
     * metodo VistaActualizarCita
     */
    public ActualizarCita() {
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

        panelActualizarCita = new javax.swing.JPanel();
        lblViejoIdCita = new javax.swing.JLabel();
        txtViejoIdCita = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNuevoIdCita = new javax.swing.JLabel();
        txtNuevoIdCita = new javax.swing.JTextField();
        lblNuevoNombreCliente = new javax.swing.JLabel();
        txtNuevoNombreCliente = new javax.swing.JTextField();
        lblNuevaFechaCita = new javax.swing.JLabel();
        lblNuevoDiaCita = new javax.swing.JLabel();
        txtNuevoDiaCita = new javax.swing.JTextField();
        lblNuevoMesCita = new javax.swing.JLabel();
        txtNuevoMesCita = new javax.swing.JTextField();
        lblNuevoServicioCita = new javax.swing.JLabel();
        txtNuevoServicioCita = new javax.swing.JTextField();
        lblNuevoNombreMasCita = new javax.swing.JLabel();
        txtActualizarNombreMascotaCita = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        botonActualizarCita = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblViejoIdCita.setText("Antiguo ID Cita: ");

        lblNuevoIdCita.setText("Nuevo ID Cita:");

        lblNuevoNombreCliente.setText("Nuevo Nombre Cliente:");

        txtNuevoNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoNombreClienteActionPerformed(evt);
            }
        });

        lblNuevaFechaCita.setText("Nueva Fecha Cita");

        lblNuevoDiaCita.setText("Nuevo Dia Cita:");

        lblNuevoMesCita.setText("Nuevo Mes Cita:");

        lblNuevoServicioCita.setText("Nuevo Servicio:");

        lblNuevoNombreMasCita.setText("Nuevo Nombre Mascota: ");

        lblNota.setText("NO OLVIDES ESCRIBIR EL TIPO DE SERVICIO PARA TU MASCOTA");

        botonActualizarCita.setText("Actualizar");
        botonActualizarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarCitaLayout = new javax.swing.GroupLayout(panelActualizarCita);
        panelActualizarCita.setLayout(panelActualizarCitaLayout);
        panelActualizarCitaLayout.setHorizontalGroup(
            panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarCitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNuevoIdCita)
                            .addComponent(lblNuevaFechaCita))
                        .addGap(41, 41, 41)
                        .addComponent(txtNuevoIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblNuevoNombreCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtNuevoNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addGap(67, 67, 67))
                    .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                        .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblNuevoServicioCita))
                            .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNota)
                                    .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                                        .addComponent(lblNuevoDiaCita)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNuevoDiaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(lblNuevoMesCita)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNuevoMesCita, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNuevoNombreMasCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoServicioCita, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(txtActualizarNombreMascotaCita)))
                    .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblViejoIdCita)
                        .addGap(27, 27, 27)
                        .addComponent(txtViejoIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonActualizarCita)
                .addGap(25, 25, 25))
        );
        panelActualizarCitaLayout.setVerticalGroup(
            panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViejoIdCita)
                    .addComponent(txtViejoIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoIdCita)
                    .addComponent(lblNuevoNombreCliente)
                    .addComponent(txtNuevoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNuevaFechaCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoDiaCita)
                    .addComponent(txtNuevoDiaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoMesCita)
                    .addComponent(txtNuevoMesCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lblNota)
                .addGap(18, 18, 18)
                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoServicioCita)
                    .addComponent(txtNuevoServicioCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarCita)
                    .addComponent(lblNuevoNombreMasCita)
                    .addComponent(txtActualizarNombreMascotaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizarCita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActualizarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarCitaActionPerformed
    Citas citaNueva = new Citas();
        int id = Integer.parseInt(txtViejoIdCita.getText());

        for(Citas citaVieja: controladorActualizar.mostrarCitas()){
            if(citaVieja.getId()== id){
                citaNueva.setId(Integer.parseInt(txtNuevoIdCita.getText()));
                citaNueva.setNombre(txtNuevoNombreCliente.getText());
                citaNueva.setDia(Integer.parseInt(txtNuevoDiaCita.getText()));
                citaNueva.setMes(Integer.parseInt(txtNuevoMesCita.getText()));
                citaNueva.setServicio(txtNuevoServicioCita.getText());
                citaNueva.setNombreMascota(txtActualizarNombreMascotaCita.getText());
                controladorActualizar.actualizarCita(citaVieja, citaNueva);
            }
        }
        this.setVisible(false);
        txtViejoIdCita.setText("");
        txtNuevoIdCita.setText("");
        txtNuevoNombreCliente.setText("");
        txtNuevoDiaCita.setText("");
        txtNuevoMesCita.setText("");
        txtNuevoServicioCita.setText(""); 
        txtActualizarNombreMascotaCita.setText("");              // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarCitaActionPerformed

    private void txtNuevoNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoNombreClienteActionPerformed
        // TODO agregue su código de manejo aquí:
    }//GEN-LAST:event_txtNuevoNombreClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarCita;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblNuevaFechaCita;
    private javax.swing.JLabel lblNuevoDiaCita;
    private javax.swing.JLabel lblNuevoIdCita;
    private javax.swing.JLabel lblNuevoMesCita;
    private javax.swing.JLabel lblNuevoNombreCliente;
    private javax.swing.JLabel lblNuevoNombreMasCita;
    private javax.swing.JLabel lblNuevoServicioCita;
    private javax.swing.JLabel lblViejoIdCita;
    private javax.swing.JPanel panelActualizarCita;
    private javax.swing.JTextField txtActualizarNombreMascotaCita;
    private javax.swing.JTextField txtNuevoDiaCita;
    private javax.swing.JTextField txtNuevoIdCita;
    private javax.swing.JTextField txtNuevoMesCita;
    private javax.swing.JTextField txtNuevoNombreCliente;
    private javax.swing.JTextField txtNuevoServicioCita;
    private javax.swing.JTextField txtViejoIdCita;
    // End of variables declaration//GEN-END:variables
}
