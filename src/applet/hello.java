package applet;

import java.applet.Applet;
import java.awt.Graphics;

public class hello extends Applet {
	String str;
	public void init(){
		str="Hello,this is a Applet";
	}
	public void paint(Graphics g){
		g.drawString(str,100,100);
	}
}
