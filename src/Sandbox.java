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
		Square movingSquare = new Square(new Point(0, 0), 100, "Orange Square", Color.ORANGE);
		Rectangle movingRect = new Rectangle(new Point(100, 100), 150, 300, "Pink Rectangle", Color.PINK);
		Circle movingCircle = new Circle(new Point(50, 50), 100, "Yellow Circle", Color.YELLOW);
		
		field.addEntity(movingSquare);
		field.addEntity(movingRect);
		field.addEntity(movingCircle);
		
		// Interact here
		movingSquare.moveY(field,  2);
		movingSquare.moveX(field,  1);
		movingRect.moveX(field, 2);
		movingRect.moveY(field, 1);
		movingCircle.moveY(field, 1);
		movingCircle.moveX(field,  1);
		
		
		this.add(field);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {new Sandbox();}
}
