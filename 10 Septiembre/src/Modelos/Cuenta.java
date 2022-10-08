package Modelos;

public class Cuenta {
	
	private String correo;
	
	private String password;
	
	private Gerente gerente;

	public Cuenta(String correo, String password, Gerente gerente) {
		super();
		this.correo = correo;
		this.password = password;
		this.gerente = gerente;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	

	public String getCorreo() {
		return correo;
	}

	@Override
	public String toString() {
		return "Cuenta [correo=" + correo + ", password=" + password + "]";
	}

}
