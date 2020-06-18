import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class AddEntityDialog extends JFrame implements ActionListener
{
	public static PhysicsField field;
	private static final JLabel title = new JLabel("Select Shape Attributes");
	public final CoordinatePanel coordinatePanel = new CoordinatePanel();
	public final ColorNamePanel colorNamePanel = new ColorNamePanel();
	private static final JButton addButton = new JButton("Add to Field");
	
	public AddEntityDialog(PhysicsField field)
	{
		this.field = field;
		addButton.addActionListener(this);
		this.add(title, BorderLayout.PAGE_START);
		this.add(coordinatePanel, BorderLayout.WEST);
		this.add(colorNamePanel, BorderLayout.CENTER);
		this.add(addButton, BorderLayout.PAGE_END);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	
	public class CoordinatePanel extends JPanel
	{
		private JLabel xLabel = new JLabel("X: ");
		private JLabel yLabel = new JLabel("Y: ");
		public JTextField coordX = new JTextField("0");
		public JTextField coordY = new JTextField("0");
		
		public CoordinatePanel()
		{
			this.setLayout(new GridLayout(2, 2));
			coordX.setPreferredSize(new Dimension(50, 25));
			coordY.setPreferredSize(new Dimension(50, 25));
			
			this.add(xLabel);
			this.add(coordX);
			this.add(yLabel);
			this.add(coordY);
		}
	}
	
	public class ColorNamePanel extends JPanel
	{
		private JLabel colorLabel = new JLabel("Color: ");
		private JLabel nameLabel = new JLabel("Name: ");
		public JTextField colorField = new JTextField();
		public JTextField nameField = new JTextField();
		
		public ColorNamePanel()
		{
			this.setLayout(new GridLayout(2, 2));
			colorField.setPreferredSize(new Dimension(50, 25));
			nameField.setPreferredSize(new Dimension(50, 25));
			
			this.add(colorLabel);
			this.add(colorField);
			this.add(nameLabel);
			this.add(nameField);
		}
	}
}
