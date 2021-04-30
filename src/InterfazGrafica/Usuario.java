package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.DropMode;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;

public class Usuario extends JFrame {

	/**
	 * @author SAMUEL Y LAURA
	 * @version 1.0
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField JtexUser;
	private JLabel lbPassword;
	private JButton btnIngresar;
	private JComboBox comboTipoUsuario;
	private static JPasswordField JtextPassword;
	
	private Verificaciones verificacion = new Verificaciones();
	private String usuario;
	private String password;
	private String perfil;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario frame = new Usuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Usuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JtexUser = new JTextField();
		JtexUser.setDropMode(DropMode.INSERT);
		JtexUser.setBounds(202, 90, 86, 20);
		contentPane.add(JtexUser);
		JtexUser.setColumns(10);

		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setBounds(119, 93, 73, 14);
		contentPane.add(lbUsuario);

		comboTipoUsuario = new JComboBox();
		comboTipoUsuario.setToolTipText("");
		comboTipoUsuario.setModel(new DefaultComboBoxModel(new String[] { "ADMINISTRADOR", "USUARIO" }));
		comboTipoUsuario.setBackground(Color.PINK);
		comboTipoUsuario.setMaximumRowCount(3);
		comboTipoUsuario.setBounds(119, 53, 151, 22);
		contentPane.add(comboTipoUsuario);

		lbPassword = new JLabel("Password");
		lbPassword.setBounds(119, 149, 73, 14);
		contentPane.add(lbPassword);
		
		
		// al presionar el boton llama la clase verificacion 
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuario = JtexUser.getText();
				password = JtextPassword.getText();
				perfil = (String) comboTipoUsuario.getSelectedItem();
				
				verificacion.datosClienteParaValidar(usuario, password, perfil);
				
			}
		});
		btnIngresar.setForeground(Color.GREEN);
		btnIngresar.setBounds(155, 202, 133, 23);
		contentPane.add(btnIngresar);

		JtextPassword = new JPasswordField();
		JtextPassword.setBounds(202, 146, 92, 20);
		contentPane.add(JtextPassword);
	}

	
}
