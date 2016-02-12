import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

//Classe Principal do Programa
public class JavaSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("JavaSWT !!!");
		shell.open();
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
	}

}
