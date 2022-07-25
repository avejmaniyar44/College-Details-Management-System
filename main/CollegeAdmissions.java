package main;
import data.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CollegeAdmissions extends Frame implements ActionListener
{
			Label L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18,L19,L20,L21,L22,L23,L24,L25,L26,L27,L28;
			Label L29,L30,L31,L32,L33,L34,L35;
			Button b1,b2,b3;
			TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
			Checkbox c1,c2,c3;
			CheckboxGroup cbg;
			Choice ch,ch1;	
			List Li;
			Scrollbar sb1;
			MenuBar mbr;
			
		        public CollegeAdmissions()
			{
					
					setLayout(null);
					setBackground(Color.blue);
					setForeground(Color.black);
					Font f1=new Font("Arial Black",Font.BOLD|Font.ITALIC,25);
					Font f2=new Font("Arial Black",Font.BOLD,15);
					
					L1=new Label("GOVERNMENT POLYTECHNIC AWASARI KHURD",Label.CENTER);
					L1.setFont(f1);
					L1.setBackground(Color.white);
			                setFont(f2);
						
					L2=new Label("Enter First Name:",Label.RIGHT);
					L3=new Label("Select Gender:",Label.RIGHT);
					L4=new Label("Enter Mobile No:",Label.RIGHT);
					L5=new Label("Enter City:",Label.RIGHT);
					L15=new Label("Enter Last Name:",Label.RIGHT);
					L16=new Label("Select Year:",Label.RIGHT);
					L17=new Label("Select Branch:",Label.RIGHT);
					L18=new Label("Enter Pincode:",Label.RIGHT);
					L19=new Label("Enter Email:",Label.RIGHT);
					L20=new Label("Course Duration:",Label.RIGHT);
					L21=new Label("District:",Label.RIGHT);
                                         
					
					
					L6=new Label();
					L6.setForeground(Color.red);
					
					L7=new Label();
					L8=new Label();
					L9=new Label();
					L10=new Label();
					L11=new Label();
					L12=new Label();
					L13=new Label();
					L14=new Label();
					L22=new Label();
					L23=new Label();
					L24=new Label();
					L25=new Label();
					L26=new Label();
					L27=new Label();
					L28=new Label();
					L29=new Label();
					L30=new Label();
					L31=new Label();
					L32=new Label();
					L33=new Label();
					L34=new Label();
					L35=new Label();
					
					
					
					
					

					
					
					L7.setForeground(Color.black);
					L8.setForeground(Color.black);
					L9.setForeground(Color.black);
					L10.setForeground(Color.black);
					L22.setForeground(Color.black);
					L23.setForeground(Color.black);
					L24.setForeground(Color.black);
					L25.setForeground(Color.black);
					L26.setForeground(Color.black);
					L27.setForeground(Color.black);
					L28.setForeground(Color.black);
									
					b1=new Button("Submit");
					b2=new Button("LogOut");
					b3=new Button("Reset");

					tf1=new TextField(20);
					tf2=new TextField(20);
					tf3=new TextField(20);
					tf4=new TextField(20);
					tf5=new TextField(20);
					tf6=new TextField(20);
					tf7=new TextField(20);


					cbg=new CheckboxGroup();
					c1=new Checkbox("Male",false,cbg);
					c2=new Checkbox("Female",false,cbg);
					c3=new Checkbox("Other",false,cbg);
			
					sb1=new Scrollbar(Scrollbar.VERTICAL,0,10,0,100);
					sb1.setBackground(Color.white);

					/*int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
				        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
				        JScrollPane jsp=new JScrollPane(b1,v,h);
				        add(jsp);*/

					mbr=new MenuBar();
					Menu m1=new Menu("HOME");
					Menu m2=new Menu("ABOUT");
					     MenuItem m21=new MenuItem("About Us");
					     MenuItem m22=new MenuItem("OFFICE STAFF");
						m2.add(m21);
						m2.add(m22);
					     
                                       Menu m3=new Menu("PROGRAMS");
					     MenuItem m31=new MenuItem("COMPUTER");
                         MenuItem m32=new MenuItem("INFORMATION TECH");
					     MenuItem m33=new MenuItem("MECHANICAL");
					     MenuItem m34=new MenuItem("AUTOMOBILE");
					     MenuItem m35=new MenuItem("ELECTRICAL");
					     MenuItem m36=new MenuItem("ELECTRONICS AND TELE");
					     MenuItem m37=new MenuItem("CIVIL");
							m3.add(m31);
						        m3.add(m32);
							m3.add(m33);
						        m3.add(m34);
							m3.add(m35);
						        m3.add(m36);
							m3.add(m37);
						        
					m3.addActionListener(this);


				       Menu m4=new Menu("STUDENT SECTION");
					     MenuItem m41=new MenuItem("Admission Details");
                        MenuItem m42=new MenuItem("Fee Structure");
							m4.add(m41);
						        m4.add(m42);
					m4.addActionListener(this);

                                       Menu m5=new Menu("FACILITIES");
					     MenuItem m51=new MenuItem("HOSTEL");
                         MenuItem m52=new MenuItem("LABORATORIES");
                         MenuItem m53=new MenuItem("LIBRARY");
	                     
							m5.add(m51);
						        m5.add(m52);
							m5.add(m53);
						        
					mbr.add(m1);
					mbr.add(m2);
                                        mbr.add(m3);
					mbr.add(m4);
					mbr.add(m5);
					setMenuBar(mbr);



					ch=new Choice();
			                ch.add("1st Year");
					ch.add("2nd Year");
					ch.add("3rd Year");

					ch1=new Choice();
			                ch1.add("1 Year");
					ch1.add("2 Year");
					ch1.add("3 Year");
					
					
					 Li=new List(8);
					 Li.add("MECH");
			      		 Li.add("INFO & TE");
			     		 Li.add("AUTO");
			      		 Li.add("ELEC &TE");
					 Li.add("ELEC");
			      		 Li.add("CIVIL");
			     		 Li.add("COMP");
			      		 Li.add("INSTRUs");

					
						
					
					L15.setBounds(700,250,150,40);
					tf4.setBounds(850,250,150,30);
					L16.setBounds(680,300,150,40);
					ch.setBounds(850,300,150,40);
				    L17.setBounds(700,350,150,40);
					Li.setBounds(850,350,150,80);
					L19.setBounds(700,450,150,40);
					tf6.setBounds(850,450,150,30);
					L21.setBounds(700,500,150,40);
					tf7.setBounds(850,500,150,30);
					
					
                   L1.setBounds(5,70,1400,120);
					L2.setBounds(250,250,150,40);
					tf1.setBounds(400,250,150,30);
					L3.setBounds(240,300,150,40);
					c1.setBounds(390,300,60,40);
					c2.setBounds(450,300,70,40);
					c3.setBounds(520,300,60,40);
					L4.setBounds(250,350,150,40);
					tf2.setBounds(400,350,150,30);
					L5.setBounds(250,400,130,40);
					tf3.setBounds(400,400,150,30);
					L18.setBounds(250,450,150,40);
					tf5.setBounds(400,450,150,30);
					L20.setBounds(250,500,150,40);
					ch1.setBounds(400,500,150,40);

					sb1.setBounds(1345,43,30,680);

					b1.setBounds(560,550,100,40);
					b3.setBounds(670,550,100,40);
					b2.setBounds(1200,200,100,30);
                                       
					L6.setBounds(250,600,750,40);
					L7.setBounds(30,630,100,40);
					L8.setBounds(150,630,100,40);
					L9.setBounds(270,630,100,40);
					L10.setBounds(390,630,80,40);
					L22.setBounds(510,630,80,40);
					L23.setBounds(630,630,100,40);
					L24.setBounds(750,630,100,40);
					L25.setBounds(870,630,100,40);
					L26.setBounds(990,630,100,40);
					L27.setBounds(1110,630,80,40);
					L28.setBounds(1230,630,100,40);



					L11.setBounds(50,660,100,40);
					L12.setBounds(150,660,100,40);
					L13.setBounds(270,660,100,40);
					L14.setBounds(390,660,80,40);
					L29.setBounds(510,660,100,40);
					L30.setBounds(630,660,100,40);
					L31.setBounds(750,660,100,40);
					L32.setBounds(870,660,100,40);
					L33.setBounds(990,660,100,40);
					L34.setBounds(1110,660,100,40);
					L35.setBounds(1230,660,100,40);
					
					b1.addActionListener(this);
					b2.addActionListener(this);
					b3.addActionListener(this);
					

					add(L1);add(L2);add(L3);add(L4);add(L5);add(L6);add(L7);add(L8);add(L9);add(L10);add(L11);add(L12);add(L13);
                   			add(L14);add(L17);add(L18);add(L19);add(L20);add(L21);add(L22);add(L23);add(L24);add(L25);add(L26);add(L27);add(L28);
					add(L29);add(L30);add(L31);add(L32);add(L33);add(L34);add(L35);
					add(b1);add(b2);add(b3);add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(tf6);add(tf7);add(c1);add(c2);add(c3);
					add(L15);add(L16);add(ch);add(ch1);add(Li);add(sb1);		
			}

			public void actionPerformed(ActionEvent ae)
			{
                             String st= ae.getActionCommand();
                             if(st.equals("Submit"))
			          {
					L7.setText("FIRST NAME");
					L8.setText("LAST NAME");
					L9.setText("GENDER");
					L10.setText("YEAR");
                   			L22.setText("BRANCH");
                  			L23.setText("DURATION");
                  			L24.setText("CITY");
                   			L25.setText("PINCODE");
                  			L26.setText("DISTRICT");
                  			L27.setText("MOBILE");
					L28.setText("EMAIL");
                                      
					L6.setText("Records Submitted Successfully!!!...Please see below details...If Any Changes Update Above Details....");
						
						
					L11.setText(tf1.getText());
					L12.setText(tf4.getText());
					L13.setText(cbg.getSelectedCheckbox().getLabel());
					L14.setText(ch.getSelectedItem());
					L29.setText(Li.getSelectedItem());
					L30.setText(ch1.getSelectedItem());
					L31.setText(tf3.getText());
					L32.setText(tf5.getText());
					L33.setText(tf7.getText());
					L34.setText(tf2.getText());
					L35.setText(tf6.getText());
                                }
                            else if(st.equals("Reset"))
               		       {
                  		        L7.setText("");
					L8.setText("");
					L9.setText("");
					L10.setText("");
                   	L22.setText("");
                  	L23.setText("");
                  	L24.setText("");
                   	L25.setText("");
                    L26.setText("");
                  	L27.setText("");
					L28.setText("");
                    L6.setText("");
						
						
					L11.setText("");
					L12.setText("");
					L13.setText("");
					L14.setText("");
					L29.setText("");
				        L30.setText("");
					L31.setText("");
					L32.setText("");
					L33.setText("");
					L34.setText("");
					L35.setText(""); 
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText("");
					tf7.setText("");
					
					
                            }
                 else if(st.equals("LogOut"))
				{
				
					System.exit(0);

				}
				 else if(st.equals("HOSTEL"))
				{
						
							hostel h1=new hostel();
          				    h1.setVisible(true);
           				    h1.setTitle("");
           					h1.setSize(500,500);
				}
				else if(st.equals("Fee Structure"))
				{
					
					 fee c1=new fee();
          			 	c1.setVisible(true);
           			 	c1.setTitle("");
           			 	c1.setSize(500,500);

				}
				else if(st.equals("Admission Details"))
				{
					
					  AdmissionDetails c1=new AdmissionDetails();
            		  c1.setVisible(true);
                      c1.setTitle("");
                      c1.setSize(500,500);

				}
				else if(st.equals("COMPUTER"))
				{
						
							 computer c1=new computer();
          					 c1.setVisible(true);
           					 c1.setTitle("");
           					 c1.setSize(500,500);
							 

				}else if(st.equals("INFORMATION TECH"))
				{
						
							 info c1=new info();
           					 c1.setVisible(true);
           					 c1.setTitle("");
            				c1.setSize(500,500);

				}else if(st.equals("MECHANICAL"))
				{
						
							 mech c1=new mech();
           				    c1.setVisible(true);
            				c1.setTitle("");
           				    c1.setSize(500,500);
							 

				}else if(st.equals("AUTOMOBILE"))
				{
						
						  auto c1=new auto();
           				 c1.setVisible(true);
           				 c1.setTitle("");
            			c1.setSize(500,500);


				}else if(st.equals("ELECTRICAL"))
				{
						
							 elec c1=new elec();
           					 c1.setVisible(true);
           					 c1.setTitle("");
           					 c1.setSize(500,500);


				}
				else if(st.equals("ELECTRONICS AND TELE"))
				{
						
							entc c1=new entc();
           					 c1.setVisible(true);
           					 c1.setTitle("");
           					 c1.setSize(500,500);
							 

				}
				else if(st.equals("CIVIL"))
				{
						
							 civil c1=new civil();
           					 c1.setVisible(true);
           					 c1.setTitle("");
           					 c1.setSize(500,500);

				}
			
			     else if(st.equals("OFFICE STAFF"))
				{
						
							 faculty c1=new faculty();
           					 c1.setVisible(true);
           					 c1.setTitle("");
           					 c1.setSize(500,500);
				}
				else if(st.equals("LABORATORIES"))
				{
						
							labo c1=new labo();
           					c1.setVisible(true);
           					c1.setTitle("");
            				c1.setSize(500,500);
				}
				
					
			}
			public static void main(String args[])
			{
				CollegeAdmissions v1=new CollegeAdmissions();
				v1.setVisible(true);
				v1.setTitle("Government Polytechnic Awasari Khurd");
				v1.setSize(1500,1500);
				
			}
}