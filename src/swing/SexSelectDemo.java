package swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class SexSelectDemo extends Sample{
    
	private JRadioButton rdMale,rdFemale;
	public SexSelectDemo() {
		setSize(200,300);
		setLayout(new GridLayout(2,1));
		ButtonGroup bg = new ButtonGroup();
		rdMale = new JRadioButton("男",false);
		rdFemale = new JRadioButton("女",true);
		bg.add(rdMale);
		bg.add(rdFemale);
		JPanel p1 = new JPanel();
		p1.add(rdMale);
		p1.add(rdFemale);
		p1.setBorder(new LineBorder(Color.BLACK));
		add(p1);
	}
	public static void main(String[] args) {
		new SexSelectDemo();
	}

}
