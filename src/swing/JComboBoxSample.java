package swing;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class JComboBoxSample extends Sample {
	private JComboBox<String> cb;

	private String[] you = { "苍井空", "吉泽明步", "松岛枫" };

	public JComboBoxSample() {
		cb = new JComboBox<String>(you);
		cb.addItemListener(new ComboItemListener(cb));
		println(cb.getSelectedItem());
		add(cb, BorderLayout.NORTH);
		Vector<String> vs = new Vector<>();
		vs.add(you[0]);
		vs.add(you[1]);
		vs.add(you[2]);
		JComboBox<String> cbv = new JComboBox<>(vs);
		cbv.addItemListener(new ComboItemListener(cbv));
		add(cbv);
	}

	public static void main(String[] args) {
		new JComboBoxSample();
	}

	class ComboItemListener implements ItemListener {
		private JComboBox<?> cb;

		public ComboItemListener(JComboBox<?> cb) {
			this.cb = cb;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			// 不加if判断，则会执行两次监听方法
			if (e.getStateChange() == ItemEvent.SELECTED) {
				// 下标从0算起，所以要+1
				println("您选中的是第" + (cb.getSelectedIndex() + 1) + "个："
						+ cb.getSelectedItem());
			}
		}

	}
}
