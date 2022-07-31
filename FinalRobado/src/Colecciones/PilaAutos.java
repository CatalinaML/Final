package Colecciones;

import java.util.Stack;

import Clases.Auto;
import Clases.Vehiculo;

public class PilaAutos implements Funcionamiento{

	private Stack<Vehiculo> autos;
	
	public PilaAutos() {
		autos = new Stack<>();
	}
	
	@Override
	public boolean agregar(Vehiculo v) {
		if(autos.push(v)!=null) {
			return true;
		}else {return false;}
	}

	@Override
	public boolean quitar(String patente) {
		Stack<Vehiculo> aux = new Stack<>();
		boolean eliminado = false;
		while(autos.empty()) {
			if(patente.equalsIgnoreCase(autos.peek().getPatente())) {
				autos.pop();
				eliminado = true;
			}else {
				aux.push(autos.pop());
			}
		}
		
		while(aux.empty()) {
			autos.push(aux.pop());
		}
		
		return eliminado;
	}

	@Override
	public boolean comprobarExistencia(Vehiculo v) {
		return autos.contains(v);
	}
	
	@Override
	public String listar() {
		String rta = "";
		for(int i = 0; i < autos.size(); i++) {
			rta += "\n" + autos.get(i).toString();
		}
		return rta;
	}
	
	public Auto tope() {
		return (Auto) autos.peek();
	}
	
	public String algoIgual(Auto a) {
		String elemento = null;
		for(int i = 0; i < autos.size(); i++) {
			if(a.getModelo().equalsIgnoreCase(autos.get(i).getModelo())){
				elemento = a.getModelo();
			}else if(a.getMarca().equalsIgnoreCase(autos.get(i).getMarca())) {
				elemento = a.getMarca();
			}else if( a.getColor().equalsIgnoreCase(autos.get(i).getColor())) {
				elemento = a.getColor();
			}else if( a.getAnioFabricacion().equalsIgnoreCase(autos.get(i).getAnioFabricacion())) {
				elemento = a.getAnioFabricacion();
			}
		}
		return elemento;
	}
	
	public int tamanio() {
		return autos.size();
	}
	
	public Auto devolver(int index) {
		return (Auto) autos.get(index);
	}
}
