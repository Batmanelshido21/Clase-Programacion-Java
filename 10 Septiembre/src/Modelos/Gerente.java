package Modelos;

public class Gerente extends Persona {

	private String puesto;
	
	
	public Gerente(String puesto) {
		super();
		this.puesto = puesto;
	}

	public String generaActividad() {
		return "Está haciendo actividad de gerente";
	}
	
	public void generarActivdad2() {
		System.out.println("Está haciendo actividad de gerente");
	}

	//Obtiene el valor de puestop
	public String getPuesto() {
		return puesto;
	}

	//Dan el valor de puesto
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
}
