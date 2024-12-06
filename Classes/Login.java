package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
import java.nio.file.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login extends JFrame implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel background, l1, l2, l3, l4,l5;
	JTextField tf1;
	JPasswordField tf2;
	JCheckBox c1;
	JButton bckbtn,exitbtn,fgtbtn,sgnbtn,sgupbtn,hide,unhide,alogin;
	ImageIcon icon,logo,img;
	
	public Login(){
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
		l1 = new JLabel(" Log In ");
        l1.setBounds(990, 100, 200, 60);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));
		p1.add(l1);
		
		//Add Let's get started Text
		l2 = new JLabel("Let's get started");
        l2.setBounds(980,150, 300, 30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		p1.add(l2);

		alogin = new JButton("Admin Login");
        alogin.setBounds(980, 200, 140, 32);
        alogin.setBackground(Color.black);
		alogin.setForeground(Color.white);
		alogin.addActionListener(this);
        alogin.setFont(new Font("Segoe UI", Font.BOLD, 17));
		p1.add(alogin);
		
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
		
		//Remember Me
		c1 = new JCheckBox("Remember me");
        c1.setBounds(895, 340, 160, 35);
        c1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        c1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        c1.setForeground(Color.black);
        c1.setFocusPainted(false);
        c1.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        c1.setContentAreaFilled(false);
		p1.add(c1);
		
		//Forget Password
		fgtbtn = new JButton("Forgot Password?");
        fgtbtn.setBounds(1060, 340, 160, 35);
        fgtbtn.setForeground(Color.black);
        fgtbtn.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        fgtbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fgtbtn.setFocusPainted(false);
        fgtbtn.addActionListener(this);
        fgtbtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        fgtbtn.setContentAreaFilled(false);
		p1.add(fgtbtn);
		
		//Sign in button
		sgnbtn=new JButton(" Sign In ");
		sgnbtn.setBounds(900, 380, 300, 35);
		sgnbtn.setBackground(Color.black);
		sgnbtn.setForeground(Color.white);
		sgnbtn.addActionListener(this);
		sgnbtn.setFont(new Font("Default", Font.BOLD,18));
		p1.add(sgnbtn);
		
		//Don't have an account? text
		l5 = new JLabel("Don't have an account?");
        l5.setBounds(950, 420,200,30);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		p1.add(l5);
		
		//signup text button 
		sgupbtn = new JButton("Sign Up");
        sgupbtn.setBounds(1115,415,70, 40);
        sgupbtn.setForeground(Color.black);
        sgupbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
        sgupbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sgupbtn.setFocusPainted(false);
        sgupbtn.setBorder(BorderFactory.createEmptyBorder(4,4,4,4));
		sgupbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sgupbtn.setContentAreaFilled(false);
		sgupbtn.addActionListener(this);
		p1.add(sgupbtn);

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
		if(ae.getSource()==sgupbtn)
		{
			Signup frame = new Signup();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==fgtbtn)
		{
			ForgetPassword frame = new ForgetPassword();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==bckbtn)
		{
			GetStarted frame = new GetStarted();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==alogin)
		{
			this.setVisible(false);
			AdminLogin frame = new AdminLogin();
			frame.setVisible(true);
			JOptionPane.showMessageDialog(null, "By default, Admin Name and Password is : 'admin'", "Information!",
                                JOptionPane.INFORMATION_MESSAGE);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
		
		else if(ae.getSource()==sgnbtn)
		{
			String textField1 = tf1.getText().toLowerCase(); // User Name 
            String textField2 = tf2.getText(); // Password

                if (textField1.isEmpty() || textField2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } 
				else {

                    try {
                        String userNameS = "User Name : " + textField1;
                        String passwordS = "Password  : " + textField2;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                        totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "JORASHOES!",
                                            JOptionPane.WARNING_MESSAGE);

                                    setVisible(false);
                                    Home frame = new Home();
                                    frame.setVisible(true);
                                    break;
                                }

                            }
                        }
                    } 
					catch (Exception ex) 
					{
                        JOptionPane.showMessageDialog(null, "Invalid User or Password.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }
		}
			
		
	}
}