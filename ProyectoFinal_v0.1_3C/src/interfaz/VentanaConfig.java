package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaConfig extends JFrame {

	JPanel contentPane;
	private JTextField assasinsTtxt;
	private JTextField assasinsLtxt;
	private JTextField murostxt;
	private JTextField objetivostxt;
	public JButton atras;
	public JButton Finalizar;
	public JTextField tamFilas;
	public JTextField tamColumnas;

	public VentanaConfig() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\Downloads\\avengers.png"));
		setTitle("Configuración.exe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCaractersticasDeMatriz = new JLabel("CONFIGURACIONES DE JUEGO.");
		lblCaractersticasDeMatriz.setFont(new Font("Calibri Light", Font.BOLD, 20));
		lblCaractersticasDeMatriz.setBounds(40, 23, 283, 35);
		contentPane.add(lblCaractersticasDeMatriz);

		JLabel label = new JLabel("");
		label.setBounds(149, 232, 46, 14);
		contentPane.add(label);

		JLabel lblPreferencasDeJuego = new JLabel("PREFERENCIAS DE JUEGO.");
		lblPreferencasDeJuego.setFont(new Font("Calibri Light", Font.BOLD, 20));
		lblPreferencasDeJuego.setBounds(55, 154, 234, 39);
		contentPane.add(lblPreferencasDeJuego);

		JLabel lblAsesinosTormentosos = new JLabel("Asesinos Tormentosos:");
		lblAsesinosTormentosos.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblAsesinosTormentosos.setBounds(40, 230, 179, 16);
		contentPane.add(lblAsesinosTormentosos);

		assasinsTtxt = new JTextField();
		assasinsTtxt.setBounds(216, 226, 86, 20);
		contentPane.add(assasinsTtxt);
		assasinsTtxt.setColumns(10);

		JLabel lblAsesion = new JLabel("Asesinos Let\u00E1les:");
		lblAsesion.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblAsesion.setBounds(40, 267, 127, 20);
		contentPane.add(lblAsesion);

		assasinsLtxt = new JTextField();
		assasinsLtxt.setBounds(216, 267, 86, 20);
		contentPane.add(assasinsLtxt);
		assasinsLtxt.setColumns(10);

		JLabel lblMuros = new JLabel("Muros:");
		lblMuros.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblMuros.setBounds(40, 310, 93, 20);
		contentPane.add(lblMuros);

		murostxt = new JTextField();
		murostxt.setBounds(216, 310, 86, 20);
		contentPane.add(murostxt);
		murostxt.setColumns(10);

		JLabel lblV = new JLabel("V 2.0");
		lblV.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblV.setBounds(308, 500, 46, 14);
		contentPane.add(lblV);

		JLabel lblMakoaTm = new JLabel("Makoa Tm");
		lblMakoaTm.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblMakoaTm.setBounds(10, 500, 81, 14);
		contentPane.add(lblMakoaTm);

		JLabel lblObjetivos = new JLabel("Objetivos:");
		lblObjetivos.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblObjetivos.setBounds(40, 356, 93, 27);
		contentPane.add(lblObjetivos);

		objetivostxt = new JTextField();
		objetivostxt.setBounds(216, 359, 86, 20);
		contentPane.add(objetivostxt);
		objetivostxt.setColumns(10);

		Finalizar = new JButton("FINALIZAR");
		Finalizar.setFont(new Font("Calibri Light", Font.BOLD, 15));
		Finalizar.setBounds(181, 420, 127, 23);
		contentPane.add(Finalizar);

		atras = new JButton("ATRAS");
		atras.setFont(new Font("Calibri Light", Font.BOLD, 15));
		atras.setBounds(40, 420, 115, 23);
		contentPane.add(atras);

		JLabel Filas = new JLabel("Filas");
		Filas.setFont(new Font("Calibri Light", Font.BOLD, 15));
		Filas.setBounds(40, 88, 137, 20);
		contentPane.add(Filas);

		tamFilas = new JTextField();
		tamFilas.setBounds(216, 88, 86, 20);
		contentPane.add(tamFilas);
		tamFilas.setColumns(10);
		
		JLabel lblColumnas = new JLabel("Columnas");
		lblColumnas.setFont(new Font("Calibri Light", Font.BOLD, 15));
		lblColumnas.setBounds(40, 129, 74, 14);
		contentPane.add(lblColumnas);
		
		tamColumnas = new JTextField();
		tamColumnas.setBounds(216, 119, 86, 20);
		contentPane.add(tamColumnas);
		tamColumnas.setColumns(10);

		setVisible(false);
		setLocationRelativeTo(null);

	}
}
