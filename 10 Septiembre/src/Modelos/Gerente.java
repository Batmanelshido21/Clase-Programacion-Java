package Modelos;

import java.util.ArrayList;

public class Gerente extends Persona {

	private String puesto;
	
	private Cuenta cuenta;
	
	private ArrayList<TrajetaCredito> tarjetas;
	

	public ArrayList<TrajetaCredito> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(ArrayList<TrajetaCredito> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Gerente(int idPersona, String nombrepersona, int edad, String puesto) {
		super(idPersona, nombrepersona, edad);
		this.puesto = puesto;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
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

	@Override
	public String toString() {
		return "Gerente [puesto=" + puesto + ", getIdPersona()=" + getIdPersona() + ", getNombrepersona()="
				+ getNombrepersona() + ", getEdad()=" + getEdad() + "]";
	}

	
}
