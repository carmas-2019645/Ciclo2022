package org.carlosarmas.modelo;
public class Citas{
	private int id; 
	private String nombrePaciente;
	private int dia;
	private int mes;
	private String servicio; 
	private String nombreMascota;


	public Citas(){}
        /**
         * metodos
         * @param id
         * @param nombrePaciente
         * @param dia
         * @param mes
         * @param servicio
         * @param nombreMascota 
         */
	public Citas(int id, String nombrePaciente, int dia, int mes, String servicio, String nombreMascota){
		this.id = id;
		this.nombrePaciente = nombrePaciente;
		this.dia = dia;
		this.mes = mes;
		this.servicio = servicio;
		this.nombreMascota = nombreMascota;

	}
	public int getId(){
		return id;
	}
        /**
         * Este es el metodo de idCliente
         * @param idCliente 
         */
        
	public void setId(int idCliente){
		this.id = idCliente;
	}
        /**
         * devuelve id del cliente
         * @return 
         */
	public String getNombre(){
		return nombrePaciente;
	}
        /**
         * Este es el metodo de nombre
         * @param nombre 
         */
	public void setNombre(String nombre){
		this.nombrePaciente = nombre;
	}
        /**
         * devuelve el nombre del paciente
         * @return nombre  
         */
	public int getDia(){
		return dia;
	}
        /**
         * Este es el metodo del diaCita
         * @param diaCita 
         */
	public void setDia(int diaCita){
		this.dia = diaCita;
	}
        /**
         * devuelve el dia de la cita
         * @return mes 
         */
	public int getMes(){
		return mes;
	}
        /**
         * Este es el metodo del mesCita
         * @param mesCita 
         */
	public void setMes(int mesCita){
		this.mes = mesCita;
	}
        /**
         * devuleve el mes de la cita
         * @return mesCita
         */
	public String getServicio(){
		return servicio;
	}
        /**
         * Este es el metodo del tipoServicio
         * @param tipoServicio 
         */
	public void setServicio(String tipoServicio){
		this.servicio = tipoServicio;
	}
        /**
         * devuelve el tipo de servicio
         * @return tipoServicio
         */
	public String getNombreMascota(){
		return nombreMascota;
	}
        /**
         * Este es el metodo dee la mascota
         * @param mascota 
         */
	public void setNombreMascota(String mascota){
		this.nombreMascota = mascota;
	}
        
	
}