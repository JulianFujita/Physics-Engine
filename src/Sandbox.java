import java.awt.*;

import javax.swing.*;

public class Sandbox {

	JFrame frame = new JFrame("Physics Sandbox");
	
	Square square = new Square(new Point(250, 250), 50, "GreenSquare", Color.GREEN);
	Rectangle rectangle = new Rectangle(new Point(10, 10), 300, 100, "BlueRect", Color.BLUE);
	
	public Sandbox()
	{
		frame.setSize(new Dimension(500, 500));
		frame.setLayout(null);
		
		frame.add(rectangle);
		frame.add(square);
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new Sandbox();
	}

}
