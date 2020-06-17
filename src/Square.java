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
					
					if(p.x + side < field.getWidth() && p.x >= 0)
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
					
					if(p.y + side < field.getHeight() && p.y >= 0)
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
		
		if(point.x < origin.x + side && point.x > origin.x 
				&& point.y < origin.y + side && point.y > origin.y)
			return true;
		return false;
	}
}
