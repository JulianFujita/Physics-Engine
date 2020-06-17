import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Rectangle extends Shape
{
	private Point origin;
	private int width;
	private int height;
	private Point[] hitbox = new Point[4];
	
	public Rectangle(Point origin, int width, int height, String name, Color color)
	{
		super(name, color);
		this.origin = origin;
		this.width = width;
		this.height = height;
		
		// Create Hitbox
		hitbox[0] = new Point(origin.x, origin.y);
		hitbox[1] = new Point(origin.x + width, origin.y);
		hitbox[2] = new Point(origin.x, origin.y + height);
		hitbox[3] = new Point(origin.x + width, origin.y + height);
	}
	
	public Point[] getHitbox()
	{
		return hitbox;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(getColor());
		g2.fill(new java.awt.Rectangle(origin.x, origin.y, width, height));
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		g2.drawRect(origin.x, origin.y, width, height);
	}
}
