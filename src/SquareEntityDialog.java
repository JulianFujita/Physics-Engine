import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class SquareEntityDialog extends AddEntityDialog
{
	public final SquarePanel squarePanel = new SquarePanel();
	
	public SquareEntityDialog(PhysicsField field)
	{
		super(field);
		this.add(squarePanel, BorderLayout.EAST);
		this.pack();
	}
	
	public class SquarePanel extends JPanel
	{
		private JLabel sideLabel = new JLabel("Side: ");
		private JTextField sideField = new JTextField();
		
		public SquarePanel()
		{
			this.setLayout(new GridLayout(1, 2));
			sideField.setPreferredSize(new Dimension(50, 25));
			
			this.add(sideLabel);
			this.add(sideField);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int x = Integer.parseInt(coordinatePanel.coordX.getText());
		int y = Integer.parseInt(coordinatePanel.coordY.getText());
		int side = Integer.parseInt(squarePanel.sideField.getText());
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
		
		field.addEntity(new Square(new Point(x, y), side, name, color));
		field.repaint();
	}
}
