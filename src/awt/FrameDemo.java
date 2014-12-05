package awt;

import java.awt.Frame;
import java.awt.Label;

@SuppressWarnings("serial")
public class FrameDemo extends Frame {

	public FrameDemo() {
		//对中文支持不好，中文Lable会乱码。
		Label l = new Label("Label");
		add(l);
	}
	public static void main(String[] args) {
		FrameDemo demo = new FrameDemo();
		
		//默认Frame点击关闭按钮，不会关闭
		demo.setSize(200, 200);
		demo.setLocationRelativeTo(null);
		demo.setVisible(true);

	}

}
