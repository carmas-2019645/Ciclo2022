/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.modelo.Empleado;
import org.carlosarmas.controlador.ControlDeEmpleado;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Carlos
 */
public class VerEmpleado extends javax.swing.JInternalFrame {
public static ControlDeEmpleado controlador = ControlDeEmpleado.getInstancia();

    /**
     * Creates new form VistaVerEmpleado
     */
    public VerEmpleado() {
        initComponents();
    }
    public void mostrarDatos(){
       String [] encabezados = {"ID","Nombre","Apellido","Telefono","Email","Direccion","Puesto","Profesion"};
       int cantidadEmpleado = controlador.cantidadEmpleado();

       DefaultTableModel cabeceraDeTabla = new DefaultTableModel(encabezados, cantidadEmpleado);
       TablaEmpleado.setModel(cabeceraDeTabla);
       TableModel listaDeDatos = TablaEmpleado.getModel();

       for(int i=0; i<cantidadEmpleado; i++){
       Empleado empleado = controlador.mostrarEmpleado().get(i);
       listaDeDatos.setValueAt(empleado.getId(), i, 0);
       listaDeDatos.setValueAt(empleado.getNombre(), i, 1);
       listaDeDatos.setValueAt(empleado.getApellido(), i, 2);
       listaDeDatos.setValueAt(empleado.getTelefono(), i, 3);
       listaDeDatos.setValueAt(empleado.getEmail(), i, 4);
       listaDeDatos.setValueAt(empleado.getDireccion(), i, 5);
       listaDeDatos.setValueAt(empleado.getPuesto(), i, 6);
       listaDeDatos.setValueAt(empleado.getProfesion(), i, 7);
       }
   }

    /**
     *Este método se llama desde dentro del constructor para inicializar.
     * NO modifique este código. El contenido de este método es siempre
     * Regenerada por los metodos.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTablaEmpleado = new javax.swing.JScrollPane();
        TablaEmpleado = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        TablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre ", "Apellido", "Telefono", "Email", "Direccion", "Puesto", "Profesion"
            }
        ));
        scrollTablaEmpleado.setViewportView(TablaEmpleado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEmpleado;
    private javax.swing.JScrollPane scrollTablaEmpleado;
    // End of variables declaration//GEN-END:variables
}
