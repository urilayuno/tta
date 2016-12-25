package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaz.VentanaPregunta;
import interfaz.VentanaPrincipal;
import modelos.LectorFicheros;
import modelos.Pregunta;

public class EjecutorPrincipal implements ActionListener{
	
	private VentanaPregunta vistaPregunta;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(VentanaPrincipal.getBoton("IPS"))) {
			String[] preguntas = LectorFicheros.obtenerPreguntas("IPS", "T1");
			Pregunta pregunta = new Pregunta(preguntas[0]);
			vistaPregunta = new VentanaPregunta();
			
		}
	}

}
