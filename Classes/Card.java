package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class Card extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,sl,h1,h2,l1,l2,l3,l4,l5,l6,l7;
	JTextField l1tf,l2tf,l5tf,l6tf;
	JButton slogo,donebtn,bckbtn,exitbtn,sinupbtn; 
	ImageIcon icon,logo,img;
		
    public Card(){
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
        h1 = new JLabel("Complete Your payment");
        h1.setBounds(450, 20, 500 , 50);
        h1.setForeground(Color.black);
        h1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        p2.add(h1);
		
		//Add Cash Image
		img = new ImageIcon("Image/CardPayment.jpg");
		background=new JLabel(img);
		background.setBounds(640,80,600,400);
		p2.add(background); 
		
		//Card Text
		h2 = new JLabel("We Accept Only");
        h2.setBounds(50,93, 500 , 50);
        h2.setForeground(Color.black);
        h2.setFont(new Font("Segoe UI", Font.BOLD, 18));
        p2.add(h2);
		
		//CArd Image
		l7 = new JLabel();
        l7.setIcon(new ImageIcon("Image/CardDetails.png"));
        Dimension size1 = l7.getPreferredSize();
        l7.setBounds(198, 100, size1.width, size1.height);
        //l7.setBounds(740, 120, 250, 100);
		p2.add(l7);
		
		//Card Name text
		l1 = new JLabel("Name on card");
        l1.setBounds(50,148, 150, 30);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(l1);
		
		//Card name Box
		l1tf = new JTextField();
        l1tf.setBounds(180,150, 400, 30);
        l1tf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		p2.add(l1tf);
		
		//Add Card Number text
        l2 = new JLabel("Card number");
        l2.setBounds(50,197, 150, 30);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(l2);
		
		//Card number Box
		l2tf = new JTextField();
        l2tf.setBounds(180,200, 400, 30);
        l2tf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		p2.add(l2tf);
		
		//Add Valid date text
        l5 = new JLabel("Valid On");
        l5.setBounds(50,247, 150, 30);
        l5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(l5);
		
		//Valid Date box
		l5tf = new JTextField();
        l5tf.setBounds(180, 250, 150, 30);
        l5tf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		p2.add(l5tf);

		//Add Cvv text
        l6 = new JLabel("CVV Code");
        l6.setBounds(350,247, 150, 30);
        l6.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(l6);
		
		//CVV Box
		l6tf = new JTextField();
        l6tf.setBounds(440, 250, 140, 30);
        l6tf.setFont(new Font("Serif", Font.PLAIN, 15));
		p2.add(l6tf);
		
		//Add Confirm Payment button
		donebtn=new JButton(" Confirm Payment ");
		donebtn.setBounds(180,300, 400, 35);
		donebtn.setBackground(Color.black);
		donebtn.setForeground(Color.white);
		donebtn.addActionListener(this);
		donebtn.setFont(new Font("Default", Font.BOLD,20));
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