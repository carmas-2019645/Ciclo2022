/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosarmas.vista;
import org.carlosarmas.modelo.Cliente;
import org.carlosarmas.controlador.ControlDeCliente;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Carlos
 */
public class VerCliente extends javax.swing.JInternalFrame {
public static ControlDeCliente controlador = ControlDeCliente.getInstancia();

    /**
     * metodo VistaVerCliente
     */
    public VerCliente() {
        initComponents();
    }
    public void mostrarDatos(){
       String [] encabezados = {"ID","Nombre","Apellido","Telefono","Email","Direccion","Mascota","Nom Mascota"};
       int cantidadCliente = controlador.cantidadCliente();

       DefaultTableModel cabeceraDeTabla = new DefaultTableModel(encabezados, cantidadCliente);
       TablaCliente.setModel(cabeceraDeTabla);
       TableModel listaDeDatos = TablaCliente.getModel();

       for(int i=0; i<cantidadCliente; i++){
       Cliente cliente = controlador.mostrarCliente().get(i);
       listaDeDatos.setValueAt(cliente.getId(), i, 0);
       listaDeDatos.setValueAt(cliente.getNombre(), i, 1);
       listaDeDatos.setValueAt(cliente.getApellido(), i, 2);
       listaDeDatos.setValueAt(cliente.getTelefono(), i, 3);
       listaDeDatos.setValueAt(cliente.getEmail(), i, 4);
       listaDeDatos.setValueAt(cliente.getDireccion(), i, 5);
       listaDeDatos.setValueAt(cliente.getMascota(), i, 6);
       listaDeDatos.setValueAt(cliente.getNombreMascota(), i, 7);
       }
   }

    /**
     * Este método se llama desde dentro del constructor para inicializar.
     * NO modifique este código. El contenido de este método es siempre
     * Regenerada por los metodos.     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTablaCliente = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre ", "Apellido", "Telefono", "Email", "Direccion", "Mascota", "Nom. Mascota"
            }
        ));
        scrollTablaCliente.setViewportView(TablaCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTablaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCliente;
    private javax.swing.JScrollPane scrollTablaCliente;
    // End of variables declaration//GEN-END:variables
}
