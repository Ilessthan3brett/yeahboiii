import java.awt.*;
import java.awt.geom.*;

public class Cup implements Drawable
{
    private int xLeft;
    private int yTop;
    private int width;
    private Rectangle Hitbox;
    public static final int DEFAULT_SIZE = 70;

    public Cup(int x, int y)
    {
        xLeft = x;
        yTop = y;
        Hitbox = new Rectangle(xLeft, yTop, 70, 100);
        width = 100;
    }

    public void changePosition(int x, int y)
    {
        xLeft = xLeft + x;
        yTop = yTop +y;

    }

    public int getX()
    {
        return xLeft;
    }

    public int getY()
    {
        return yTop;
    }

    public Cup(int x, int y, int s)
    {
        xLeft = x;
        yTop = y;
        //width in pixels 
        width = s;
    }

    public void draw(Graphics2D g2)
    {
        Polygon base = new Polygon();
        Hitbox = new Rectangle(xLeft, yTop, 70, 100);
        base.addPoint(xLeft + 10, yTop + 30);
        base.addPoint(xLeft + 20, yTop +90);
        base.addPoint(xLeft + 50 , yTop + 90);
        base.addPoint(xLeft + 60, yTop + 30);
        Polygon pineapple = new Polygon();
        pineapple.addPoint(xLeft + 25, yTop + 80);
        pineapple.addPoint(xLeft + 20, yTop + 60);
        pineapple.addPoint(xLeft + 25, yTop + 50);
        pineapple.addPoint(xLeft + 45, yTop + 50);
        pineapple.addPoint(xLeft + 50, yTop + 60);
        pineapple.addPoint(xLeft + 45, yTop + 80);
        Polygon stem = new Polygon();
        stem.addPoint(xLeft + 30, yTop + 50);
        stem.addPoint(xLeft + 25, yTop + 40);
        stem.addPoint(xLeft + 35, yTop + 45);
        stem.addPoint(xLeft + 45, yTop + 40);
        stem.addPoint(xLeft + 40, yTop + 50);

        Rectangle lid = new Rectangle(xLeft + 5, yTop + 25, 60, 5);
        Rectangle straw = new Rectangle(xLeft + 30, yTop, 10, 25);
        Ellipse2D.Double logo = new Ellipse2D.Double(xLeft + 20, yTop + 40, 30,30);
        Ellipse2D.Double logo2 = new Ellipse2D.Double(xLeft + 30, yTop + 50, 10,10);

        Color dgreen = new Color(16,135,30);
        g2.setColor(Color.GREEN);
        g2.fill(base);
        g2.setColor(Color.RED);
        g2.fill(pineapple);
        g2.setColor(Color.YELLOW);
        g2.fill(lid);
        g2.setColor(Color.GREEN);
        g2.setColor(Color.WHITE);
        g2.fill(straw);
        g2.setColor(dgreen);
        g2.fill(stem);
        g2.setColor(Color.BLACK);
        g2.draw(Hitbox);
        g2.draw(pineapple);
        g2.draw(stem);
        g2.draw(straw);
        g2.draw(base);
        g2.draw(lid);

        
        
    }
    public void drawSelf(Graphics2D g2)
    {
        Rectangle Cup = new Rectangle(xLeft + 10 * width/DEFAULT_SIZE, yTop + 30* width/DEFAULT_SIZE, 50* width/DEFAULT_SIZE, 40* width/DEFAULT_SIZE);
        Rectangle door = new Rectangle(xLeft + 20* width/DEFAULT_SIZE, yTop + 45* width/DEFAULT_SIZE, 15* width/DEFAULT_SIZE, 25* width/DEFAULT_SIZE);
        Ellipse2D.Double knob = new Ellipse2D.Double(xLeft + 22* width/DEFAULT_SIZE, yTop + 55* width/DEFAULT_SIZE, 5* width/DEFAULT_SIZE, 5* width/DEFAULT_SIZE);
        Rectangle window = new Rectangle(xLeft + 45* width/DEFAULT_SIZE, yTop + 45* width/DEFAULT_SIZE, 10* width/DEFAULT_SIZE, 10* width/DEFAULT_SIZE);

        Polygon roof = new Polygon();
        roof.addPoint(xLeft, yTop + 30* width/DEFAULT_SIZE);
        roof.addPoint(xLeft + 35* width/DEFAULT_SIZE, yTop);
        roof.addPoint(xLeft + 70* width/DEFAULT_SIZE, yTop + 30* width/DEFAULT_SIZE);

        Line2D.Double vertBar = new Line2D.Double(xLeft + 50* width/DEFAULT_SIZE, yTop + 45* width/DEFAULT_SIZE, 
                xLeft + 50* width/DEFAULT_SIZE, yTop + 55* width/DEFAULT_SIZE);
        Line2D.Double horizBar = new Line2D.Double(xLeft + 45* width/DEFAULT_SIZE, yTop + 50* width/DEFAULT_SIZE, 
                xLeft + 55* width/DEFAULT_SIZE, yTop + 50* width/DEFAULT_SIZE);

        g2.setColor(Color.RED);
        g2.fill(Cup);
        g2.setColor(Color.CYAN);
        g2.fill(window);
        g2.setColor(Color.BLACK);
        g2.fill(roof);
        g2.draw(vertBar);
        g2.draw(horizBar);
        g2.setColor(Color.GREEN);
        g2.fill(door);
        g2.setColor(Color.YELLOW);
        g2.fill(knob);

    }
}
