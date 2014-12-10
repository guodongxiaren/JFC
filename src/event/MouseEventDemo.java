package event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import swing.Sample;

@SuppressWarnings("serial")
public class MouseEventDemo extends Sample implements MouseListener {

	public MouseEventDemo() {
		addMouseListener(this);
	}
	public static void main(String[] args) {
		new MouseEventDemo();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		println("Clicked");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		println("Pressed");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		//释放鼠标
		println("Released");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		println("--------Enterd------->");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		println("<-------Exited--------");
		
	}

}
