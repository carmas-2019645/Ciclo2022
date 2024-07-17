package org.carlosarmas.controlador; 
import org.carlosarmas.modelo.Medico;
import java.util.ArrayList;
public class ControlDeMedico{

	private static ControlDeMedico instancia; 
	private ArrayList<Medico> listaMedico;
	
	private ControlDeMedico(){
		listaMedico = new ArrayList<Medico>();
	}
        /**
         * devuelve el control del medico
         * @return ControlDeCliente
         */
	
	public static ControlDeMedico getInstancia(){
		if(instancia == null){
			instancia = new ControlDeMedico();
		}return instancia;
	}
        /**
         * Este es el metodo de nuevoMedico
         * @param nuevoMedico 
         */

	public void agregarMedico(Medico nuevoMedico){
		listaMedico.add(nuevoMedico);
	}
        /**
         * devuelve los nuevos medicos
         * @return nuevoMedico
         */
	public ArrayList<Medico> mostrarMedico(){
		return listaMedico;
	}
         /**
         * Este es el metodo de mediEliminar 
         * @param  mediEliminar 
         */
	public void eliminarMedico(Medico mediEliminar){
		listaMedico.remove(mediEliminar);
	}
        /**
         * Este es el metodo de id 
         * @param id 
         */
	public void eliminarMedico(int id){
		Medico mediEliminar = new Medico();
		for(Medico medico : listaMedico){
			if(medico.getId()== id){
				mediEliminar = medico;
				listaMedico.remove(mediEliminar);
				break;
			}
		}
	}
	public void actualizarMedico(Medico medicoAntiguo, Medico medicoActualizado){
		int indice =  listaMedico.indexOf(medicoAntiguo);
		listaMedico.set(indice, medicoActualizado);

	}
        /**
         * devuelve de medicoAntiguo a medicoActualizado
         * @return cantidadMedico
         */
	public int cantidadMedico(){
		return listaMedico.size();
	}
}
