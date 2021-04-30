package InterfazGrafica;
/**
 * @author SAMUEL Y LAURA
 * @version 1.0
 */

public class DatosCrudos extends validacion{
	
	private validacion superior;

	public DatosCrudos(validacion superior) {
		
		super();
		this.superior = superior;
	}

	@Override
	public void datosParaValidar(String usuario, String password, String perfil) {
		
		//verifico que el usuario y contrasena no tengan espacios para evitar un ataque por sentencias SQL
		String auxiUsuario = usuario.replaceAll(" ", "");
		String auxiPassword = password.replaceAll(" ", "");
		System.out.println("usuario que llego "+" "+usuario+" "+"sin espacios"+" "+auxiUsuario);
		System.out.println("pasword que llego "+" "+password+" "+"sin espacios"+" "+auxiPassword);
		superior.datosParaValidar(auxiUsuario, auxiPassword, perfil);
		
	}

}
