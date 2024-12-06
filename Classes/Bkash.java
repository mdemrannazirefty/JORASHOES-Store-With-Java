package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class Bkash extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JTextField l3b,l2b;
	JLabel background,sl,l1,l2,l3,l4,l5;
	JButton slogo,donebtn,bckbtn,exitbtn,sinupbtn; 
	ImageIcon icon, logo,img;
		
    public Bkash(){
        super(" JORASHOES ");
		this.setSize(1300,750);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        f1 = new JFrame();
        f1.setUndecorated(true);
		f1.setLayout(null);
               
		p1 = new JPanel();
		p1.setSize(new Dimension(1300,100));
		p1.setBackground(Color.black);
		p1.setBounds(0,0,1300,100);
		p1.setLayout(null);
		this.add(p1);
		
		
        p2 = new JPanel();
		p2.setSize(new Dimension(1300,550));
		p2.setBackground(new Color(220,220,220));
		p2.setBounds(0,100,1300,550);
		p2.setLayout(null);
		this.add(p2);
		
		p3 = new JPanel();
		p3.setSize(new Dimension(1300,100));
		p3.setBackground(Color.black);
		p3.setBounds(0,650,1300,100);
		p3.setLayout(null);
		this.add(p3);   
		
		// Icon
		icon = new ImageIcon("Image/icon.png");
        this.setIconImage(icon.getImage());
		
		//Site logo
		slogo = new JButton();
        slogo.setIcon(new ImageIcon("Image/slogo.png"));
        slogo.setBounds(10,10,200, 100);
        //slogo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        slogo.setBackground(Color.black);
        slogo.addActionListener(this);
		p1.add(slogo);
		
		//Add Hotline Text
        l4 = new JLabel("Hotline: 100");
        l4.setBounds(950,40, 300 , 30);
        l4.setForeground(Color.red);
        l4.setFont(new Font("Segoe UI", Font.BOLD,15));
        p1.add(l4);
		
		//Add Signin/up Button
        sinupbtn=new JButton("SIGN IN/UP");
		sinupbtn.setBounds(1160,40,100,40);
		sinupbtn.setBackground(Color.white);
		sinupbtn.setForeground(Color.black);
		sinupbtn.addActionListener(this);
		sinupbtn.setFont(new Font("Default", Font.BOLD,12));
		p1.add(sinupbtn);
		
		//Headline Text
        l1 = new JLabel("Complete The Process");
        l1.setBounds(200, 20, 500 , 50);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        p2.add(l1);
		
		//Enter Number Text
        l3 = new JLabel("Enter Your Number:");
        l3.setBounds(50,90, 300, 50);
		l3.setForeground(Color.black);
		l3.setFont(new Font("Segoe UI",Font.BOLD, 15));
        //l3.setFont(new Font("Default", Font.BOLD,18));
        p2.add(l3);
		
		//Enter Number box
		l3b = new JTextField();
        l3b.setBounds(200, 100, 300, 35);
        l3b.setFont(new Font("Default", Font.BOLD,15));
        p2.add(l3b);
		
		//TrsID Text
		l2 = new JLabel("Enter TrsID:");
        l2.setBounds(50, 145, 300, 50);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		p2.add(l2);
		
		//TrsID box
		l2b = new JTextField();
        l2b.setBounds(200, 150, 300, 35);
        l2b.setFont(new Font("Default", Font.BOLD,15));
        p2.add(l2b);
		
		//Add Cash Image
		img = new ImageIcon("Image/BkashPayment.png");
		background=new JLabel(img);
		background.setBounds(630,25,618,435);
		p2.add(background); 
		
		//Add Done button
		donebtn=new JButton(" Done ");
		donebtn.setBounds(200, 200, 300, 35);
		donebtn.setBackground(Color.black);
		donebtn.setForeground(Color.white);
		donebtn.addActionListener(this);
		donebtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(donebtn);
		
		//Add Back button
		bckbtn=new JButton(" Back ");
		bckbtn.setBounds(50,480,150,50);
		bckbtn.setBackground(Color.black);
		bckbtn.setForeground(Color.white);
		bckbtn.addActionListener(this);
		bckbtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(bckbtn);
		
		//Add Exit button
		exitbtn=new JButton(" Exit ");
		exitbtn.setBounds(1060,480,150,50);
		exitbtn.setBackground(Color.black);
		exitbtn.setForeground(Color.white);
		exitbtn.addActionListener(this);
		exitbtn.setFont(new Font("Default", Font.BOLD,20));
		p2.add(exitbtn);
        
		//Add Credit Text 
		l3 = new JLabel(" © 2022 JORASHOES | All Right Reserved ");
        l3.setBounds(470, 660, 600 , 50);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Default", Font.PLAIN, 18));
        p3.add(l3);
		
		
        this.setVisible(true);
	}
	//Action Listener for Signin/up and Back	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==slogo)
		{
			Home frame = new Home();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==sinupbtn)
		{
			Login frame = new Login();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==donebtn)
		{
			Home frame = new Home();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==bckbtn)
		{
			PaymentMathod frame = new PaymentMathod();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
	}
}