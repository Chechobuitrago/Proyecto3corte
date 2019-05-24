package interfaz;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class Game extends JFrame {

	public int DimensionX = 0;
	public int DimensionY = 0;

	public JButton[][] MatrizBotones;
	public JButton button;

	public Game(int DimensionX, int DimensionY) {
		MatrizBotones = new JButton[DimensionX][DimensionY];
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Matriz");
		setName("Tablero");
		setSize(1000,700);
		setResizable(false);
		setLayout(new GridLayout(DimensionX, DimensionY));

		for (int i = 0; i < MatrizBotones.length; i++) {
			for (int j = 0; j < MatrizBotones[0].length; j++) {
				add(new JButton("rezemos"));
			}
		}
		setLocationRelativeTo(null);

	}

}
