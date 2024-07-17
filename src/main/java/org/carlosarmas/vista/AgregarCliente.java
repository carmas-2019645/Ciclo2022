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
public class AgregarCliente extends javax.swing.JInternalFrame {
public static ControlDeCliente controlador = ControlDeCliente.getInstancia();

    /**
     * metodo VistaAgregarCliente
     */
    public AgregarCliente() {
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

        panelAgregarCliente = new javax.swing.JPanel();
        lblIdClienteAgregar = new javax.swing.JLabel();
        txtIdAgregarCliente = new javax.swing.JTextField();
        lblNombreClienteAgregar = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        lblApellidoCliente = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        lblTelefonoCliente = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblEmailCliente = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonAceptarCliente = new javax.swing.JButton();
        botonCancelarCliente = new javax.swing.JButton();
        lblTipoMascota = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        txtTipoMascto = new javax.swing.JTextField();
        lblNombreMascotaCliente = new javax.swing.JLabel();
        txtNombreMascotaCliente = new javax.swing.JTextField();
        lblNota1 = new javax.swing.JLabel();
        lblNota2 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblIdClienteAgregar.setText("ID Cliente: ");

        lblNombreClienteAgregar.setText("Nombre Cliente");

        lblApellidoCliente.setText("Apellido Cliente");

        lblTelefonoCliente.setText("Telefono Cliente");

        lblEmailCliente.setText("Email Cliente");

        botonAceptarCliente.setText("Aceptar");
        botonAceptarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarClienteActionPerformed(evt);
            }
        });

        botonCancelarCliente.setText("Cancelar");
        botonCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarClienteActionPerformed(evt);
            }
        });

        lblTipoMascota.setText("Mascota Cliente: ");

        lblDireccionCliente.setText("Direccion Cliente");

        lblNombreMascotaCliente.setText("Nombre Mascota:");

        lblNota1.setText("DEBES ESCRIBIR SI TU MASCOTA ES UN PERRO, UN GATO");

        lblNota2.setText("U OTRO ANIMAL.");

        javax.swing.GroupLayout panelAgregarClienteLayout = new javax.swing.GroupLayout(panelAgregarCliente);
        panelAgregarCliente.setLayout(panelAgregarClienteLayout);
        panelAgregarClienteLayout.setHorizontalGroup(
            panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                        .addComponent(botonAceptarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelarCliente))
                    .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                        .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                                .addComponent(lblIdClienteAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoMascota)
                    .addComponent(txtTipoMascto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreClienteAgregar)
                    .addComponent(lblApellidoCliente)
                    .addComponent(lblTelefonoCliente)
                    .addComponent(lblNombreMascotaCliente)
                    .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombreMascotaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txtDireccionCliente)
                        .addComponent(txtEmailCliente)
                        .addComponent(txtTelefonoCliente)
                        .addComponent(txtApellidoCliente)
                        .addComponent(txtNombreCliente))
                    .addComponent(lblDireccionCliente)
                    .addComponent(lblEmailCliente))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblNota2))
                    .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNota1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAgregarClienteLayout.setVerticalGroup(
            panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdClienteAgregar)
                    .addComponent(txtIdAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreClienteAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellidoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefonoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccionCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lblTipoMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTipoMascto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreMascotaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreMascotaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarCliente)
                    .addComponent(botonAceptarCliente))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarClienteActionPerformed
    this.setVisible(false);   
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarClienteActionPerformed

    private void botonAceptarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarClienteActionPerformed
        Cliente cliente = new Cliente();      
        cliente.setId(Integer.parseInt(txtIdAgregarCliente.getText()));
        cliente.setNombre(txtNombreCliente.getText());
        cliente.setApellido(txtApellidoCliente.getText()); 
        cliente.setTelefono(txtTelefonoCliente.getText());
        cliente.setEmail(txtEmailCliente.getText());
        cliente.setDireccion(txtDireccionCliente.getText());
        cliente.setMascota(txtTipoMascto.getText());
        cliente.setNombreMascota(txtNombreMascotaCliente.getText());

        controlador.agregarCliente(cliente); 

        this.setVisible(false);
        txtIdAgregarCliente.setText("");
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtTelefonoCliente.setText("");
        txtEmailCliente.setText("");
        txtDireccionCliente.setText("");
        txtTipoMascto.setText("");
        txtNombreMascotaCliente.setText("");

  // TODO add your handling code here:
    }//GEN-LAST:event_botonAceptarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarCliente;
    private javax.swing.JButton botonCancelarCliente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidoCliente;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblEmailCliente;
    private javax.swing.JLabel lblIdClienteAgregar;
    private javax.swing.JLabel lblNombreClienteAgregar;
    private javax.swing.JLabel lblNombreMascotaCliente;
    private javax.swing.JLabel lblNota1;
    private javax.swing.JLabel lblNota2;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTipoMascota;
    private javax.swing.JPanel panelAgregarCliente;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtIdAgregarCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreMascotaCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTipoMascto;
    // End of variables declaration//GEN-END:variables

   
}
