package POO;

import Modelos.Gerente;
import Modelos.Intendente;

public class Maini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String puestoG = "Gerente de mantenimiento";
		String puestoI = "Intendente general";

		Gerente gerente = new Gerente(puestoG);
		Intendente intendente = new Intendente(puestoI);

		intendente.setIdPersona(1);
		intendente.setEdad(56);
		intendente.setNombrepersona("Miguel");

		gerente.setIdPersona(0);
		gerente.setEdad(40);
		gerente.setNombrepersona("Javier");

		System.out.println("El gerente tiene  la edad de " + gerente.getEdad() + " Su nombre es "
				+ gerente.getNombrepersona() + " Su número de personal es " + gerente.getIdPersona() + " Su puesto es "
				+ gerente.getPuesto());
		gerente.generarActivdad2();
		// String pruebaMetodo = gerente.generaActividad();
		// System.out.println(pruebaMetodo);
		System.out.println("=========================");
		System.out.println("El intendente tiene  la edad de " + intendente.getEdad() + " Su nombre es "
				+ intendente.getNombrepersona() + " Su número de personal es " + intendente.getIdPersona()
				+ " Su puesto es " + intendente.getPuesto());

	}

}
