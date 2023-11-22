package usuario;

public class Estudiante extends Usuario{

	int Calificacion;


	
	@Override
	public void ObtenerInformacion() {
		
	}

	@Override
	public boolean Autentificar(String password) {
		
		return false;
	}
}
