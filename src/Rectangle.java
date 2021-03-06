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
					
					if(p.x + width < field.getWidth() && p.x >= 0)
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
					
					if(p.y + height < field.getHeight() && p.y >= 0)
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
		
		if(point.x < origin.x + width && point.x > origin.x 
				&& point.y < origin.y + height && point.y > origin.y)
			return true;
		return false;
	}
}
