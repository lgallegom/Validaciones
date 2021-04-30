package InterfazGrafica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author SAMUEL Y LAURA
 * @version 1.0
 */
public class RespuestaCache extends validacion {
	private ArrayList<ArrayList> datosCache = new ArrayList();
	private ArrayList<String> datosCacheIndividuales = new ArrayList<String>();

	public RespuestaCache() {
		super();
	}

	@Override
	public void datosParaValidar(String usuario, String password, String perfil) {
		// se simula una recoleccion de datos de cache gurdandolos en un arreglo si se
		// cierra el programa se borran los datos de cache
		datosCacheIndividuales.add(0, usuario);
		datosCacheIndividuales.add(1, password);
		datosCache.add(datosCacheIndividuales);

	}

	public boolean datosCacheGuardados(String usuario, String password) {
		// este metodo se creo para utilizarlo en Verificaciones se conparan los datos
		// que vuelven a entrar y si son iguales a los datos de cahce lo deja ingresar a
		// ordenes en linea
		for (int i = 0; i < datosCache.size(); i++) {
			if (datosCache.get(i).get(0).equals(usuario) && datosCache.get(i).get(1).equals(password)) {
				return true;
			}

		}
		return false;

	}

}
