import javax.swing.JFrame;
import javax.swing.JButton;

public class BasicElements{

	public static void main (String args []){
		JFrame myFrame = new JFrame();
		JButton myButton = new JButton();
		myFrame.setSize(900, 600);

		myFrame.setLayout(null);
		myFrame.add(myButton);

		myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		System.out.println("basic java elements");
	}
}