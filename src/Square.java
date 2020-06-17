import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

public class Square extends Shape
{
	private Point origin;
	private int side;
	private Point[] hitbox = new Point[4];
	
	public Square(Point origin, int side, String name, Color color)
	{
		super(name, color);
		this.origin = origin;
		this.side = side;
		
		// Create Hitbox
		hitbox[0] = new Point(origin.x, origin.y);
		hitbox[1] = new Point(origin.x + side, origin.y);
		hitbox[2] = new Point(origin.x, origin.y + side);
		hitbox[3] = new Point(origin.x + side, origin.y + side);
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
		g2.fill(new Rectangle(origin.x, origin.y, side, side));
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		g2.drawRect(origin.x, origin.y, side, side);
	}
}
