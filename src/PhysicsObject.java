import java.awt.Point;

public class PhysicsObject
{
	private String name;
	private Shape sp;
	private Point location = new Point(0, 0);
	
	public PhysicsObject(String name, Shape sp)
	{
		this.name = name;
		this.sp = sp;
	}
}
