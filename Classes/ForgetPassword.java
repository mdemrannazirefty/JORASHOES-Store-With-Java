package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class ForgetPassword extends JFrame implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel background, l1, l2, l3,l4;
	JTextField tf1,tf2,tf3;
	JButton bckbtn,exitbtn,conbtn;
	ImageIcon icon,logo,img;
	
	public ForgetPassword(){
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
		
		//Add Recover Password text
		l1 = new JLabel("Recover Your Password");
        l1.setBounds(820, 120, 400, 60);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		p1.add(l1);
		
		//User Name
        l2 = new JLabel("User Name");
        l2.setBounds(700,250, 300, 50);
		l2.setForeground(Color.black);
		l2.setFont(new Font("Segoe UI",Font.BOLD, 25));
        p1.add(l2);
		
		//User box
		tf1 = new JTextField();
        tf1.setBounds(900, 260, 300,30);
        tf1.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf1);
		
		//New Password Text
		l3 = new JLabel("New Password");
        l3.setBounds(700, 300, 300, 50);
        l3.setForeground(Color.black);
        l3.setFont(new Font("Segoe UI", Font.BOLD, 25));
		p1.add(l3);
		
		//new Password box
		tf2 = new JTextField();
        tf2.setBounds(900, 310, 300, 30);
        tf2.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf2);
		
		//retype Password Text
		l4 = new JLabel("Re-Type Password");
        l4.setBounds(700,350, 300, 50);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Segoe UI", Font.BOLD, 22));
		p1.add(l4);
		
		//retype Password box
		tf3 = new JTextField();
        tf3.setBounds(900, 360, 300,30);
        tf3.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf3);
		
		//Continue button
		conbtn=new JButton(" Continue ");
		conbtn.setBounds(900,410, 300, 35);
		conbtn.setBackground(Color.black);
		conbtn.setForeground(Color.white);
		conbtn.addActionListener(this);
		conbtn.setFont(new Font("Default", Font.BOLD,18));
		p1.add(conbtn);
		
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
	
	//Action Listener for Back and Exit Button	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==conbtn)
		{
			Home frame = new Home();
			this.setVisible(false);
			frame.setVisible(true);
		}
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
	}
}