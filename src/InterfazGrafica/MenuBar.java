package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuBar extends JFrame {

	private JPanel contentPane;
	public static JMenu mnproductos;
	public static JMenu mnreportes;
	public static JMenu mninventario;
	public static JMenu mnordenlinea;
	public static JMenu mnalmacen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBar frame = new MenuBar();
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
	public MenuBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnproductos = new JMenu("PRODUCTOS");
		mnproductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnproductos.setForeground(Color.BLUE);
		menuBar.add(mnproductos);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnproductos.add(mntmNewMenuItem);
		
		mnreportes = new JMenu("REPORTES");
		mnreportes.setForeground(Color.PINK);
		menuBar.add(mnreportes);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnreportes.add(mntmNewMenuItem_1);
		
		mninventario = new JMenu("INVENTARIO");
		mninventario.setForeground(Color.RED);
		menuBar.add(mninventario);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mninventario.add(mntmNewMenuItem_2);
		
		mnordenlinea = new JMenu("ORDEN-EN-LINEA");
		mnordenlinea.setForeground(new Color(0, 255, 0));
		menuBar.add(mnordenlinea);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("items");
		mnordenlinea.add(mntmNewMenuItem_3);
		
		mnalmacen = new JMenu("ALMACEN");
		mnalmacen.setForeground(Color.PINK);
		menuBar.add(mnalmacen);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnalmacen.add(mntmNewMenuItem_4);
		
		JMenuBar menuBar_3 = new JMenuBar();
		menuBar.add(menuBar_3);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar.add(menuBar_2);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
