package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.Font;
import java.io.*;
import java.nio.file.*;
import java.awt.event.*;
import java.awt.Color;

public class AdminLogin extends JFrame implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel background, l1, l2, l3, l4;
	JTextField tf1;
	JPasswordField tf2;
	JButton bckbtn,exitbtn,lgnbtn,hide,unhide;
	ImageIcon icon,logo,img;
	
	public AdminLogin(){
		super(" JORASHOES ");
		this.setSize(1300,750);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f1 = new JFrame();
        f1.setUndecorated(true);
		f1.setLayout(null);
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,1300,750);
		p1.setOpaque(false);
		p1.setBackground(new Color(220,220,220));
		//this.add(p1);
		
		// Icon
		icon = new ImageIcon("Image/icon.png");
        this.setIconImage(icon.getImage());
		
		//Background Image add
		img = new ImageIcon("Image/JORASHOES-login.jpg");
		background=new JLabel(img);
		background.setBounds(0,0,650,750);
		this.add(background); 
		
		//Add User Log In text
		l1 = new JLabel("Admin Log In ");
        l1.setBounds(920, 100, 250, 60);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 32));
		p1.add(l1);
		
		//Add Let's get started Text
		l2 = new JLabel("Leaders at all levels have access to power");
        l2.setBounds(850,150, 300, 30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		p1.add(l2);
		
		//User Name
        l3 = new JLabel("User Name");
        l3.setBounds(700,250, 300, 50);
		l3.setForeground(Color.black);
		l3.setFont(new Font("Segoe UI",Font.BOLD, 25));
        //l3.setFont(new Font("Default", Font.BOLD,18));
        p1.add(l3);
		
		//User box
		tf1 = new JTextField();
        tf1.setBounds(900, 260, 300, 35);
        tf1.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf1);
		
		//Password Text
		l4 = new JLabel("Password");
        l4.setBounds(700, 300, 300, 50);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Segoe UI", Font.BOLD, 25));
		p1.add(l4);
		
		//Password Box
		tf2 = new JPasswordField();
		tf2.setBounds(900,310,300,35);
		tf2.setEchoChar('*');
		tf2.setFont(new Font("Default", Font.BOLD,15));
		p1.add(tf2);

		//Hide Icon
		hide = new JButton(new ImageIcon("Image/Hide.png"));
		hide.setBounds(1210,320,22,20);
		hide.setVisible(true);
		hide.setCursor(new Cursor(Cursor.HAND_CURSOR));
		hide.setContentAreaFilled(false);
		hide.setFocusPainted(false);
		hide.setBorderPainted(false);
		p1.add(hide);

		//Unhide Icon
		unhide = new JButton(new ImageIcon("Image/Unhide.png"));
		unhide.setBounds(1210,320,22,20);
		unhide.setVisible(false);
		unhide.setCursor(new Cursor(Cursor.HAND_CURSOR));
		unhide.setContentAreaFilled(false);
		unhide.setFocusPainted(false);
		unhide.setBorderPainted(false);
		p1.add(unhide);
		
		//hideIcon active listener
			hide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				tf2.setEchoChar((char) 0);
				hide.setVisible(false);
				unhide.setVisible(true);
				tf2.requestFocusInWindow();

			}
		});

		//unhideIcon active listener
			unhide.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				tf2.setEchoChar('*'); ////display password
				unhide.setVisible(false);
				hide.setVisible(true);
				tf2.requestFocusInWindow();
			}
		});
		
		//Sign in button
		lgnbtn=new JButton(" Login ");
		lgnbtn.setBounds(900, 380, 300, 35);
		lgnbtn.setBackground(Color.black);
		lgnbtn.setForeground(Color.white);
		lgnbtn.addActionListener(this);
		lgnbtn.setFont(new Font("Default", Font.BOLD,18));
		p1.add(lgnbtn);

		//Add Back button
		bckbtn=new JButton(" Back ");
		bckbtn.setBounds(700,650,180,50);
		bckbtn.setBackground(Color.black);
		bckbtn.setForeground(Color.white);
		bckbtn.addActionListener(this);
		bckbtn.setFont(new Font("Default", Font.BOLD,18));
		p1.add(bckbtn);
		
		//Add Exit button
		exitbtn=new JButton(" Exit ");
		exitbtn.setBounds(1060,650,180,50);
		exitbtn.setBackground(Color.black);
		exitbtn.setForeground(Color.white);
		exitbtn.addActionListener(this);
		exitbtn.setFont(new Font("Default", Font.BOLD,20));
		p1.add(exitbtn);
		
		this.add(p1);	
        this.setVisible(true);
	}
	//Action Listener for Signin and Signup and Back And Exit
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bckbtn)
		{
			Login frame = new Login();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
		
		else if(ae.getSource()==lgnbtn)
		{
			String textField1 = tf1.getText().toLowerCase(); // Admin Name
            String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				else 
				{
                    try 
					{
                        String userNameS = "Name    : " + textField1;
                        String passwordS = "Password: " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Admin Login Successful.", "JORASHOES",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    AdminPanel frame = new AdminPanel();
                                    frame.setVisible(true);
                                    break;
                                }
                            }
                        }
                    } 
					catch (Exception ex) 
					{
                        JOptionPane.showMessageDialog(null, "Invalid User or Password!", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
                    }
                }
		}
		
	}
}