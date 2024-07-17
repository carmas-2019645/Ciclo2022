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
public class ActualizarEmpleado extends javax.swing.JInternalFrame {
public static ControlDeEmpleado controlador = ControlDeEmpleado.getInstancia();

    /**
     * metodo VistaActualizarEmpleado
     */
    public ActualizarEmpleado() {
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

        panelActualizarEmpleado = new javax.swing.JPanel();
        lblViejoIdEmpleado = new javax.swing.JLabel();
        txtViejoIdEmpleado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNuevoIdEmpleado = new javax.swing.JLabel();
        txtNuevoIdEmpleado = new javax.swing.JTextField();
        lblNuevoNombreEmpleado = new javax.swing.JLabel();
        txtNuevoNombreEmpleado = new javax.swing.JTextField();
        lblNuevoApellidoEmpleado = new javax.swing.JLabel();
        txtNuevoApellidoEmpleado = new javax.swing.JTextField();
        lblNuevotTelefonoEmpleado = new javax.swing.JLabel();
        txtNuevoTelefonoEmpleado = new javax.swing.JTextField();
        lblNuevoEmailEmpleado = new javax.swing.JLabel();
        txtNuevoEmailEmpleado = new javax.swing.JTextField();
        lblNuevaDireccionEmpleado = new javax.swing.JLabel();
        txtNuevaDireccionEmpleado = new javax.swing.JTextField();
        lblNuevoPuesto = new javax.swing.JLabel();
        txtNuevoPuestoEmpleado = new javax.swing.JTextField();
        lblNuevaProfesion = new javax.swing.JLabel();
        txtNuevaProfesionEmpleado = new javax.swing.JTextField();
        botonActualizarEmpleado = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblViejoIdEmpleado.setText("Antiguo ID Empleado: ");

        lblNuevoIdEmpleado.setText("Nuevo ID Empleado:");

        lblNuevoNombreEmpleado.setText("Nuevo Nombre Empleado:");

        lblNuevoApellidoEmpleado.setText("Nuevo Apellido Empleado:");

        lblNuevotTelefonoEmpleado.setText("Nuevo Telefono Empleado:");

        lblNuevoEmailEmpleado.setText("Nuevo Email:");

        lblNuevaDireccionEmpleado.setText("Nueva Direccion:");

        lblNuevoPuesto.setText("Nuevo Puesto:");

        lblNuevaProfesion.setText("Nueva Profesion: ");

        botonActualizarEmpleado.setText("Actualizar");
        botonActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarEmpleadoLayout = new javax.swing.GroupLayout(panelActualizarEmpleado);
        panelActualizarEmpleado.setLayout(panelActualizarEmpleadoLayout);
        panelActualizarEmpleadoLayout.setHorizontalGroup(
            panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                        .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNuevoIdEmpleado)
                                                .addComponent(lblNuevoApellidoEmpleado))
                                            .addComponent(lblNuevoEmailEmpleado)))
                                    .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(lblNuevaDireccionEmpleado))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarEmpleadoLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNuevoPuesto, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNuevaProfesion, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                        .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txtNuevoIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(txtNuevoApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(25, 25, 25)
                                        .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNuevoNombreEmpleado)
                                            .addComponent(lblNuevotTelefonoEmpleado))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNuevoTelefonoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                            .addComponent(txtNuevoNombreEmpleado)))
                                    .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNuevoPuestoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                            .addComponent(txtNuevaProfesionEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                            .addComponent(txtNuevaDireccionEmpleado)
                                            .addComponent(txtNuevoEmailEmpleado)))))
                            .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(lblViejoIdEmpleado)
                                .addGap(27, 27, 27)
                                .addComponent(txtViejoIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(botonActualizarEmpleado)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelActualizarEmpleadoLayout.setVerticalGroup(
            panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViejoIdEmpleado)
                    .addComponent(txtViejoIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoIdEmpleado)
                    .addComponent(lblNuevoNombreEmpleado)
                    .addComponent(txtNuevoNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoApellidoEmpleado)
                    .addComponent(txtNuevoApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevotTelefonoEmpleado)
                    .addComponent(txtNuevoTelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoEmailEmpleado)
                    .addComponent(txtNuevoEmailEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevaDireccionEmpleado)
                    .addComponent(txtNuevaDireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoPuesto)
                    .addComponent(txtNuevoPuestoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelActualizarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevaProfesionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevaProfesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonActualizarEmpleado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActualizarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarEmpleadoActionPerformed
    Empleado nuevoEmpleado = new Empleado();
        int id = Integer.parseInt(txtViejoIdEmpleado.getText());

        for(Empleado viejoEmpleado: controlador.mostrarEmpleado()){
            if(viejoEmpleado.getId()== id){
                nuevoEmpleado.setId(Integer.parseInt(txtNuevoIdEmpleado.getText()));
                nuevoEmpleado.setNombre(txtNuevoNombreEmpleado.getText());
                nuevoEmpleado.setApellido(txtNuevoApellidoEmpleado.getText());
                nuevoEmpleado.setTelefono(txtNuevoTelefonoEmpleado.getText());
                nuevoEmpleado.setEmail(txtNuevoEmailEmpleado.getText());
                nuevoEmpleado.setDireccion(txtNuevaDireccionEmpleado.getText());
                nuevoEmpleado.setPuesto(txtNuevoPuestoEmpleado.getText());
                nuevoEmpleado.setProfesion(txtNuevaProfesionEmpleado.getText());
                controlador.actualizarEmpleado(viejoEmpleado, nuevoEmpleado);
            }
        }
        this.setVisible(false);
        txtViejoIdEmpleado.setText("");
        txtNuevoIdEmpleado.setText("");
        txtNuevoNombreEmpleado.setText("");
        txtNuevoApellidoEmpleado.setText("");
        txtNuevoTelefonoEmpleado.setText(""); 
        txtNuevoEmailEmpleado.setText("");
        txtNuevaDireccionEmpleado.setText("");
        txtNuevoPuestoEmpleado.setText(""); 
        txtNuevaProfesionEmpleado.setText("");              // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarEmpleado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNuevaDireccionEmpleado;
    private javax.swing.JLabel lblNuevaProfesion;
    private javax.swing.JLabel lblNuevoApellidoEmpleado;
    private javax.swing.JLabel lblNuevoEmailEmpleado;
    private javax.swing.JLabel lblNuevoIdEmpleado;
    private javax.swing.JLabel lblNuevoNombreEmpleado;
    private javax.swing.JLabel lblNuevoPuesto;
    private javax.swing.JLabel lblNuevotTelefonoEmpleado;
    private javax.swing.JLabel lblViejoIdEmpleado;
    private javax.swing.JPanel panelActualizarEmpleado;
    private javax.swing.JTextField txtNuevaDireccionEmpleado;
    private javax.swing.JTextField txtNuevaProfesionEmpleado;
    private javax.swing.JTextField txtNuevoApellidoEmpleado;
    private javax.swing.JTextField txtNuevoEmailEmpleado;
    private javax.swing.JTextField txtNuevoIdEmpleado;
    private javax.swing.JTextField txtNuevoNombreEmpleado;
    private javax.swing.JTextField txtNuevoPuestoEmpleado;
    private javax.swing.JTextField txtNuevoTelefonoEmpleado;
    private javax.swing.JTextField txtViejoIdEmpleado;
    // End of variables declaration//GEN-END:variables
}
