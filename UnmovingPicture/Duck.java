import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Duck implements Drawable
{
    private int x;
    private int y;

    public Duck(int xValue, int yValue)
    {
        x = xValue;
        y = yValue;
    }

    public void changePosition(int xVal, int yVal)
    {
        x += xVal;
        y += yVal;
    }

    public void draw(Graphics2D g2)
    {
        g2.setColor(Color.YELLOW);
        Ellipse2D.Double head = new Ellipse2D.Double(x + 20, y + 10, 50, 50);
        Ellipse2D.Double body = new Ellipse2D.Double(x + 30, y + 35, 100, 75);
        Ellipse2D.Double eye = new Ellipse2D.Double(x + 30, y + 20, 10, 15);
        Polygon tail = new Polygon();
        Polygon beak = new Polygon();
        Polygon hair = new Polygon();
        Arc2D.Double wing = new Arc2D.Double(x + 65, y + 50, 40, 40, 180, 160, Arc2D.Double.OPEN);
        Line2D.Double leg = new Line2D.Double(x + 95, y + 105, x + 95, y + 120);
        Line2D.Double legb = new Line2D.Double(x + 95, y + 120, x + 85, y + 120);
        Line2D.Double leg2 = new Line2D.Double(x + 70, y + 110, x + 70, y + 120);
        Line2D.Double leg2b = new Line2D.Double(x + 70, y + 120, x + 60, y + 120);
        tail.addPoint(x + 120, y + 50);
        tail.addPoint(x + 130, y + 40);
        tail.addPoint(x + 135, y + 20);
        tail.addPoint(x + 143, y + 40);
        tail.addPoint(x + 143, y + 55);
        tail.addPoint(x + 125, y + 80);
        beak.addPoint(x + 20, y + 30);
        beak.addPoint(x + 5, y + 35);
        beak.addPoint(x + 20, y + 40);
        hair.addPoint(x + 47, y + 10);
        hair.addPoint(x + 44, y + 5);
        hair.addPoint(x + 42, y + 3);
        hair.addPoint(x + 37, y);
        hair.addPoint(x + 40, y + 2);
        hair.addPoint(x + 41, y + 7);
        hair.addPoint(x + 42, y + 10);

        g2.fill(tail);
        g2.fill(hair);
        g2.setColor(Color.BLACK);
        g2.draw(tail);
        g2.draw(hair);
        g2.draw(leg);
        g2.draw(legb);
        g2.draw(leg2);
        g2.draw(leg2b);
        g2.setColor(Color.YELLOW);
        g2.fill(body);
        g2.setColor(Color.BLACK);
        g2.draw(body);
        g2.setColor(Color.ORANGE);
        g2.fill(beak);
        g2.setColor(Color.BLACK);
        g2.draw(beak);
        g2.setColor(Color.YELLOW);
        g2.fill(head);
        g2.setColor(Color.BLACK);
        g2.draw(head);
        g2.fill(eye);
        g2.draw(wing);

    }
}
