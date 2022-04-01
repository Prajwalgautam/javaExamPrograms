
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuWala{
        public JLabel num1Label = new JLabel("Number 1: ");
        public JTextField num2Text = new JTextField();
        public JLabel resultLabel = new JLabel("Result: ");
        public JTextField resultText = new JTextField();
        public JLabel num2Label = new JLabel("Number 2: ");
        public JTextField num1Text = new JTextField();
        MenuWala(){
        JFrame frame = new JFrame();
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("MenuBar");
        JMenuItem addition = new JMenuItem("add");
        JMenuItem subtract = new JMenuItem("sub");
        bar.add(menu);
        menu.add(addition);
        menu.add(subtract);
        num1Label.setBounds(20,40,80,20);
        num1Text.setBounds(80,40,80,20);
        frame.add(num1Label);
        frame.add(num1Text);
        num2Label.setBounds(20,80,80,20);
        num2Text.setBounds(80,80,80,20);
        frame.add(num2Label);
        frame.add(num2Text);
        resultLabel.setBounds(20,120,80,20);
        resultText.setBounds(100,120,80,20);
        frame.add(resultLabel);
        frame.add(resultText);
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
        frame.setJMenuBar(bar);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args) {
        new MenuWala();
    }
}
