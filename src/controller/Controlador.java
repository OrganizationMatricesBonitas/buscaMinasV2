package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.border.LineBorder;

import model.Coordenada;
import model.MyButton;
import model.TableroAleatorio;

public class Controlador {

	private TableroAleatorio tablero;

	public Controlador(Coordenada coordenada) {
		super();
		this.tablero.revelarCasilla(coordenada);
	}

	public Controlador(int lado) {
		tablero = new TableroAleatorio(lado, lado);
	}

	public Controlador(int lado,int minas, Coordenada coordenada) {
		tablero = new TableroAleatorio(lado, minas, coordenada);
	}
	public Controlador(int lado, List<Coordenada> posiciones) {
		tablero = new TableroAleatorio(lado, posiciones);
	}

	public TableroAleatorio getTablero() {
		return tablero;
	}

	public void setTablero(TableroAleatorio tablero) {
		this.tablero = tablero;
	}

	/*
	 * Comporbara si la casilla en el tablero esta velada
	 * 
	 * @param coordenada es la coordenada a verificar en el tablero return True si
	 * la casilla esta Velada False: si la casilla esta desvelada
	 */
	public boolean isVelada(Coordenada coordenada) {

		return tablero.getCasilla(coordenada).isVelada();
	}

	public Integer getMinasAlrededor(Coordenada coordenada) {
		// TODO Auto-generated method stub
		return tablero.getCasilla(coordenada).getMinasAlrededor();
	}

	public Color getColor(Integer minasAlrededor) {
		Color color = Color.BLACK;
		if (minasAlrededor == 1) {
			color = new Color(0, 76, 153);
		} else if (minasAlrededor == 2) {
			color = new Color(0, 153, 153);
		} else if (minasAlrededor == 3) {
			color = new Color(255, 128, 0);
		} else if (minasAlrededor == 4) {
			color = new Color(255, 100, 0);
		} else if (minasAlrededor == 5) {
			color = new Color(204, 128, 0);
		} else if (minasAlrededor == 6) {
			color = new Color(204, 0, 204);
		}else if (minasAlrededor == 7) {
			color = new Color(153, 128, 0);
		}else {
			color = new Color(153, 0, 76);
		}
		return color;
	}

	public void desvelarCasilla(Coordenada coordenada) {
		tablero.revelarCasilla(coordenada);
	}

}
