// import statements  
import java.awt.*;    
import javax.swing.*;   
import java.awt.event.*;    
  
public class CardDemo extends JFrame  
{  
    CardLayout crd;    
    JButton btn1, btn2, btn3;    
    Container cPane;   
    CardDemo()  
    {    
    cPane = getContentPane();    
    crd = new CardLayout();     
    cPane.setLayout(crd);     
    btn1 = new JButton("Apple");    
    btn2 = new JButton("Boy");    
    btn3 = new JButton("Cat");    
    btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)   
            {    
            crd.next(cPane);    
            }
    });    
    btn2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)   
        {    
        crd.next(cPane);    
        }
    });     
    btn3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)   
        {    
        crd.next(cPane);    
        }
    });    
    cPane.add("a", btn1); 
    cPane.add("b", btn2);
    cPane.add("c", btn3);  
    setSize(300, 300);    
    setVisible(true);    
    setDefaultCloseOperation(EXIT_ON_CLOSE);            
    }        
    public static void main(String argvs[])   
    {
        new CardDemo();          
    }    
}  
