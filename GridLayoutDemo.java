import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class GridLayoutDemo extends JFrame {
    GridLayoutDemo(){
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,3));
        setSize(400,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
