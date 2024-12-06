package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class AdminPanel extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,l1,l2,udt,anadmint;
	JButton slogo,bckbtn,exitbtn,sinupbtn,udata,anadmin;
	ImageIcon icon,logo,img;
		
    public AdminPanel(){
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
        l1 = new JLabel("Hotline: 100");
        l1.setBounds(950,40, 300 , 30);
        l1.setForeground(Color.red);
        l1.setFont(new Font("Segoe UI", Font.BOLD,15));
        p1.add(l1);
				
		//Add Signin/up Button
        sinupbtn=new JButton("SIGN IN/UP");
		sinupbtn.setBounds(1160,40,100,40);
		sinupbtn.setBackground(Color.white);
		sinupbtn.setForeground(Color.black);
		sinupbtn.addActionListener(this);
		sinupbtn.setFont(new Font("Default", Font.BOLD,12));
		p1.add(sinupbtn);
		
		//Admin Panel Text
		l2=new JLabel("Admin Panel");
		l2.setBounds(920,150, 300 , 30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.BOLD,30));
        p2.add(l2);
		
		//User Data Image
        udata = new JButton();
        udata.setIcon(new ImageIcon("Image/UserData.png"));
        udata.setBounds(700, 250,250, 250);
        udata.setCursor(new Cursor(Cursor.HAND_CURSOR));
        udata.setBackground(new Color(30,30,30));
        udata.addActionListener(this);
		p2.add(udata);
		
		//User Data Text
        udt = new JLabel("User Data");
        udt.setBounds(770,500, 250, 35);
        udt.setFont(new Font("Segoe UI", Font.BOLD,20));
		p2.add(udt);
		
		
		//Add New Admin Image
        anadmin = new JButton();
        anadmin.setIcon(new ImageIcon("Image/AddNewAdmin.png"));
        anadmin.setBounds(1000, 250,250, 250);
        anadmin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        anadmin.setBackground(new Color(30,30,30));
        anadmin.addActionListener(this);
		p2.add(anadmin);
		
		//Add New Admin Text
        anadmint = new JLabel("Add New Admin");
        anadmint.setBounds(1040,500, 250, 35);
        anadmint.setFont(new Font("Segoe UI", Font.BOLD,20));
		p2.add(anadmint);
		
		//Add Exit button
		exitbtn=new JButton(" Exit ");
		exitbtn.setBounds(1060,650,180,50);
		exitbtn.setBackground(Color.black);
		exitbtn.setForeground(Color.white);
		exitbtn.addActionListener(this);
		exitbtn.setFont(new Font("Default", Font.BOLD,20));
		p2.add(exitbtn);
		
		//Background Image add
		img = new ImageIcon("Image/W&BJORASHOES.jpg");
		background=new JLabel(img);
		background.setBounds(0,50,650,750);
		p2.add(background); 
		
		//Add Back button
		bckbtn=new JButton(" Back ");
		bckbtn.setBounds(700,650,180,50);
		bckbtn.setBackground(Color.black);
		bckbtn.setForeground(Color.white);
		bckbtn.addActionListener(this);
		bckbtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(bckbtn);
		
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
		else if (ae.getSource()==sinupbtn)
		{
			Login frame = new Login();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==bckbtn)
		{
			AdminLogin frame = new AdminLogin();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==udata)
		{
			AllUserData frame = new AllUserData();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==anadmin)
		{
			AddNewAdmin frame = new AddNewAdmin();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
	}
}