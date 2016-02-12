import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JavaSwing extends JFrame{

	public JavaSwing() {
		setTitle("JavaSwing");
		setSize(800,600);
		JOptionPane.showMessageDialog(this, "JavaSwing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSwing app = new JavaSwing();
		app.setVisible(true);
	}

}
