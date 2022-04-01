import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.*;
public class ChangeFont extends JFrame {
    JCheckBox bold = new JCheckBox("bold");
    JCheckBox italic = new JCheckBox("italic");
    JCheckBox plain = new JCheckBox("plain");
    JPanel jp = new JPanel();
    JTextArea jta = new JTextArea();
    ChangeFont(){
        setSize(700,800);
        jta.setBorder(null);
        jp.add(jta);
        jp.add(bold);
        jp.add(italic);
        jp.add(plain);
        getContentPane().add(jp);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        
        jp.setLayout(new GridBagLayout());
        plain.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str = jta.getText();
                g.setFont(new Font(null, Font.PLAIN, 20));
                g.drawString(str, 20, 90);
            }
        });
        italic.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str = jta.getText();
                g.setFont(new Font(null, Font.ITALIC, 20));
                g.drawString(str, 20, 90);
            }
        });
        bold.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String str = jta.getText();
                g.setFont(new Font(null, Font.BOLD, 20));
                g.drawString(str, 20, 90);
            }
        });
    }
    public static void main(String[] args) {
        new ChangeFont();
    }
}
