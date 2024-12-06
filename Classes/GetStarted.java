package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;

public class GetStarted extends JFrame implements ActionListener
{
	JFrame f1;
	JPanel p1;
	JLabel background, l2, l3;
	JButton getbtn,contbtn,exitbtn;
	ImageIcon logo,icon,img;
	
	public GetStarted(){
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
		
		// Icon
		icon = new ImageIcon("Image/icon.png");
        this.setIconImage(icon.getImage());

		//Background Image add
		img = new ImageIcon("Image/gs.gif");
		background=new JLabel(img);
		background.setBounds(0,0,1300,750);
		//this.add(background);
		p1.add(background);		
		
		//Add Getstarted button
		getbtn=new JButton(" Get Started ");
		getbtn.setBounds(550,475,200,50);
		getbtn.setBackground(Color.black);
		getbtn.setForeground(Color.white);
		getbtn.addActionListener(this);
		getbtn.setFont(new Font("Default", Font.BOLD,19));
		this.add(getbtn);
		
		//Add Contribution button
		contbtn=new JButton(" Contribution ");
		contbtn.setBounds(75,625,150,50);
		contbtn.setBackground(Color.black);
		contbtn.setForeground(Color.white);
		contbtn.addActionListener(this);
		contbtn.setFont(new Font("Default", Font.BOLD,16));
		this.add(contbtn);
		
		//Add Exit button
		exitbtn=new JButton(" Exit ");
		exitbtn.setBounds(1060,625,150,50);
		exitbtn.setBackground(Color.black);
		exitbtn.setForeground(Color.white);
		//exitbtn.addActionListener(this);
		exitbtn.setFont(new Font("Default", Font.BOLD,20));
		this.add(exitbtn);
		
		//Action Listener for Exit Button
		exitbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
		
		this.add(p1);	
        this.setVisible(true);
	}
	
	//Action Listener for Getstartedand and Contribution and Exit Button	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==getbtn)
		{
			Login frame = new Login();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==contbtn)
		{
			Contribution frame = new Contribution();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
	}
		
		
}