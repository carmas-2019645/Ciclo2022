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
public class ActualizarMascota extends javax.swing.JInternalFrame {
public static ControlDeMascota controladorActualizar = ControlDeMascota.getInstancia();

    /**
     * Crea nuevo formulario VistaActualizarMascota
     */
    public ActualizarMascota() {
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

        panelActualizarMascota = new javax.swing.JPanel();
        lblViejoIdMascota = new javax.swing.JLabel();
        txtViejoIdMascota = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNuevoIdMascota = new javax.swing.JLabel();
        txtNuevoIdMascota = new javax.swing.JTextField();
        lblNuevoNombreDuenio = new javax.swing.JLabel();
        txtNuevoNombreDuenio = new javax.swing.JTextField();
        lblNuevaRazaMascota = new javax.swing.JLabel();
        txtNuevaRazaMascota = new javax.swing.JTextField();
        lblNota = new javax.swing.JLabel();
        lblNuevoTipoMascota = new javax.swing.JLabel();
        txtNuevoTipoMascota = new javax.swing.JTextField();
        lblNuevaFechaUltimaVacuna = new javax.swing.JLabel();
        lblNuevoDiaVacuna = new javax.swing.JLabel();
        txtNuevoDiaVacuna = new javax.swing.JTextField();
        lblNuevoMesMascota = new javax.swing.JLabel();
        txtNuevoMesVacuna = new javax.swing.JTextField();
        lblNuevoAnioVacuna = new javax.swing.JLabel();
        txtNuevoAnioMascota = new javax.swing.JTextField();
        lblNuevoNombreMascota = new javax.swing.JLabel();
        txtNuevoNombreMascota = new javax.swing.JTextField();
        botonActualizarMascota = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblViejoIdMascota.setText("Antiguo ID Mascota: ");

        lblNuevoIdMascota.setText("Nuevo ID Mascota:");

        lblNuevoNombreDuenio.setText("Nuevo Nombre Dueño:");

        lblNuevaRazaMascota.setText("Nueva Raza Mascota:");

        lblNota.setText("NO OLVIDES QUE EN NUEVO TIPO MASCOTA DEBES  PONER SI TU MASCOTA ES UN PERRO U OTRO ANIMAL");

        lblNuevoTipoMascota.setText("Nuevo Tipo Mascota:");

        lblNuevaFechaUltimaVacuna.setText("Nueva Fecha Ultima Vacuna");

        lblNuevoDiaVacuna.setText("Nuevo Dia Vacuna:");

        lblNuevoMesMascota.setText("Nuevo Mes Vacuna:");

        lblNuevoAnioVacuna.setText("Nuevo Año Vacuna:");

        lblNuevoNombreMascota.setText("Nuevo Nombre Mascota: ");

        botonActualizarMascota.setText("Actualizar");
        botonActualizarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarMascotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarMascotaLayout = new javax.swing.GroupLayout(panelActualizarMascota);
        panelActualizarMascota.setLayout(panelActualizarMascotaLayout);
        panelActualizarMascotaLayout.setHorizontalGroup(
            panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarMascotaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                                        .addComponent(lblNuevoIdMascota)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNuevoIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNuevoNombreDuenio))
                                    .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                                        .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNuevoDiaVacuna)
                                            .addComponent(lblNuevaFechaUltimaVacuna))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNuevoTipoMascota)
                                            .addComponent(txtNuevoDiaVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNuevoNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNuevaRazaMascota)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNuevaRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(txtNuevoTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                                .addComponent(lblNuevoNombreMascota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNuevoNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(lblNuevoMesMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNuevoMesVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonActualizarMascota)
                .addGap(25, 25, 25))
            .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblNota))
                    .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                        .addGap(460, 460, 460)
                        .addComponent(lblNuevoAnioVacuna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNuevoAnioMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblViejoIdMascota)
                        .addGap(29, 29, 29)
                        .addComponent(txtViejoIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelActualizarMascotaLayout.setVerticalGroup(
            panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViejoIdMascota)
                    .addComponent(txtViejoIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoIdMascota)
                    .addComponent(lblNuevoNombreDuenio)
                    .addComponent(txtNuevoNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevaRazaMascota)
                    .addComponent(txtNuevaRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevoIdMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNota)
                .addGap(13, 13, 13)
                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoTipoMascota)
                    .addComponent(txtNuevoTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblNuevaFechaUltimaVacuna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoDiaVacuna)
                    .addComponent(txtNuevoDiaVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoMesMascota)
                    .addComponent(txtNuevoMesVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNuevoAnioVacuna)
                    .addComponent(txtNuevoAnioMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNuevoNombreMascota)
                    .addComponent(txtNuevoNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonActualizarMascota)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelActualizarMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelActualizarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarMascotaActionPerformed
    Mascota nuevaMascota = new Mascota();
        int id = Integer.parseInt(txtViejoIdMascota.getText());

        for(Mascota viejaMascota: controladorActualizar.mostrarMascota()){
            if(viejaMascota.getId()== id){
                nuevaMascota.setId(Integer.parseInt(txtNuevoIdMascota.getText()));
                nuevaMascota.setDuenio(txtNuevoNombreDuenio.getText());
                nuevaMascota.setRaza(txtNuevaRazaMascota.getText());
                nuevaMascota.setTipo(txtNuevoTipoMascota.getText());
                nuevaMascota.setDiaVacuna(Integer.parseInt(txtNuevoDiaVacuna.getText()));
                nuevaMascota.setMesVacuna(Integer.parseInt(txtNuevoMesVacuna.getText()));
                nuevaMascota.setAnioVacuna(Integer.parseInt(txtNuevoAnioMascota.getText()));
                nuevaMascota.setNombre(txtNuevoNombreMascota.getText());
                controladorActualizar.actualizarMascota(viejaMascota, nuevaMascota);
            }
        }
        this.setVisible(false);
        txtViejoIdMascota.setText("");
        txtNuevoIdMascota.setText("");
        txtNuevoNombreDuenio.setText("");
        txtNuevaRazaMascota.setText("");
        txtNuevoTipoMascota.setText(""); 
        txtNuevoDiaVacuna.setText("");
        txtNuevoMesVacuna.setText("");
        txtNuevoAnioMascota.setText(""); 
        txtNuevoNombreMascota.setText("");              // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarMascotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizarMascota;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblNuevaFechaUltimaVacuna;
    private javax.swing.JLabel lblNuevaRazaMascota;
    private javax.swing.JLabel lblNuevoAnioVacuna;
    private javax.swing.JLabel lblNuevoDiaVacuna;
    private javax.swing.JLabel lblNuevoIdMascota;
    private javax.swing.JLabel lblNuevoMesMascota;
    private javax.swing.JLabel lblNuevoNombreDuenio;
    private javax.swing.JLabel lblNuevoNombreMascota;
    private javax.swing.JLabel lblNuevoTipoMascota;
    private javax.swing.JLabel lblViejoIdMascota;
    private javax.swing.JPanel panelActualizarMascota;
    private javax.swing.JTextField txtNuevaRazaMascota;
    private javax.swing.JTextField txtNuevoAnioMascota;
    private javax.swing.JTextField txtNuevoDiaVacuna;
    private javax.swing.JTextField txtNuevoIdMascota;
    private javax.swing.JTextField txtNuevoMesVacuna;
    private javax.swing.JTextField txtNuevoNombreDuenio;
    private javax.swing.JTextField txtNuevoNombreMascota;
    private javax.swing.JTextField txtNuevoTipoMascota;
    private javax.swing.JTextField txtViejoIdMascota;
    // End of variables declaration//GEN-END:variables
}
