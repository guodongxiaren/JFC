package swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class BorderSample extends Sample {

	private JPanel p1;
	private Border border[] = new Border[7];

	public BorderSample() {
		p1 = new JPanel();
		p1.setLayout(new GridLayout(5, 2));
		border[0] = new LineBorder(Color.GREEN, 2);
		border[1] = new LineBorder(Color.WHITE, 1, true);
		border[2] = new LineBorder(Color.ORANGE, 1, false);
		border[3] = new LineBorder(Color.cyan, 3, true);
		border[4] = new LineBorder(Color.DARK_GRAY, 3);
		p1.setBorder(border[0]);
		JTextField jt1 = new JTextField();
		JTextField jt2 = new JTextField();
		jt1.setBorder(border[3]);
		jt2.setBorder(border[4]);

		JButton jb1 = new JButton("圆角");
		JButton jb2 = new JButton("直角");
		jb1.setBorder(border[1]);
		jb2.setBorder(border[2]);

		JLabel jl1 = new JLabel("标题边框");
		border[5] = new TitledBorder("标题");
		jl1.setBorder(border[5]);
		EmptyBorder emptyBorder = (EmptyBorder) BorderFactory
				.createEmptyBorder();// 创建空边框

		LineBorder lineBorder = (LineBorder) BorderFactory
				.createLineBorder(Color.black);// 创建线形边框

		EtchedBorder etchedBorder = (EtchedBorder) BorderFactory
				.createEtchedBorder();// 创建蚀刻式边框

		BevelBorder raisedBevelBorder = (BevelBorder) BorderFactory
				.createRaisedBevelBorder();// 创建浮雕式边框

		BevelBorder loweredBevelBorder = (BevelBorder) BorderFactory
				.createLoweredBevelBorder();// 创建下沉边框

		JLabel le = new JLabel("空边框");
		le.setBorder(emptyBorder);
		JLabel ll = new JLabel("线性边框");
		ll.setBorder(lineBorder);
		JLabel letched = new JLabel("蚀刻式边框");
		letched.setBorder(etchedBorder);
		JLabel lraised = new JLabel("浮雕式边框");
		lraised.setBorder(raisedBevelBorder);
		JLabel llower = new JLabel("下沉边框");
		llower.setBorder(loweredBevelBorder);
		p1.add(jt1);
		p1.add(jt2);
		p1.add(jb1);
		p1.add(jb2);
		p1.add(jl1);
		p1.add(le);
		p1.add(ll);
		p1.add(letched);
		p1.add(lraised);
		p1.add(llower);
		add(p1);
	}

	public static void main(String[] args) throws Exception {
		BorderSample bs = new BorderSample();

		bs.setSize(200, 500);
		bs.setTitle("边框");

	}

}
