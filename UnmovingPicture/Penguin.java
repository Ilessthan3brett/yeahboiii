import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.Font.*;
import java.awt.geom.Ellipse2D.*;
public class Penguin implements Drawable
{

    private int xLeft;
    private int yTop;
    private int width;
    private Rectangle Hitbox;
    public static final int DEFAULT_SIZE = 100;

    public Penguin(int x, int y)
    {
        Hitbox = new Rectangle(xLeft, yTop, 80, 80);
        xLeft = x;
        yTop = y;
        width = 100;
    }

    public void changeLocation(int x, int y)
    {
        xLeft = xLeft + x;
        yTop = yTop + y;
    }

    public void setLocation(int dx, int dy)
    {
        xLeft = dx;
        yTop = dy;
    }

    public void draw(Graphics2D g2)
    {
        Rectangle body = new Rectangle(xLeft + 30, yTop + 20, 20, 50);
        g2.setColor(Color.BLACK);
        g2.fill(body);
        
        
        Hitbox = new Rectangle(xLeft, yTop, 80, 80);
        g2.draw(Hitbox);

        Polygon flipper = new Polygon();
        flipper.addPoint(xLeft + 35, yTop + 35);
        flipper.addPoint(xLeft + 45, yTop + 60);
        flipper.addPoint(xLeft + 45, yTop + 35);
        g2.setColor(Color.GRAY);
        g2.fill(flipper);

        Polygon foot1 = new Polygon();
        foot1.addPoint(xLeft + 30, yTop + 70);
        foot1.addPoint(xLeft + 40, yTop + 70);
        foot1.addPoint(xLeft + 40, yTop + 79);
        g2.setColor(Color.ORANGE);
        g2.fill(foot1);

        Polygon foot2 = new Polygon();
        foot2.addPoint(xLeft + 40, yTop + 70);
        foot2.addPoint(xLeft + 50, yTop + 70);
        foot2.addPoint(xLeft + 50, yTop + 79);
        g2.setColor(Color.ORANGE);
        g2.fill(foot2);

        Arc2D.Double belly = new Arc2D.Double(xLeft + 40, yTop + 20, 20, 50, -90, 180, Arc2D.CHORD);
        g2.setColor(Color.WHITE);
        g2.fill(belly);

        Arc2D.Double head = new Arc2D.Double(xLeft + 30, yTop + 10, 20, 25, 0, 180, Arc2D.CHORD);
        g2.setColor(Color.BLACK);
        g2.fill(head);

        Polygon beak = new Polygon();
        beak.addPoint(xLeft + 50, yTop + 15);
        beak.addPoint(xLeft + 50, yTop + 21);
        beak.addPoint(xLeft + 55, yTop + 18);
        g2.setColor(Color.ORANGE);
        g2.fill(beak);

        Ellipse2D.Double eyeBig = new Ellipse2D.Double(xLeft + 40, yTop + 15, 5, 5);
        g2.setColor(Color.WHITE);
        g2.fill(eyeBig);

        Ellipse2D.Double eyeSmall = new Ellipse2D.Double(xLeft + 42, yTop + 17, 2, 2);
        g2.setColor(Color.BLACK);
        g2.fill(eyeSmall);

    }
}

