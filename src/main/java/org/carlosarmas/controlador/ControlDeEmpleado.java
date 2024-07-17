package org.carlosarmas.controlador; 
import org.carlosarmas.modelo.Empleado;
import java.util.ArrayList;
public class ControlDeEmpleado{

	private static ControlDeEmpleado instancia; 
	private ArrayList<Empleado> listaEmpleado;
	
	private ControlDeEmpleado(){
		listaEmpleado = new ArrayList<Empleado>();
	}
        /**
         * devuelve el control de empleados
         * @return ControlDeEmpleado
         */
	
	public static ControlDeEmpleado getInstancia(){
		if(instancia == null){
			instancia = new ControlDeEmpleado();
		}return instancia;
	}
        /**
         * Este es el metodo de nuevoEmpleado 
         * @param nuevoEmpleado 
         */

	public void agregarEmpleado(Empleado nuevoEmpleado){
		listaEmpleado.add(nuevoEmpleado);
	}
        /**
         * devuelve el nuevo empleado
         * @return nuevoEmpleado
         */
	public ArrayList<Empleado> mostrarEmpleado(){
		return listaEmpleado;
	}
        /**
         *  Este es el metodo de empleadoEliminado 
         * @param empleadoEliminado 
         */
	
	public void eliminarEmpleado(Empleado empleadoEliminado){
		listaEmpleado.remove(empleadoEliminado);
	}
        /**
         * Este es el metodo del id
         * @param id 
         */
	public void eliminarEmpleado(int id){
		Empleado empleadoEliminado = new Empleado();
		for(Empleado empleado : listaEmpleado){
			if(empleado.getId()== id){
				empleadoEliminado = empleado;
				listaEmpleado.remove(empleadoEliminado);
				break;
			}
		}
	}
	public void actualizarEmpleado(Empleado empleadoAntiguo, Empleado empleadoNuevo){
		int indice =  listaEmpleado.indexOf(empleadoAntiguo);
		listaEmpleado.set(indice, empleadoNuevo);

	}
        /**
         * devuelve de empleadosAntiguos a empleadoNuevo
         * @return cantidadEmpleado
         */
	public int cantidadEmpleado(){
		return listaEmpleado.size();
	}
}
