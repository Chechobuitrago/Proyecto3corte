package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;

public class VentanaBienvenidos extends JFrame {

	private JPanel contentPane;
	public JButton botonJugar;
	public JButton botonIntrucciones;
	public JButton salir;
	private JLabel lblNewLabel;
	private JLabel lblAddyOsmani;

	public VentanaBienvenidos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\avengers.png"));
		setTitle("Helio.exe");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblElBosquecillo = new JLabel("EL BOSQUECILLO.");
		lblElBosquecillo.setFont(new Font("Calibri Light", Font.BOLD, 30));
		lblElBosquecillo.setBounds(174, 38, 253, 61);
		contentPane.add(lblElBosquecillo);

		JLabel lblV = new JLabel("V 0.1");
		lblV.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblV.setBounds(541, 441, 43, 19);
		contentPane.add(lblV);

		botonJugar = new JButton("JUGAR");
		botonJugar.setFont(new Font("Calibri Light", Font.BOLD, 15));
		botonJugar.setBounds(160, 235, 109, 37);
		contentPane.add(botonJugar);

		botonIntrucciones = new JButton("INSTRUCCIONES");
		botonIntrucciones.setFont(new Font("Calibri Light", Font.BOLD, 15));
		botonIntrucciones.setBounds(309, 235, 152, 37);
		contentPane.add(botonIntrucciones);

		salir = new JButton("SALIR");
		salir.setFont(new Font("Calibri Light", Font.BOLD, 15));
		salir.setBounds(234, 296, 109, 37);
		contentPane.add(salir);

		JLabel lblClasif = new JLabel(" Makoa Tm");
		lblClasif.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblClasif.setBounds(10, 434, 78, 23);
		contentPane.add(lblClasif);

		lblNewLabel = new JLabel("\u201CFirst do it, then do it right, then do it better.\u201D");
		lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 20));
		lblNewLabel.setBounds(89, 110, 422, 52);
		contentPane.add(lblNewLabel);

		lblAddyOsmani = new JLabel("- Addy Osmani");
		lblAddyOsmani.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblAddyOsmani.setBounds(245, 151, 116, 37);
		contentPane.add(lblAddyOsmani);

		setVisible(true);
		setLocationRelativeTo(null);
	}

}
