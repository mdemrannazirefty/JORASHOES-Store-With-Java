package Classes;

import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import java.awt.Dimension;
import java.time.*;
import java.time.format.*;
import java.awt.EventQueue;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.JOptionPane.showMessageDialog;

public class Signup extends JFrame implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel background, l1, l2, l3, l4,l5,l6,l7,l8,l9,l10;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JCheckBox c1;
	JRadioButton m1, f2, o3;
	ButtonGroup bgp;
	Container c;
	int a, b,Random;
	JButton bckbtn,exitbtn,admbtn,fgtbtn,sgnbtn,sgupbtn,rstbtn;
	ImageIcon icon,logo,img;
	
	public Signup(){
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
		img = new ImageIcon("Image/W&BJORASHOES.jpg");
		background=new JLabel(img);
		background.setBounds(0,0,650,750);
		this.add(background); 
		
		//Add User Log In text
		l1 = new JLabel("Sign Up");
        l1.setBounds(950,70, 200, 60);
        l1.setForeground(Color.black);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));
		p1.add(l1);
		
		//Add Let's get started Text
		l2 = new JLabel("Let's get started");
        l2.setBounds(950,120, 300, 30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		p1.add(l2);
		
		//User Name
        l3 = new JLabel("User Name");
        l3.setBounds(700,200, 300, 50);
		l3.setForeground(Color.black);
		l3.setFont(new Font("Segoe UI",Font.BOLD, 22));
        //l3.setFont(new Font("Default", Font.BOLD,18));
        p1.add(l3);
		
		//User box
		tf1 = new JTextField();
        tf1.setBounds(900, 210, 300, 35);
        tf1.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf1);
		
		//Email
        l4 = new JLabel("Email");
        l4.setBounds(700,250, 300, 50);
		l4.setForeground(Color.black);
		l4.setFont(new Font("Segoe UI",Font.BOLD, 22));
        p1.add(l4);
		
		//Email box
		tf2 = new JTextField();
        tf2.setBounds(900, 260, 300, 35);
        tf2.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf2);
		
		//Phone Number
        l10 = new JLabel("Phone Number");
        l10.setBounds(700,300, 300, 50);
		l10.setForeground(Color.black);
		l10.setFont(new Font("Segoe UI",Font.BOLD, 22));
        p1.add(l10);
		
		//Phone Number box
		tf7 = new JTextField();
        tf7.setBounds(900, 310, 300, 35);
        tf7.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf7);
		
		//Password Text
		l5 = new JLabel("Password");
        l5.setBounds(700, 350, 300, 50);
        l5.setForeground(Color.black);
        l5.setFont(new Font("Segoe UI",Font.BOLD, 22));
		p1.add(l5);
		
		//Password box
		tf3 = new JTextField();
        tf3.setBounds(900, 360, 300, 35);
        tf3.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf3);
		
		//Re-Type Password Text
		l6 = new JLabel("Re-Type Password");
        l6.setBounds(700, 400, 300, 50);
        l6.setForeground(Color.black);
        l6.setFont(new Font("Segoe UI",Font.BOLD, 21));
		p1.add(l6);
		
		//Re-Type Password Box
		tf4 = new JTextField();
        tf4.setBounds(900, 410, 300, 35);
        tf4.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf4);
		
		//Gender text
		l7 = new JLabel("Gender ");
		l7.setFont(new Font("Segoe UI",Font.BOLD, 22));
		l7.setForeground(Color.black);
		l7.setBounds(700,440, 300, 50);
		p1.add(l7);
		
		m1=new JRadioButton("Male");    
		m1.setFont(new Font("Segoe UI",Font.BOLD, 15));  
		m1.setBounds(900,450,70,25); 
		p1.add(m1);	
	
		f2=new JRadioButton("Female"); 
		f2.setFont(new Font("Segoe UI",Font.BOLD, 15));  
		f2.setBounds(990,450,90,25);
		p1.add(f2);
	
		o3=new JRadioButton("Other");  
		o3.setFont(new Font("Segoe UI",Font.BOLD, 15));  
		o3.setBounds(1100,450,70,25);
		p1.add(o3);
		
		//Add 3 button in group
		ButtonGroup g1 = new ButtonGroup();
		g1.add(m1);
		g1.add(f2);
		g1.add(o3);
		
		//Capcha Text
		l8 = new JLabel("Capcha");
        l8.setBounds(700,485, 300, 50);
        l8.setForeground(Color.black);
        l8.setFont(new Font("Segoe UI",Font.BOLD, 22));
		p1.add(l8);
		
		// To get a random number for captcha
		Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
	
        // Captcha Number
        l9 = new JLabel();
        l9.setText("  " + a + " + " + b + "  ");
        l9.setBounds(800, 495,60, 30);
        l9.setFont(new Font("Default", Font.PLAIN,15));
        l9.setForeground(Color.red);
        l9.setBackground(Color.decode("#FFD3D3"));
        l9.setOpaque(true);
        p1.add(l9);
		
		//Capcha box
		tf6 = new JTextField();
        tf6.setBounds(900,495, 300, 35);
        tf6.setFont(new Font("Default", Font.BOLD,15));
        p1.add(tf6);

		//Reset Button
		rstbtn = new JButton("Reset");
        rstbtn.setBounds(1120,520, 100, 40);
        rstbtn.setForeground(Color.black);
        rstbtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
        rstbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rstbtn.setFocusPainted(false);
        rstbtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        rstbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rstbtn.addActionListener(this);
        rstbtn.setContentAreaFilled(false);
		p1.add(rstbtn);
		
		//Sign up button
		sgupbtn=new JButton(" Sign Up ");
		sgupbtn.setBounds(900,555, 300, 35);
		sgupbtn.setBackground(Color.black);
		sgupbtn.setForeground(Color.white);
		sgupbtn.addActionListener(this);
		sgupbtn.setFont(new Font("Default", Font.BOLD,15));
		p1.add(sgupbtn);
		
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
	
	//Action Listener for Reset and Signup and Back and Exit Button	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==rstbtn)
		{
			Signup frame = new Signup();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==bckbtn)
		{
			Login frame = new Login();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
		else if(ae.getSource()==sgupbtn)
		{

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
				String textField3 = tf7.getText(); // Phone Number
                String textField4 = tf3.getText(); // Password
                String textField5 = tf4.getText(); // Re Password
                String textField6 = tf6.getText(); // Captcha
                int result = 0;

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                        || textField5.isEmpty() || textField6.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);

                } 
				else {

                    String string17 = tf6.getText();
                    int myInteger = 0;
                    try {
                        myInteger = Integer.parseInt(string17);
                    } catch (Exception ef) {

                        showMessageDialog(null, "Wrong Captcha", "null", 2);
                        ef.printStackTrace();
                    }

                    result = Integer.parseInt(tf6.getText());

                    if (textField6.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
					/*
					else if (result != (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
                    } */
					else if (!textField4.equals(textField5)) {
                        showMessageDialog(null, "Password & Re-type Password must be same", "null", 2);
                    }
					else {

                        try {
                            File file = new File(".\\Data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            LocalDateTime myDateObj = LocalDateTime.now();
                            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                            String timeAndDate = myDateObj.format(myFormatObj);

                            pw.println("User Name   : " + textField1);
							pw.println("Password    : " + textField4);
							pw.println("Email       : " + textField2);
							pw.println("Phone Number: " + textField3);
                            pw.println("Time & Date : " + timeAndDate);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "Sign Up Successfull !!",
                                "Sign Up Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        Login frame = new Login();
                        frame.setVisible(true);
                    }
                }
		}
	}
}