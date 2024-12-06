package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class PaymentMathod extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,sl,l1,l2,l3,l4,cri,bki,csi,crt,bkt,cst;
	JButton crdbtn,bksbtn,cshbtn,bagbtn,sinupbtn,slogo;
	ImageIcon icon,logo,img;
		
    public PaymentMathod(){
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
		
		//Add PAyment Text
        l1 = new JLabel(" Select Your Payment Mathod ");
        l1.setBounds(400, 40, 700 , 50);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));
        p2.add(l1);
		
	/*	
		//Adding my slogan
		l2 = new JLabel(" Heaven Under Your feet ");
        l2.setBounds(50, 50,470,30);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        p1.add(l2);
	*/	 
		//Add 3 Payment mathod
		//Addd Card Image Button
        crdbtn = new JButton();
        crdbtn.setIcon(new ImageIcon("Image/Card.png"));
        crdbtn.setBounds(200,150,250, 300);
        crdbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        crdbtn.setBackground(new Color(30,30,30));
        crdbtn.addActionListener(this);
		p2.add(crdbtn);
		
		//Card Text
        crt = new JLabel("Credit/Debit Card");
        crt.setBounds(240,460, 250, 35);
		crt.setForeground(Color.black);
        crt.setFont(new Font("Segoe UI", Font.BOLD, 20));
		p2.add(crt);
		
		//Add Bkash Image Button
        bksbtn = new JButton();
        bksbtn.setIcon(new ImageIcon("Image/Bkash.png"));
        bksbtn.setBounds(500,150,250, 300);
        bksbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bksbtn.setBackground(new Color(30,30,30));
        bksbtn.addActionListener(this);
		p2.add(bksbtn);
		
		//Bkash Text
        bkt = new JLabel("Bkash Payment");
        bkt.setBounds(550,460, 250, 35);
		bkt.setForeground(Color.black);
        bkt.setFont(new Font("Segoe UI", Font.BOLD, 20));
		p2.add(bkt);
		
		//Add Cash Image Button
        cshbtn = new JButton();
        cshbtn.setIcon(new ImageIcon("Image/Cash.png"));
        cshbtn.setBounds(800, 150,250, 300);
        cshbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cshbtn.setBackground(new Color(30,30,30));
        cshbtn.addActionListener(this);
		p2.add(cshbtn);
		
		//Cash Text
        cst = new JLabel("Cash On Delivery");
        cst.setBounds(850,460, 250, 35);
		cst.setForeground(Color.black);
        cst.setFont(new Font("Segoe UI", Font.BOLD, 20));
		p2.add(cst);
	
		//Add Bag
		bagbtn=new JButton("BAG");
		bagbtn.setBounds(1050,40,80,40);
		bagbtn.setBackground(Color.white);
		bagbtn.setForeground(Color.black);
		bagbtn.addActionListener(this);
		bagbtn.setFont(new Font("Default", Font.BOLD,14));
		p1.add(bagbtn);
				
		//Add Signin/up Button
        sinupbtn=new JButton("SIGN IN/UP");
		sinupbtn.setBounds(1160,40,100,40);
		sinupbtn.setBackground(Color.white);
		sinupbtn.setForeground(Color.black);
		sinupbtn.addActionListener(this);
		sinupbtn.setFont(new Font("Default", Font.BOLD,12));
		p1.add(sinupbtn);
        
		//Add Credit Text 
		l3 = new JLabel(" © 2022 JORASHOES | All Right Reserved ");
        l3.setBounds(470, 660, 600 , 50);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Default", Font.PLAIN, 18));
        p3.add(l3);
		
		
        this.setVisible(true);
	}
	//Action Listener for logo and Signin/up and Bag	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==slogo)
		{
			Home frame = new Home();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==bagbtn)
		{
			Bag frame = new Bag();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==sinupbtn)
		{
			Login frame = new Login();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==crdbtn)
		{
			Card frame = new Card();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==bksbtn)
		{
			Bkash frame = new Bkash();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==cshbtn)
		{
			Cash frame = new Cash();
			this.setVisible(false);
			frame.setVisible(true);
		}
	}
}