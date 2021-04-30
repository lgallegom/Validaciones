package InterfazGrafica;

import javax.swing.JOptionPane;
/**
 * @author SAMUEL Y LAURA
 * @version 1.0
 */

public class AtaqueFuerzaBruta extends validacion{

	private int erroresIngreso;	
	
	
	@Override
	public void datosParaValidar(String usuario, String password, String perfil) {		
		
		int oportunidadesIngreso = 3;
		
		if (erroresIngreso == oportunidadesIngreso) {
			JOptionPane.showMessageDialog(null, "Ha Exedido el numero de intentos. SUERTEEEEEEE");
			System.exit(0);
		} 
		JOptionPane.showMessageDialog(null,
				"Error verifique los Datos!! numero de intentos" + " " + (3 - erroresIngreso));
		erroresIngreso = erroresIngreso+1;
		
	}

}
