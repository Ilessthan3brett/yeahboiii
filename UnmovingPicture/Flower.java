import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class Flower implements Drawable
{
    private int x;
    private int y;
    public Flower(int X, int Y)
    {
        x=X;
        y=Y;
    }

    public void draw(Graphics2D g2)
    {
        //stem
        Graphics2D g = (Graphics2D) g2;
        Rectangle r = new Rectangle(x+95,y+170,25,200);
        g2.setColor(new Color(40, 160, 40));
        g2.fill(r);
        g2.draw(r);

        //big petals
        RectangularShape b = new Ellipse2D.Double(x+25,y+115,90,90);
        g2.setColor(Color.RED);
        g2.fill(b);
        g2.draw(b);

        RectangularShape b2 = new Ellipse2D.Double(x+95,y+115,90,90);
        g2.setColor(Color.RED);
        g2.fill(b2);
        g2.draw(b2);

        RectangularShape b3 = new Ellipse2D.Double(x+120,y+50,90,90);
        g2.setColor(Color.RED);
        g2.fill(b3);
        g2.draw(b3);

        RectangularShape b4 = new Ellipse2D.Double(x,y+50,90,90);
        g2.setColor(Color.RED);
        g2.fill(b4);
        g2.draw(b4);

        RectangularShape b5 = new Ellipse2D.Double(x+60,y,90,90);
        g2.setColor(Color.RED);
        g2.fill(b5);
        g2.draw(b5);

        //petals
        RectangularShape p1 = new Ellipse2D.Double(x+35,y+25,70,70);
        g2.setColor(Color.MAGENTA);
        g2.fill(p1);
        g2.draw(p1);

        RectangularShape p2 = new Ellipse2D.Double(x+100,y+25,70,70);
        g2.setColor(Color.MAGENTA);
        g2.fill(p2);
        g2.draw(p2);

        RectangularShape p3 = new Ellipse2D.Double(x+120,y+90,70,70);
        g2.setColor(Color.MAGENTA);
        g2.fill(p3);
        g2.draw(p3);

        RectangularShape p4 = new Ellipse2D.Double(x+15,y+90,70,70);
        g2.setColor(Color.MAGENTA);
        g2.fill(p4);
        g2.draw(p4);

        RectangularShape p5 = new Ellipse2D.Double(x+70,y+130,70,70);
        g2.setColor(Color.MAGENTA);
        g2.fill(p5);
        g2.draw(p5);

        //small petals
        RectangularShape p7 = new Ellipse2D.Double(x+65,y+117,45,45);
        g2.setColor(Color.PINK);
        g2.fill(p7);
        g2.draw(p7);

        RectangularShape p8 = new Ellipse2D.Double(x+120,y+77,45,45);
        g2.setColor(Color.PINK);
        g2.fill(p8);
        g2.draw(p8);

        RectangularShape p9 = new Ellipse2D.Double(x+105,y+117,45,45);
        g2.setColor(Color.PINK);
        g2.fill(p9);
        g2.draw(p9);

        RectangularShape p10 = new Ellipse2D.Double(x+50,y+77,45,45);
        g2.setColor(Color.PINK);
        g2.fill(p10);
        g2.draw(p10);

        RectangularShape p11 = new Ellipse2D.Double(x+85,y+52,45,45);
        g2.setColor(Color.PINK);
        g2.fill(p11);
        g2.draw(p11);

        //center
        RectangularShape e = new Ellipse2D.Double(x+75,y+75,65,65);
        g2.setColor(Color.YELLOW);
        g2.fill(e);
        g2.draw(e);

        RectangularShape e1 = new Ellipse2D.Double(x+97,y+99,20,20);
        g2.setColor(Color.ORANGE);
        g2.fill(e1);
        g2.draw(e1);

        //leaf
        RectangularShape p6 = new Ellipse2D.Double(x+115,y+210,100,30);
        g2.setColor(new Color(40, 160, 40));
        g2.fill(p6);
        g2.draw(p6);
    }
}