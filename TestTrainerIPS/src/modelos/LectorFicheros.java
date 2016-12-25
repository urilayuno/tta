package modelos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorFicheros {
	
	private String lecturaFichero(String asignatura, String tema) {
		
		return null;
	}
	
	public static String[] obtenerPreguntas(String asignatura, String tema) {
		
		String texto = "";
		String aux = "";
		String[] preguntas;
		
		try {
			BufferedReader lector = new BufferedReader(new FileReader(asignatura+tema+".txt"));
			while( aux != null) {
				texto += aux;
				try {
					aux = lector.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		preguntas = texto.split("//");
		
		return preguntas;
	}
	
}
