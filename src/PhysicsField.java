import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PhysicsField extends JPanel
{
	private static ArrayList<PhysicsObject> entities = new ArrayList();
	
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
		}
	}
}
