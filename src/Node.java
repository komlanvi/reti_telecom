import javax.swing.*;
import java.awt.*;

/**
 * Created by doncredas on 13/02/16.
 */
public class Node extends JPanel{
    private int posX = -50;
    private int posY = -50;

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.RED);
        g.fillOval(this.posX, this.posY, 25, 25);
        System.out.println("< X = " +this.getPosX() +", Y = " +this.getPosY()+ " >");
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
