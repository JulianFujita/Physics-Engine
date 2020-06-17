import java.awt.Color;
import java.awt.Point;

public class Circle extends PhysicsObject
{
	private int radius;
	
	public Circle(Point location, int radius, String name, Color color)
	{
		super(location, name, color);
		this.radius = radius;
	}
	
	public int getRadius()
	{
		return radius;
	}
}
