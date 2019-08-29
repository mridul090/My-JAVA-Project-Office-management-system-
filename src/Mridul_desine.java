import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Mridul_desine {
	JFrame frame;
	JMenuBar menuBar,menuBar_1;
	JMenu mnNewMenu,mnNewMenu_1,mnOpstion, mnSeeprofiles;
	JMenuItem mntmNewMenuItem_1,mntmNewMenuItem_2,mntmNewMenuItem_3;
	JMenuItem mntmLocation ;
	JTextPane textPane;
	private JMenuItem mntmBacktomanu;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mridul_desine window = new Mridul_desine();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mridul_desine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 frame = new JFrame();
			frame.setSize(1000, 1000);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			
			 mnNewMenu = new JMenu("File");
			menuBar.add(mnNewMenu);
			
		    mnNewMenu_1 = new JMenu("Save_as");
			mnNewMenu.add(mnNewMenu_1);
			
			
		    mntmLocation = new JMenuItem("TxtFile");
			mnNewMenu_1.add(mntmLocation);
			//mntmLocation.addActionListener(this);
			
			mntmBacktomanu = new JMenuItem("BackToManu");
			mnNewMenu.add(mntmBacktomanu);
			
			JMenuItem mntmShow = new JMenuItem("Show");
			mnNewMenu.add(mntmShow);
			
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
			panel.setBounds(0, 0, 124, 504);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			panel.setBackground(Color.white);
			
			menuBar_1 = new JMenuBar();
			menuBar_1.setBounds(0, 0, 124, 21);
			panel.add(menuBar_1);
			
			 mnOpstion = new JMenu("Opstion");
			menuBar_1.add(mnOpstion);
			
			 mnSeeprofiles = new JMenu("SeeProfiles");
			mnOpstion.add(mnSeeprofiles);
			
			mntmNewMenuItem_1 = new JMenuItem("1stClass_Employees");
			mnSeeprofiles.add(mntmNewMenuItem_1);
			
			mntmNewMenuItem_2 = new JMenuItem("2ndClass_Employees");
			mnSeeprofiles.add(mntmNewMenuItem_2);
			
			 mntmNewMenuItem_3 = new JMenuItem("3rdClass_Employees\r\n");
			mnSeeprofiles.add(mntmNewMenuItem_3);
			
			textPane = new JTextPane();
			textPane.setBounds(0, 21, 124, 201);
			panel.add(textPane);
			
//			mntmNewMenuItem_1.addActionListener(this);
//			mntmNewMenuItem_2.addActionListener(this);
//			mntmNewMenuItem_3.addActionListener(this);
//			
			JLabel lblNewLabel = new JLabel("      Employees Information Sotrage!!!");
			lblNewLabel.setBackground(Color.DARK_GRAY);
			lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD, 19));
			lblNewLabel.setBounds(134, 11, 589, 71);
			frame.getContentPane().add(lblNewLabel);
			
			JTextArea txtrHelpHereYou = new JTextArea();
			txtrHelpHereYou.setBackground(Color.GRAY);
			txtrHelpHereYou.setFont(new Font("Monospaced", Font.BOLD, 13));
			txtrHelpHereYou.setText("Help!!!\r\nHere You have  three options.\r\n1st Class ,2nd Class and 3rd Class employees categories\r\n ");
			txtrHelpHereYou.setToolTipText("Help!!!\r\nHere You have  three options.\r\n1st Class ,2nd Class and 3rd Class employees categories\r\n ");
			txtrHelpHereYou.setBounds(202, 74, 426, 394);
			frame.getContentPane().add(txtrHelpHereYou);
			
			/*JScrollPane jsp = new JScrollPane(txtrHelpHereYou, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			//JScrollPane jsp1 = new JScrollPane(txtrHelpHereYou,  ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			jsp.setBounds(200,74,10,430);
			frame.add(jsp);**/


			
			panel.setVisible(true);
			frame.setVisible(true);
		}
}
