package org.carlosarmas.modelo;
public class Medico{
	private int id; 
	private String nombre;
	private String apellido;
	private String telefono;
	private String especialidad;
	private String email; 
	private String direccion;
	private String estudios;
	private String colegiado;

	public Medico(){}
        /**
         * metodos
         * @param id
         * @param nombre
         * @param apellido
         * @param telefono
         * @param especialidad
         * @param email
         * @param direccion
         * @param estudios
         * @param colegiado 
         */
	public Medico(int id, String nombre, String apellido, String telefono, String especialidad, String email, String direccion, String estudios, String colegiado){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.especialidad = especialidad;
		this.email = email;
		this.direccion = direccion;
		this.estudios = estudios;
		this.colegiado = colegiado;
	}
	public int getId(){
		return id;
	}
        /**
         * Este es el metodo de idDoctor 
         * @param idDoctor 
         */
	public void setId(int idDoctor){
		this.id = idDoctor;
	}
        /**
         * devuelve el id del doctor
         * @return idDoctor
         */
	public String getNombre(){
		return nombre;
	}
        /**Este es el metodo de nombreDoctor 
         * 
         * @param nombreDoctor 
         */
	public void setNombre(String nombreDoctor){
		this.nombre = nombreDoctor;
	}
        /**
         * devuelve el nombre del medico
         * @return nombreDoctor
         */
	public String getApellido(){
		return apellido;
	}
        /**
         * Este es el metodo de apellidoDoctor 
         * @param apellidoDoctor 
         */
	public void setApellido(String apellidoDoctor){
		this.apellido = apellidoDoctor;
	}
        /**
         * devuelve el apellido del medico
         * @return apellidoDoctor
         */
	public String getTelefono(){
		return telefono;
	}
        /**
         * Este es el metodo de telefonoDoctor 
         * @param telefonoDoctor 
         */
	public void setTelefono(String telefonoDoctor){
		this.telefono = telefonoDoctor;
	}
        /**
         * devuelve el numero de telefono del medico
         * @return telefonoDoctor
         */
	public String getEspecialidad(){
		return especialidad;
	}
        /**
         * Este es el metodo de especialidadDoc
         * @param especialidadDoc 
         */
	public void setEspecialidad(String especialidadDoc){
		this.especialidad = especialidadDoc;
	}
        /**
         * devuelve la especialidad del 
         * @return 
         */
	public String getEmail(){
		return email;
	}
        /**
         * Este es el metodo de especialidadDoc
         * @param emailDoctor 
         */
	public void setEmail(String emailDoctor){
		this.email = emailDoctor;
	}
        /**
         * devuelve el email del medico
         * @return emailDoctor
         */
	public String getDireccion(){
		return direccion;
	}
        /**
         * Este es el metodo de direccionDoctor
         * @param direccionDoctor 
         */
	public void setDireccion(String direccionDoctor){
		this.direccion = direccionDoctor;
	}
        /**
         * devuelve la direccion del medico
         * @return direccionDoctor
         */
	public String getEstudios(){
		return estudios;
	}
        /**
         * Este es el metodo de estudiosDoctor
         * @param estudiosDoctor 
         */
	public void setEstudios(String estudiosDoctor){
		this.estudios = estudiosDoctor;
	}
        /**
         * devuleve los estudios del medico
         * @return 
         */
	public String getColegiado(){
		return colegiado;
	}
        /**
         * Este es el metodo de colegiadoDoctor
         * @param colegiadoDoctor 
         */
	public void setColegiado(String colegiadoDoctor){
		this.colegiado = colegiadoDoctor;
	}
        /**
         * devuelve el colegiado 
         * @return colegiadoDoctor
         */
}