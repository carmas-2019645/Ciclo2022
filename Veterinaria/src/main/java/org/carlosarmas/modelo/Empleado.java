package org.carlosarmas.modelo;
public class Empleado{
	private int id; 
	private String nombre;
	private String apellido;
	private String telefono;
	private String email; 
	private String direccion;
        private String puesto;
	private String profesion;

	public Empleado(){}
        /**
         * metodos
         * @param id
         * @param nombre
         * @param apellido
         * @param telefono
         * @param email
         * @param direccion
         * @param puesto
         * @param profesion 
         */
	public Empleado(int id, String nombre, String apellido, String telefono, String email, String direccion,String puesto, String profesion){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
                this.puesto = puesto;
		this.profesion = profesion;

	}
	public int getId(){
		return id;
	}
        /**
         * Este es el metodo de idEmpleado
         * @param idEmpleado 
         */
	public void setId(int idEmpleado){
		this.id = idEmpleado;
	}
        /**
         * devuelve el id del empleado
         * @return idEmpleado
         */
	public String getNombre(){
		return nombre;
	}
        /**
         * Este es el metodo de nombreEmpleado
         * @param nombreEmpleado 
         */
	public void setNombre(String nombreEmpleado){
		this.nombre = nombreEmpleado;
	}
        /**
         * devuelve el nombre del empleado
         * @return nombreEmpleado
         */
	public String getApellido(){
		return apellido;
	}
        /**
         * Este es el metodo de apellidoEmpleado
         * @param apellidoEmpleado 
         */
	public void setApellido(String apellidoEmpleado){
		this.apellido = apellidoEmpleado;
	}
        /**
         * devuelve el apellido del empleado
         * @return apellidoEmpleado
         */
	public String getTelefono(){
		return telefono;
	}
        /**
         * Este es el metodo de telefonoEmpleado
         * @param telefonoEmpleado 
         */
	public void setTelefono(String telefonoEmpleado){
		this.telefono = telefonoEmpleado;
	}
        /**
         * devuelve el telefono del empleado
         * @return telefonoEmpleado
         */
	public String getEmail(){
		return email;
	}
        /**
         * Este es el metodo de emailEmpleado
         * @param emailEmpleado 
         */
	public void setEmail(String emailEmpleado){
		this.email = emailEmpleado;
	}
        /**
         * devuelve el email del empleado
         * @return emailEmpleado
         */
	public String getDireccion(){
		return direccion;
	}
        /**
         * Este es el metodo de direccionEmpleado
         * @param direccionEmpleado 
         */
	public void setDireccion(String direccionEmpleado){
		this.direccion = direccionEmpleado;
	}
        /**
         * Este es el metodo de idEmpleado
         * @param puestoEmpleado 
         */
        public void setPuesto(String puestoEmpleado){
		this.puesto = puestoEmpleado;
	}
        /**
         * devuelve el puesto a las empleados 
         * @return puestoEmpleado
         */
        public String getPuesto(){
		return puesto;
	}
        /**
         * devuelve la profesion del empleado
         * @return getProfesion
         */
	public String getProfesion(){
		return profesion;
	}
        /**
         * Este es el metodo de profesionEmpleado
         * @param profesionEmpleado 
         */
	public void setProfesion(String profesionEmpleado){
		this.profesion = profesionEmpleado;
	}
	
}