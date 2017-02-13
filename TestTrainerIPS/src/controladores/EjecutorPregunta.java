package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaz.VentanaPregunta;

public class EjecutorPregunta implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(VentanaPregunta.getBotonAceptar())) {
			if(VentanaPregunta.getSelectedCheckBox().getText().equals("a)")){
				System.out.println("Has seleccionado la a");
			} else {
				System.out.println("Opcion no valida");
			}
		}
	}

}
