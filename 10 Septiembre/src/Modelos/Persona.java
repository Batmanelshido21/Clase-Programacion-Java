package Modelos;

public class Persona {
	
	private int idPersona;
	
	private String nombrepersona;
	
	private int edad;

	public Persona(int idPersona, String nombrepersona, int edad) {
		super();
		this.idPersona = idPersona;
		this.nombrepersona = nombrepersona;
		this.edad = edad;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrepersona() {
		return nombrepersona;
	}

	public void setNombrepersona(String nombrepersona) {
		this.nombrepersona = nombrepersona;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
		

}
