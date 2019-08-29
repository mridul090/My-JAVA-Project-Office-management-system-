import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.lang.model.element.Element;
import javax.swing.*;

import org.w3c.dom.css.ElementCSSInlineStyle;


public class General_LogIn{
	JFrame j;
	String pass="";
	String PassWord;
	String name,Id;
	
	General_LogIn(){	
	j = new JFrame();
	j.setSize(560,417);
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.getContentPane().setLayout(null);
	JLabel p1= new JLabel("Name:");
	p1.setBounds(56,104,100,30);
	p1.setFont(new Font("Tahoma", Font.BOLD, 20));		
	j.getContentPane().add(p1);
	
	JTextField t1= new JTextField(30);
	t1.setBounds(185,93,200,30);
	j.getContentPane().add(t1);
	
	JLabel p2= new JLabel("Password:");
	p2.setBounds(43,180,117,39);
	p2.setFont(new Font("Tahoma", Font.BOLD, 20));		
	j.getContentPane().add(p2);
	
    JPasswordField pasw = new JPasswordField(30); 
    pasw.setBounds(185,188,200,30);	    
    j.getContentPane().add(pasw);
    
    JLabel p3= new JLabel("or,cread new Account;");
    p3.setBounds(185,227,200,39);
    p3.setFont(new Font("Tahoma", Font.BOLD, 12));
   j.getContentPane().add(p3);
    
    JButton b1 = new JButton("Login");
    b1.setBounds(75,277,100,50);
    b1.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 16));
    b1.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
    		MainProfile profile = new MainProfile();
    		
    		
    		try {
				FileReader R= new FileReader("ID.txt"); 
				FileReader R1= new FileReader("Password.txt");
			
				BufferedReader bReader = new BufferedReader(R);
				BufferedReader bReader1 = new BufferedReader(R1);
				
				name = bReader.readLine();
				String pass1 = bReader1.readLine();
				
				Id = t1.getText().trim();
				PassWord = pasw.getText().trim();
				
				while(name!=null && pass1!= null){
				
					
				String[] aStrings = pass1.split("");
				for(int i=0;i<aStrings.length;i++){
					int a = Integer.parseInt(aStrings[i]);
					int b = a-1;
					pass += b;
				}
				
				
				
				if((!Id.equals("")&& !Id.equals(" ")) && (!PassWord.equals("") && !PassWord.equals(" ")))
				{
					//System.out.println("pass"+pass+"PassWord"+PassWord);
					if((Id.equals(name)) && (PassWord.equals(pass))){
					
				    	profile.showingMainProfile(name);
					    j.dispose();
					
			     	}
				}
				else {
					JOptionPane.showMessageDialog(null, "Faild to loge in");

				}
				name = bReader.readLine();
			    pass1 = bReader1.readLine();
			    pass="";
				}
				System.out.println(name);
				System.out.println(pass);
				System.out.println(PassWord);
    		}
    		catch (IOException e1) {
				System.out.println("The file location is not found");
				e1.printStackTrace();
    		}
    	}
    	
    	
    });	
					
	

    j.getContentPane().add(b1);
    
    
    JButton b2 = new JButton("Create an account");
    b2.setBounds(185,277,200,50);
    b2.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 16));
    b2.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
    		new Creat_An_Account();
    		j.dispose();
    		}
    	});

    j.getContentPane().add(b2);
    
    JLabel lblNewLabel = new JLabel("Welcom To Office Monitoring Apps @2017");
    lblNewLabel.setBackground(Color.LIGHT_GRAY);
    lblNewLabel.setForeground(Color.RED);
    lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD | Font.ITALIC, 18));
    lblNewLabel.setBounds(43, 54, 490, 39);
    j.getContentPane().add(lblNewLabel);
    
    JMenuBar menuBar = new JMenuBar();
    menuBar.setBounds(0, 0, 544, 21);
    j.getContentPane().add(menuBar);
    
    JMenu mnNewMenu = new JMenu("Options");
    menuBar.add(mnNewMenu);
    
    JMenuItem mntmAdminLogein = new JMenuItem("Admin LogeIn");
    mnNewMenu.add(mntmAdminLogein);
    
    mntmAdminLogein.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			 Admin_Account admin_Account= new Admin_Account();
			 admin_Account.initialize();
			 j.dispose();
		}
	});
    
    JMenuItem mntmExit = new JMenuItem("Exit");
    mnNewMenu.add(mntmExit);
    
    j.setVisible(true);}


}


