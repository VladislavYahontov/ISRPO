import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Class_PZ16 extends JApplet {
    public void init() {

        setSize(400, 400);
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.green);
        g.drawRect(250, 250, 50, 70);
    }

}
