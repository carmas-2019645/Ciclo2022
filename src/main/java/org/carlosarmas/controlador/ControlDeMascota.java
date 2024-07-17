package org.carlosarmas.controlador; 
import org.carlosarmas.modelo.Mascota;
import java.util.ArrayList;
public class ControlDeMascota{

	private static ControlDeMascota instancia; 
	private ArrayList<Mascota> listaMascota;
	
	private ControlDeMascota(){
		listaMascota = new ArrayList<Mascota>();
	}
        /**
         * devuelve el control de las mascotas
         * @return ControlDeMascota
         */
	
	public static ControlDeMascota getInstancia(){
		if(instancia == null){
			instancia = new ControlDeMascota();
		}return instancia;
	}
        /**
         * Este es el metodo de nuevaMascota 
         * @param nuevaMascota 
         */

	public void agregarMascota(Mascota nuevaMascota){
		listaMascota.add(nuevaMascota);
	}
        /**
         * devuelve la nueva mascota
         * @return nuevaMascota
         */
	public ArrayList<Mascota> mostrarMascota(){
		return listaMascota;
	}
        /**
         * Este es el metodo de mascotaEliminada
         * @param mascotaEliminada 
         */
	
	public void eliminarMascota(Mascota mascotaEliminada){
		listaMascota.remove(mascotaEliminada);
	}
        /**
         * Este es el metodo de id
         * @param id 
         */
	public void eliminarMascota(int id){
		Mascota mascotaEliminada = new Mascota();
		for(Mascota mascota : listaMascota){
			if(mascota.getId()== id){
				mascotaEliminada = mascota;
				listaMascota.remove(mascotaEliminada);
				break;
			}
		}
	}
	public void actualizarMascota(Mascota mascotaVieja, Mascota mascotaNueva){
		int indice =  listaMascota.indexOf(mascotaVieja);
		listaMascota.set(indice, mascotaNueva);

	}
        /**
         * evuelve de mascotaVieja a mascotaNueva
         * @return cantidadMascota
         */
	public int cantidadMascota(){
		return listaMascota.size();
	}
}
