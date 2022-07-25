package data;
import javax.swing.*;
import java.awt.*;


public class hostel extends JFrame
{
    public hostel()
    {
        
       FlowLayout  f1=new FlowLayout();
       setLayout(f1);
       ImageIcon ii=new ImageIcon("hostel.jpg");
       JLabel L1=new JLabel(ii);
       add(L1); 
    }

    public static void main(String args[])
    {
            hostel h1=new hostel();
            h1.setVisible(true);
            h1.setTitle("");
            h1.setSize(500,500);

    }
}