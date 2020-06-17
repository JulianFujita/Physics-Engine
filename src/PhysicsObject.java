import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class PhysicsObject extends JPanel
{
	public static final int FRAME_TIME = 10;
	public ArrayList<Thread> threadList = new ArrayList<>();
	private String name;
	private Color color;
	private Point location;
	
	public PhysicsObject(Point location, String name, Color color) 
	{
		this.location = location;
		this.name = name;
		this.color = color;
	}
	
	public String getName()
	{
		return name;
	}
	public Color getColor()
	{
		return color;
	}
	public Point getLocation()
	{
		return location;
	}
	
	public void stop()
	{
		for(int i = 0; i < threadList.size(); i++)
		{
			threadList.get(i).stop();
		}
	
	}
}
