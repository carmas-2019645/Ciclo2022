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
public class AgregarDoctor extends javax.swing.JInternalFrame {
public static ControlDeMedico controladorMedico = ControlDeMedico.getInstancia();

    /**
     * metodo VistaAgregarDoctor
     */
    public AgregarDoctor() {
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

        panelAgregarDoctor = new javax.swing.JPanel();
        lblIdDoctorAgregar = new javax.swing.JLabel();
        txtIdDoctor = new javax.swing.JTextField();
        lblNombreDoctorAgregar = new javax.swing.JLabel();
        txtNombreDoctor = new javax.swing.JTextField();
        lblApellidoDoctor = new javax.swing.JLabel();
        txtApellidoDoctor = new javax.swing.JTextField();
        lblTelefonoDoctor = new javax.swing.JLabel();
        txtTelefonoDoctor = new javax.swing.JTextField();
        lblEspecialidadDoctor = new javax.swing.JLabel();
        txtEspecialidadDoctor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonAceptarDoctor = new javax.swing.JButton();
        botonCancelarDoctor = new javax.swing.JButton();
        lblDireccionDoctor = new javax.swing.JLabel();
        lblEmailDoctor = new javax.swing.JLabel();
        txtEmailDoctor = new javax.swing.JTextField();
        txtDireccionDoctor = new javax.swing.JTextField();
        lblEstudiosDoctor = new javax.swing.JLabel();
        txtEstudiosDoctor = new javax.swing.JTextField();
        lblColegiadoDoctor = new javax.swing.JLabel();
        txtColegiadoDoctor = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblIdDoctorAgregar.setText("ID Doctor:");

        lblNombreDoctorAgregar.setText("Nombre Doctor");

        lblApellidoDoctor.setText("Apellido Doctor");

        lblTelefonoDoctor.setText("Telefono Doctor");

        lblEspecialidadDoctor.setText("Especialidad ");

        botonAceptarDoctor.setText("Aceptar");
        botonAceptarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarDoctorActionPerformed(evt);
            }
        });

        botonCancelarDoctor.setText("Cancelar");
        botonCancelarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarDoctorActionPerformed(evt);
            }
        });

        lblDireccionDoctor.setText("Dirrecion");

        lblEmailDoctor.setText("email");

        lblEstudiosDoctor.setText("Estudios");

        lblColegiadoDoctor.setText("Colegiado");

        javax.swing.GroupLayout panelAgregarDoctorLayout = new javax.swing.GroupLayout(panelAgregarDoctor);
        panelAgregarDoctor.setLayout(panelAgregarDoctorLayout);
        panelAgregarDoctorLayout.setHorizontalGroup(
            panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addComponent(botonAceptarDoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelarDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGroup(panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                                .addComponent(lblIdDoctorAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgregarDoctorLayout.createSequentialGroup()
                        .addComponent(txtColegiadoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGroup(panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstudiosDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtDireccionDoctor)
                            .addComponent(txtEmailDoctor)
                            .addComponent(txtEspecialidadDoctor)
                            .addComponent(txtTelefonoDoctor)
                            .addComponent(txtApellidoDoctor)
                            .addComponent(txtNombreDoctor))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                .addGroup(panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblColegiadoDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblEstudiosDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblDireccionDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblEmailDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblTelefonoDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblEspecialidadDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblApellidoDoctor))
                    .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblNombreDoctorAgregar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAgregarDoctorLayout.setVerticalGroup(
            panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdDoctorAgregar)
                    .addComponent(txtIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreDoctorAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblApellidoDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefonoDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEspecialidadDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEspecialidadDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccionDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstudiosDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstudiosDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblColegiadoDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColegiadoDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgregarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarDoctor)
                    .addComponent(botonAceptarDoctor))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregarDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarDoctorActionPerformed
    this.setVisible(false);   
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarDoctorActionPerformed

    private void botonAceptarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarDoctorActionPerformed
        Medico medico = new Medico();      
        medico.setId(Integer.parseInt(txtIdDoctor.getText()));
        medico.setNombre(txtNombreDoctor.getText());
        medico.setApellido(txtApellidoDoctor.getText()); 
        medico.setTelefono(txtTelefonoDoctor.getText());
        medico.setEspecialidad(txtEspecialidadDoctor.getText());
        medico.setEmail(txtEmailDoctor.getText());
        medico.setDireccion(txtDireccionDoctor.getText());
        medico.setEstudios(txtEstudiosDoctor.getText());
        medico.setColegiado(txtColegiadoDoctor.getText());

        controladorMedico.agregarMedico(medico); 

        this.setVisible(false);
        txtIdDoctor.setText("");
        txtNombreDoctor.setText("");
        txtApellidoDoctor.setText("");
        txtTelefonoDoctor.setText("");
        txtEspecialidadDoctor.setText("");
        txtEmailDoctor.setText("");
        txtDireccionDoctor.setText("");
        txtEstudiosDoctor.setText("");
        txtColegiadoDoctor.setText("");

  // TODO add your handling code here:
    }//GEN-LAST:event_botonAceptarDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarDoctor;
    private javax.swing.JButton botonCancelarDoctor;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidoDoctor;
    private javax.swing.JLabel lblColegiadoDoctor;
    private javax.swing.JLabel lblDireccionDoctor;
    private javax.swing.JLabel lblEmailDoctor;
    private javax.swing.JLabel lblEspecialidadDoctor;
    private javax.swing.JLabel lblEstudiosDoctor;
    private javax.swing.JLabel lblIdDoctorAgregar;
    private javax.swing.JLabel lblNombreDoctorAgregar;
    private javax.swing.JLabel lblTelefonoDoctor;
    private javax.swing.JPanel panelAgregarDoctor;
    private javax.swing.JTextField txtApellidoDoctor;
    private javax.swing.JTextField txtColegiadoDoctor;
    private javax.swing.JTextField txtDireccionDoctor;
    private javax.swing.JTextField txtEmailDoctor;
    private javax.swing.JTextField txtEspecialidadDoctor;
    private javax.swing.JTextField txtEstudiosDoctor;
    private javax.swing.JTextField txtIdDoctor;
    private javax.swing.JTextField txtNombreDoctor;
    private javax.swing.JTextField txtTelefonoDoctor;
    // End of variables declaration//GEN-END:variables

   
}
