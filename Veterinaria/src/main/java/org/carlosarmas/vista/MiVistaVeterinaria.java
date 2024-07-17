/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.carlosarmas.vista;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JInternalFrame;



/**
 *
 * @author Carlos
 */
public class MiVistaVeterinaria extends javax.swing.JFrame {
Dimension tamanioPantalla = new Dimension();




private static AgregarDoctor instanciaAgregarDoctor = null;
private static VerDoctor instanciaVerDoctor = null;
private static BorrarDoctor instanciaBorrarDoctor = null;
private static ActualizarDoctor instanciaActualizarDoctor = null;
private static AgregarCliente instanciaAgregarCliente = null;
private static VerCliente instanciaVerCliente = null;
private static BorrarCliente instanciaBorrarCliente = null;
private static ActualizarCliente instanciaActualizarCliente = null;
private static AgregarEmpleado instanciaAgregarEmpleado = null;
private static VerEmpleado instanciaVerEmpleado = null;
private static BorrarEmpleado instanciaBorrarEmpleado = null;
private static ActualizarEmpleado instanciaActualizarEmpleado = null;
private static AgregarCita instanciaAgregarCita = null;
private static VerCita instanciaVerCita = null;
private static BorrarCita instanciaBorrarCita = null;
private static ActualizarCita instanciaActualizarCita = null;
private static AgregarMascota instanciaAgregarMascota = null;
private static VerMascota instanciaVerMascota = null;
private static BorrarMascota instanciaBorrarMacota = null;
private static ActualizarMascota instanciaActualizarMascota= null;



    /**
     * metodo MiVistaVeterinaria
     */
    public MiVistaVeterinaria() {
        tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        lookAndFeel();
        initComponents();
        this.setSize(tamanioPantalla);
    }
    
public void lookAndFeel(){
     try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                    
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(MiVistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(MiVistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(MiVistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(MiVistaVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
     
    }
private synchronized JInternalFrame getInstanciaAgregarDoctor(){
    if(instanciaAgregarDoctor == null){
        instanciaAgregarDoctor = new AgregarDoctor();
        panelVeterinaria.add(instanciaAgregarDoctor);
    }else if(instanciaAgregarDoctor.isVisible()== false)
        instanciaAgregarDoctor.setVisible(true); 
        instanciaAgregarDoctor.show();
        return instanciaAgregarDoctor;
}
/**
 * devuelve cuando agregamos un doctor
 * @return AgregarDoctor
 */
private synchronized JInternalFrame getInstanciaVerDoctor(){
    if(instanciaVerDoctor == null){
        instanciaVerDoctor = new VerDoctor();
        panelVeterinaria.add(instanciaVerDoctor);
    }else if(instanciaVerDoctor.isVisible()== false)
        instanciaVerDoctor.setVisible(true); 
        instanciaVerDoctor.show();
        return instanciaVerDoctor;
}
/**
 * devuelve para ver a los doctores
 * @return VerDoctor
 */
private synchronized JInternalFrame getInstanciaBorrarDoctor(){
    if(instanciaBorrarDoctor == null){
        instanciaBorrarDoctor = new BorrarDoctor();
        panelVeterinaria.add(instanciaBorrarDoctor);
    }else if(instanciaBorrarDoctor.isVisible()== false)
        instanciaBorrarDoctor.setVisible(true); 
        instanciaBorrarDoctor.show();
        return instanciaBorrarDoctor;
}
/**
 * devuelve cuando borramos a un doctor
 * @return BorrarDoctor
 */
private synchronized JInternalFrame getInstanciaActualizarDoctor(){
    if(instanciaActualizarDoctor == null){
        instanciaActualizarDoctor = new ActualizarDoctor();
        panelVeterinaria.add(instanciaActualizarDoctor);
    }else if(instanciaActualizarDoctor.isVisible()== false)
        instanciaActualizarDoctor.setVisible(true); 
        instanciaActualizarDoctor.show();
        return instanciaActualizarDoctor;
}
/**
 * devuelve cuando actulice a un doctor
 * @return ActualizarDoctor
 */
   

 
 private synchronized JInternalFrame getInstanciaAgregarCliente(){
        if(instanciaAgregarCliente == null){
            instanciaAgregarCliente = new AgregarCliente();
            panelVeterinaria.add(instanciaAgregarCliente);
        }else if(instanciaAgregarCliente.isVisible()== false)
            instanciaAgregarCliente.setVisible(true);   
            instanciaAgregarCliente.show();
            return instanciaAgregarCliente; 
    }
 /**
  * devuelve cuando agregamos un cliente 
  * @return AgregarCliente
  */
private synchronized JInternalFrame getInstanciaVerCliente(){
        if(instanciaVerCliente == null){
            instanciaVerCliente = new VerCliente();
            panelVeterinaria.add(instanciaVerCliente);
        }else if(instanciaVerCliente.isVisible()== false)
            instanciaVerCliente.setVisible(true);   
            instanciaVerCliente.show();
            return instanciaVerCliente; 
    }
/**
 * devuelve para ver a un cliente
 * @return VerCliente
 */

private synchronized JInternalFrame getInstanciaBorrarCliente(){
        if(instanciaBorrarCliente == null){
            instanciaBorrarCliente = new BorrarCliente();
            panelVeterinaria.add(instanciaBorrarCliente);
        }else if(instanciaBorrarCliente.isVisible()== false)
            instanciaBorrarCliente.setVisible(true);   
            instanciaBorrarCliente.show();
            return instanciaBorrarCliente; 
    }
/**
 * devuelve cuando borramos a un cliente
 * @return BorrarCliente
 */
private synchronized JInternalFrame getInstanciaActualizarCliente(){
        if(instanciaActualizarCliente == null){
            instanciaActualizarCliente = new ActualizarCliente();
            panelVeterinaria.add(instanciaActualizarCliente);
        }else if(instanciaActualizarCliente.isVisible()== false)
            instanciaActualizarCliente.setVisible(true);   
            instanciaActualizarCliente.show();
            return instanciaActualizarCliente; 
    }
/**
 * devuelve cuando actulice a un cliente
 * @return ActualizarCliente
 */
 
private synchronized JInternalFrame getInstanciaAgregarEmpleado(){
        if(instanciaAgregarEmpleado == null){
            instanciaAgregarEmpleado = new AgregarEmpleado();
            panelVeterinaria.add(instanciaAgregarEmpleado);
        }else if(instanciaAgregarEmpleado.isVisible()== false)
            instanciaAgregarEmpleado.setVisible(true);   
            instanciaAgregarEmpleado.show();
            return instanciaAgregarEmpleado; 
    }
/**
 * devuelve cuando agregamos un empleo
 * @return AgregarEmpleado
 */
private synchronized JInternalFrame getInstanciaVerEmpleado(){
        if(instanciaVerEmpleado == null){
            instanciaVerEmpleado = new VerEmpleado();
            panelVeterinaria.add(instanciaVerEmpleado);
        }else if(instanciaAgregarEmpleado.isVisible()== false)
            instanciaVerEmpleado.setVisible(true);   
            instanciaVerEmpleado.show();
            return instanciaVerEmpleado; 
    }
/**
 * devuelve para ver un empleado
 * @return VerEmpleado
 */
private synchronized JInternalFrame getInstanciaBorrarEmpleado(){
        if(instanciaBorrarEmpleado == null){
            instanciaBorrarEmpleado = new BorrarEmpleado();
            panelVeterinaria.add(instanciaBorrarEmpleado);
        }else if(instanciaBorrarEmpleado.isVisible()== false)
            instanciaBorrarEmpleado.setVisible(true);   
            instanciaBorrarEmpleado.show();
            return instanciaBorrarEmpleado; 
    }
/**
 * devuelve cuando borramos a un empleado
 * @return BorrarEmpleado
 */
private synchronized JInternalFrame getInstanciaActualizarEmpleado(){
        if(instanciaActualizarEmpleado == null){
            instanciaActualizarEmpleado = new ActualizarEmpleado();
            panelVeterinaria.add(instanciaActualizarEmpleado);
        }else if(instanciaActualizarEmpleado.isVisible()== false)
            instanciaActualizarEmpleado.setVisible(true);   
            instanciaActualizarEmpleado.show();
            return instanciaActualizarEmpleado; 
    }
/**
 * devuelve cuando actulice a un empleado
 * @return ActualizarEmpleado
 */
private synchronized JInternalFrame getInstanciaAgregarCita(){
        if(instanciaAgregarCita == null){
            instanciaAgregarCita = new AgregarCita();
            panelVeterinaria.add(instanciaAgregarCita);
        }else if(instanciaAgregarCita.isVisible()== false)
            instanciaAgregarCita.setVisible(true);   
            instanciaAgregarCita.show();
            return instanciaAgregarCita; 
    }
/**
 * devuelve cuando agregamos una cita
 * @return AgregarCita
 */
private synchronized JInternalFrame getInstanciaVerCita(){
        if(instanciaVerCita == null){
            instanciaVerCita = new VerCita();
            panelVeterinaria.add(instanciaVerCita);
        }else if(instanciaVerCita.isVisible()== false)
            instanciaVerCita.setVisible(true);   
            instanciaVerCita.show();
            return instanciaVerCita; 
    }
/**
 * devuelve para ver una cita
 * @return 
 */
private synchronized JInternalFrame getInstanciaBorrarCita(){
        if(instanciaBorrarCita == null){
            instanciaBorrarCita = new BorrarCita();
            panelVeterinaria.add(instanciaBorrarCita);
        }else if(instanciaBorrarCita.isVisible()== false)
            instanciaBorrarCita.setVisible(true);   
            instanciaBorrarCita.show();
            return instanciaBorrarCita; 
    }
/**
 * devuelve cuando borramos una cita
 * @return BorrarCita
 */
private synchronized JInternalFrame getInstanciaActualizarCita(){
        if(instanciaActualizarCita == null){
            instanciaActualizarCita = new ActualizarCita();
            panelVeterinaria.add(instanciaActualizarCita);
        }else if(instanciaActualizarCita.isVisible()== false)
            instanciaActualizarCita.setVisible(true);   
            instanciaActualizarCita.show();
            return instanciaActualizarCita; 
    }
/**
 * devuelve cuando actulice una cita
 * @return ActualizarCita
 */
private synchronized JInternalFrame getInstanciaAgregarMascota(){
        if(instanciaAgregarMascota == null){
            instanciaAgregarMascota = new AgregarMascota();
            panelVeterinaria.add(instanciaAgregarMascota);
        }else if(instanciaAgregarMascota.isVisible()== false)
            instanciaAgregarMascota.setVisible(true);   
            instanciaAgregarMascota.show();
            return instanciaAgregarMascota; 
    }
/**
 * devuelve cuando agregamos una mascota
 * @return AgregarMascota
 */
private synchronized JInternalFrame getInstanciaVerMascota(){
        if(instanciaVerMascota == null){
            instanciaVerMascota = new VerMascota();
            panelVeterinaria.add(instanciaVerMascota);
        }else if(instanciaVerMascota.isVisible()== false)
            instanciaVerMascota.setVisible(true);   
            instanciaVerMascota.show();
            return instanciaVerMascota; 
    }
/**
 * devuelve para ver una mascota
 * @return VerMascota
 */
private synchronized JInternalFrame getInstanciaBorrarMascota(){
        if(instanciaBorrarMacota == null){
            instanciaBorrarMacota = new BorrarMascota();
            panelVeterinaria.add(instanciaBorrarMacota);
        }else if(instanciaBorrarMacota.isVisible()== false)
            instanciaBorrarMacota.setVisible(true);   
            instanciaBorrarMacota.show();
            return instanciaBorrarMacota; 
    }
/**
 * devuelve cuando borramos una mascota
 * @return BorrarMacota
 */
private synchronized JInternalFrame getInstanciaActualizarMascota(){
        if(instanciaActualizarMascota == null){
            instanciaActualizarMascota = new ActualizarMascota();
            panelVeterinaria.add(instanciaActualizarMascota);
        }else if(instanciaActualizarMascota.isVisible()== false)
            instanciaActualizarMascota.setVisible(true);   
            instanciaActualizarMascota.show();
            return instanciaActualizarMascota; 
    }
/**
 * devuelve cuando actualizamos una mascota
 * @return ActualizarMascota
 */


    /**
     * Este método se llama desde dentro del constructor para inicializar.
     * NO modifique este código. El contenido de este método es siempre.
     * Regenerada por los metodos.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelVeterinaria = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuDoctor = new javax.swing.JMenu();
        itemAgregarDoctor = new javax.swing.JMenuItem();
        itemVerDoctor = new javax.swing.JMenuItem();
        itemBorrarDoctor = new javax.swing.JMenuItem();
        itemActualizarDoctor = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        itemAgregarCliente = new javax.swing.JMenuItem();
        itemVerCliente = new javax.swing.JMenuItem();
        itrmBorrarCliente = new javax.swing.JMenuItem();
        itemActualizarCliente = new javax.swing.JMenuItem();
        MenuEmpleado = new javax.swing.JMenu();
        itemAgregarEmpleado = new javax.swing.JMenuItem();
        itemVerEmpledo = new javax.swing.JMenuItem();
        itemBorrarEmpleado = new javax.swing.JMenuItem();
        itemActualizarEmpleado = new javax.swing.JMenuItem();
        menuCitas = new javax.swing.JMenu();
        itemAgregarCita = new javax.swing.JMenuItem();
        itemVerCita = new javax.swing.JMenuItem();
        itemBorrarCita = new javax.swing.JMenuItem();
        itemActualizarCita = new javax.swing.JMenuItem();
        menuMascota = new javax.swing.JMenu();
        itemAgregarMascota = new javax.swing.JMenuItem();
        itemVerMascota = new javax.swing.JMenuItem();
        itemBorrarMascota = new javax.swing.JMenuItem();
        itemActualizarMascota = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelVeterinariaLayout = new javax.swing.GroupLayout(panelVeterinaria);
        panelVeterinaria.setLayout(panelVeterinariaLayout);
        panelVeterinariaLayout.setHorizontalGroup(
            panelVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        panelVeterinariaLayout.setVerticalGroup(
            panelVeterinariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        jMenu1.setText("Veterinaria");

        MenuDoctor.setText("Doctor");

        itemAgregarDoctor.setText("Agregar");
        itemAgregarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarDoctorActionPerformed(evt);
            }
        });
        MenuDoctor.add(itemAgregarDoctor);

        itemVerDoctor.setText("Ver");
        itemVerDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerDoctorActionPerformed(evt);
            }
        });
        MenuDoctor.add(itemVerDoctor);

        itemBorrarDoctor.setText("Borrar");
        itemBorrarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBorrarDoctorActionPerformed(evt);
            }
        });
        MenuDoctor.add(itemBorrarDoctor);

        itemActualizarDoctor.setText("Actualizar");
        itemActualizarDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarDoctorActionPerformed(evt);
            }
        });
        MenuDoctor.add(itemActualizarDoctor);

        jMenu1.add(MenuDoctor);

        MenuCliente.setText("Cliente");

        itemAgregarCliente.setText("Agregar");
        itemAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itemAgregarCliente);

        itemVerCliente.setText("Ver");
        itemVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itemVerCliente);

        itrmBorrarCliente.setText("Borrar");
        itrmBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itrmBorrarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itrmBorrarCliente);

        itemActualizarCliente.setText("Actualizar");
        itemActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(itemActualizarCliente);

        jMenu1.add(MenuCliente);

        MenuEmpleado.setText("Empleado");

        itemAgregarEmpleado.setText("Agregar");
        itemAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarEmpleadoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(itemAgregarEmpleado);

        itemVerEmpledo.setText("Ver");
        itemVerEmpledo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerEmpledoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(itemVerEmpledo);

        itemBorrarEmpleado.setText("Borrar");
        itemBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBorrarEmpleadoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(itemBorrarEmpleado);

        itemActualizarEmpleado.setText("Actualizar");
        itemActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarEmpleadoActionPerformed(evt);
            }
        });
        MenuEmpleado.add(itemActualizarEmpleado);

        jMenu1.add(MenuEmpleado);

        menuCitas.setText("Citas");

        itemAgregarCita.setText("Agregar");
        itemAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarCitaActionPerformed(evt);
            }
        });
        menuCitas.add(itemAgregarCita);

        itemVerCita.setText("Ver");
        itemVerCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerCitaActionPerformed(evt);
            }
        });
        menuCitas.add(itemVerCita);

        itemBorrarCita.setText("Borrar");
        itemBorrarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBorrarCitaActionPerformed(evt);
            }
        });
        menuCitas.add(itemBorrarCita);

        itemActualizarCita.setText("Actualizar");
        itemActualizarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarCitaActionPerformed(evt);
            }
        });
        menuCitas.add(itemActualizarCita);

        jMenu1.add(menuCitas);

        menuMascota.setText("Mascota");

        itemAgregarMascota.setText("Agregar");
        itemAgregarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAgregarMascotaActionPerformed(evt);
            }
        });
        menuMascota.add(itemAgregarMascota);

        itemVerMascota.setText("Ver");
        itemVerMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerMascotaActionPerformed(evt);
            }
        });
        menuMascota.add(itemVerMascota);

        itemBorrarMascota.setText("Borrar");
        itemBorrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBorrarMascotaActionPerformed(evt);
            }
        });
        menuMascota.add(itemBorrarMascota);

        itemActualizarMascota.setText("Actualizar");
        itemActualizarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarMascotaActionPerformed(evt);
            }
        });
        menuMascota.add(itemActualizarMascota);

        jMenu1.add(menuMascota);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVeterinaria)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelVeterinaria)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemAgregarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarDoctorActionPerformed
       getInstanciaAgregarDoctor(); // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarDoctorActionPerformed

    private void itemVerDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerDoctorActionPerformed
       getInstanciaVerDoctor();
       instanciaVerDoctor.mostrarDatos(); // TODO add your handling code here:
    }//GEN-LAST:event_itemVerDoctorActionPerformed

    private void itemBorrarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBorrarDoctorActionPerformed
        getInstanciaBorrarDoctor();    // TODO add your handling code here:
    }//GEN-LAST:event_itemBorrarDoctorActionPerformed

    private void itemActualizarDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarDoctorActionPerformed
        getInstanciaActualizarDoctor();        // TODO add your handling code here:
    }//GEN-LAST:event_itemActualizarDoctorActionPerformed

    private void itemAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarClienteActionPerformed
      getInstanciaAgregarCliente();  // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarClienteActionPerformed

    private void itemVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerClienteActionPerformed
     getInstanciaVerCliente(); 
     instanciaVerCliente.mostrarDatos();  // TODO add your handling code here:
    }//GEN-LAST:event_itemVerClienteActionPerformed

    private void itrmBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itrmBorrarClienteActionPerformed
    getInstanciaBorrarCliente();    // TODO add your handling code here:
    }//GEN-LAST:event_itrmBorrarClienteActionPerformed

    private void itemActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarClienteActionPerformed
     getInstanciaActualizarCliente(); // TODO add your handling code here:
    }//GEN-LAST:event_itemActualizarClienteActionPerformed

    private void itemAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarEmpleadoActionPerformed
    getInstanciaAgregarEmpleado();    // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarEmpleadoActionPerformed

    private void itemVerEmpledoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerEmpledoActionPerformed
    getInstanciaVerEmpleado();
    instanciaVerEmpleado.mostrarDatos();    // TODO add your handling code here:
    }//GEN-LAST:event_itemVerEmpledoActionPerformed

    private void itemBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBorrarEmpleadoActionPerformed
    getInstanciaBorrarEmpleado(); // TODO add your handling code here:
    }//GEN-LAST:event_itemBorrarEmpleadoActionPerformed

    private void itemActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarEmpleadoActionPerformed
    getInstanciaActualizarEmpleado();  // TODO add your handling code here:
    }//GEN-LAST:event_itemActualizarEmpleadoActionPerformed

    private void itemAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarCitaActionPerformed
    getInstanciaAgregarCita();        // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarCitaActionPerformed

    private void itemVerCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerCitaActionPerformed
    getInstanciaVerCita();
    instanciaVerCita.mostrarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_itemVerCitaActionPerformed

    private void itemBorrarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBorrarCitaActionPerformed
    getInstanciaBorrarCita();        // TODO add your handling code here:
    }//GEN-LAST:event_itemBorrarCitaActionPerformed

    private void itemActualizarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarCitaActionPerformed
    getInstanciaActualizarCita();        // TODO add your handling code here:
    }//GEN-LAST:event_itemActualizarCitaActionPerformed

    private void itemVerMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerMascotaActionPerformed
    getInstanciaVerMascota();
    instanciaVerMascota.mostrarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_itemVerMascotaActionPerformed

    private void itemAgregarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAgregarMascotaActionPerformed
     getInstanciaAgregarMascota();   // TODO add your handling code here:
    }//GEN-LAST:event_itemAgregarMascotaActionPerformed

    private void itemBorrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBorrarMascotaActionPerformed
       getInstanciaBorrarMascota();        // TODO add your handling code here:
    }//GEN-LAST:event_itemBorrarMascotaActionPerformed

    private void itemActualizarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarMascotaActionPerformed
     getInstanciaActualizarMascota();        // TODO add your handling code here:
    }//GEN-LAST:event_itemActualizarMascotaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuDoctor;
    private javax.swing.JMenu MenuEmpleado;
    private javax.swing.JMenuItem itemActualizarCita;
    private javax.swing.JMenuItem itemActualizarCliente;
    private javax.swing.JMenuItem itemActualizarDoctor;
    private javax.swing.JMenuItem itemActualizarEmpleado;
    private javax.swing.JMenuItem itemActualizarMascota;
    private javax.swing.JMenuItem itemAgregarCita;
    private javax.swing.JMenuItem itemAgregarCliente;
    private javax.swing.JMenuItem itemAgregarDoctor;
    private javax.swing.JMenuItem itemAgregarEmpleado;
    private javax.swing.JMenuItem itemAgregarMascota;
    private javax.swing.JMenuItem itemBorrarCita;
    private javax.swing.JMenuItem itemBorrarDoctor;
    private javax.swing.JMenuItem itemBorrarEmpleado;
    private javax.swing.JMenuItem itemBorrarMascota;
    private javax.swing.JMenuItem itemVerCita;
    private javax.swing.JMenuItem itemVerCliente;
    private javax.swing.JMenuItem itemVerDoctor;
    private javax.swing.JMenuItem itemVerEmpledo;
    private javax.swing.JMenuItem itemVerMascota;
    private javax.swing.JMenuItem itrmBorrarCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCitas;
    private javax.swing.JMenu menuMascota;
    private javax.swing.JDesktopPane panelVeterinaria;
    // End of variables declaration//GEN-END:variables
}
