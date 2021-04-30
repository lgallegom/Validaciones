package InterfazGrafica;

import javax.swing.JOptionPane;

/**
 * @author SAMUEL Y LAURA
 * @version 1.0
 */

public class OrdenesEnLinea {

	public OrdenesEnLinea() {
		// TODO Auto-generated constructor stub
	}

	public void conexionSistemaOrdenLinea(String perfil, String usuario) {
		// le dapaso alas ventanas dependiendo si es administrador o usuario le
		// restringe algunas ventanas
		JOptionPane.showMessageDialog(null, "Bienvenido" + " " + usuario);
		if (perfil.equals("ADMINISTRADOR")) {
			MenuBar menu = new MenuBar();
			menu.show();

		} else {
			if (perfil.equals("USUARIO")) {
				MenuBar menu = new MenuBar();
				menu.mnreportes.setVisible(false);
				menu.mninventario.setVisible(false);
				menu.mnalmacen.setVisible(false);
				menu.show();

			}
		}

	}

}
