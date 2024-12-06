package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.Font;
import java.io.*;
import java.nio.file.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.JOptionPane.showMessageDialog;

public class AddNewAdmin extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,l1,l2,l3,l4,l5;
	JTextField tf1,tf2;
	JButton slogo,bckbtn,exitbtn,sinupbtn,anadmin;
	ImageIcon icon,logo,img;
		
    public AddNewAdmin(){
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
		
		//Background Image add
		img = new ImageIcon("Image/AddNewAdmin.jpg");
		background=new JLabel(img);
		background.setBounds(0,50,650,750);
		p2.add(background); 
		
		//Admin Panel Text
		l2=new JLabel("Add New Admin");
		l2.setBounds(920,200, 300 , 30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.BOLD,30));
        p2.add(l2);
		
		//Leaders at all levels have access to power Text
		l5 = new JLabel("Leaders at all levels have access to power");
        l5.setBounds(850,235, 400, 30);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		p2.add(l5);


		//User Name
        l3 = new JLabel("User Name");
        l3.setBounds(700,300, 300, 50);
		l3.setForeground(Color.black);
		l3.setFont(new Font("Segoe UI",Font.BOLD, 25));
        //l3.setFont(new Font("Default", Font.BOLD,18));
        p2.add(l3);
		
		//User box
		tf1 = new JTextField();
        tf1.setBounds(900, 310, 300, 35);
        tf1.setFont(new Font("Default", Font.BOLD,15));
        p2.add(tf1);
		
		//Password Text
		l4 = new JLabel("Password");
        l4.setBounds(700, 350, 300, 50);
        l4.setForeground(Color.black);
        l4.setFont(new Font("Segoe UI", Font.BOLD, 25));
		p2.add(l4);
		
		//Password box
		tf2 = new JTextField();
        tf2.setBounds(900, 360, 300, 35);
        tf2.setFont(new Font("Default", Font.BOLD,15));
        p2.add(tf2);
		
		//addnewadmin button
		anadmin=new JButton(" Add New Admin ");
		anadmin.setBounds(900, 420, 300, 35);
		anadmin.setBackground(Color.black);
		anadmin.setForeground(Color.white);
		anadmin.addActionListener(this);
		anadmin.setFont(new Font("Default", Font.BOLD,18));
		p2.add(anadmin);
		
		//Add Exit button
		exitbtn=new JButton(" Exit ");
		exitbtn.setBounds(1060,650,180,50);
		exitbtn.setBackground(Color.black);
		exitbtn.setForeground(Color.white);
		exitbtn.addActionListener(this);
		exitbtn.setFont(new Font("Default", Font.BOLD,20));
		p2.add(exitbtn);
		
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
			AdminPanel frame = new AdminPanel();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
		else if(ae.getSource()==anadmin)
		{
			String textField1 = tf1.getText().toLowerCase(); // User Name
            String textField2 = tf2.getText(); // Password

                if ((!textField1.isEmpty() || !textField2.isEmpty())) 
				{
                    try 
					{
                        File file = new File(".\\Data\\admin_data.txt");
                        if (!file.exists()) 
						{
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        pw.println("Name    : " + textField1);
                        pw.println("Password: " + textField2);
                        pw.println("==========================================");
                        pw.println();
                        pw.close();

                        showMessageDialog(null, " New Admin Added", "Added Complete", 1);
						AddNewAdmin frame = new AddNewAdmin();
						this.setVisible(false);
						frame.setVisible(true);
						
                    } 
					catch (Exception ex) 
					{
                        System.out.print(ex);
                    }
                }
		}
	}
}