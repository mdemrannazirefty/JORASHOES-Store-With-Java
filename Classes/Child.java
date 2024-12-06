package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class Child extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,sl,l1,l2,l3,l4,i1t,i2t,i3t,i4t,i1p,i2p,i3p,i4p;
	JButton slogo,menbtn,womenbtn,childbtn,giftbtn,bagbtn,sinupbtn,i1i,i2i,i3i,i4i;
	ImageIcon icon,logo,img;
		
    public Child(){
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
		
		//Background Image add
		img = new ImageIcon("Image/Childb.jpg");
		background=new JLabel(img);
		background.setBounds(50,25,1200,150);
		p2.add(background); 
		
		//Add all Item 
		//Item1 Image
        i1i = new JButton();
        i1i.setIcon(new ImageIcon("Image/WhiteChild.png"));
        i1i.setBounds(50, 210,250, 250);
        i1i.setCursor(new Cursor(Cursor.HAND_CURSOR));
        i1i.setBackground(new Color(30,30,30));
        i1i.addActionListener(this);
		p2.add(i1i);
		
		//Item1 Text
        i1t = new JLabel("White Child ");
        i1t.setBounds(50,460, 250, 35);
        i1t.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(i1t);
		
		//Item1 Price
        i1p = new JLabel("BDT 2,050 tk");
        i1p.setBounds(50, 482, 300, 35);
        i1p.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		p2.add(i1p);
		
		//Item2 Image
        i2i = new JButton();
        i2i.setIcon(new ImageIcon("Image/GreenChild.png"));
        i2i.setBounds(365, 210,250, 250);
        i2i.setCursor(new Cursor(Cursor.HAND_CURSOR));
        i2i.setBackground(new Color(30,30,30));
        i2i.addActionListener(this);
		p2.add(i2i);
		
		//Item2 Text
        i2t = new JLabel("Green Child ");
        i2t.setBounds(365,460, 250, 35);
        i2t.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(i2t);
		
		//Item2 Price
        i2p = new JLabel("BDT 2,100 tk");
        i2p.setBounds(365, 482, 300, 35);
        i2p.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		p2.add(i2p);
		
		//Item3 Image
        i3i = new JButton();
        i3i.setIcon(new ImageIcon("Image/WhiteRedChild.png"));
        i3i.setBounds(675, 210,250, 250);
        i3i.setCursor(new Cursor(Cursor.HAND_CURSOR));
        i3i.setBackground(new Color(30,30,30));
        i3i.addActionListener(this);
		p2.add(i3i);
		
		//Item3 Text
        i3t = new JLabel("Wht-Red Child ");
        i3t.setBounds(675,460, 250, 35);
        i3t.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(i3t);
		
		//Item3 Price
        i3p = new JLabel("BDT 1,650 tk");
        i3p.setBounds(675, 482, 300, 35);
        i3p.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		p2.add(i3p);
		
		//Item4 Image
        i4i = new JButton();
        i4i.setIcon(new ImageIcon("Image/PinkChild.png"));
        i4i.setBounds(995, 210,250, 250);
        i4i.setCursor(new Cursor(Cursor.HAND_CURSOR));
        i4i.setBackground(new Color(30,30,30));
        i4i.addActionListener(this);
		p2.add(i4i);
		
		//Item4 Text
        i4t = new JLabel("Pink Child ");
        i4t.setBounds(995,460, 250, 35);
        i4t.setFont(new Font("Segoe UI", Font.BOLD, 18));
		p2.add(i4t);
		
		//Item4 Price
        i4p = new JLabel("BDT 2,870 tk");
        i4p.setBounds(995, 482, 300, 35);
        i4p.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		p2.add(i4p);

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
		else if (ae.getSource()==i1i)
		{
			ChildProduct1 frame = new ChildProduct1();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==i2i)
		{
			ChildProduct2 frame = new ChildProduct2();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==i3i)
		{
			ChildProduct3 frame = new ChildProduct3();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if (ae.getSource()==i4i)
		{
			ChildProduct4 frame = new ChildProduct4();
			this.setVisible(false);
			frame.setVisible(true);
		}
		
	}
}