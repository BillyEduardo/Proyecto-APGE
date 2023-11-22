package usuario;

abstract class Usuario implements InformacionUsuario , Autentificacion {

	
	String nombre;
	String correo;
	String password;
	String rol;
	int id;
	
	//Getters y setters
	public void setNombre() {
		
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setCorreo() {
		
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setPassword() {
		
	}
	
	public String getPassword() {
		
		return password;
	}
	
	public void setRol() {
		
	}
	
	public String getRol() {
		
		return rol;
	}
	//Fin de getter y setters
	//---
	//Agregar usuario
	
	public void agregarUsuario() {}
}


