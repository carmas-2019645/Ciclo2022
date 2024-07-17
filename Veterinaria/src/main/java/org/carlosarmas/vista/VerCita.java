/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.modelo.Citas;
import org.carlosarmas.controlador.ControlDeCitas;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Carlos
 */
public class VerCita extends javax.swing.JInternalFrame {
public static ControlDeCitas controlador = ControlDeCitas.getInstancia();

    /**
     * metodo VistaVerCita
     */
    public VerCita() {
        initComponents();
    }
    public void mostrarDatos(){
       String [] encabezados = {"ID","Paciente","Dia Cita","Mes Cita","Servicio","Mascota"};
       int cantidadCitas = controlador.cantidadCitas();

       DefaultTableModel cabeceraDeTabla = new DefaultTableModel(encabezados, cantidadCitas);
       TablaCita.setModel(cabeceraDeTabla);
       TableModel listaDeDatos = TablaCita.getModel();

       for(int i=0; i<cantidadCitas; i++){
       Citas cita = controlador.mostrarCitas().get(i);
       listaDeDatos.setValueAt(cita.getId(), i, 0);
       listaDeDatos.setValueAt(cita.getNombre(), i, 1);
       listaDeDatos.setValueAt(cita.getDia(), i, 2);
       listaDeDatos.setValueAt(cita.getMes(), i, 3);
       listaDeDatos.setValueAt(cita.getServicio(), i, 4);
       listaDeDatos.setValueAt(cita.getNombreMascota(), i, 5);
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

        scrollTablaCita = new javax.swing.JScrollPane();
        TablaCita = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        TablaCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Paciente", "Dia Cita", "Mes Cita", "Servicio", "Mascota"
            }
        ));
        scrollTablaCita.setViewportView(TablaCita);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaCita, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCita;
    private javax.swing.JScrollPane scrollTablaCita;
    // End of variables declaration//GEN-END:variables
}
