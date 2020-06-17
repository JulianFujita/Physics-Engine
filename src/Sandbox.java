import java.awt.Color;
import java.awt.Point;

public class Sandbox {

	public Sandbox()
	{
		
	}
	
	public static void main(String[] args) 
	{
		new PhysicsObject("Square", new Square(new Point(0, 0), 10, "one", Color.black));
		new PhysicsObject("Rectangle", new Rectangle(new Point(0, 0), 10, 20, "two", Color.ORANGE));
		new PhysicsObject("Circle", new Circle(new Point(10, 10), 20, "three", Color.YELLOW));
	}

}
