package data;
import javax.swing.*;
import java.awt.*;


public class auto extends JFrame
{
    public auto()
    {
        
       FlowLayout  f1=new FlowLayout();
       setLayout(f1);
       ImageIcon ii=new ImageIcon("auto.jpg");
       JLabel L1=new JLabel(ii);
       L1.setBounds(850,850,500,900);
       add(L1); 
    }

    public static void main(String args[])
    {
            auto c1=new auto();
            c1.setVisible(true);
            c1.setTitle("");
            c1.setSize(500,500);

    }
}