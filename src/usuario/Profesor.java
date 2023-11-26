package usuario;

public class Profesor extends Usuario{
	
	String Especialidad;

	
	@Override
	public void ObtenerInformacion() {
			
	}
	
	@Override
	public boolean Autentificar(String password) {
	
		return false;
	}

}
