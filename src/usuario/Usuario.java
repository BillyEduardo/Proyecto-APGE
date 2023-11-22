package usuario;

abstract class Usuario implements InformacionUsuario , Autentificacion {

	
	String nombre;
	String correo;
	String password;
	String rol;
	int id;
	
}

