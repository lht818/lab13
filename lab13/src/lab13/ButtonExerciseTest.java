package lab13;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class ButtonExerciseTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				ButtonExercise frame = new ButtonExercise();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		}
);

	}

}