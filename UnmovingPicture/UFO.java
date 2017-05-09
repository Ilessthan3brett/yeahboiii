import java.awt.*; 
import java.awt.geom.*; 

/**
 * @author Shannon Mulligan on Sept. 30th, 2013.
 * @version NUMBER ONE!
 */public class UFO implements Drawable
{
    private int x;
    private int y;
    private double scale;

    /**
     * @return Draws you an awesome UFO. Or does it?
     * @param theX = your X value 
     * @param theY = your Y value
     */public UFO(int theX, int theY)
    {
        x = theX;
        y = theY;
        scale = 1;
    }

    /**
     * @return Draws you a ufo to your desired size. Reccomended scale is 5.
     * @param theX = your X value
     * @param theY = your Y value
     * @param theScale = your desired scale. Points are accepted.
     */public UFO(int theX, int theY, double theScale)
    {
        x = theX;
        y = theY;
        scale = theScale;
    }

    /**
     * Draw a normal ufo. As normal as ufos get.
     * @return normal ufo
     */public void draw(Graphics2D g2)
    {
        //Main ship
        Ellipse2D.Double ship = new Ellipse2D.Double(x, y + 6* scale, 48* scale, 20* scale);
        Ellipse2D.Double glass = new Ellipse2D.Double(x + 12* scale, y, 22* scale, 16* scale);
        //mainship outlines
        Ellipse2D.Double shipoutline = new Ellipse2D.Double(x, y + 6* scale, 48* scale, 20* scale);
        Ellipse2D.Double glassoutline = new Ellipse2D.Double(x + 12* scale, y, 22* scale, 16* scale);
        Arc2D.Double nothershipoutline = new Arc2D.Double(x, y, 48*scale, 20*scale, 197, 150, Arc2D.OPEN);

        //lights
        Ellipse2D.Double light1 = new Ellipse2D.Double(x + 1* scale, y + 14* scale, 2* scale, 4* scale);
        Ellipse2D.Double light2 = new Ellipse2D.Double(x + 4* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double light3 = new Ellipse2D.Double(x + 10* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double light4 = new Ellipse2D.Double(x + 16* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double light5 = new Ellipse2D.Double(x + 22* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double light6 = new Ellipse2D.Double(x + 28* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double light7 = new Ellipse2D.Double(x + 34* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double light8 = new Ellipse2D.Double(x + 40* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double light9 = new Ellipse2D.Double(x + 45* scale, y + 14* scale, 2* scale, 4* scale);
        //lightlines
        Ellipse2D.Double lightline1 = new Ellipse2D.Double(x + 1* scale, y + 14* scale, 2* scale, 4* scale);
        Ellipse2D.Double lightline2 = new Ellipse2D.Double(x + 4* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline3 = new Ellipse2D.Double(x + 10* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline4 = new Ellipse2D.Double(x + 16* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline5 = new Ellipse2D.Double(x + 22* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline6 = new Ellipse2D.Double(x + 28* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline7 = new Ellipse2D.Double(x + 34* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline8 = new Ellipse2D.Double(x + 40* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline9 = new Ellipse2D.Double(x + 45* scale, y + 14* scale, 2* scale, 4* scale);
        //shading (Oooh fancy fancy!)
        Arc2D.Double glassshade = new Arc2D.Double( x + 14* scale, y + 2* scale, 18* scale, 12* scale, 120, 210, Arc2D.PIE);
        Arc2D.Double shipshade = new Arc2D.Double( x + 2* scale, y + 8* scale, 44* scale, 16* scale, 95, 240, Arc2D.PIE);
        Arc2D.Double glassshiney = new Arc2D.Double( x + 18* scale, y + 2* scale, 12* scale, 10* scale, 0, 110, Arc2D.PIE);
        Arc2D.Double shipshiney = new Arc2D.Double( x + 2* scale, y + 8* scale, 44* scale, 16* scale, 25, 45, Arc2D.PIE);

        
        //---THE DRAWING PART----

        //ship, outline, and shade
        g2.setColor (new Color(116, 142, 160));
        g2.fill(ship);
        g2.setColor(Color.BLACK);
        g2.draw(nothershipoutline);
        g2.setColor (new Color(52, 74, 94));
        g2.fill(shipshade);
        g2.setColor(new Color(214, 222, 246));
        g2.fill(shipshiney);
        g2.setColor(Color.BLACK);
        g2.draw(shipoutline);

        //ship glass, outline, and shade
        g2.setColor(new Color(86, 153, 222));
        g2.fill(glass);
        g2.setColor(Color.BLACK);
        g2.draw(glassoutline);
        g2. setColor (new Color(38, 106, 152));
        g2.fill(glassshade);
        g2.setColor (new Color(230, 230, 246));
        g2.fill(glassshiney);

        g2.setColor(Color.BLACK);
        g2.draw(nothershipoutline);

        g2.setColor(new Color(255, 189, 19));
        g2.fill(light1);
        g2.fill(light2);
        g2.fill(light3);
        g2.fill(light4);
        g2.fill(light5);
        g2.fill(light6);
        g2.fill(light7);
        g2.fill(light8);
        g2.fill(light9);

        g2.setColor(Color.BLACK);
        g2.draw(lightline1);
        g2.draw(lightline2);
        g2.draw(lightline3);
        g2.draw(lightline4);
        g2.draw(lightline5);
        g2.draw(lightline6);
        g2.draw(lightline7);
        g2.draw(lightline8);
        g2.draw(lightline9);

      
        
    }
    
    /**
     * Create a halloweeny version of your ufo!
     * @return Halloweeny version
     */public void drawHALLOWEEN(Graphics2D g2)

    {
        //Main ship
        Ellipse2D.Double ship = new Ellipse2D.Double(x, y + 6* scale, 48* scale, 20* scale);
        Ellipse2D.Double glass = new Ellipse2D.Double(x + 12* scale, y, 22* scale, 16* scale);
        //mainship outlines
        Ellipse2D.Double shipoutline = new Ellipse2D.Double(x, y + 6* scale, 48* scale, 20* scale);
        Ellipse2D.Double glassoutline = new Ellipse2D.Double(x + 12* scale, y, 22* scale, 16* scale);
        Arc2D.Double nothershipoutline = new Arc2D.Double(x, y, 48*scale, 20*scale, 197, 150, Arc2D.OPEN);

        //lights
        Ellipse2D.Double light1 = new Ellipse2D.Double(x + 1* scale, y + 14* scale, 2* scale, 4* scale);
        Ellipse2D.Double light2 = new Ellipse2D.Double(x + 4* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double light3 = new Ellipse2D.Double(x + 10* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double light4 = new Ellipse2D.Double(x + 16* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double light5 = new Ellipse2D.Double(x + 22* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double light6 = new Ellipse2D.Double(x + 28* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double light7 = new Ellipse2D.Double(x + 34* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double light8 = new Ellipse2D.Double(x + 40* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double light9 = new Ellipse2D.Double(x + 45* scale, y + 14* scale, 2* scale, 4* scale);
        //lightlines
        Ellipse2D.Double lightline1 = new Ellipse2D.Double(x + 1* scale, y + 14* scale, 2* scale, 4* scale);
        Ellipse2D.Double lightline2 = new Ellipse2D.Double(x + 4* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline3 = new Ellipse2D.Double(x + 10* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline4 = new Ellipse2D.Double(x + 16* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline5 = new Ellipse2D.Double(x + 22* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline6 = new Ellipse2D.Double(x + 28* scale, y + 20* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline7 = new Ellipse2D.Double(x + 34* scale, y + 18* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline8 = new Ellipse2D.Double(x + 40* scale, y + 16* scale, 4* scale, 4* scale);
        Ellipse2D.Double lightline9 = new Ellipse2D.Double(x + 45* scale, y + 14* scale, 2* scale, 4* scale);
        //shading (Oooh fancy fancy!)
        Arc2D.Double glassshade = new Arc2D.Double( x + 14* scale, y + 2* scale, 18* scale, 12* scale, 120, 210, Arc2D.PIE);
        Arc2D.Double shipshade = new Arc2D.Double( x + 2* scale, y + 8* scale, 44* scale, 16* scale, 95, 240, Arc2D.PIE);
        Arc2D.Double glassshiney = new Arc2D.Double( x + 18* scale, y + 2* scale, 12* scale, 10* scale, 0, 110, Arc2D.PIE);
        Arc2D.Double shipshiney = new Arc2D.Double( x + 2* scale, y + 8* scale, 44* scale, 16* scale, 25, 45, Arc2D.PIE);

        
        //---THE DRAWING PART----

        //ship, outline, and shade
        g2.setColor (new Color(239, 95, 0));
        g2.fill(ship);
        g2.setColor(Color.BLACK);
        g2.draw(nothershipoutline);
        g2.setColor (new Color(208, 53, 0));
        g2.fill(shipshade);
        g2.setColor(new Color(255, 203, 171));
        g2.fill(shipshiney);
        g2.setColor(Color.BLACK);
        g2.draw(shipoutline);

        //ship glass, outline, and shade
        g2.setColor(new Color(131, 0, 255));
        g2.fill(glass);
        g2.setColor(Color.BLACK);
        g2.draw(glassoutline);
        g2.setColor (new Color(83, 0, 174));
        g2.fill(glassshade);
        g2. setColor (new Color(239, 255, 244));
        g2.fill(glassshiney);

        g2.setColor(Color.BLACK);
        g2.draw(nothershipoutline);

        g2.setColor(new Color(243, 199, 210));
        g2.fill(light1);
        g2.fill(light2);
        g2.fill(light3);
        g2.fill(light4);
        g2.fill(light5);
        g2.fill(light6);
        g2.fill(light7);
        g2.fill(light8);
        g2.fill(light9);

        g2.setColor(Color.BLACK);
        g2.draw(lightline1);
        g2.draw(lightline2);
        g2.draw(lightline3);
        g2.draw(lightline4);
        g2.draw(lightline5);
        g2.draw(lightline6);
        g2.draw(lightline7);
        g2.draw(lightline8);
        g2.draw(lightline9);

      
        
    }
    public void changePosition(int dx, int dy)
    {
        x = x + dx;
        y = y + dy;
    }

}
