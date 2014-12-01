package swing;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class JListSample extends Sample {
	private JList<String> list;
	private String[] you = { "苍井空", "吉泽明步", "松岛枫" };

	public JListSample() {
		list = new JList<>(you);
		list.setVisibleRowCount(3);
		list.setBorder(BorderFactory.createTitledBorder("您最喜欢哪个国家女优？"));
		JScrollPane sp = new JScrollPane(list);
		add(sp);

	}

	public static void main(String[] args) {
		JListSample spl = new JListSample();
		spl.setSize(200, 100);
	}

}
