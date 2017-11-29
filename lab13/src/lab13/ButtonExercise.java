package lab13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ButtonExercise extends JFrame {

	private JPanel buttonPanel;
	private JButton ResetButton;
	private JButton ChangeButton;
	private JButton CloseButton;
	private int numClicks =0;
	
	private static final int width = 300;
	private static final int height = 200;
	public ButtonExercise()
	{
		setSize(width, height); //set size of the frame
		// create the buttons
		 ResetButton = new JButton("Reset");
		 ChangeButton = new JButton("Change");
		 CloseButton = new JButton("Close");//use system.exit(0)
		
		buttonPanel = new JPanel();
		// add buttons to panel
		buttonPanel.add(ResetButton);
		buttonPanel.add(ChangeButton);
		buttonPanel.add(CloseButton);
		
		//add panel to frame
		add(buttonPanel);
		
		//create button actions
		ColorAction resetAction = new ColorAction(Color.BLUE);
		ColorAction changeAction = new ColorAction(Color.BLACK);
		ColorAction closeAction = new ColorAction(Color.WHITE);
		//associate actions with buttons
		ResetButton.addActionListener(resetAction);
		ChangeButton.addActionListener(changeAction);
		CloseButton.addActionListener(closeAction);
		
	}// end constructor
	private class ColorAction implements ActionListener
	{
		private Color backgroundColor;
		private int clicks;
		
		public ColorAction(Color c)
		{
			backgroundColor = c;
			
		}
		public void actionPerformed(ActionEvent event)
		{
			Object obj = event.getSource();
			if(obj == CloseButton )
				System.exit(0);
			if(obj == ResetButton)
				buttonPanel.setBackground(Color.BLUE);
			if(obj == ChangeButton)
			{
				if(clicks%3 == 0)
					buttonPanel.setBackground(Color.BLACK);
				if(clicks%3 == 1)
					buttonPanel.setBackground(Color.GREEN);
				if(clicks%3==2)	
					buttonPanel.setBackground(Color.ORANGE);
				clicks++;
			}	
			
		}
	}
	
}


 

