package Colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Clases.Camioneta;
import Clases.Vehiculo;

public class MapaCamionetas implements Funcionamiento{

	private HashMap<String, Vehiculo> camionetas;
	
	public MapaCamionetas() {
		camionetas = new HashMap<>();
	}
	
	@Override
	public boolean agregar(Vehiculo v) {
		if(camionetas.put(v.getPatente(), v) != null){
			return true;
		}else { return false;}
	}
	
	@Override
	public boolean quitar(String patente) {
		boolean flag = false;
		if(camionetas.containsKey(patente)) {
			camionetas.remove(patente);
			flag = true;
		}
		return flag;
	}
	
	@Override
	public boolean comprobarExistencia(Vehiculo v) {
		return camionetas.containsValue(v);
	}

	@Override
	public String listar() {
		String rta = "";
		
		Iterator<Map.Entry<String, Vehiculo>> fila = camionetas.entrySet().iterator();
		
		while(fila.hasNext()) {
			Map.Entry<String, Vehiculo> unaFila = fila.next();
			rta += unaFila.getKey() + "\n" + unaFila.getValue().toString();
		}
		
		return rta;
	}

	public Camioneta devolver(String patente) {
		return (Camioneta) camionetas.get(patente);
	}
	
	
	public int tamanio() {
		return camionetas.size();
	}
	
	public String algoIgual(Camioneta a) {
		String elemento = null;
		Iterator<Map.Entry<String, Vehiculo>> fila = camionetas.entrySet().iterator();
		
		while(fila.hasNext()) {
			Map.Entry<String, Vehiculo> unaFila = fila.next();
			if(a.getModelo().equalsIgnoreCase(unaFila.getValue().getModelo())){
				elemento = a.getModelo();
			}else if(a.getMarca().equalsIgnoreCase(unaFila.getValue().getMarca())) {
				elemento = a.getMarca();
			}else if( a.getColor().equalsIgnoreCase(unaFila.getValue().getColor())) {
				elemento = a.getColor();
			}else if( a.getAnioFabricacion().equalsIgnoreCase(unaFila.getValue().getAnioFabricacion())) {
				elemento = a.getAnioFabricacion();
			}
		}
		return elemento;
	}
	
	public Iterator<Map.Entry<String, Vehiculo>> iterador(){
		return camionetas.entrySet().iterator();
	}



	
}
