import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public abstract class Shape  extends JPanel
{
	private String name;
	private Color color;
	
	public Shape(String name, Color color)
	{
		this.name = name;
		this.color = color;
		this.setToolTipText(name);
	}
	
	public Color getColor()
	{
		return color;
	}
}
