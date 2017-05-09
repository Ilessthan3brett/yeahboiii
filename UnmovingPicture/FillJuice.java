import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class FillJuice
{
    private static Cup mug;
   
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(900, 700);
        frame.setTitle("Fill your juice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final ArrayList<Drawable> list = new ArrayList<Drawable>();
        mug = new Cup(400, 500);
        Penguin p1 = new Penguin(233,0);
        Penguin p2 = new Penguin(466,0);
        Penguin p3 = new Penguin(700,0);
        Penguin p4 = new Penguin(20,0);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(mug);

      
        
         class MyComp extends JComponent
         {
                public void paintComponent(Graphics g)
                {
                    Graphics2D g2 = (Graphics2D) g;

                    for (Drawable d : list)
                    {
                        d.draw(g2);
                    }
                }
        }
        
        class MoveCup implements KeyListener
        {
            public void keyPressed(KeyEvent e)
            {
                if( mug.getX() <= 800 && mug.getX() > 0)
                {
                    if(e.getKeyCode() == KeyEvent.VK_RIGHT)
                    {
                        mug.changePosition(10,0);
                        frame.repaint();
                    }
                    if(e.getKeyCode() == KeyEvent.VK_LEFT)
                    {
                        mug.changePosition(-10,0);
                        frame.repaint();
                    }
                }
                else if(mug.getX() >= 800)
                {
                    mug.changePosition(-1,0);
                    frame.repaint();
                }
                else if(mug.getX() <= 0)
                {
                    mug.changePosition(1,0);
                    frame.repaint();
                }
            }
            public void keyReleased(KeyEvent e)
            {
            }
            public void keyTyped(KeyEvent e)
            {
            }
            
        }
        class Drop implements ActionListener
        {
            private int count;
            public void actionPerformed(ActionEvent e)
            {
                count++;
                if(count % 2 == 0)
                {
                  for( Drawable p : list)
                  {
                      if(p instanceof Penguin)
                      {
                          Penguin pe = (Penguin)p;
                          int b1 = (int)(Math.random()*20+1);
                          pe.changeLocation(0,b1);
                          frame.repaint();
                        }
                      
                    }
                    
                    
                }
            }
        }
            ActionListener a = new Drop();
            Timer t = new Timer(100,a);
            t.start();
            
            
        
           
          
            
           
            MoveCup d = new MoveCup();
            frame.addKeyListener(d);
            
            MyComp c = new MyComp();
            // add mouselistner to compeneted, not frame
            //             c.addMouseListener(p);
            frame.add(c);
            
            
            frame.setVisible(true);
    }
}