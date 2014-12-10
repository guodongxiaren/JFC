package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JTextFieldSample extends Sample {
	JTextField tf;

	public JTextFieldSample() {
		tf = new JTextField();
		add(tf, BorderLayout.NORTH);
		JButton jbok = new JButton("确定");
		jbok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = tf.getText();
				if (str.equals(null))
					println("OK");

			}
		});
		add(jbok, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		JTextFieldSample spl = new JTextFieldSample();
		spl.setSize(300, 200);
	}
}
