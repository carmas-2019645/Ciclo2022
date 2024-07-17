/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeCliente;
import org.carlosarmas.modelo.Cliente;

/**
 *
 * @author Carlos
 */
public class ActualizarCliente extends javax.swing.JInternalFrame {
public static ControlDeCliente controladorActualizar = ControlDeCliente.getInstancia();

    /**
     * metodo VistaActualizarCliente
     */
    public ActualizarCliente() {
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

        panelActualizarCliente = new javax.swing.JPanel();
        lblViejoIdCliente = new javax.swing.JLabel();
        txtViejoIdCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNuevoIdCliente = new javax.swing.JLabel();
        txtNuevoIdCliente = new javax.swing.JTextField();
        lblNuevoNombreCliente = new javax.swing.JLabel();
        txtNuevoNombreCliente = new javax.swing.JTextField();
        lblNuevoApellidoCliente = new javax.swing.JLabel();
        txtNuevoApellidoCliente = new javax.swing.JTextField();
        lblNuevotTelefonoCliente = new javax.swing.JLabel();
        txtNuevoTelefonoCliente = new javax.swing.JTextField();
        lblNuevoEmailCliente = new javax.swing.JLabel();
        txtNuevoEmailCliente = new javax.swing.JTextField();
        lblNuevaDireccionCliente = new javax.swing.JLabel();
        txtNuevaDireccionCliente = new javax.swing.JTextField();
        lblNuevaMascotaCliente = new javax.swing.JLabel();
        txtNuevaMascotaCliente = new javax.swing.JTextField();
        lblNuevoNombreMasCliente = new javax.swing.JLabel();
        txtActualizarNombreMascotaCliente = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        botonActualizarCliente = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblViejoIdCliente.setText("Antiguo ID Cliente: ");

        lblNuevoIdCliente.setText("Nuevo ID Cliente:");

        lblNuevoNombreCliente.setText("Nuevo Nombre Cliente:");

        lblNuevoApellidoCliente.setText("Nuevo Apellido Cliente:");

        lblNuevotTelefonoCliente.setText("Nuevo Telefono Cliente:");

        lblNuevoEmailCliente.setText("Nuevo Email:");

        lblNuevaDireccionCliente.setText("Nueva Direccion:");

        lblNuevaMascotaCliente.setText("Nueva Mascota:");

        lblNuevoNombreMasCliente.setText("Nuevo Nombre Mascota: ");

        lblNota.setText("NO OLVIDES QUE EN NUEVA MASCOTA DEBES  PONER SI TU MASCOTA ES UN PERRO U OTRO ANIMAL");

        botonActualizarCliente.setText("Actualizar");
        botonActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarClienteLayout = new javax.swing.GroupLayout(panelActualizarCliente);
        panelActualizarCliente.setLayout(panelActualizarClienteLayout);
        panelActualizarClienteLayout.setHorizontalGroup(
            panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarClienteLayout.createSequentialGroup()
                        .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNuevoIdCliente)
                                        .addComponent(lblNuevoApellidoCliente))
                                    .addComponent(lblNuevoEmailCliente)))
                            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblNuevaDireccionCliente)))
                        .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtNuevoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txtNuevoApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNuevoNombreCliente)
                                    .addComponent(lblNuevotTelefonoCliente))
                                .addGap(18, 18, 18)
                                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                        .addComponent(txtNuevoTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                        .addComponent(txtNuevoNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addGap(67, 67, 67))))
                            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNuevaDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNuevoEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                .addComponent(lblNota)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                                .addComponent(lblNuevaMascotaCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNuevoNombreMasCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevaMascotaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(txtActualizarNombreMascotaCliente)))
                    .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblViejoIdCliente)
                        .addGap(27, 27, 27)
                        .addComponent(txtViejoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonActualizarCliente)
                .addGap(25, 25, 25))
        );
        panelActualizarClienteLayout.setVerticalGroup(
            panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViejoIdCliente)
                    .addComponent(txtViejoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 35, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoIdCliente)
                    .addComponent(lblNuevoNombreCliente)
                    .addComponent(txtNuevoNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoApellidoCliente)
                    .addComponent(txtNuevoApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevotTelefonoCliente)
                    .addComponent(txtNuevoTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoEmailCliente)
                    .addComponent(txtNuevoEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevaDireccionCliente)
                    .addComponent(txtNuevaDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(lblNota)
                .addGap(15, 15, 15)
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevaMascotaCliente)
                    .addComponent(txtNuevaMascotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizarCliente)
                    .addComponent(lblNuevoNombreMasCliente)
                    .addComponent(txtActualizarNombreMascotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarClienteActionPerformed
    Cliente nuevoCliente = new Cliente();
        int id = Integer.parseInt(txtViejoIdCliente.getText());

        for(Cliente viejoCliente: controladorActualizar.mostrarCliente()){
            if(viejoCliente.getId()== id){
                nuevoCliente.setId(Integer.parseInt(txtNuevoIdCliente.getText()));
                nuevoCliente.setNombre(txtNuevoNombreCliente.getText());
                nuevoCliente.setApellido(txtNuevoApellidoCliente.getText());
                nuevoCliente.setTelefono(txtNuevoTelefonoCliente.getText());
                nuevoCliente.setEmail(txtNuevoEmailCliente.getText());
                nuevoCliente.setDireccion(txtNuevaDireccionCliente.getText());
                nuevoCliente.setMascota(txtNuevaMascotaCliente.getText());
                nuevoCliente.setNombreMascota(txtActualizarNombreMascotaCliente.getText());
                controladorActualizar.actualizarCliente(viejoCliente, nuevoCliente);
            }
        }
        this.setVisible(false);
        txtViejoIdCliente.setText("");
        txtNuevoIdCliente.setText("");
        txtNuevoNombreCliente.setText("");
        txtNuevoApellidoCliente.setText("");
        txtNuevoTelefonoCliente.setText(""); 
        txtNuevoEmailCliente.setText("");
        txtNuevaDireccionCliente.setText("");
        txtNuevaMascotaCliente.setText(""); 
        txtActualizarNombreMascotaCliente.setText("");              // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarCliente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblNuevaDireccionCliente;
    private javax.swing.JLabel lblNuevaMascotaCliente;
    private javax.swing.JLabel lblNuevoApellidoCliente;
    private javax.swing.JLabel lblNuevoEmailCliente;
    private javax.swing.JLabel lblNuevoIdCliente;
    private javax.swing.JLabel lblNuevoNombreCliente;
    private javax.swing.JLabel lblNuevoNombreMasCliente;
    private javax.swing.JLabel lblNuevotTelefonoCliente;
    private javax.swing.JLabel lblViejoIdCliente;
    private javax.swing.JPanel panelActualizarCliente;
    private javax.swing.JTextField txtActualizarNombreMascotaCliente;
    private javax.swing.JTextField txtNuevaDireccionCliente;
    private javax.swing.JTextField txtNuevaMascotaCliente;
    private javax.swing.JTextField txtNuevoApellidoCliente;
    private javax.swing.JTextField txtNuevoEmailCliente;
    private javax.swing.JTextField txtNuevoIdCliente;
    private javax.swing.JTextField txtNuevoNombreCliente;
    private javax.swing.JTextField txtNuevoTelefonoCliente;
    private javax.swing.JTextField txtViejoIdCliente;
    // End of variables declaration//GEN-END:variables
}
