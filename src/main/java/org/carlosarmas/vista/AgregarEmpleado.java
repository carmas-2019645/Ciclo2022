/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeEmpleado;
import org.carlosarmas.modelo.Empleado;

/**
 *
 * @author Carlos
 */
public class AgregarEmpleado extends javax.swing.JInternalFrame {
public static ControlDeEmpleado controlador = ControlDeEmpleado.getInstancia();

    /**
     * metodo VistaAgregarEmpleado
     */
    public AgregarEmpleado() {
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

        panelEmpleado = new javax.swing.JPanel();
        lblIdEmpleadoAgregar = new javax.swing.JLabel();
        txtIdAgregarEmpleado = new javax.swing.JTextField();
        lblNombreEmpleado = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        lblApellidoEmpleado = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        lblTelefonoEmpleado = new javax.swing.JLabel();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        lblEmailEmpleado = new javax.swing.JLabel();
        txtEmailEmpleado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonAceptarEmpleado = new javax.swing.JButton();
        botonCancelarEmpleado = new javax.swing.JButton();
        lblPuestoEmpleado = new javax.swing.JLabel();
        lblDireccionEmpleado = new javax.swing.JLabel();
        txtDireccionEmpleado = new javax.swing.JTextField();
        txtPuestoEmpleado = new javax.swing.JTextField();
        lblProfesionEmpleado = new javax.swing.JLabel();
        txtProfesionEmpleado = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblIdEmpleadoAgregar.setText("ID Empleado:");

        lblNombreEmpleado.setText("Nombre Empleado");

        lblApellidoEmpleado.setText("Apellido Empleado");

        lblTelefonoEmpleado.setText("Telefono Empleado");

        lblEmailEmpleado.setText("Email Empleado");

        botonAceptarEmpleado.setText("Aceptar");
        botonAceptarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarEmpleadoActionPerformed(evt);
            }
        });

        botonCancelarEmpleado.setText("Cancelar");
        botonCancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarEmpleadoActionPerformed(evt);
            }
        });

        lblPuestoEmpleado.setText("Puesto Empleado:");

        lblDireccionEmpleado.setText("Direccion Empleado");

        lblProfesionEmpleado.setText("Profesion Empleado:");

        javax.swing.GroupLayout panelEmpleadoLayout = new javax.swing.GroupLayout(panelEmpleado);
        panelEmpleado.setLayout(panelEmpleadoLayout);
        panelEmpleadoLayout.setHorizontalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addComponent(botonAceptarEmpleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelarEmpleado))
                    .addGroup(panelEmpleadoLayout.createSequentialGroup()
                        .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                                .addComponent(lblIdEmpleadoAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPuestoEmpleado)
                    .addComponent(txtPuestoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreEmpleado)
                    .addComponent(lblApellidoEmpleado)
                    .addComponent(lblTelefonoEmpleado)
                    .addComponent(lblProfesionEmpleado)
                    .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtProfesionEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txtDireccionEmpleado)
                        .addComponent(txtEmailEmpleado)
                        .addComponent(txtTelefonoEmpleado)
                        .addComponent(txtApellidoEmpleado)
                        .addComponent(txtNombreEmpleado))
                    .addComponent(lblDireccionEmpleado)
                    .addComponent(lblEmailEmpleado))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelEmpleadoLayout.setVerticalGroup(
            panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEmpleadoAgregar)
                    .addComponent(txtIdAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellidoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefonoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccionEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPuestoEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPuestoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfesionEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProfesionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarEmpleado)
                    .addComponent(botonAceptarEmpleado))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarEmpleadoActionPerformed
    this.setVisible(false);   
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarEmpleadoActionPerformed

    private void botonAceptarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarEmpleadoActionPerformed
        Empleado cliente = new Empleado();      
        cliente.setId(Integer.parseInt(txtIdAgregarEmpleado.getText()));
        cliente.setNombre(txtNombreEmpleado.getText());
        cliente.setApellido(txtApellidoEmpleado.getText()); 
        cliente.setTelefono(txtTelefonoEmpleado.getText());
        cliente.setEmail(txtEmailEmpleado.getText());
        cliente.setDireccion(txtDireccionEmpleado.getText());
        cliente.setPuesto(txtPuestoEmpleado.getText());
        cliente.setProfesion(txtProfesionEmpleado.getText());

        controlador.agregarEmpleado(cliente); 

        this.setVisible(false);
        txtIdAgregarEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtApellidoEmpleado.setText("");
        txtTelefonoEmpleado.setText("");
        txtEmailEmpleado.setText("");
        txtDireccionEmpleado.setText("");
        txtPuestoEmpleado.setText("");
        txtProfesionEmpleado.setText("");

  // TODO add your handling code here:
    }//GEN-LAST:event_botonAceptarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarEmpleado;
    private javax.swing.JButton botonCancelarEmpleado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidoEmpleado;
    private javax.swing.JLabel lblDireccionEmpleado;
    private javax.swing.JLabel lblEmailEmpleado;
    private javax.swing.JLabel lblIdEmpleadoAgregar;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblProfesionEmpleado;
    private javax.swing.JLabel lblPuestoEmpleado;
    private javax.swing.JLabel lblTelefonoEmpleado;
    private javax.swing.JPanel panelEmpleado;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextField txtDireccionEmpleado;
    private javax.swing.JTextField txtEmailEmpleado;
    private javax.swing.JTextField txtIdAgregarEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtProfesionEmpleado;
    private javax.swing.JTextField txtPuestoEmpleado;
    private javax.swing.JTextField txtTelefonoEmpleado;
    // End of variables declaration//GEN-END:variables

   
}
