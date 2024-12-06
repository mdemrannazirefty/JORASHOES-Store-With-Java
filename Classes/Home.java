package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class Home extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,sl,l1,l2,l3,l4,l5;
	JButton slogo,menbtn,womenbtn,childbtn,giftbtn,bagbtn,sinupbtn; 
	ImageIcon icon,logo,img;
		
    public Home(){
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
		
	/*	
		//Add my Text
        l1 = new JLabel(" JORA SHOES ");
        l1.setBounds(50, 20, 500 , 30);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 30));
        p1.add(l1);
		
		//Adding my slogan
		l2 = new JLabel(" Heaven Under Your feet ");
        l2.setBounds(50, 50,470,30);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        p1.add(l2);
	*/	
		//Background Image add
		img = new ImageIcon("Image/HomeCover.jpg");
		background=new JLabel(img);
		background.setBounds(50,25,1200,200);
		p2.add(background); 
		
		//Addd Men
        menbtn=new JButton(" MEN ");
		menbtn.setBounds(50,250,250,250);
		menbtn.setBackground(new Color(30,30,30));
		//menbtn.setBackground(Color.black);
		menbtn.setForeground(Color.white);
		menbtn.addActionListener(this);
		menbtn.setFont(new Font("Default", Font.BOLD,25));
		p2.add(menbtn);

		//Add Women
        womenbtn=new JButton(" WOMEN ");
		womenbtn.setBounds(365,250,250,250);
		womenbtn.setBackground(new Color(30,30,30));
		womenbtn.setForeground(Color.white);
		womenbtn.addActionListener(this);
		womenbtn.setFont(new Font("Default", Font.BOLD,25));
		p2.add(womenbtn);
               
		//Add Child
        childbtn=new JButton(" CLILD ");
		childbtn.setBounds(675,250,250,250);
		childbtn.setBackground(new Color(30,30,30));
		childbtn.setForeground(Color.white);
		childbtn.addActionListener(this);
		childbtn.setFont(new Font("Default", Font.BOLD,25));
		p2.add(childbtn);
               
		//Add Gift
        giftbtn=new JButton(" GIFT ");
		giftbtn.setBounds(995,250,250,250);
		giftbtn.setBackground(new Color(30,30,30));
		giftbtn.setForeground(Color.white);
		giftbtn.addActionListener(this);
		giftbtn.setFont(new Font("Default", Font.BOLD,25));
		p2.add(giftbtn);
		
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
		else if (ae.getSource()==menbtn)
		{
			Men frame = new Men();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==womenbtn)
		{
			Women frame = new Women();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==childbtn)
		{
			Child frame = new Child();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==giftbtn)
		{
			Gift frame = new Gift();
			this.setVisible(false);
			frame.setVisible(true);
		}
	}
}