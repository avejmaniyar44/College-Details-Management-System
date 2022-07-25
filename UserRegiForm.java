
import main.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class UserRegiForm extends Frame implements ActionListener
{
		Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
		TextField tf1,tf2;
		Button b1,b2;
		Label tk;
		UserRegiForm()
		{
			setLayout(null);
			//setBackground(Color.pink);
			Font f1 = new Font("Times New Roman",Font.BOLD,35);
			Font f2 = new Font("Times New Roman",Font.BOLD,28);
			//Font f21 = new Font("Times New Roman",Font.BOLD,28);
			Font f3 = new Font("Times New Roman",Font.BOLD,18);
			Font f4 = new Font("Times New Roman",Font.BOLD,14);
			Font f5 = new Font("Times New Roman",Font.BOLD,22);
			Font f6 = new Font("Times New Roman",Font.BOLD,20);
			Font f7 = new Font("Times New Roman",Font.BOLD,20);
			Font f8 = new Font("Times New Roman",Font.BOLD,20);
			Font f9 = new Font("Times New Roman",Font.BOLD,20);
			
			tk = new Label("                                      ");
			tk.setFont(f9);
			l1 = new Label("Government Polytechnic Awasari(Khurd)",Label.CENTER);
			l1.setFont(f1);
			l2 = new Label("Maharashtra State");
			l2.setFont(f2);
			l3 = new Label("Board of Technical Education");
			l3.setFont(f2);
			l4 = new Label("REGISTRATION AND USER LOGIN",Label.CENTER);
			l4.setFont(f3);
			l4.setBackground(Color.blue);
			l4.setForeground(Color.white);
			l5 = new Label("User registered with this portal, use your Username & Password to login");
			l5.setFont(f5);
			l6 = new Label("Username");
			l6.setFont(f6);
			l7 = new Label("Password");
			l7.setFont(f7);
			l8 = new Label("or");
			l8.setFont(f7);
			l9= new Label("Don't have an Username? Sign up now");
			l9.setFont(f8);
			
			tf1 = new TextField(40);
			tf2 = new TextField(40);
			tf2.setEchoChar('*');
			
			b1 = new Button("Login");
			b1.setFont(f9);
			b1.setBackground(Color.white);
			b1.setForeground(Color.blue);
			b1.addActionListener(this);
			
			b2 = new Button("Sign up");
			b2.setFont(f9);
			b2.setBackground(Color.green);
			b2.setForeground(Color.black);
			
			add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(tf1);add(tf2);add(b1);add(b2);
			add(tk);                    
			l1.setBounds(20,50,1000,70);
			l2.setBounds(420,100,750,70);
			l3.setBounds(320,150,750,60);
			l4.setBounds(20,220,1000,50);
			l5.setBounds(200,300,1000,60);
			l6.setBounds(350,370,100,50);
			tf1.setBounds(460,373,250,40);
			l7.setBounds(350,440,100,50);
			tf2.setBounds(460,443,250,40);
			b1.setBounds(490,510,150,50);
			tk.setBounds(460,560,200,40);
			l8.setBounds(550,590,1000,40);
			l9.setBounds(400,620,1000,40);
			b2.setBounds(490,650,150,50);
		}
		public void actionPerformed(ActionEvent ae)
		{
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","system","8380");
				Statement stmt=con.createStatement();
				String sql="select * from users where username='"+tf1.getText()+"'and password='"+tf2.getText().toString()+  "'";
				ResultSet rs=stmt.executeQuery(sql);	
					
						
						if(rs.next())
						{
								tk.setText("Login Successful..!!!");
								CollegeAdmissions c1=new CollegeAdmissions();
								c1.setVisible(true);
								c1.setTitle("Government Polytechnic Awasari Khurd");
								c1.setSize(1500,1500);
								setVisible(false);
						con.close();
								
								 
						}
						else
						{
								tk.setText("Login Fail..!!!");
						}
				}
			catch(Exception e)
			{
				System.out.println(e);
			}

						
					
		
		}
		public static void main(String args[])
		{
			UserRegiForm obj = new UserRegiForm();
			obj.setVisible(true);
			obj.setTitle("Government Polytechnic Awasari(Khurd) Login Page");
			obj.setSize(1000,1000);
			
		}
}