package Json;

import java.util.Iterator;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import Clases.Camioneta;
import Clases.Vehiculo;
import Colecciones.ListaMotos;
import Colecciones.MapaCamionetas;
import Colecciones.PilaAutos;

public class ControladorJson {

	public static JSONArray cargarMotos(ListaMotos motos) {
		JSONArray jsonArray = new JSONArray();
		for(int i = 0; i < motos.tamanio(); i++) {
			JSONObject jsonObject = new JSONObject();
			
			try {
				jsonObject.put("patente", motos.devolver(i).getPatente());
				jsonObject.put("modelo", motos.devolver(i).getModelo());
				jsonObject.put("marca", motos.devolver(i).getMarca());
				jsonObject.put("color", motos.devolver(i).getColor());
				jsonObject.put("anioFabricacion", motos.devolver(i).getAnioFabricacion());
				jsonObject.put("cantCilindros", motos.devolver(i).getCantCilindro());
				jsonObject.put("conCasco", motos.devolver(i).isConCasco());
				
				jsonArray.put(jsonObject);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		
		JsonUtiles.grabar(jsonArray, "archivoMotos");
		return jsonArray;
	}
	
	public static JSONArray cargarAutos(PilaAutos autos) {
		JSONArray jsonArray = new JSONArray();
		for(int i = 0; i < autos.tamanio(); i++) {
			JSONObject jsonObject = new JSONObject();
			
			try {
				jsonObject.put("patente", autos.devolver(i).getPatente());
				jsonObject.put("modelo", autos.devolver(i).getModelo());
				jsonObject.put("marca", autos.devolver(i).getMarca());
				jsonObject.put("color", autos.devolver(i).getColor());
				jsonObject.put("anioFabricacion", autos.devolver(i).getAnioFabricacion());
				jsonObject.put("cantPuertas", autos.devolver(i).getCantPuertas());
				
				jsonArray.put(jsonObject);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		JsonUtiles.grabar(jsonArray, "archivoAutos");
		return jsonArray;
	}
	
	public static JSONArray cargarCamionetas(MapaCamionetas camionetas) {
		JSONArray jsonArray = new JSONArray();
		Iterator<Map.Entry<String, Vehiculo>> fila = camionetas.iterador();
		
		while(fila.hasNext()) {
			Map.Entry<String, Vehiculo> unaFila = fila.next();
			JSONObject jsonObject = new JSONObject();
			
			try {
				jsonObject.put("patente", unaFila.getValue().getPatente());
				jsonObject.put("modelo", unaFila.getValue().getModelo());
				jsonObject.put("marca", unaFila.getValue().getMarca());
				jsonObject.put("color", unaFila.getValue().getColor());
				jsonObject.put("anioFabricacion", unaFila.getValue().getAnioFabricacion());
				if(unaFila.getValue() instanceof Camioneta) {
					Camioneta unaCamioneta = (Camioneta) unaFila.getValue();
					jsonObject.put("cajaCerrada",unaCamioneta.isCajaCerrada());
					jsonObject.put("farosAntiniebla", unaCamioneta.isFarosAntiniebla());
				}
				
				jsonArray.put(jsonObject);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		JsonUtiles.grabar(jsonArray, "archivoCamionetas");
		return jsonArray;
	}
	
	public static void cargarTodo(MapaCamionetas camionetas, PilaAutos autos, ListaMotos motos) {
		JSONArray jsonArray = new JSONArray();
		JSONArray motosJson = cargarMotos(motos);
		JSONArray autosJson = cargarAutos(autos);
		JSONArray camionetasJson = cargarCamionetas(camionetas);
		
		jsonArray.put(motosJson);
		jsonArray.put(autosJson);
		jsonArray.put(camionetasJson);
		
		JsonUtiles.grabar(jsonArray, "archivoGeneral");
	}
}
