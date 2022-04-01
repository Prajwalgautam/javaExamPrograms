import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
public class ColorChange{
    ColorChange(){
        JFrame frame = new JFrame();
        JButton btn1 = new JButton("yellow");
        JButton btn2 = new JButton("green");
        JButton btn3 = new JButton("blue");
        btn1.setBounds(10,30,40,20);
        btn2.setBounds(10,80,40,20);
        btn3.setBounds(10,130,40,20);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.getContentPane().setBackground(Color.YELLOW);
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.getContentPane().setBackground(Color.green);
            }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.getContentPane().setBackground(Color.blue);
            }
        });
        
        btn1.setBorder(null);
        btn2.setBorder(null);
        btn3.setBorder(null);
        frame.getContentPane().setBackground(Color.red);
        frame.setSize(600,700);
        frame.setVisible(true);
        frame.pack();
        frame.setLayout(null);
        
    }
    public static void main(String[] args) {
        new ColorChange();
    }
}
