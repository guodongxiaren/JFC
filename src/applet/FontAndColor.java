package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class FontAndColor extends Applet {
    Font fnt1= new Font("Serif",Font.ITALIC,25);
    Font fnt2 = new Font("Monospaced",Font.BOLD+Font.ITALIC,24);
    public void paint(Graphics g){
    	String str = new String("Programming is Fun");
    	Color mycolor = new Color(194,64,200);
    	g.setFont(fnt1);
    	g.drawString(str, 30, 40);
    	Color darker = mycolor.darker();
    	g.setColor(darker);
    	g.drawString(str, 50, 80);
    	Color brighter=mycolor.brighter();
    	g.setColor(brighter);
        g.drawString(str, 70, 120);
        g.setFont(fnt2);
        g.setColor(Color.red);
        g.drawString(str, 30, 170);
        g.setColor(Color.white);
        g.drawString(str, 32, 169);
    }
}
