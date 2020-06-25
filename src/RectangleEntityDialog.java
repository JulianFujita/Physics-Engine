import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class RectangleEntityDialog extends AddEntityDialog
{
	public final RectanglePanel rectanglePanel = new RectanglePanel();
	
	public RectangleEntityDialog(PhysicsField field)
	{
		super(field);
		this.add(rectanglePanel, BorderLayout.EAST);
		this.pack();
	}
	
	public class RectanglePanel extends JPanel
	{
		private JLabel widthLabel = new JLabel("Width: ");
		private JTextField widthField = new JTextField();
		private JLabel heightLabel = new JLabel("Height: ");
		private JTextField heightField = new JTextField();
		
		public RectanglePanel()
		{
			this.setLayout(new GridLayout(2, 1));
			widthField.setPreferredSize(new Dimension(50, 25));
			heightField.setPreferredSize(new Dimension(50, 25));
			
			this.add(widthLabel);
			this.add(widthField);
			this.add(heightLabel);
			this.add(heightField);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		super.actionPerformed(e);
		
		try
		{
			int x = Integer.parseInt(coordinatePanel.coordX.getText());
			int y = Integer.parseInt(coordinatePanel.coordY.getText());
			int width = Integer.parseInt(rectanglePanel.widthField.getText());
			int height = Integer.parseInt(rectanglePanel.heightField.getText());
			String name = colorNamePanel.nameField.getText();
			Color color;
			String colorString = colorNamePanel.colorField.getText();
			colorString = colorString.toUpperCase();
			
			switch(colorString)
			{
			case "RED":
				color = Color.RED;
				break;
			case "ORANGE":
				color = Color.orange;
				break;
			case "YELLOW":
				color = Color.yellow;
				break;
			case "GREEN":
				color = Color.green;
				break;
			case "BLUE":
				color = Color.blue;
				break;
			case "PINK":
				color = Color.pink;
				break;
			case "CYAN":
				color = Color.cyan;
				break;
			case "GRAY":
				color = Color.gray;
				break;
			case "MAGENTA":
				color = Color.magenta;
				break;
			default:
				color = Color.WHITE;	
			}
			
			field.addEntity(new Rectangle(new Point(x, y), width, height, name, color));
			field.repaint();
		}
		catch(Exception error)
		{
			this.showError();
		}
	}
}
