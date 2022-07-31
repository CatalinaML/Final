package App;

import Clases.Auto;
import Clases.Camioneta;
import Clases.Moto;
import Colecciones.ListaMotos;
import Colecciones.MapaCamionetas;
import Colecciones.PilaAutos;

public class Main {

	public static void main(String[] args) {
		Concesionario concesionario = new Concesionario();
		
		//llenar datos
		//--------------------------------------CAMIONETAS
		System.out.println("\nCAMIONETAS");
		Camioneta c1 = new Camioneta("123", "Toyota", "a", "1987", "rojo", false, false);
		Camioneta c2 = new Camioneta("124", "Toyota", "b", "1988", "verde", true, false);
		Camioneta c3 = new Camioneta("125", "Fiat", "c", "2000", "azul", false, true);
		Camioneta c4 = new Camioneta("126", "Renault", "c", "1987", "amarillo", true, true);
		Camioneta c5 = new Camioneta("127", "Ford", "d", "1987", "rojo", false, false);
		
		concesionario.agregarCamioneta(c1);
		concesionario.agregarCamioneta(c2);
		concesionario.agregarCamioneta(c3);
		concesionario.agregarCamioneta(c4);
		concesionario.agregarCamioneta(c5);
		
		MapaCamionetas camionetas = new MapaCamionetas();
		camionetas = concesionario.getCamionetas();
		
		System.out.println(camionetas.listar());
		concesionario.cargarCamionetas();// CARGA DE JSON
		
		//--------------------------------------MOTOS
		System.out.println("\nMOTOS");
		Moto m1 = new Moto("213", "yamaha", "a", "2000", "rojo", 5, false);
		Moto m2 = new Moto("214", "yamaha", "b", "2000", "verde", 4, true);
		Moto m3 = new Moto("215", "motomami", "c", "2002", "azul", 2, true);
		Moto m4 = new Moto("218", "fiat", "d", "2015", "amarillo", 4, false);
		Moto m5 = new Moto("219", "ford", "e", "2009", "rojo", 1, true);
		Moto m6 = new Moto("210", "renault", "a", "2010", "negro", 5, false);
		
		concesionario.agregarMoto(m1);
		concesionario.agregarMoto(m2);
		concesionario.agregarMoto(m3);
		concesionario.agregarMoto(m4);
		concesionario.agregarMoto(m5);
		concesionario.agregarMoto(m6);
		
		ListaMotos motos = new ListaMotos();
		motos = concesionario.getMotos();
		
		System.out.println(motos.listar());
		concesionario.cargarMotos();// CARGA DE JSON
		
		//--------------------------------------AUTOS
		System.out.println("\nAUTOS");
		Auto a1 = new Auto("354", "fiat", "A", "1999", "rojo", 2);
		Auto a2 = new Auto("357", "ford", "b", "1952", "verde", 2);
		Auto a3 = new Auto("356", "renault", "c", "1987", "violeta", 2);
		Auto a4 = new Auto("350", "ford", "d", "1998", "amarillo", 2);
		Auto a5 = new Auto("353", "toyota", "e", "1999", "rojo", 2);
		Auto a6 = new Auto("389", "sdhks", "f", "2010", "negro", 2);

		concesionario.agregarAuto(a1);
		concesionario.agregarAuto(a2);
		concesionario.agregarAuto(a3);
		concesionario.agregarAuto(a4);
		concesionario.agregarAuto(a5);
		concesionario.agregarAuto(a6);
		
		PilaAutos autos = new PilaAutos();
		autos = concesionario.getAutos();
		
		System.out.println(autos.listar());
		concesionario.cargarAutos();// CARGA DE JSON
		
		//---------------------------------------CARGA DE TODOS LOS ARCHIVOS
		concesionario.cargarTodo();
	}

}
