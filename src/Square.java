import java.awt.Color;
import java.awt.Point;

public class Square extends PhysicsObject
{
	private int side;
	
	public Square(Point location, int side, String name, Color color)
	{
		super(location, name, color);
		this.side = side;
	}
	
	public int getSide()
	{
		return side;
	}
}
