package Colecciones;

import java.util.ArrayList;

import Clases.Moto;
import Clases.Vehiculo;

public class ListaMotos implements Funcionamiento{

	private ArrayList<Vehiculo> motos;
	
	public ListaMotos() {
		motos = new ArrayList<>();
	}
	
	public Moto devolver(int index) {
		return (Moto) motos.get(index);
	}
	
	public String algoIgual(Moto a) {
		String elemento = null;
		for(int i = 0; i < motos.size(); i++) {
			if(a.getModelo().equalsIgnoreCase(motos.get(i).getModelo())){
				elemento = a.getModelo();
			}else if(a.getMarca().equalsIgnoreCase(motos.get(i).getMarca())) {
				elemento = a.getMarca();
			}else if( a.getColor().equalsIgnoreCase(motos.get(i).getColor())) {
				elemento = a.getColor();
			}else if( a.getAnioFabricacion().equalsIgnoreCase(motos.get(i).getAnioFabricacion())) {
				elemento = a.getAnioFabricacion();
			}
		}
		return elemento;
	}
	
	public int tamanio() {
		return motos.size();
	}

	@Override
	public boolean agregar(Vehiculo v) {
		return motos.add(v);
	}

	@Override
	public boolean quitar(String patente) {
		int i = 0;
		while(i<motos.size() && patente.equalsIgnoreCase(motos.get(i).getPatente())) {
			i++;
		}
		if(i<=motos.size()) {
			motos.remove(i);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String listar() {
		String rta = "";
		
		for(int i = 0; i < motos.size(); i++) {
			rta += "\n" + motos.get(i).toString();
		}
		return rta;
	}

	@Override
	public boolean comprobarExistencia(Vehiculo v) {
		return motos.contains(v);
	}

}
