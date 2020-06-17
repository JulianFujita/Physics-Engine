import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape
{
	private Point origin;
	private int radius;
	private Point[] hitbox = new Point[4];
	
	public Circle(Point origin, int radius, String name, Color color)
	{
		super(name, color);
		this.origin = origin;
		this.radius = radius;
		
		// Create Hitbox
		hitbox[0] = new Point(origin.x, origin.y - radius);
		hitbox[1] = new Point(origin.x - radius, origin.y);
		hitbox[2] = new Point(origin.x, origin.y + radius);
		hitbox[3] = new Point(origin.x + radius, origin.y);
	}
	
	public Point[] getHitbox()
	{
		return hitbox;				
	}
}
