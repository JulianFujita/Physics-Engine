import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.*;

public class Sandbox extends JFrame{

	private final static Dimension SCREEN_SIZE = new Dimension(800, 700);
	private PhysicsField field = new PhysicsField();
	
	public Sandbox()
	{
		this.setSize(SCREEN_SIZE);

		
		
		// Add Physics Objects
		field.addEntity(new Square(new Point(10, 10), 50, "Square1", Color.BLUE));
		field.addEntity(new Rectangle(new Point(300, 300), 100, 300, "Rectangle1", Color.BLACK));
		field.addEntity(new Circle(new Point(300, 50), 100, "Circle1", Color.GREEN));
		
		
		
		this.add(field);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {new Sandbox();}
}
