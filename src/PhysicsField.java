import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PhysicsField extends JPanel implements MouseListener
{
	private static final int FACTOR = 25;
	private static ArrayList<PhysicsObject> entities = new ArrayList();
	private static int selectedObject;
	private static Point mousePressed;
	private static Point mouseReleased;
	
	public PhysicsField()
	{
		this.setBackground(Color.DARK_GRAY);
		this.addMouseListener(this);
	}
	
	public void addEntity(PhysicsObject entity)
	{
		entities.add(entity);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		PhysicsObject entity;
		Point origin;
		Color color;
		
		for(int i = 0; i < entities.size(); i++)
		{
			entity = entities.get(i);
			origin = entity.getLocation();
			color = entity.getColor();
			
			g2.setColor(color);
			g.setColor(color);
			
			if(entity instanceof Square)
			{
				int side = ((Square) entity).getSide();
				
				g2.fill(new java.awt.Rectangle(origin.x, origin.y, side, side));
				g2.setColor(Color.BLACK);
				g2.drawRect(origin.x, origin.y, side, side);
			}
			else if(entity instanceof Rectangle)
			{
				int width = ((Rectangle) entity).getWidth();
				int height = ((Rectangle) entity).getHeight();
				
				g2.fill(new java.awt.Rectangle(origin.x, origin.y, width, height));
				g2.setColor(Color.BLACK);
				g2.drawRect(origin.x, origin.y, width, height);
			}
			else if(entity instanceof Circle)
			{
				int radius = ((Circle) entity).getRadius();
				
				g.fillOval(origin.x, origin.y, radius, radius);
				g.setColor(Color.BLACK);
				g.drawOval(origin.x, origin.y, radius, radius);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e){}

	@Override
	public void mousePressed(MouseEvent e)
	{
		Point location = e.getPoint();
		
		for(int i = 0; i < entities.size(); i++)
		{
			//Check if point is inside of any objects
			if(entities.get(i).isPointInside(location)) 
			{
				selectedObject = i;
				mousePressed = location;
				break;
			}
			else
				selectedObject = 999;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		mouseReleased = e.getPoint();
		if(!entities.isEmpty() && selectedObject != 999)
		{
			PhysicsObject entity = entities.get(selectedObject);
			int deltaX = mouseReleased.x - mousePressed.x;
			int deltaY = mouseReleased.y - mousePressed.y;
			
			entity.stop();
			entity.moveX(this, deltaX/FACTOR);
			entity.moveY(this, deltaY/FACTOR);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
