package com.company;

import java.awt.*;
import java.awt.event.*;
public class Main extends Canvas {
    private int lastX, lastY;
    private int ex, ey;
    private boolean clear=false;

    public Main () {
        super();
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                ex=e.getX();
                ey=e.getY();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar()==' ') {
                    clear = true;
                    repaint();
                }
            }
        });
    }

    public void update(Graphics g) {
        if (clear) {
            g.clearRect(0, 0, getWidth(), getHeight());
            clear = false;
        } else {
            g.drawLine(lastX, lastY, ex, ey);
            lastX=ex;
            lastY=ey;
        }
    }
    public static void main(String s[]) {
        final Frame f = new Frame("Draw");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        Checkbox payment = new
                Checkbox("Оплата в кредит");
        payment.setBounds(10, 10, 120, 20);
        f.add(payment);
        Checkbox delivery = new Checkbox("Доставка");
        delivery.setBounds(10, 30, 120, 20);
        f.add(delivery);
        Choice color = new Choice();
        color.add("Белый");
        color.add("Зеленый");
        color.add("Синий");
        color.add("Черный");
        f.add(color);
        List accessories = new List(3);
        accessories.add("Чехол");
        accessories.add("Наушники");
        accessories.add("Аккумулятор");
        accessories.add("Блок питания");
        f.add(accessories);
        f.setSize(400, 300);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        f.add(new Label("Test"));
        f.add(new Button("Long string"));
        f.add(new TextArea(2, 20));

        final Canvas c = new Main();
        f.add(c);

        f.setVisible(true);
    }
}
