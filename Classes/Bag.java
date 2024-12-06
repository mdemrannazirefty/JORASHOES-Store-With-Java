package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class Bag extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,sl,l1,l2,l3,l4,l5;
	JButton slogo,donebtn,orderbtn,sinupbtn; 
	ImageIcon icon,logo,img;
		
    public Bag(){
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
		
		//Item Text
        l1 = new JLabel(" No Item Selected ");
        l1.setBounds(600, 20, 500 , 50);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        p2.add(l1);
		
		//Add Done button
		donebtn=new JButton(" Done ");
		donebtn.setBounds(50,480,150,50);
		donebtn.setBackground(Color.black);
		donebtn.setForeground(Color.white);
		donebtn.addActionListener(this);
		donebtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(donebtn);
		
		//Add Order button
		orderbtn=new JButton(" Order ");
		orderbtn.setBounds(1060,480,150,50);
		orderbtn.setBackground(Color.black);
		orderbtn.setForeground(Color.white);
		orderbtn.addActionListener(this);
		orderbtn.setFont(new Font("Default", Font.BOLD,20));
		p2.add(orderbtn);
        
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
		if(ae.getSource()==sinupbtn)
		{
			Login frame = new Login();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==slogo)
		{
			Home frame = new Home();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==donebtn)
		{
			Home frame = new Home();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==orderbtn)
		{
			PaymentMathod frame = new PaymentMathod();
			this.setVisible(false);
			frame.setVisible(true);
		}
	}
}