package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaz.VentanaPregunta;
import modelos.Pregunta;

public class EjecutorPregunta implements ActionListener{
	
	private VentanaPregunta vistaPregunta;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(VentanaPregunta.getBotonAceptar())) {
			if(VentanaPregunta.getSelectedCheckBox().getText().equals(VentanaPregunta.getRespuestaCorrecta())){
				System.out.println("CORRECTO!");
			} else {
				System.out.println("FALLO!");
			}
		}
	}
	
	public void crearVentanaPregunta() {
		vistaPregunta = new VentanaPregunta();
	}
	
	public void darValoresPregunta(Pregunta pregunta) {
		vistaPregunta.setValues(pregunta);
	}

}
