package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class MenProduct1 extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,sl,l1,l2,l3,l4,l5,l6,l7,mp1l;
	JButton slogo,bagbtn,sinupbtn,bckbtn,exitbtn,mp1,abagbtn,Buynbtn;
	JRadioButton s40,s41,s42;
	ButtonGroup bgp;
	JComboBox cb1,cb2;
	ImageIcon icon,logo,img;
		
    public MenProduct1(){
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
		
		//Adding Top Side logo
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
		
		//Add Catagory Text 
		l1 = new JLabel("Catagory: Men ");
        l1.setBounds(50,20,600,50);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Default", Font.BOLD, 20));
        p2.add(l1);
		
		//White Men Background Image add
		img = new ImageIcon("Image/MenProduct1.jpg");
		background=new JLabel(img);
		background.setBounds(50,100,500,350);
		background.setBackground(new Color(30,30,30));
		p2.add(background); 
		
		//Add Product name Text 
		l2 = new JLabel("Product Name: White Men");
        l2.setBounds(600,20,300 , 50);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Default", Font.BOLD, 18));
        p2.add(l2);
		
		//Add Code text
		l3 = new JLabel("Code: 22d18c");
        l3.setBounds(600,40,300 , 50);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Default", Font.BOLD, 18));
        p2.add(l3);
		
		//Available size text
		l4 = new JLabel("Available Size:");
        l4.setBounds(600,100,300 , 50);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Default", Font.PLAIN, 18));
        p2.add(l4);
		
		//Size rediobutton
		s40=new JRadioButton("40");    
		s40.setFont(new Font("Segoe UI",Font.BOLD, 15));  
		s40.setBounds(600,140,50,30); 
		p2.add(s40);	
	
		s41=new JRadioButton("41"); 
		s41.setFont(new Font("Segoe UI",Font.BOLD, 15));  
		s41.setBounds(650,140,50,30);
		p2.add(s41);
	
		s42=new JRadioButton("42");  
		s42.setFont(new Font("Segoe UI",Font.BOLD, 15));  
		s42.setBounds(700,140,50,30);
		p2.add(s42);
		
		//Add 3 button in group
		ButtonGroup g1 = new ButtonGroup();
		g1.add(s40);
		g1.add(s41);
		g1.add(s42);
		
		//Available colour text
		l5 = new JLabel("Available Colour:");
        l5.setBounds(600,170,300 , 50);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Default", Font.PLAIN, 18));
        p2.add(l5);
		
		//colour in combobox
		String quantity[] = { "White", "Black", "Red", "Gray", "Pink", "Golden"};
        cb1 = new JComboBox(quantity);
        cb1.setBounds(600,210, 100,25);
		p2.add(cb1);
		
		//Quality text
		l6 = new JLabel("Quantity");
        l6.setBounds(600,230, 240, 40);
        l6.setFont(new Font("Default", Font.PLAIN, 18));
		p2.add(l6);
		
		//Quality in combobox
        String quantity2[] = { "1", "2", "3", "4", "4", "5" };
        cb2 = new JComboBox(quantity2);
        cb2.setBounds(600,270, 60, 20);
		p2.add(cb2);
		
		//Price Text
		l7 = new JLabel("BDT 2,000 tk");
        l7.setBounds(600,300,300 ,50);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Default", Font.BOLD,25));
        p2.add(l7);
		
		//Add Bag button
		abagbtn=new JButton("Add Bag");
		abagbtn.setBounds(600,400,150,50);
		abagbtn.setBackground(Color.black);
		abagbtn.setForeground(Color.white);
		//abagbtn.addActionListener(this);
		abagbtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(abagbtn);
		
		//Buy now button
		Buynbtn=new JButton("Buy Now");
		Buynbtn.setBounds(800,400,150,50);
		Buynbtn.setBackground(Color.black);
		Buynbtn.setForeground(Color.white);
		Buynbtn.addActionListener(this);
		Buynbtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(Buynbtn);
		
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
		else if(ae.getSource()==abagbtn)
		{
			Bag frame = new Bag();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==Buynbtn)
		{
			PaymentMathod frame = new PaymentMathod();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==bckbtn)
		{
			Men frame = new Men();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
	}
}