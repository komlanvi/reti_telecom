import javax.swing.*;

/**
 * Created by doncredas on 13/02/16.
 */
public class Frame extends JFrame
{
    Node node;
    public Frame()
    {
        this.setTitle("doncredas");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.node = new Node();
        this.setContentPane(node);
        this.setVisible(true);
        this.go();
    }

    public void go()
    {
        System.out.println("Ici la centrale, générale nous vous communiquons en temps réel les coordonnées de nos F16");
        int x = this.node.getPosX();
        int y = this.node.getPosY();
        boolean backX = false;
        boolean backY = false;
        while (true) {
            if (x < 1) backX = false;
            if (x > (node.getWidth() - 25)) backX = true;
            if (y < 1) backY = false;
            if (y > (node.getHeight() - 25)) backY = true;

            if (!backX) {
                this.node.setPosX(++x);
            } else {
                this.node.setPosX(--x);
            }
            if (!backY) {
                this.node.setPosY(++y);
            } else {
                this.node.setPosY(--y);
            }
            node.repaint();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Frame f = new Frame();
    }
}
