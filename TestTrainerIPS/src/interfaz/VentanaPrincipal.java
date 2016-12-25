package interfaz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.SplashScreen;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controladores.EjecutorPrincipal;

public class VentanaPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelTitulo;
	private JPanel panelBotones;
	private static JButton boton1 = new JButton("IPS");
	private JLabel titulo = new JLabel("Test Trainer");
	private final SplashScreen splash;
	
	private final EjecutorPrincipal actionListener = new EjecutorPrincipal();
	
	public VentanaPrincipal () {
		splash = SplashScreen.getSplashScreen();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.setVisible(true);
		this.setSize(new Dimension(500,500));
		panelTitulo = new JPanel();
		panelBotones = new JPanel();
		
		panelTitulo.setVisible(true);
		panelBotones.setVisible(true);
		boton1.setVisible(true);
		titulo.setVisible(true);
		
		boton1.addActionListener(actionListener);
		
		panelTitulo.add(titulo, BorderLayout.CENTER);
		panelBotones.add(boton1, BorderLayout.LINE_START);
		this.add(panelTitulo, BorderLayout.NORTH);
		this.add(panelBotones, BorderLayout.CENTER);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static JButton getBoton(String text) {
		JButton boton = null;
		switch(text) {
			case "IPS": boton = boton1;
				break;
		}
		
		return boton;
	}
}
