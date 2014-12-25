package layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import swing.Sample;

@SuppressWarnings("serial")
public class SignUpPanel extends JPanel{

	private int count;
	private JLabel label[];
	private JComponent comp[];
	private JButton jbok;
    public SignUpPanel(String[] fields) {
    	count = fields.length;
    	jbok = new JButton("确定");
    	JPanel p1 = new JPanel(new GridLayout(count,2,5,5));
    	JPanel p2 = new JPanel();
    	setLayout(new BorderLayout());
    	add(p1,BorderLayout.CENTER);
    	add(p2,BorderLayout.SOUTH);
    	p2.add(jbok);
    	
    	
    	label = new JLabel[count];
    	comp = new JTextField[count];
    	
    	
    	for(int i=0;i<count;i++){
    		label[i] = new JLabel(fields[i]);
    		comp[i] = new JTextField();
    		p1.add(label[i]);
    		p1.add(comp[i]);
    	}
	}

	public static void main(String[] args) {
		JFrame testFrame = new Sample();
		String []fields = {"用户名","密码","邮箱","地址"};
		testFrame.add(new SignUpPanel(fields));
		testFrame.setSize(300, 200);
	}
	
}
