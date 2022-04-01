import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class GuiProgram extends JFrame{
    public JButton addition= new JButton("Add");
    public JButton subtract= new JButton("Sub");
    public JLabel num1Label = new JLabel("Number 1: ");
    public JTextField num2Text = new JTextField();
    public JLabel resultLabel = new JLabel("Result: ");
    public JTextField resultText = new JTextField();
    public JLabel num2Label = new JLabel("Number 2: ");
    public JTextField num1Text = new JTextField();
    GuiProgram(){
        num1Label.setBounds(10,20,80,20);
        num1Text.setBounds(80,20,80,20);
        num2Label.setBounds(10,60,80,20);
        num2Text.setBounds(80,60,80,20);
        resultLabel.setBounds(10,80,80,20);
        resultText.setBounds(80,80,80,20);
        addition.setBounds(10,120,50,20);
        subtract.setBounds(80,120,50,20);
        addition.setBorder(null);
        subtract.setBorder(null);
        add(resultLabel);
        add(resultText);
        add(addition);
        add(subtract);
        subtract.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e){
				 double number1 = Double.parseDouble(num1Text.getText());
				 double number2 = Double.parseDouble(num2Text.getText());
				 resultText.setText(String.valueOf(number1-number2));
 
			}});
            addition.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                 double number1 = Double.parseDouble(num1Text.getText());
				 double number2 = Double.parseDouble(num2Text.getText());
				 resultText.setText(String.valueOf(number1+number2));
                }
            });
        add(num2Label);
        add(num2Text);
        add(num1Label);
        add(num1Text);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GuiProgram();
    }
}
