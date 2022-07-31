package App;

import Clases.Auto;
import Clases.Camioneta;
import Clases.Moto;
import Colecciones.ListaMotos;
import Colecciones.MapaCamionetas;
import Colecciones.PilaAutos;
import Excepciones.RepetidoException;
import Json.ControladorJson;

public class Concesionario {

	private ListaMotos motos;
	private MapaCamionetas camionetas;
	private PilaAutos autos;
	
	public Concesionario() {
		motos = new ListaMotos();
		camionetas = new MapaCamionetas();
		autos = new PilaAutos();
	}

	public ListaMotos getMotos() {
		return motos;
	}

	public MapaCamionetas getCamionetas() {
		return camionetas;
	}

	public PilaAutos getAutos() {
		return autos;
	}
	
	
	//-----------------------------------FUNCIONES AGREGAR
	public void agregarMoto(Moto m) {
		String elemento = motos.algoIgual(m);
		try {
			if(elemento == null) {
				motos.agregar(m);
			}else {throw new RepetidoException("No se puede guardar este auto", elemento);}
		}catch(RepetidoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void agregarCamioneta(Camioneta c) {
		String elemento = camionetas.algoIgual(c);
		try {
			if(elemento == null) {
				camionetas.agregar(c);
			}else {throw new RepetidoException("No se puede guardar este auto", elemento);}
		}catch(RepetidoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void agregarAuto(Auto a) {
		String elemento = autos.algoIgual(a);
		try {
			if(elemento == null) {
				autos.agregar(a);
			}else {throw new RepetidoException("No se puede guardar este auto", elemento);}
		}catch(RepetidoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//-------------------------------------FUNCIONES JSON
	
	public void cargarAutos() {
		ControladorJson.cargarAutos(autos);
	}
	
	public void cargarCamionetas() {
		ControladorJson.cargarCamionetas(camionetas);
	}
	
	public void cargarMotos() {
		ControladorJson.cargarMotos(motos);
	}
	
	public void cargarTodo() {
		ControladorJson.cargarTodo(camionetas, autos, motos);
	}
	
}
