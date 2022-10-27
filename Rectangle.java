// Program 19

import java.applet.*;
import java.awt.*;

public class Rectangle extends Applet{
    int x;
    int y;
    int w;
    int h;
    Color color;
    public void init(){
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        w = Integer.parseInt(getParameter("width"));
        h = Integer.parseInt(getParameter("height"));
        color = new Color(Integer.parseInt(getParameter("c"), 16));
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.drawRect(x, y, w, h);
    }
}
