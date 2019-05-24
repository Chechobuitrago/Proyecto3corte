package controlador;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import interfaz.VentanaConfig;
import interfaz.Game;
import interfaz.VentanaBienvenidos;

public class El_Bosquecillo implements ActionListener {

	VentanaBienvenidos v1;
	VentanaConfig v2;
	Game g1;

	public El_Bosquecillo() {

		v1 = new VentanaBienvenidos();
		v2 = new VentanaConfig();

		v1.setVisible(true);
		v2.setVisible(false);
		g1.setVisible(false);

	}

//	public static int generarNumAleatorio(int minimo,int maximo) {
//		return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
//	}

	public void actionPerformed(ActionEvent e) {
		String a = "El juego de Bosquecillo es un juego donde el objetivo es mover un carrito para recorrer los\r\n"
				+ "puntos objetivo en un laberinto hasta llegar a un punto determinado, sin alcanzar un número\r\n"
				+ "máximo de movimientos y bajo algunas restricciones. En este juego, al jugador se le\r\n"
				+ "denomina Bosquecillo y es quien debe mover el carrito. El juego se desarrolla en un tablero\r\n"
				+ "con forma de matriz de M x N casillas, lo que representa el laberinto, y los movimientos se\r\n"
				+ "realizan trasladándose entre una casilla y otra en dirección vertical u horizontal, solamente.\r\n"
				+ "";
		if (e.getActionCommand().equals("JUGAR")) {
			v1.setVisible(false);
			v2.setVisible(true);

		} else if (e.getActionCommand().equals("INSTRUCCIONES")) {
			JOptionPane.showMessageDialog(null, a, "mensaje de sistema", JOptionPane.INFORMATION_MESSAGE);

		} else if (e.getActionCommand().equals("SALIR")) {
			v1.setVisible(false);
			JOptionPane.showMessageDialog(null, "Gracias por jugar");

		} else if (e.getActionCommand().equals("JUGAR")) {
			v1.setVisible(false);
			v2.setVisible(true);

		} else if (e.getActionCommand().equals("ATRAS")) {
			v1.setVisible(true);
			v2.setVisible(false);
		}

		else if (e.getActionCommand().equals("FINALIZAR")) {
			v2.setVisible(false);

			String filas = v2.tamFilas.getText();
			int tamFilas = Integer.parseInt(filas);
			String columnas = v2.tamColumnas.getText();
			int tamColumnas = Integer.parseInt(columnas);

			if (tamFilas < 5 || tamFilas > 20 || tamColumnas < 5 || tamColumnas > 20) {
				JOptionPane.showMessageDialog(null, "mal");
			} else {
				g1 = new Game(tamFilas, tamColumnas);

				g1.setVisible(true);
			}

		}

	}
}
