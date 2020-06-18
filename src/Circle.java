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
		Thread thread = new Thread()
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
		}; 
		
		thread.start();
		threadList.add(thread);
	}
	
	public void moveY(PhysicsField field, int force)
	{
		Thread thread = new Thread()
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
		};
		
		thread.start();
		threadList.add(thread);
	}
	
	public boolean isPointInside(Point point)
	{
		Point origin = getLocation();
		
		if(point.x < origin.x + 2*radius && point.x > origin.x 
				&& point.y < origin.y + 2*radius && point.y > origin.y)
			return true;
		return false;
	}
}
