import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape
{
	private Point origin;
	private int radius;
	
	public Circle(Point origin, int radius, String name, Color color)
	{
		super(name, color);
		this.origin = origin;
		this.radius = radius;
		
		// Create Hitbox
	}
}
