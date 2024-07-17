/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeMedico;
import org.carlosarmas.modelo.Medico;

/**
 *
 * @author Carlos
 */
public class ActualizarDoctor extends javax.swing.JInternalFrame {
public static ControlDeMedico controladorActualizar = ControlDeMedico.getInstancia();

    /**
     * metodo VistaActualizarDoctor
     */
    public ActualizarDoctor() {
        initComponents();
    }

    /**
     * Este método se llama desde dentro del constructor para inicializar.
     *  NO modifique este código. El contenido de este método es siempre
     * Regenerada por los metodos.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelActualizarDoctor = new javax.swing.JPanel();
        lblViejoIdDoctorActualizar = new javax.swing.JLabel();
        txtViejoIdDoctor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNuevoIdDoctor = new javax.swing.JLabel();
        txtNuevoIdDoctor = new javax.swing.JTextField();
        lblNuevoNombreDoctor = new javax.swing.JLabel();
        txtNuevoNombreDoctor = new javax.swing.JTextField();
        lblNuevoApellidoDoctor = new javax.swing.JLabel();
        txtNuevoApellido = new javax.swing.JTextField();
        lblNuevotTelefonoDoctor = new javax.swing.JLabel();
        txtNuevoTelefonoDoctor = new javax.swing.JTextField();
        lblNuevaEspecialidadDoctor = new javax.swing.JLabel();
        txtNuevaEspecialidad = new javax.swing.JTextField();
        botonActualizarDoctor = new javax.swing.JButton();
        lblNuevoEmail = new javax.swing.JLabel();
        txtNuevoEmailDoctor = new javax.swing.JTextField();
        lblNuevaDireccion = new javax.swing.JLabel();
        txtNuevaDireccion = new javax.swing.JTextField();
        lblNuevoEstudioDoctor = new javax.swing.JLabel();
        txtNuevoEstudioDoctor = new javax.swing.JTextField();
        lblColegiadoActualizar = new javax.swing.JLabel();
        txtActualizarColegiado = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblViejoIdDoctorActualizar.setText("Antiguo ID Doctor: ");

        lblNuevoIdDoctor.setText("Nuevo ID Doctor:");

        lblNuevoNombreDoctor.setText("Nuevo Nombre Doctor:");

        lblNuevoApellidoDoctor.setText("Nuevo Apellido Doctor:");

        lblNuevotTelefonoDoctor.setText("Nuevo Telefono Doctor:");

        lblNuevaEspecialidadDoctor.setText("Nueva Especialidad:");

        botonActualizarDoctor.setText("Actualizar");
        botonActualizarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarDoctorActionPerformed(evt);
            }
        });

        lblNuevoEmail.setText("Nuevo Email");

        lblNuevaDireccion.setText("Nueva Direccion:");

        lblNuevoEstudioDoctor.setText("Nuevos Estudios:");

        lblColegiadoActualizar.setText("Nuevo Colegiado:");

        javax.swing.GroupLayout panelActualizarDoctorLayout = new javax.swing.GroupLayout(panelActualizarDoctor);
        panelActualizarDoctor.setLayout(panelActualizarDoctorLayout);
        panelActualizarDoctorLayout.setHorizontalGroup(
            panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNuevaEspecialidadDoctor)
                            .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNuevoIdDoctor)
                                .addComponent(lblNuevoApellidoDoctor))
                            .addComponent(lblNuevoEstudioDoctor))
                        .addGap(12, 12, 12)
                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNuevoIdDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(txtNuevoApellido)
                                    .addComponent(txtNuevaEspecialidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                        .addComponent(lblNuevoNombreDoctor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNuevoNombreDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNuevaDireccion)
                                            .addComponent(lblNuevotTelefonoDoctor))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNuevaDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtNuevoTelefonoDoctor)))))
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addComponent(txtNuevoEstudioDoctor)
                                .addGap(18, 18, 18)
                                .addComponent(lblColegiadoActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(txtActualizarColegiado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                        .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(lblViejoIdDoctorActualizar)
                                .addGap(27, 27, 27)
                                .addComponent(txtViejoIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(botonActualizarDoctor))
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(lblNuevoEmail))
                            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(txtNuevoEmailDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelActualizarDoctorLayout.setVerticalGroup(
            panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViejoIdDoctorActualizar)
                    .addComponent(txtViejoIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoIdDoctor)
                    .addComponent(lblNuevoNombreDoctor)
                    .addComponent(txtNuevoNombreDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoApellidoDoctor)
                    .addComponent(txtNuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevotTelefonoDoctor)
                    .addComponent(txtNuevoTelefonoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevaEspecialidadDoctor)
                    .addComponent(txtNuevaEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevaDireccion)
                    .addComponent(txtNuevaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNuevoEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoEmailDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panelActualizarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoEstudioDoctor)
                    .addComponent(txtNuevoEstudioDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColegiadoActualizar)
                    .addComponent(txtActualizarColegiado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonActualizarDoctor)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizarDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActualizarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarDoctorActionPerformed
    Medico nuevoMedico = new Medico();
        int id = Integer.parseInt(txtViejoIdDoctor.getText());

        for(Medico medicoAntiguo: controladorActualizar.mostrarMedico()){
            if(medicoAntiguo.getId()== id){
                nuevoMedico.setId(Integer.parseInt(txtNuevoIdDoctor.getText()));
                nuevoMedico.setNombre(txtNuevoNombreDoctor.getText());
                nuevoMedico.setApellido(txtNuevoApellido.getText());
                nuevoMedico.setTelefono(txtNuevoTelefonoDoctor.getText());
                nuevoMedico.setEspecialidad(txtNuevaEspecialidad.getText());
                nuevoMedico.setDireccion(txtNuevaDireccion.getText());
                nuevoMedico.setEmail(txtNuevoEmailDoctor.getText());
                nuevoMedico.setEstudios(txtNuevoEstudioDoctor.getText());
                nuevoMedico.setColegiado(txtActualizarColegiado.getText());
                controladorActualizar.actualizarMedico(medicoAntiguo, nuevoMedico);
            }
        }
        this.setVisible(false);
        txtViejoIdDoctor.setText("");
        txtNuevoIdDoctor.setText("");
        txtNuevoNombreDoctor.setText("");
        txtNuevoApellido.setText("");
        txtNuevoTelefonoDoctor.setText(""); 
        txtNuevaEspecialidad.setText(""); 
        txtNuevoEmailDoctor.setText("");
        txtNuevaDireccion.setText("");
        txtNuevoEstudioDoctor.setText(""); 
        txtActualizarColegiado.setText("");              // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarDoctor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblColegiadoActualizar;
    private javax.swing.JLabel lblNuevaDireccion;
    private javax.swing.JLabel lblNuevaEspecialidadDoctor;
    private javax.swing.JLabel lblNuevoApellidoDoctor;
    private javax.swing.JLabel lblNuevoEmail;
    private javax.swing.JLabel lblNuevoEstudioDoctor;
    private javax.swing.JLabel lblNuevoIdDoctor;
    private javax.swing.JLabel lblNuevoNombreDoctor;
    private javax.swing.JLabel lblNuevotTelefonoDoctor;
    private javax.swing.JLabel lblViejoIdDoctorActualizar;
    private javax.swing.JPanel panelActualizarDoctor;
    private javax.swing.JTextField txtActualizarColegiado;
    private javax.swing.JTextField txtNuevaDireccion;
    private javax.swing.JTextField txtNuevaEspecialidad;
    private javax.swing.JTextField txtNuevoApellido;
    private javax.swing.JTextField txtNuevoEmailDoctor;
    private javax.swing.JTextField txtNuevoEstudioDoctor;
    private javax.swing.JTextField txtNuevoIdDoctor;
    private javax.swing.JTextField txtNuevoNombreDoctor;
    private javax.swing.JTextField txtNuevoTelefonoDoctor;
    private javax.swing.JTextField txtViejoIdDoctor;
    // End of variables declaration//GEN-END:variables
}
