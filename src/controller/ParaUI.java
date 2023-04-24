package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPanel;

import model.Botonera;
import model.Densidad;
import model.Dificultad;
import view.UI;

// herada de UI, no sabemos si estaira bien implementado
public class ParaUI extends UI {

	Dificultad dificultad;
	Densidad densidad;
	

	public ParaUI() {
		super();
		mnitInicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					contentPane.removeAll();
//					frame.revalidate();
//					frame.repaint();		
				}catch (Exception error) {
					System.out.println(error.getMessage());
				}
		
				setDificultad();
				setDensidad();
				double porcentaje = Double.valueOf(densidad.getPorcentaje())/100;
				int superficie = dificultad.getLongitud()*dificultad.getLongitud();
				
				int minas = (int) Math.round(superficie*porcentaje);
//				System.out.println(minas);
//				panelbotones = new Botonera(dificultad.getLongitud());
//				panelbotones = new Botonera(dificultad.getLongitud(),minas);
		
//				panel.add(panelbotones.getPanel(), BorderLayout.CENTER);
				revalidate();
				repaint();

			}});
	}


//	public void actionPerformed(ActionEvent e) {
//		try {
//			panel.removeAll();
////			frame.revalidate();
////			frame.repaint();		
//		}catch (Exception error) {
//			System.out.println(error.getMessage());
//		}
//
//		setDificultad();
//		setDensidad();
//		double porcentaje = Double.valueOf(densidad.getPorcentaje())/100;
//		int superficie = dificultad.getLongitud()*dificultad.getLongitud();
//		
//		int minas = (int) Math.round(superficie*porcentaje);
////		System.out.println(minas);
////		panelbotones = new Botonera(dificultad.getLongitud());
////		panelbotones = new Botonera(dificultad.getLongitud(),minas);
//
////		panel.add(panelbotones.getPanel(), BorderLayout.CENTER);
//		frame.revalidate();
//		frame.repaint();
//	}
//
//
	private void setDificultad() {
//		groupDificultad.getSelection().getSelectedObjects()
//		if (facil.isSelected()) {
//			dificultad = Dificultad.facil;
//			// botonesFacil.resetController();
//		} else if (medio.isSelected()) {
//			dificultad = Dificultad.medio;
//			// botonesMedio.resetController();
//		} else {
//			dificultad = Dificultad.dificil;
//			// botonesDificil.resetController();
//		}
	}
	
	private void setDensidad() {
//		if(baja.isSelected()) {
//			densidad=Densidad.baja;
//		}else if(media.isSelected()) {
//			densidad=Densidad.media;
//		}else {
//			densidad=Densidad.alta;
//		}
	
	}


}
