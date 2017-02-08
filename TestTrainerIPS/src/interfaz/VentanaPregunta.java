package interfaz;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

import controladores.EjecutorPregunta;
import modelos.Pregunta;

public class VentanaPregunta extends JFrame{
	private static JRadioButton botonA;
	private static JRadioButton botonB;
	private static JButton botonAceptar;
	//TODO grupo de radio buttons
	private static JRadioButtonMenuItem p;
	
	private JPanel panelBoton;
	
	private EjecutorPregunta ejecutorPregunta = new EjecutorPregunta();
	
	
	public VentanaPregunta() {
		panelBoton = new JPanel();
		botonAceptar = new JButton("Aceptar");
		botonA = new JRadioButton("a)");
		botonB = new JRadioButton("b)");
		
		botonAceptar.addActionListener(ejecutorPregunta);
		
		panelBoton.add(botonAceptar);
//		this.setLayout();
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(botonA);
		this.add(botonB);
		this.add(panelBoton, BorderLayout.SOUTH);
	}
	
	public static JRadioButton getSelectedCheckBox() {
		JRadioButton checkBox = null;
		
		if(botonA.isSelected()) {
			checkBox = botonA;
		}
		
		return checkBox;
	}
	
	public static JButton getBotonAceptar() {
		return botonAceptar;
	}
	
	public void setValues(Pregunta pregunta){
		
	}
}
