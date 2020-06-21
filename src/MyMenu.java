import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyMenu extends JMenuBar implements ActionListener
{
	public static final JMenu add = new JMenu("Add");
	public static final JMenuItem square = new JMenuItem("Square");
	public static final JMenuItem rectangle = new JMenuItem("Rectangle");
	public static final JMenuItem circle = new JMenuItem("Circle");
	
	public static final JMenu edit = new JMenu("Edit");
	public static final JMenuItem stopAll = new JMenuItem("Stop all");
	public static final JMenuItem randomizeAll = new JMenuItem("Randomize all");
	
	public static PhysicsField field;
	
	public MyMenu(PhysicsField field)
	{
		this.field = field;
		
		square.addActionListener(this);
		rectangle.addActionListener(this);
		circle.addActionListener(this);
		add.add(square);
		add.add(rectangle);
		add.add(circle);
		
		stopAll.addActionListener(this);
		randomizeAll.addActionListener(this);
		edit.add(stopAll);
		edit.add(randomizeAll);
		
		this.add(add);
		this.add(edit);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{		
		String button = e.getActionCommand();
		switch(button)
		{
			case "Square":
				new SquareEntityDialog(field);
				break;
			case "Circle":
				new CircleEntityDialog(field);
				break;
			case "Rectangle":
				new RectangleEntityDialog(field);
				break;
			case "Stop all":
				field.stopAllEntities();
				break;
			case "Randomize all":
				field.stopAllEntities();
				field.randomizeEntities();
				break;
		}
	}
}

