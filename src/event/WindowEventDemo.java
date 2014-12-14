package event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import swing.Sample;

@SuppressWarnings("serial")
public class WindowEventDemo extends Sample implements WindowListener {

	public WindowEventDemo() {
		addWindowListener(this);
	}

	public static void main(String[] args) {
		new WindowEventDemo();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		println("窗口打开");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		println("窗口正在关闭...");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		println("窗口关闭");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		println("窗口最小化");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		println("窗口从最小化还原");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		println("窗口激活");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		println("窗口变成非激活状态");

	}

}
