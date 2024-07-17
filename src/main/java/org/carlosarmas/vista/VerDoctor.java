/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.modelo.Medico;
import org.carlosarmas.controlador.ControlDeMedico;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Carlos
 */
public class VerDoctor extends javax.swing.JInternalFrame {
public static ControlDeMedico controladorMedico = ControlDeMedico.getInstancia();

    /**
     * metodo VistaVerDoctor
     */
    public VerDoctor() {
        initComponents();
    }
    public void mostrarDatos(){
       String [] encabezados = {"ID","Nombre","Apellido","Telefono","Especialidad","email","Direccion","Estudios","Colegiado"};
       int cantidadMedico = controladorMedico.cantidadMedico();

       DefaultTableModel cabeceraDeTabla = new DefaultTableModel(encabezados, cantidadMedico);
       TablaDoctor.setModel(cabeceraDeTabla);
       TableModel listaDeDatos = TablaDoctor.getModel();

       for(int i=0; i<cantidadMedico; i++){
       Medico medico = controladorMedico.mostrarMedico().get(i);
       listaDeDatos.setValueAt(medico.getId(), i, 0);
       listaDeDatos.setValueAt(medico.getNombre(), i, 1);
       listaDeDatos.setValueAt(medico.getApellido(), i, 2);
       listaDeDatos.setValueAt(medico.getTelefono(), i, 3);
       listaDeDatos.setValueAt(medico.getEspecialidad(), i, 4);
       listaDeDatos.setValueAt(medico.getEmail(), i, 5);
       listaDeDatos.setValueAt(medico.getDireccion(), i, 6);
       listaDeDatos.setValueAt(medico.getEstudios(), i, 7);
       listaDeDatos.setValueAt(medico.getColegiado(), i, 8);
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

        scrollTablaDoctoro = new javax.swing.JScrollPane();
        TablaDoctor = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        TablaDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre ", "Apellido", "Telefono", "Especialidad  ", "email", "Dirrecion ", "Estudios", "Colegiado"
            }
        ));
        scrollTablaDoctoro.setViewportView(TablaDoctor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaDoctoro, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaDoctoro, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDoctor;
    private javax.swing.JScrollPane scrollTablaDoctoro;
    // End of variables declaration//GEN-END:variables
}
