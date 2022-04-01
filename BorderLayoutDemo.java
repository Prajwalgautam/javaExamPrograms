import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
public class BorderLayoutDemo {
    BorderLayoutDemo(){
        JFrame f = new JFrame();
        JButton north = new JButton("NORTH");
        JButton south = new JButton("SOUTH");
        JButton east = new JButton("EAST");
        JButton west = new JButton("WEST");
        JButton center = new JButton("CENTER");
        f.setLayout(new BorderLayout());
        f.add(north, BorderLayout.NORTH);
        f.add(east, BorderLayout.EAST);
        f.add(west, BorderLayout.WEST);
        f.add(south, BorderLayout.SOUTH);
        f.add(center, BorderLayout.CENTER);
        f.setSize(500,500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
