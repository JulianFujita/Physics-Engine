import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class CircleEntityDialog extends AddEntityDialog
{
	public final CirclePanel circlePanel = new CirclePanel();
	
	public CircleEntityDialog(PhysicsField field)
	{
		super(field);
		this.add(circlePanel, BorderLayout.EAST);
		this.pack();
	}
	
	public class CirclePanel extends JPanel
	{
		private JLabel radiusLabel = new JLabel("Radius: ");
		private JTextField radiusField = new JTextField();
		
		public CirclePanel()
		{
			this.setLayout(new GridLayout(1, 2));
			radiusField.setPreferredSize(new Dimension(50, 25));
			
			this.add(radiusLabel);
			this.add(radiusField);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int x = Integer.parseInt(coordinatePanel.coordX.getText());
		int y = Integer.parseInt(coordinatePanel.coordY.getText());
		int radius = Integer.parseInt(circlePanel.radiusField.getText());
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
		
		field.addEntity(new Circle(new Point(x, y), radius, name, color));
		field.repaint();
	}
}
