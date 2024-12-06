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
import javax.swing.table.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.JOptionPane.showMessageDialog;

public class AllUserData extends JFrame implements ActionListener
{ 
    JFrame f1;
	JPanel p1,p2,p3;
	JLabel background,l1,l2,l3,l4,l5;
	JButton slogo,bckbtn,exitbtn,sinupbtn,adduser,refresh,deletebtn;
	ImageIcon icon,logo,img;
	JTable table;
    DefaultTableModel model;
	JScrollPane scroll;
	
	String[] column = { "User Name", "Password", "Email", "Phone Number", "Date and Time" };
    String[] rows = new String[10];
		
    public AllUserData(){
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
		img = new ImageIcon("Image/UserData.jpg");
		background=new JLabel(img);
		background.setBounds(0,50,650,750);
		p2.add(background); 
		
		//Admin Panel Text
		l2=new JLabel("All User Data");
		l2.setBounds(900,120, 300 , 30);
        l2.setForeground(Color.black);
        l2.setFont(new Font("Segoe UI", Font.BOLD,30));
        p2.add(l2);
		
		// JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(new Font("Segoe UI", Font.PLAIN,18));
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(280);
        table.getColumnModel().getColumn(3).setPreferredWidth(180);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);

        scroll = new JScrollPane(table);
        scroll.setBounds(690, 200, 550, 350);
        scroll.setBackground(Color.WHITE);
        p2.add(scroll);

        String file = ".\\Data\\user_data.txt";
        String temp = ".\\Data\\temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 4);
                if (x.equals("User")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(13); // User Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(13); // Password
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(14); // Email
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(13); // Phone Number
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(13); // Date and Time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }
		
		//Add User button
		adduser=new JButton("Add User");
		adduser.setBounds(690,580,150,40);
		adduser.setBackground(Color.black);
		adduser.setForeground(Color.white);
		adduser.addActionListener(this);
		adduser.setFont(new Font("Default", Font.BOLD,20));
		p2.add(adduser);
		
		//Refresh button
		refresh=new JButton(" Refresh ");
		refresh.setBounds(900,580,150,40);
		refresh.setBackground(Color.black);
		refresh.setForeground(Color.white);
		refresh.addActionListener(this);
		refresh.setFont(new Font("Default", Font.BOLD,20));
		p2.add(refresh);
		
		//Delete User button
		deletebtn=new JButton(" Delete User ");
		deletebtn.setBounds(1100,580,150,40);
		deletebtn.setBackground(Color.black);
		deletebtn.setForeground(Color.white);
		deletebtn.addActionListener(this);
		deletebtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(deletebtn);

		//Add Back button
		bckbtn=new JButton(" Back ");
		bckbtn.setBounds(690,650,180,50);
		bckbtn.setBackground(Color.black);
		bckbtn.setForeground(Color.white);
		bckbtn.addActionListener(this);
		bckbtn.setFont(new Font("Default", Font.BOLD,18));
		p2.add(bckbtn);
		
		//Add Exit button
		exitbtn=new JButton(" Exit ");
		exitbtn.setBounds(1070,650,180,50);
		exitbtn.setBackground(Color.black);
		exitbtn.setForeground(Color.white);
		exitbtn.addActionListener(this);
		exitbtn.setFont(new Font("Default", Font.BOLD,20));
		p2.add(exitbtn);
		
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
		else if (ae.getSource()==adduser)
		{
			Signup frame = new Signup();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==refresh)
		{
			AllUserData frame = new AllUserData();
			this.setVisible(false);
			frame.setVisible(true);
		}
		else if(ae.getSource()==exitbtn)
		{
			System.exit(0);
		}
		else if(ae.getSource()==deletebtn)
		{
			String file = ".\\Data\\user_data.txt";
			String temp = ".\\Data\\temp.txt";
			
			if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Select a user for delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeUser = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 4);
                            if (x.equals("User")) {
                                String userName = Files.readAllLines(Paths.get(file)).get(i);
                                if (userName.substring(12).equals(removeUser)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 4);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4)
                                    || j == (q + 5))) {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + userName);
                            } else {
                                String userName = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(userName);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    AllUserData frame = new AllUserData();
                    frame.setVisible(true);
                }
			
		
		}
	}
}