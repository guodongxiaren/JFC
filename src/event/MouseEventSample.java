package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

import swing.Sample;

@SuppressWarnings("serial")
public class MouseEventSample extends Sample {

	private JTextArea ta = new JTextArea();

	public MouseEventSample() {
		JPanel p = new JPanel();
		p.setComponentPopupMenu(new RightKeyMenu());
		add(p);
		add(ta, BorderLayout.SOUTH);
		setSize(300, 300);
		p.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1:
					ta.setText("您点击的是左键");
					break;
				// 一般鼠标没有中键，貌似
				case MouseEvent.BUTTON2:
					ta.setText("您点击的是中键");
					break;
				case MouseEvent.BUTTON3:
					ta.setText("您点击的是右键");
					break;
				}
			}

		});
	}

	class RightKeyMenu extends JPopupMenu implements ActionListener {
		JMenuItem item1 = new JMenuItem("苍井空");
		JMenuItem item2 = new JMenuItem("吉泽明步");
		JMenuItem item3 = new JMenuItem("麻生希");

		public RightKeyMenu() {
			add(item1);
			add(item2);
			add(item3);
			item1.addActionListener(this);
			item2.addActionListener(this);
			item3.addActionListener(this);
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					super.mousePressed(e);
					if (e.getButton() == MouseEvent.BUTTON3) {
						RightKeyMenu.this.repaint();
					}
				}

			});
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == item1) {
				ta.setText("您选择的是苍井空");
			} else if (e.getSource() == item2) {
				ta.setText("您选择的是吉泽明步");
			} else if (e.getSource() == item3) {
				ta.setText("您选择的是麻生希");
			}
		}
	}

	public static void main(String[] args) {
		new MouseEventSample();
	}

}
