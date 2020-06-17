import java.awt.Color;
import java.awt.Point;

import javax.swing.JPanel;

public abstract class PhysicsObject extends JPanel
{
	private String name;
	private Color color;
	private Point location;
	
	public PhysicsObject(Point location, String name, Color color) 
	{
		this.location = location;
		this.name = name;
		this.color = color;
		this.setToolTipText(name);
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
}
