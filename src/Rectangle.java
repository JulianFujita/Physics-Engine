import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape
{
	private Point origin;
	private int width;
	private int height;
	private Point[] hitbox = new Point[4];
	
	public Rectangle(Point origin, int width, int height, String name, Color color)
	{
		super(name, color);
		this.origin = origin;
		this.width = width;
		this.height = height;
		
		// Create Hitbox
		hitbox[0] = new Point(origin.x, origin.y);
		hitbox[1] = new Point(origin.x + width, origin.y);
		hitbox[2] = new Point(origin.x, origin.y + height);
		hitbox[3] = new Point(origin.x + width, origin.y + height);
	}
}
