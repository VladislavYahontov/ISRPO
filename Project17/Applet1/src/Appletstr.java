
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class Appletstr extends Applet implements Runnable {

    Random rand = new Random();
    int x, y;

    Thread th;
    public void run() {

        while (true) {

            repaint();

            try {
                //Определяем скорость передвижения.
                th.sleep(80);
            }
            catch (InterruptedException e) {
            }
        }
    }

    public void init() {
        setSize(300, 200);
        x = 10;
        y = 20;
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        if (x==200)
        {
            Color randomColour = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
            g.setColor(randomColour);

            while (x!=0)
            {
                x -= 5.0;
                g.drawString("Здравствуйте", x, y);
                try {
                    th.sleep(5);
                }
                catch (InterruptedException e) {
                }
            }
        } else
        {
            x += 5.0;
            g.drawString("Здравствуйте", x, y);
        }
    }
}