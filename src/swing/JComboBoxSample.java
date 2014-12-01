package swing;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class JComboBoxSample extends Sample {
	private JComboBox<String> cb;
	private String[] you = { "苍井空", "吉泽明步", "松岛枫" };

	public JComboBoxSample() {
		cb = new JComboBox<String>(you);
		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// 不加if判断，则会执行两次监听方法
				if (e.getStateChange() == ItemEvent.SELECTED)
					println(cb.getSelectedItem());

			}
		});
		println(cb.getSelectedItem());
		add(cb, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		JComboBoxSample spl = new JComboBoxSample();
		spl.setSize(200, 100);
	}

}
