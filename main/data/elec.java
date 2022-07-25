package data;
import javax.swing.*;
import java.awt.*;


public class elec extends JFrame
{
    public elec()
    {
        
       FlowLayout  f1=new FlowLayout();
       setLayout(f1);
       ImageIcon ii=new ImageIcon("elec.jpg");
       JLabel L1=new JLabel(ii);
      // L1.setBounds(250,250,150,40);
      //L1.setBounds(100,100,100,100);
       add(L1); 
    }

    public static void main(String args[])
    {
            elec c1=new elec();
            c1.setVisible(true);
            c1.setTitle("");
            c1.setSize(500,500);

    }
}