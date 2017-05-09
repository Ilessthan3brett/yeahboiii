
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
public class Joe implements Drawable
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Color col;

    
    public Joe(int xValue, int yValue)
    {
        x = xValue;
        y = yValue;
        int green = (int)(Math.random()*255)+1;
        col = new Color( 0,green,255);
    }

  
    public void draw(Graphics2D g2)
    {
      g2.setColor(col);
      
      Rectangle Body = new Rectangle(x,y,30,30);
      
      Polygon logo = new Polygon();
      
      logo.addPoint(x + 5 , y + 5);
      logo.addPoint(x + 25 , y + 5);
      logo.addPoint(x + 25 , y + 10);
      logo.addPoint(x + 17 , y + 10);
      logo.addPoint(x + 17 , y + 27);
      logo.addPoint(x + 5, y + 27 );
      logo.addPoint(x + 5 , y + 23 );
      logo.addPoint(x + 13 , y + 23 );
      logo.addPoint(x + 13 , y + 10 );
      logo.addPoint(x + 5, y + 10 );
     
      
      g2.setColor(col);
      g2.fill(Body);
      g2.setColor(Color.BLACK);
      g2.fill(logo);
    }
}
