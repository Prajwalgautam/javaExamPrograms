import javax.swing.JOptionPane;
public class InputDialog {
    InputDialog(){
        String num1 = JOptionPane.showInputDialog("Type num 1");
        String num2 = JOptionPane.showInputDialog("Type num 2");
        int total = Integer.parseInt(num1) + Integer.parseInt(num2);
        JOptionPane.showMessageDialog(null, "The sum of provided input is "+total);
    }
    public static void main(String[] args) {
        new InputDialog();
    }
}
