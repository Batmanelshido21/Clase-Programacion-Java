package Modelos;

public class Intendente extends Persona{
	
	private String puesto;


	public Intendente(int idPersona, String nombrepersona, int edad, String puesto) {
		super(idPersona, nombrepersona, edad);
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	

}
