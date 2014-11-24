package applet;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Hello extends Applet {
	String str;
	public void init(){
		str="Hello,this is a Applet";
	}
	public void paint(Graphics g){
		g.drawString(str,100,100);
	}
}
