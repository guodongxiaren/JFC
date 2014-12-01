package swing;

import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class JTableSample extends Sample {

	public JTableSample() {
		Vector<Vector<String>> v = new Vector<>();
		Vector<String> u1 = new Vector<>();
		Vector<String> u2 = new Vector<>();
		u1.addElement("1");
		u1.addElement("jelly");
		u2.addElement("2");
		u2.addElement("black");
		v.addElement(u1);
		v.addElement(u2);
		Vector<String> col = new Vector<>();
		col.addElement("ID");
		col.addElement("用戶名");
		JTable table = new JTable(v, col);
		// 注意构造方法
		JScrollPane sp = new JScrollPane(table);

		add(sp);
	}

	public static void main(String[] args) {
		JTableSample spl = new JTableSample();
		spl.setSize(200, 100);
	}

}
