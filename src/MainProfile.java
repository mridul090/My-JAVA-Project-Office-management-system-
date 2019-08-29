import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.security.PublicKey;

import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;

public class MainProfile implements ActionListener {
	
	int n=0,m=0,k=0;
	String user;
	Search_EmployeesInformation Search = new Search_EmployeesInformation();
	ArrayList<employeInfo1> add_In_List = new ArrayList<>();
	String text="";
	
	 DeleteInformation Delete = new DeleteInformation();
	Information_From informationfrom = new Information_From();
	JTableRow Bill_make;
	JTextPane	textPane1;
	JButton btnNewButton_1,btnShowlist;
	

	public static void main(String[] args) {
		MainProfile p = new MainProfile();
		p.showingMainProfile(null);
	

	}
	
	
	public void  showingMainProfile(String user){
		   this.user = user;
		   text ="User:"+user +"\n";
		  
		
	       frame = new JFrame("Menu");
	       frame.getContentPane().setForeground(new Color(119, 136, 153));
	       frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	       frame.setSize(730,559);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			JMenuBar menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			
			JMenu mnFile = new JMenu("File ");
			mnFile.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
			menuBar.add(mnFile);
			
			JMenuItem mntmOption = new JMenuItem("Exit");
			mntmOption.setBackground(Color.LIGHT_GRAY);
			mntmOption.setForeground(Color.GREEN);
			mntmOption.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
			mnFile.add(mntmOption);
			mntmOption.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					frame.dispose();
				}
			});
			
			JMenuItem mntmNewMenuItem = new JMenuItem("");
			mntmNewMenuItem.setBackground(Color.GRAY);
			menuBar.add(mntmNewMenuItem);
			frame.getContentPane().setLayout(null);
			
			JButton btnNewButton = new JButton("ADD Information\r\n");
			btnNewButton.setBounds(63, 162, 315, 55);
			btnNewButton.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17));
			btnNewButton.setBackground(Color.GRAY);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ADD_Information(user);
					
				}
			});
			frame.getContentPane().add(btnNewButton);
			

			
			JButton btnNewButton_2 = new JButton("Search Imployees");
			btnNewButton_2.setBackground(Color.GRAY);
			btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
			btnNewButton_2.setBounds(63, 229, 315, 50);
			frame.getContentPane().add(btnNewButton_2);
			
			 btnNewButton_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
						Search.initialize(user);
						
					
				}
			});
			

			 JPanel panel1 = new JPanel();
				panel1.setBounds(438, 191, 266, 305);
				frame.getContentPane().add(panel1);
				panel1.setLayout(null);
				panel1.setBackground(new Color(176, 196, 222));
				
			    textPane1= new JTextPane();
				textPane1.setBackground(new Color(112, 128, 144));
				textPane1.setForeground(new Color(0, 0, 0));
				textPane1.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
				textPane1.setBounds(0, 0, 266, 305);
				panel1.add(textPane1);
				
				btnNewButton_1 = new JButton("SeeList\r\n");
				btnNewButton_1.setBounds(442, 162, 138, 23);
				frame.getContentPane().add(btnNewButton_1);
				btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				btnNewButton_1.addActionListener(this);
				
				btnShowlist = new JButton("ShowList\r\n");
				btnShowlist.setBounds(575, 162, 129, 23);
				frame.getContentPane().add(btnShowlist);
				btnShowlist.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				btnShowlist.addActionListener(this);
				
			
			JButton btnNewButton_3 = new JButton("Delete Information");
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
			btnNewButton_3.setBackground(Color.GRAY);
			btnNewButton_3.setBounds(63, 290, 315, 55);
			frame.getContentPane().add(btnNewButton_3);
      btnNewButton_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
				
					 Delete.initialize(user);

				}
			});
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(175, 238, 238));
			panel.setBounds(0, 0, 984, 151);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel label = new JLabel("       Welcom To Office Monitoring Apps @2017\r\n");
			label.setBounds(78, 44, 492, 30);
			label.setForeground(Color.RED);
			label.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 27));
			label.setBackground(Color.GRAY);
			panel.add(label);
			
			JButton btnBillmake = new JButton("BillMake\r\n");
			btnBillmake.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
			btnBillmake.setBackground(Color.GRAY);
			btnBillmake.setBounds(63, 356, 315, 55);
			frame.getContentPane().add(btnBillmake);
			btnBillmake.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					Bill_make = new JTableRow();
					Bill_make.BillMake(user);
				}
			});
			
			frame.setVisible(true);
			

		}
	
	JFrame frame;
	JMenuBar menuBar,menuBar_1;
	JMenu mnNewMenu,mnNewMenu_1,mnOpstion, mnSeeprofiles;
	JMenuItem mntmNewMenuItem_1,mntmNewMenuItem_2,mntmNewMenuItem_3;
	JMenuItem mntmLocation,mntmBacktomanu  ;
	JTextPane textPane;
	JMenuItem mntmSearch;
	JMenuItem mntmShow;
	JLabel lblNewLabel_1 ;
	String A;
	private JButton btnNewButton;
	private JButton btnAddinformationForMiddleclass;
	private JButton btnAddinformationForGenerall;

	
	public void ADD_Information(String user){  
		this.user = user;
		frame = new JFrame("ADD_Information");
		frame.getContentPane().setBackground(new Color(70, 130, 180));
	
		frame.setSize(626, 437);
	
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(192, 192, 192));
		frame.setJMenuBar(menuBar);
	
	    mnNewMenu = new JMenu("File");
	    menuBar.add(mnNewMenu);
	
        mnNewMenu_1 = new JMenu("Save_as");
	    mnNewMenu.add(mnNewMenu_1);
	
	    mntmBacktomanu = new JMenuItem("BackToManu");
	    mnNewMenu.add(mntmBacktomanu);
	    mntmBacktomanu.addActionListener(this);
	
	    mntmSearch = new JMenuItem("SeeList");
	    mnNewMenu.add(mntmSearch);
	    mntmSearch.addActionListener(this);
	
    	mntmShow = new JMenuItem("show");
	    mnNewMenu.add(mntmShow);
	    mntmShow.addActionListener(this);
	
        mntmLocation = new JMenuItem("TxtFile");
	    mnNewMenu_1.add(mntmLocation);
	    mntmLocation.addActionListener(this);
	
	    JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
	    mnNewMenu.add(mntmNewMenuItem);
	    frame.getContentPane().setLayout(null);
	    mntmNewMenuItem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			frame.dispose();
		}
	});
	
	JPanel panel = new JPanel();
	panel.setBounds(0, 0, 235, 377);
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	panel.setBackground(Color.GRAY);
	
	textPane= new JTextPane();
	textPane.setBackground(Color.GRAY);
	textPane.setForeground(new Color(0, 0, 0));
	textPane.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
	textPane.setBounds(0, 11, 235, 366);
	panel.add(textPane);
	
	btnNewButton = new JButton("AddInformation for Officers");
	btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
	btnNewButton.setForeground(Color.RED);
	btnNewButton.setBounds(245, 57, 237, 23);
	frame.getContentPane().add(btnNewButton);
	btnNewButton.addActionListener(this);
	
	btnAddinformationForMiddleclass = new JButton("AddInformation for Middleclass");
	btnAddinformationForMiddleclass.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
	btnAddinformationForMiddleclass.setForeground(Color.RED);
	btnAddinformationForMiddleclass.setBounds(245, 109, 237, 23);
	frame.getContentPane().add(btnAddinformationForMiddleclass);
	btnAddinformationForMiddleclass.addActionListener(this);
	
	btnAddinformationForGenerall = new JButton("AddInformation for \r\nGenerall Employee");
	btnAddinformationForGenerall.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
	btnAddinformationForGenerall.setForeground(Color.RED);
	btnAddinformationForGenerall.setBounds(245, 157, 320, 25);
	frame.getContentPane().add(btnAddinformationForGenerall);
	btnAddinformationForGenerall.addActionListener(this);
	
	
	/*JScrollPane jsp = new JScrollPane(txtrHelpHereYou, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	//JScrollPane jsp1 = new JScrollPane(txtrHelpHereYou,  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	jsp.setBounds(200,74,10,430);
	frame.add(jsp);**/


	
	panel.setVisible(true);
	frame.setVisible(true);
		}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Information_From information_From = new Information_From();
		
		Object r = e.getSource();
		if(r == btnNewButton){
			//new FirstClassOfficerProfile();
			information_From.Info(1,user);
			frame.dispose();
		}
		else if(r == btnAddinformationForMiddleclass){
			//new FirstClassOfficerProfile();
			information_From.Info(2,user);
			frame.dispose();
			
		}
		else if(r == btnAddinformationForGenerall){
			//new FirstClassOfficerProfile();
			information_From.Info(3,user);
			frame.dispose();
		}
		else if(r == mntmBacktomanu ){
			showingMainProfile(user);
			frame.dispose();
		}
		else if(r == mntmLocation){
			int n =informationfrom.decoideFile();
		
			if(n==1){
				textPane.setText("The Operation has "+"\n"+" successfuly 'Done'."+"\n"
			    		+ "File has saved "+"in a Txt file."+"\n"+"File location"+"\n"+"TxtFile.txt");
				JOptionPane.showMessageDialog(null, "Information successfully Store");
			}
			else{
				
				textPane.setText("UnSuccess!!");
			}
		}
		else if(r == mntmSearch){
			Search();
			
		}
		else if(r == mntmShow){
			
			textPane.setText(text);
		}
		else if(r == btnNewButton_1){
			Search();
			JOptionPane.showMessageDialog(null, "Search complite");
		}
		else if(r == btnShowlist){
			textPane1.setText(text);
		}
 
		
	
	
	}
	public void Search(){

		try {
			FileInputStream fileIn = new FileInputStream("TxtFile.txt");
			ObjectInputStream ObjectIn = new ObjectInputStream(fileIn);
			
			add_In_List = (ArrayList<employeInfo1>)ObjectIn.readObject();
			
			ObjectIn.close();
			fileIn.close();
			
			
			
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2.getMessage());
		}
		
		for(employeInfo1 e1:add_In_List){
			String string = "";
		
			if(e1.getUser().equals(user)){
				string =e1.getName()+"-"+e1.getSecrialNo()+"-"+e1.getPosition()+"\n";
				add(string);
				System.out.println("User: "+user+"\n"+e1);
				
			}
			
			
			
			
		}
		JOptionPane.showMessageDialog(null, "Search complite");

	}
	
	public void add(String s){
		text +=s;
		System.out.println(text);
	}
	

	
}
