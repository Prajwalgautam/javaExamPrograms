import java.awt.*;    
import javax.swing.*;    
    
public class BoxLayoutDemo extends Frame {    
    Button buttons[];    
    public BoxLayoutDemo() {    
      buttons = new Button [5];    
          
      for (int i = 0;i<5;i++) {    
          buttons[i] = new Button ("Button " + (i + 1));    
          add (buttons[i]);    
        }    
    setLayout (new BoxLayout(this, BoxLayout.X_AXIS));    
    setSize(400,400);    
    setVisible(true);    
  }    

  public static void main(String args[]){    
    new BoxLayoutDemo();    
  }    
}   
