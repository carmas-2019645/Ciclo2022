/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.modelo.Mascota;
import org.carlosarmas.controlador.ControlDeMascota;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Carlos
 */
public class VerMascota extends javax.swing.JInternalFrame {
public static ControlDeMascota controlador = ControlDeMascota.getInstancia();

    /**
     * metodo VistaVerMascota
     */
    public VerMascota() {
        initComponents();
    }
    public void mostrarDatos(){
       String [] encabezados = {"ID","Dueño","Raza","Tipo","Dia Vacuna","Mes Vacuna","Año Vacuna","Nom. Mascota"};
       int cantidadMascota = controlador.cantidadMascota();

       DefaultTableModel cabeceraDeTabla = new DefaultTableModel(encabezados, cantidadMascota);
       TablaMascota.setModel(cabeceraDeTabla);
       TableModel listaDeDatos = TablaMascota.getModel();

       for(int i=0; i<cantidadMascota; i++){
       Mascota mascota = controlador.mostrarMascota().get(i);
       listaDeDatos.setValueAt(mascota.getId(), i, 0);
       listaDeDatos.setValueAt(mascota.getDuenio(), i, 1);
       listaDeDatos.setValueAt(mascota.getRaza(), i, 2);
       listaDeDatos.setValueAt(mascota.getTipo(), i, 3);
       listaDeDatos.setValueAt(mascota.getDiaVacuna(), i, 4);
       listaDeDatos.setValueAt(mascota.getMesVacuna(), i, 5);
       listaDeDatos.setValueAt(mascota.getAnioVacuna(), i, 6);
       listaDeDatos.setValueAt(mascota.getNombre(), i, 7);
       }
   }

    /**
     * Este método se llama desde dentro del constructor para inicializar.
     * NO modifique este código. El contenido de este método es siempre
     * Regenerada por los metodos.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTablaMascota = new javax.swing.JScrollPane();
        TablaMascota = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        TablaMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Duenio", "Raza", "Tipo", "Dia", "Mes", "Anio", "Nombre"
            }
        ));
        scrollTablaMascota.setViewportView(TablaMascota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMascota;
    private javax.swing.JScrollPane scrollTablaMascota;
    // End of variables declaration//GEN-END:variables
}
