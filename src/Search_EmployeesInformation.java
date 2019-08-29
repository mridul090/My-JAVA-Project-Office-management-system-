import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Search_EmployeesInformation implements ActionListener{

	
	
	JFrame frame;
	JMenuBar menuBar,menuBar_1;
	JMenu mnNewMenu,mnNewMenu_1,mnOpstion, mnSeeprofiles;
	JMenuItem mntmNewMenuItem_1,mntmNewMenuItem_2,mntmNewMenuItem_3;
	JMenuItem mntmLocation ;
	FileInputStream  fileInputStream ;
	ObjectInputStream objectInputStream;
	JButton button,btnNewButton,button_1;
	Search searchClass = new Search();
	JMenuItem mntmNewMenuItem,mntmNewMenuItem_4;
	JMenu mnOption;
	String user;
	
	
	public static void main(String[] args) {
		Search_EmployeesInformation info = new Search_EmployeesInformation();
		info.initialize(null) ;

	}
	
	public void initialize(String user) {
		this.user = user;
		 frame = new JFrame("Searching Employye information");
		 frame.getContentPane().setBackground(new Color(65, 105, 225));
			frame.setSize(616, 352);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Selecet a single Employees information and search ");
			lblNewLabel.setForeground(new Color(255, 255, 0));
			lblNewLabel.setBackground(Color.GRAY);
			lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
			lblNewLabel.setBounds(67, 32, 460, 27);
			frame.getContentPane().add(lblNewLabel);
			
			btnNewButton = new JButton("HigherOfficers");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			btnNewButton.setBounds(32, 101, 197, 39);
			frame.getContentPane().add(btnNewButton);
			btnNewButton.addActionListener(this);
			
			button = new JButton("MiddleClass");
			button.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			button.setBounds(32, 167, 197, 39);
			frame.getContentPane().add(button);
			 button.addActionListener(this);
			
		    button_1 = new JButton("Low class");
		    button_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
			button_1.setBounds(32, 233, 197, 39);
			frame.getContentPane().add(button_1);
			button_1.addActionListener(this);
			
			JMenuBar menuBar_2 = new JMenuBar();
			menuBar_2.setBackground(new Color(32, 178, 170));
			menuBar_2.setBounds(0, 0, 648, 21);
			frame.getContentPane().add(menuBar_2);
			
		    mnOption = new JMenu("Option");
			menuBar_2.add(mnOption);
			
			 mntmNewMenuItem = new JMenuItem("Manue");
			mnOption.add(mntmNewMenuItem);
			mntmNewMenuItem.addActionListener(this);
			
			mntmNewMenuItem_4 = new JMenuItem("Exit\r\n");
			mnOption.add(mntmNewMenuItem_4);
			
			
			frame.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object aObject = e.getSource();
		
		if(aObject==btnNewButton){
			
			
			searchClass.initialize("1stClassOfficer",user);
			
		}
		else if(aObject == button){
			searchClass.initialize("2ndClassOfficer",user);
		}
        else if(aObject == button_1){
        	searchClass.initialize("3rdClassOfficer",user);
		}
        else if(aObject ==   mntmNewMenuItem){
        MainProfile mainProfile =	new MainProfile();
        mainProfile.showingMainProfile(user);
        //	mainProfile.showingMainProfile();
        	frame.dispose();
        }
        else if(aObject ==  mntmNewMenuItem_4 ){
            	frame.dispose();
            }
		
	}

}
