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
	
	public void moveX(PhysicsField field, int force)
	{
		new Thread()
		{
			public void run()
			{
				int v = force;
				
				while(true)
				{
					Point p = getLocation();
					
					if(p.x + radius < field.getWidth() && p.x >= 0)
					{
						try {Thread.sleep(FRAME_TIME);} 
						catch (InterruptedException e) {e.printStackTrace();}
						p.x += v;
						field.repaint();
					}
					else
					{
						v = -v;
						p.x += v;
					}
					
				}
			}
		}.start();
	}
	
	public void moveY(PhysicsField field, int force)
	{
		new Thread()
		{
			public void run()
			{
				int v = force;
				
				while(true)
				{
					Point p = getLocation();
					
					if(p.y + radius < field.getHeight() && p.y >= 0)
					{
						try {Thread.sleep(FRAME_TIME);} 
						catch (InterruptedException e) {e.printStackTrace();}
						p.y += v;
						field.repaint();
					}
					else
					{
						v = -v;
						p.y += v;
					}
					
				}
			}
		}.start();
	}
}
