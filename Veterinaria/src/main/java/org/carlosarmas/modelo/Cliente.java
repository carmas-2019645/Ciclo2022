package org.carlosarmas.modelo;
public class Cliente{
    
	private int id; 
	private String nombre;
	private String apellido;
	private String telefono;
	private String email; 
	private String direccion;
        private String mascota;
	private String nombreMascota;       

	public Cliente(){}
        /**
         * metodos 
         * @param id
         * @param nombre
         * @param apellido
         * @param telefono
         * @param email
         * @param direccion
         * @param mascota
         * @param nombreMascota 
         */
	public Cliente(int id, String nombre, String apellido, String telefono, String email, String direccion,String mascota, String nombreMascota){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
                this.mascota = mascota;
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
         * devuelve el id del cliente
         * @return idCliente
         */
	public String getNombre(){
		return nombre;
	}
        /**
         * Este es el metodo de nombreCliente
         * @param nombreCliente 
         */
	public void setNombre(String nombreCliente){
		this.nombre = nombreCliente;
	}
        /**
         * devuelve el apellido
         * @return apellido
         */
	public String getApellido(){
		return apellido;
	}
        /**
         * Este es el metodo de apellidoCliente
         * @param apellidoCliente 
         */
	public void setApellido(String apellidoCliente){
		this.apellido = apellidoCliente;
	}
        /**
         * devuelve el telefono
         * @return telefono
         */
	public String getTelefono(){
		return telefono;
	}
        /**
         * Este es el metodo de telefonoCliente
         * @param telefonoCliente 
         */
	public void setTelefono(String telefonoCliente){
		this.telefono = telefonoCliente;
	}
        /**
         * devuelve datos de la mascota
         * @return mascota
         */
	public String getMascota(){
		return mascota;
	}
        /**
         * Este es el metodo de tipoMascota
         * @param tipoMascota 
         */
	public void setMascota(String tipoMascota){
		this.mascota = tipoMascota;
	}
        /**
         * devuelve el email
         * @return email
         */
	public String getEmail(){
		return email;
	}
        /**
         * Este es el metodo de emailCliente
         * @param emailCliente 
         */
	public void setEmail(String emailCliente){
		this.email = emailCliente;
	}
        /**
         * devuelve la dirección
         * @return dirección 
         */
	public String getDireccion(){
		return direccion;
	}
        /**
        * Este es el metodo de direccionCliente
         * @param direccionCliente 
         */
	public void setDireccion(String direccionCliente){
		this.direccion = direccionCliente;
	}
        /**
         * devuelve el nombre de la mascota
         * @return NombreMascota
         */
	public String getNombreMascota(){
		return nombreMascota;
	}/**
        * Este es el metodo de masCota
         * @param masCota 
         */
	public void setNombreMascota(String masCota){
		this.nombreMascota = masCota;
	}
        
	
}