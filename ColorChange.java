import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
class ColorChange extends JFrame{
    ColorChange(){
        JButton btn = new JButton("Click");
        JTextField txtField = new JTextField();
        txtField.setBounds(50,50,50,50);
        btn.setBounds(50,150,40,30);
        btn.setBorder(null);
        add(txtField);
        add(btn);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String input = txtField.getText();
                txtField.setText(String.valueOf(input.toUpperCase()));
                txtField.setForeground(Color.CYAN);
            }
        });
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ColorChange();
    }
}