
/**
 * Write a description of class Frank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
public class Ball implements Drawable
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private boolean loop;
    private int green;
    private Rectangle Hitbox;

    
    public Ball(int xValue, int yValue)
    {
        Hitbox = new Rectangle(x,y,10,10);
        x = xValue;
        loop = true;
        green = 0;
        y = yValue;
        
    }
    public Rectangle getHitbox()
    {
        return Hitbox;
    }
    public void changeLocation(int xn, int yn)
    {
        x = x +xn;
        y = y +yn;
    }
    public void setLocation(int dx, int dy)
    {
        x = dx;
        x = dy;
    }
    public void draw(Graphics2D g2)
    {
      
      if(green < 255 && loop)
      {
          green = green + 15;
        }
      if( green == 255)
      {
          loop = false;
        }
       if( green > 0 && loop == false)
      {
          green = green -15;
        }
       if( green == 0)
      {
          loop = true;
        }
     
        Color col = new Color( 255,green,0);
      
      RectangularShape ball = new Ellipse2D.Double(x,y,10,10);
      Hitbox = new Rectangle(x,y,10,10);
     
      
      g2.setColor(col);
      g2.fill(ball);
      g2.setColor(Color.BLACK);
      g2.draw(ball);
      g2.draw(Hitbox);
    }
}
