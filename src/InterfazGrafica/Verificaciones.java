package InterfazGrafica;

import java.util.ArrayList;

/**
 * @author SAMUEL Y LAURA
 * @version 1.0
 */

public class Verificaciones {

	private validacion superior;
	private BaseDatos db = new BaseDatos();
	private ArrayList<ArrayList> adminUsu = new ArrayList();

	private validacion ataqueFB = new AtaqueFuerzaBruta();
	private RespuestaCache respuestaCache = new RespuestaCache();
	private validacion datosCrudos = new DatosCrudos(respuestaCache);

	private OrdenesEnLinea ordenesLinea = new OrdenesEnLinea();

	public Verificaciones() {

	}

	public void datosClienteParaValidar(String usuario, String password, String perfil) {

		// este eswiche se crea por si el usuario no se encuentra en base dedatos
		// utilice la clase ataquFuerzaBruta
		// para impedir que coja la clave
		boolean swiche = true;

		// este if espara verificar si el mismo usuario se a logueado en esta maquina lo
		// deje pasar sin pasar por todas las verificacions datos de cache
		if (respuestaCache.datosCacheGuardados(usuario, password)) {
			ordenesLinea.conexionSistemaOrdenLinea(perfil, usuario);
			System.out.println("me debolvieron cache y pase directo");
		} else {
			// si el usuario si se encuentra en la base de datos el ingresa y llama al
			// metodo validacionDatosExtra el cual va y verifica las validaciones extras que
			// tiene
			if (perfil.equals("ADMINISTRADOR")) {
				adminUsu = db.getAdministradores();
				for (int i = 0; i < adminUsu.size(); i++) {
					if (adminUsu.get(i).get(0).equals(usuario) && adminUsu.get(i).get(1).equals(password)) {
						ValidacionDatosExtra(usuario, password, perfil);
						swiche = false;
					}
				}
				if (swiche) {
					ataqueFB.datosParaValidar(usuario, password, perfil);
				}
			} else {

				adminUsu = db.getUsuarios();
				for (int i = 0; i < adminUsu.size(); i++) {
					if (adminUsu.get(i).get(0).equals(usuario) && adminUsu.get(i).get(1).equals(password)) {
						ValidacionDatosExtra(usuario, password, perfil);
						swiche = false;
					}
				}
				if (swiche) {
					ataqueFB.datosParaValidar(usuario, password, perfil);

				}

			}

		}

	}

	@SuppressWarnings("unused")
	private void ValidacionDatosExtra(String usuario, String password, String perfil) {
		// Aca implementamos el patron de cadena de responsavilidad psando por cada uno
		// de las validaciones extras que tengan si desea agrgar mas validaciones en
		// esta parte se pueden agregar
		superior = datosCrudos;
		superior.datosParaValidar(usuario, password, perfil);
		System.out.println("paso por validaciones jajajajaj");
		ordenesLinea.conexionSistemaOrdenLinea(perfil, usuario);

	}

}
