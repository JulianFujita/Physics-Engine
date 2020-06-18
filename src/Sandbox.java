import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.*;

public class Sandbox extends JFrame{

	private final static Dimension SCREEN_SIZE = new Dimension(800, 800);
	private PhysicsField field = new PhysicsField();
	
	public Sandbox()
	{
		this.setSize(SCREEN_SIZE);
		this.setTitle("Physics Engine");
		
		// Add Physics Objects
		Circle circle1;
		for(int i = 1; i < 50; i++)
		{
			circle1 = new Circle(new Point(0, 0), 50, "Circle", Color.RED);
			field.addEntity(circle1);
			circle1.moveX(field, i);
			circle1.moveY(field, i);
		}
		
		this.add(field);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {new Sandbox();}
}
