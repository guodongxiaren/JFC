package event;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import swing.Sample;

@SuppressWarnings("serial")
public class KeyEventDemo extends Sample {
	private KeyboardPanel keyboardPanel = new KeyboardPanel();

	public KeyEventDemo() {
		add(keyboardPanel);
		// 获取焦点，必不可少
		keyboardPanel.setFocusable(true);
	}

	public static void main(String[] args) {
		KeyEventDemo frame = new KeyEventDemo();
		frame.setTitle("KeyEventDemo");
		frame.setSize(300, 300);
	}

	// 内部类
	static class KeyboardPanel extends JPanel {
		private int x = 100;
		private int y = 100;
		private int radius = 50;

		public KeyboardPanel() {
			addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					println("按下");
					switch (e.getKeyCode()) {
					case KeyEvent.VK_DOWN:
						y += 10;
						break;
					case KeyEvent.VK_UP:
						y -= 10;
						break;
					case KeyEvent.VK_LEFT:
						x -= 10;
						break;
					case KeyEvent.VK_RIGHT:
						x += 10;
						break;
					}
					repaint();
				}

				@Override
				public void keyTyped(KeyEvent e) {
					// super.keyTyped(e);
					println("敲击");
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// super.keyReleased(e);
					println("释放");
				}

			});
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawOval(x, y, radius, radius);
			// g.drawString("Hello World",x,y);
		}
	}
}