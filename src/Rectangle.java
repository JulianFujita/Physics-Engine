import java.awt.Color;
import java.awt.Point;

public class Rectangle extends PhysicsObject
{
	private int width;
	private int height;
	
	public Rectangle(Point location, int width, int height, String name, Color color)
	{
		super(location, name, color);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
}
