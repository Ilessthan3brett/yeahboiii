import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class TheUnmovingPicture
{
    private static UFO ufo;
    private static Penguin penguin;
    private static Flower flower;
    private static Duck duck;
    private static Frank frank;
    private static Joe joe;
    private static Ball ball;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(900, 700);
        frame.setTitle("Look at this");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final ArrayList<Drawable> list = new ArrayList<Drawable>();
        duck = new Duck(400, 500);
        ufo = new UFO(200, 150, 2);
        joe = new Joe(200,200);
        ball = new Ball(75,75);
        flower = new Flower(600, 250);
        penguin = new Penguin(100, 550);
        frank = new Frank(100,100);
        list.add(duck);
        list.add(ball);
        list.add(joe);
        list.add(frank);
        list.add(ufo);
        list.add(flower);
        list.add(penguin);

        class MyComp extends JComponent
        {
            public void paintComponent(Graphics g)
            {
                Graphics2D g2 = (Graphics2D) g;
                Mountain m = new Mountain(getWidth(), getHeight());
                m.draw(g2);
                for (Drawable d : list)
                {
                    d.draw(g2);
                }
            }
        }
        class UFOMover implements ActionListener
        {
            private int count;
            public void actionPerformed(ActionEvent e)
            {
                count++;
                if(count % 100 < 25)
                {
                    ufo.changePosition(2,-1);
                }
                else if( count % 100 < 50)
                {
                    ufo.changePosition(-2,-1);
                }
                else if(count % 100 < 75)
                {
                    ufo.changePosition(-2,1);
                }
                else
                {
                    ufo.changePosition(2,1);
                }
                frame.repaint();

            }
        }
        class DuckMover implements KeyListener
        {
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_UP)
                {
                    duck.changePosition(3,-5);

                }
                else
                {
                    duck.changePosition(-3,5);
                }
                frame.repaint();
            }

            public void keyReleased(KeyEvent e)
            {
            }

            public void keyTyped(KeyEvent e)
            {
            }
        }
        class PenguinMover extends MouseAdapter
        {
            // this is just cause tigges is a lazy turd :)
            public void mouseClicked(MouseEvent e)
            {
                int x = e.getX();
                int y = e.getY();
                penguin.setLocation(x,y);
                frame.repaint();
            }
        }

        ActionListener a = new UFOMover();
        Timer t = new Timer(50,a);
        t.start();

        PenguinMover p = new PenguinMover();

        DuckMover d = new DuckMover();
        frame.addKeyListener(d);

        MyComp c = new MyComp();
        // add mouselistner to compeneted, not frame
        c.addMouseListener(p);
        frame.add(c);

        frame.setVisible(true);
    }
}