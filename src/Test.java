import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by doncredas on 14/02/16.
 */
public class Test extends JFrame {

    private JPanel content;
    private JButton button;
    public Test() {
        this.setTitle("doncredas");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.content = new JPanel();

        this.button = new JButton("Uno");
        this.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button " +button.getText()+ " pressed!!");
            }
        });

        content.add(button);

        this.setContentPane(content);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
