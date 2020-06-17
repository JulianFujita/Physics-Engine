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
		Square movingSquare = new Square(new Point(0, 0), 100, "MovingSquare", Color.ORANGE);
		Rectangle movingRect = new Rectangle(new Point(100, 100), 50, 300, "MovingRect", Color.PINK);
		Square fastSquare = new Square(new Point(100, 100), 30, "FastSquare", Color.CYAN);
		Rectangle slowRect = new Rectangle(new Point(0, 0), 100, 50, "SlowRect", Color.GRAY);
		Circle circle = new Circle(new Point(50, 50), 30, "Circle", Color.YELLOW);
		
		field.addEntity(movingSquare);
		field.addEntity(movingRect);
		field.addEntity(fastSquare);
		field.addEntity(slowRect);
		field.addEntity(circle);
		
		// Interact here
		movingSquare.moveY(field,  5);
		movingSquare.moveX(field,  4);
		movingRect.moveX(field, 3);
		movingRect.moveY(field, 5);
		fastSquare.moveX(field, 10);
		fastSquare.moveY(field, 10);
		slowRect.moveX(field, 1);
		slowRect.moveY(field, 1);
		circle.moveY(field, 1);
		
		slowRect.stop();
		
		
		this.add(field);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {new Sandbox();}
}
