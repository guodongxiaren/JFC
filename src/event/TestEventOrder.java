package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import swing.Sample;

/**
 * 测试事件触发的顺序，即某一事件是另一事件的子类。 那么如果同时注册这两种事件，则触发的顺序是？
 * 
 * @author jelly
 *
 */
@SuppressWarnings("serial")
public class TestEventOrder extends Sample {
	public TestEventOrder() {
		JButton jb = new JButton("点我");
		add(jb);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				println("触发ActionEvent事件");
			}
		});
		jb.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				println("触发鼠标点击事件");
			}

		});
	}

	public static void main(String[] args) {
		new TestEventOrder();

	}

}
