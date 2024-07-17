package org.carlosarmas.controlador; 
import org.carlosarmas.modelo.Citas;
import java.util.ArrayList;
public class ControlDeCitas{

	private static ControlDeCitas instancia; 
        
	private ArrayList<Citas> listaCitas;
	
	private ControlDeCitas(){
		listaCitas = new ArrayList<Citas>();
	}
        /**
         * devuelve el control de citas
         * @return ControlDeCitas
         */
        
	
	public static ControlDeCitas getInstancia(){
		if(instancia == null){
			instancia = new ControlDeCitas();
		}return instancia;
	}
        /**
         * Este es el metodo de nuevaCita 
         * @param nuevaCita 
         */

	public void agregarCitas(Citas nuevaCita){
		listaCitas.add(nuevaCita);
	}
        /**
         * devuelve la nueva cita
         * @return nuevaCita
         */
	public ArrayList<Citas> mostrarCitas(){
		return listaCitas;
	}
        /**
         * Este es el metodo de citaEliminar 
         * @param citaEliminar 
         */
	
	public void eliminarCita(Citas citaEliminar){
		listaCitas.remove(citaEliminar);
	}
        /**
         * Este es el metodo del id
         * @param id 
         */
	public void eliminarCita(int id){
		Citas citaEliminar = new Citas();
		for(Citas cita : listaCitas){
			if(cita.getId()== id){
				citaEliminar = cita;
				listaCitas.remove(citaEliminar);
				break;
			}
                        
		}
	}
	public void actualizarCita(Citas citaVieja, Citas citaNueva){
		int indice =  listaCitas.indexOf(citaVieja);
		listaCitas.set(indice, citaNueva);

	}
        /**
         * devuelve de citasViejas a CitasNuevas
         * @return cantidadCitas
         */
	public int cantidadCitas(){
		return listaCitas.size();
	}
}
