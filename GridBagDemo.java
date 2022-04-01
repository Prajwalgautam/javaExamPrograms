import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
public class GridBagDemo extends JFrame {
    GridBagDemo(){
        JPanel jp = new JPanel();
        JButton btn1 = new JButton("I");
        JButton btn2 = new JButton("Want");
        JButton btn3 = new JButton("To");
        JButton btn4 = new JButton("Break");
        JButton btn5 = new JButton("Free");
        JButton btn6 = new JButton("By Queen");
        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);
        jp.add(btn4);
        jp.add(btn5);
        jp.add(btn6);
        jp.setLayout(new GridBagLayout());
        getContentPane().add(jp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagDemo();
    }
}

