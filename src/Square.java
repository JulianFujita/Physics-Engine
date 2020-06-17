import java.awt.Color;
import java.awt.Point;

public class Square extends Shape
{
	private Point origin;
	private int side;
	private Point[] hitbox = new Point[4];
	
	public Square(Point origin, int side, String name, Color color)
	{
		super(name, color);
		this.origin = origin;
		this.side = side;
		
		// Create Hitbox
		hitbox[0] = new Point(origin.x, origin.y);
		hitbox[1] = new Point(origin.x + side, origin.y);
		hitbox[2] = new Point(origin.x, origin.y + side);
		hitbox[3] = new Point(origin.x + side, origin.y + side);
	}
}
