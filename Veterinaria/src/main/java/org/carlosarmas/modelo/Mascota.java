package org.carlosarmas.modelo;
public class Mascota{
	private int id; 
	private String duenio;
	private String raza;
        private String tipoMascota;
	private int diaVacuna;
	private int mesVacuna; 
	private int anioVacuna;
        private String nombre;


	public Mascota(){}
        /**
         * metodos
         * @param id
         * @param duenio
         * @param raza
         * @param tipoMascota
         * @param diaVacuna
         * @param mesVacuna
         * @param anioVacuna
         * @param nombre 
         */
	public Mascota(int id, String duenio, String raza,String tipoMascota, int diaVacuna, int mesVacuna, int anioVacuna,String nombre){
		this.id = id;
		this.duenio = duenio;
		this.raza = raza;
                this.tipoMascota = tipoMascota;
		this.diaVacuna = diaVacuna;
		this.mesVacuna = mesVacuna;
                this.anioVacuna = anioVacuna;
		this.nombre = nombre;

	}
	public int getId(){
		return id;
	}
        /**
         * Este es el metodo de idMascota
         * @param idMascota 
         */
	public void setId(int idMascota){
		this.id = idMascota;
	}
        /**
         * devuelve el id de la mascota
         * @return idMascota
         */
	public String getDuenio(){
		return duenio;
	}
        /**
         * Este es el metodo de dueñoMascota
         * @param dueñoMascota 
         */
	public void setDuenio(String dueñoMascota){
		this.duenio = dueñoMascota;
	}
        /**
         * devuelve el dueño de la mascota
         * @return dueñoMascota
         */
	public String getRaza(){
		return raza;
	}
        /**
         * Este es el metodo de razaMascota
         * @param razaMascota 
         */
	public void setRaza(String razaMascota){
		this.raza = razaMascota;
	}
        /**
         * devuelve la raza de la mascota
         * @return razaMascota
         */
	public String getTipo(){
		return tipoMascota;
	}
        /**
         * Este es el metodo de tipoMascota
         * @param mascota 
         */
	public void setTipo(String mascota){
		this.tipoMascota = mascota;
	}
        /**
         * devuelve tipo de mascota
         * @return mascota
         */
	public int getDiaVacuna(){
		return diaVacuna;
	}
        /**
         * Este es el metodo de diaVacunaMascota
         * @param diaVacunaMascota 
         */
	public void setDiaVacuna(int diaVacunaMascota){
		this.diaVacuna = diaVacunaMascota;
	}
        /**
         * devulve el dia de la vacuna de la mascota
         * @return diaVacunaMascota
         */
        public int getMesVacuna(){
		return mesVacuna;
	}
        /**
         * Este es el metodo de mesVacunaMascota
         * @param mesVacunaMascota 
         */
	public void setMesVacuna(int mesVacunaMascota){
		this.mesVacuna = mesVacunaMascota;
	}
        /**
         * devuelve el mes de la vacuna de la mascota
         * @return 
         */
        public int getAnioVacuna(){
		return anioVacuna;
	}
        /**
         * Este es el metodo de anioVacunaMascota 
         * @param anioVacunaMascota 
         */
	public void setAnioVacuna(int anioVacunaMascota){
		this.anioVacuna = anioVacunaMascota;
	}
        /**
         * devuelve el anio de la vacuna de la mascota
         * @return anioVacunaMascota 
         */
	public String getNombre(){
		return nombre;
	}
        /**
         * Este es el metodo de nombreMascota
         * @param nombreMascota 
         */
	public void setNombre(String nombreMascota){
		this.nombre = nombreMascota;
	}
        /**
         * devuelve el nombre de la mascota
         * @return nombreMasccta
         */
	
}