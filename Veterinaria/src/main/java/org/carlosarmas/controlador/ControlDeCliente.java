package org.carlosarmas.controlador; 
import org.carlosarmas.modelo.Cliente;
import java.util.ArrayList;
public class ControlDeCliente{

	private static ControlDeCliente instancia; 
	private ArrayList<Cliente> listaCliente;
	
	private ControlDeCliente(){
		listaCliente = new ArrayList<Cliente>();
	}
        /**
         * devuelve el control del cliente
         * @return ControlDeCliente
         */
	
	public static ControlDeCliente getInstancia(){
		if(instancia == null){
			instancia = new ControlDeCliente();
		}return instancia;
	}
        /**
         * Este es el metodo de nuevoCliente 
         * @param nuevoCliente 
         */

	public void agregarCliente(Cliente nuevoCliente){
		listaCliente.add(nuevoCliente);
	}
        /**
         * devuelve los nuevos clientes
         * @return nuevoCliente
         */
	public ArrayList<Cliente> mostrarCliente(){
		return listaCliente;
	}
        /**
         * Este es el metodo de clienteEliminar 
         * @param clienteEliminar 
         */
	
	public void eliminarCliente(Cliente clienteEliminar){
		listaCliente.remove(clienteEliminar);
	}
        /**
         * Este es el metodo de id 
         * @param id 
         */
	public void eliminarCliente(int id){
		Cliente clienteEliminar = new Cliente();
		for(Cliente cliente : listaCliente){
			if(cliente.getId()== id){
				clienteEliminar = cliente;
				listaCliente.remove(clienteEliminar);
				break;
			}
		}
	}
	public void actualizarCliente(Cliente clienteViejo, Cliente clienteNuevo){
		int indice =  listaCliente.indexOf(clienteViejo);
		listaCliente.set(indice, clienteNuevo);

	}
        /**
         * devuelve de clienteViejo a clienteNuevo
         * @return cantidadCliente
         */
	public int cantidadCliente(){
		return listaCliente.size();
	}
}
