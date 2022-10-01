package Modelos;

public class Intendente extends Persona{
	
	private String puesto;

	public Intendente(String puesto) {
		super();
		this.puesto = puesto;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	

}
