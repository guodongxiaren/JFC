package swing;



import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

public class JFileChooserDemo {

	public static void main(String[] args) throws Exception {
//		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		UIManager.setLookAndFeel(new WindowsLookAndFeel());
		JFileChooser fileChooser = new JFileChooser();
		if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			File file = fileChooser.getSelectedFile();
			Scanner sc = new Scanner(file);
			while(sc.hasNext()){
				System.out.println(sc.nextLine());
			}
			sc.close();
		}else{
			System.out.println("No file is selected");
		}
	}

}
