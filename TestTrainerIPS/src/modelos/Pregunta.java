package modelos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

public class Pregunta {
	
	private String pregunta;
	private String opcion1;
	private String opcion2;
	private String opcion3;
	private String opcionCorrecta;
	
	public Pregunta() {
		pregunta = "";
		opcion1 = "";
		opcion2 = "";
		opcion3 = "";
		opcionCorrecta = "";
	}
	
	public Pregunta(String pregunta) {
		String[] valores = pregunta.split("!");
		
		this.pregunta = valores[0];
		this.opcion1 = valores[1];
		this.opcion2 = valores[2];
		this.opcion3 = valores[3];
		
		if(opcion1.contains("#")) {
			opcionCorrecta = opcion1;
			opcion1.replaceAll("#", "");
		} else if(opcion2.contains("#")) {
			opcionCorrecta = opcion2;
			opcion2.replaceAll("#", "");
		} else {
			opcion3 = opcion3.replaceAll("#", "");
			opcionCorrecta = opcion3;
		}
	}
	
	public String getOpcion1() {
		return opcion1;
	}
	
	public String getOpcion2() {
		return opcion2;
	}
	
	public String getOpcion3() {
		return opcion3;
	}
	
	public String getOpcionCorrecta() {
		return opcionCorrecta;
	}
	
	public String getEnunciado() {
		return pregunta;
	}

}
