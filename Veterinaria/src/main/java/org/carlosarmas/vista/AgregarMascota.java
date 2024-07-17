/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.controlador.ControlDeMascota;
import org.carlosarmas.modelo.Mascota;

/**
 *
 * @author Carlos
 */
public class AgregarMascota extends javax.swing.JInternalFrame {
public static ControlDeMascota controlador = ControlDeMascota.getInstancia();

    /**
     * metodo VistaAgregarMascota
     */
    public AgregarMascota() {
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

        panelMascota = new javax.swing.JPanel();
        lblIdMascota = new javax.swing.JLabel();
        txtIdMascota = new javax.swing.JTextField();
        lblNombreDuenio = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        lblRazaMascota = new javax.swing.JLabel();
        txtRazaMascota = new javax.swing.JTextField();
        lblTipoMascota = new javax.swing.JLabel();
        txtTipoMascota = new javax.swing.JTextField();
        lblFechaVacuna = new javax.swing.JLabel();
        txtDiaVacuna = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        botonAceptarMascota = new javax.swing.JButton();
        botonCancelarMascota = new javax.swing.JButton();
        lblMesVacuna = new javax.swing.JLabel();
        lblDiaVacuna = new javax.swing.JLabel();
        txtMesVacuna = new javax.swing.JTextField();
        txtAnioVacuna = new javax.swing.JTextField();
        lblAnioEmpleado = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        Nota1 = new javax.swing.JLabel();
        Nota2 = new javax.swing.JLabel();
        lblNombreMascota = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblIdMascota.setText("ID Mascota:");

        lblNombreDuenio.setText("Nombre Dueño");

        lblRazaMascota.setText("Raza Mascota");

        lblTipoMascota.setText("Tipo de Mascota");

        lblFechaVacuna.setText("Fecha Ultima Vacuna");

        botonAceptarMascota.setText("Aceptar");
        botonAceptarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarMascotaActionPerformed(evt);
            }
        });

        botonCancelarMascota.setText("Cancelar");
        botonCancelarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarMascotaActionPerformed(evt);
            }
        });

        lblMesVacuna.setText("Mes:");

        lblDiaVacuna.setText("Dia: ");

        lblAnioEmpleado.setText("Año:");

        Nota1.setText("NO OLVIDES PONER SI TU MASCOTA ES UN PERRO,");

        Nota2.setText("U OTRO ANIMAL");

        lblNombreMascota.setText("Nombre Mascota");

        javax.swing.GroupLayout panelMascotaLayout = new javax.swing.GroupLayout(panelMascota);
        panelMascota.setLayout(panelMascotaLayout);
        panelMascotaLayout.setHorizontalGroup(
            panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMascotaLayout.createSequentialGroup()
                        .addComponent(botonAceptarMascota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelarMascota))
                    .addGroup(panelMascotaLayout.createSequentialGroup()
                        .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMascotaLayout.createSequentialGroup()
                                .addComponent(lblIdMascota)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMascotaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreDuenio)
                    .addComponent(lblRazaMascota)
                    .addComponent(lblTipoMascota)
                    .addComponent(lblFechaVacuna)
                    .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelMascotaLayout.createSequentialGroup()
                            .addComponent(lblAnioEmpleado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtAnioVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreMascota)
                            .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(txtTipoMascota)
                                .addComponent(txtRazaMascota)
                                .addComponent(txtNombreDuenio)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelMascotaLayout.createSequentialGroup()
                .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMascotaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Nota1))
                    .addGroup(panelMascotaLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Nota2))
                    .addGroup(panelMascotaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblDiaVacuna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblMesVacuna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMesVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMascotaLayout.setVerticalGroup(
            panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdMascota)
                    .addComponent(txtIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreDuenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRazaMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nota1)
                .addGap(1, 1, 1)
                .addComponent(Nota2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipoMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFechaVacuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaVacuna)
                    .addComponent(lblMesVacuna)
                    .addComponent(txtMesVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnioEmpleado)
                    .addComponent(txtAnioVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNombreMascota)
                .addGap(11, 11, 11)
                .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarMascota)
                    .addComponent(botonAceptarMascota))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarMascotaActionPerformed
    this.setVisible(false);   
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarMascotaActionPerformed

    private void botonAceptarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarMascotaActionPerformed
        Mascota mascota = new Mascota();      
        mascota.setId(Integer.parseInt(txtIdMascota.getText()));
        mascota.setDuenio(txtNombreDuenio.getText());
        mascota.setRaza(txtRazaMascota.getText()); 
        mascota.setTipo(txtTipoMascota.getText());
        mascota.setDiaVacuna(Integer.parseInt(txtDiaVacuna.getText()));
        mascota.setMesVacuna(Integer.parseInt(txtMesVacuna.getText()));
        mascota.setAnioVacuna(Integer.parseInt(txtAnioVacuna.getText()));
        mascota.setNombre(txtNombreMascota.getText());

        controlador.agregarMascota(mascota); 

        this.setVisible(false);
        txtIdMascota.setText("");
        txtNombreDuenio.setText("");
        txtRazaMascota.setText("");
        txtTipoMascota.setText("");
        txtDiaVacuna.setText("");
        txtMesVacuna.setText("");
        txtAnioVacuna.setText("");
        txtNombreMascota.setText("");

  // TODO add your handling code here:
    }//GEN-LAST:event_botonAceptarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nota1;
    private javax.swing.JLabel Nota2;
    private javax.swing.JButton botonAceptarMascota;
    private javax.swing.JButton botonCancelarMascota;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnioEmpleado;
    private javax.swing.JLabel lblDiaVacuna;
    private javax.swing.JLabel lblFechaVacuna;
    private javax.swing.JLabel lblIdMascota;
    private javax.swing.JLabel lblMesVacuna;
    private javax.swing.JLabel lblNombreDuenio;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblRazaMascota;
    private javax.swing.JLabel lblTipoMascota;
    private javax.swing.JPanel panelMascota;
    private javax.swing.JTextField txtAnioVacuna;
    private javax.swing.JTextField txtDiaVacuna;
    private javax.swing.JTextField txtIdMascota;
    private javax.swing.JTextField txtMesVacuna;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtRazaMascota;
    private javax.swing.JTextField txtTipoMascota;
    // End of variables declaration//GEN-END:variables

   
}
