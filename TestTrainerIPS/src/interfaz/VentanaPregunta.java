package interfaz;

import java.awt.BorderLayout;
import javax.swing.*;

import controladores.EjecutorPregunta;
import modelos.Pregunta;

public class VentanaPregunta extends JFrame{
	private static JRadioButton opcionA;
	private static JRadioButton opcionB;
	private static JRadioButton opcionC;
	private static JButton botonAceptar;
	private ButtonGroup grupoOpciones;
	//TODO grupo de radio buttons
	
	private JPanel panelBoton;
	
	private EjecutorPregunta ejecutorPregunta = new EjecutorPregunta();
	
	
	public VentanaPregunta() {
		panelBoton = new JPanel();
		JPanel panelOpciones = new JPanel();
		JPanel titulo = new JPanel();

		botonAceptar = new JButton("Aceptar");
		opcionA = new JRadioButton("a)");
		opcionB = new JRadioButton("b)");
		opcionC = new JRadioButton("c)");

		grupoOpciones = new ButtonGroup();

		grupoOpciones.add(opcionA);
		grupoOpciones.add(opcionB);
		grupoOpciones.add(opcionC);
		
		botonAceptar.addActionListener(ejecutorPregunta);
		
		panelBoton.add(botonAceptar);

		panelOpciones.setLayout(new BoxLayout(panelOpciones, BoxLayout.PAGE_AXIS));
		panelOpciones.add(opcionA);
		panelOpciones.add(opcionB);
		panelOpciones.add(opcionC);

		//TODO Corregir como aparecen los botones, pegarlos al marco izquierdo

		this.setSize(500, 500);
		this.setVisible(true);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		this.add(titulo);
		this.add(panelOpciones, BorderLayout.WEST);
		this.add(panelBoton, BorderLayout.SOUTH);
	}
	
	public static JRadioButton getSelectedCheckBox() {
		JRadioButton checkBox = null;
		
		if(opcionA.isSelected()) {
			checkBox = opcionA;
		}
		
		return checkBox;
	}
	
	public static JButton getBotonAceptar() {
		return botonAceptar;
	}
	
	public void setValues(Pregunta pregunta){
		
	}
}
