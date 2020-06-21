import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.*;

public class Sandbox extends JFrame{

	private final static Dimension SCREEN_SIZE = new Dimension(800, 800);
	private PhysicsField field = new PhysicsField();
	private MyMenu menu = new MyMenu(field);
	
	public Sandbox()
	{
		this.setSize(SCREEN_SIZE);
		this.setTitle("Physics Engine");
		
		// Add Physics Objects
		
		this.add(field);
		this.setJMenuBar(menu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {new Sandbox();}
}
