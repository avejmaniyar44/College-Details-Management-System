package data;
import javax.swing.*;
import java.awt.*;



public class AdmissionDetails extends JFrame
{
    public AdmissionDetails()
    {
        
       FlowLayout  f1=new FlowLayout();
       setLayout(f1);
       ImageIcon ii=new ImageIcon("admdeatils.jpeg");
       JLabel L1=new JLabel(ii);
       int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	   int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	   JScrollPane jsp=new JScrollPane(L1,v,h);
	   add(jsp);
       add(L1); 
    }

    public static void main(String args[])
    {
            AdmissionDetails c1=new AdmissionDetails();
            c1.setVisible(true);
            c1.setTitle("");
            c1.setSize(500,500);

    }
}