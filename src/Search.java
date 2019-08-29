import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.jar.Attributes.Name;

import javax.sound.midi.Soundbank;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Search implements ActionListener{

	private String GiveName, GiveSecrialNo;
	public ArrayList<employeInfo1> add_In_List = new ArrayList<>();
	public String degination ;
    Integer SecrailNo,flag = 0;
	String user;
	String string; 
	

	public String getGiveName() {
		return GiveName;
	}


	public void setGiveName(String giveName) {
		GiveName = giveName;
	}


	public String getGiveSecrialNo() {
		return GiveSecrialNo;
	}


	public void setGiveSecrialNo(String giveSecrialNo) {
		GiveSecrialNo = giveSecrialNo;
	}


	JFrame frame1;
	JMenuBar menuBar,menuBar_1;
	JMenu mnNewMenu,mnNewMenu_1,mnOpstion, mnSeeprofiles;
	JMenuItem mntmNewMenuItem_1,mntmNewMenuItem_2,mntmNewMenuItem_3;
	JMenuItem mntmLocation ;
	private JTextField txtGivename,txtGivename1;
	private JTextField txtGivesecrialno;
	private JButton btnSearch;
	private String Name;
	Search_EmployeesInformation goback;
	public static void main(String[] args) {
		Search search = new Search();
		//search.initialize();
	}


	public void initialize(String s,String user) {
		this.user =user;
	    degination =s;
	    
	    frame1 = new JFrame("search Employe's Information");
	    frame1.getContentPane().setBackground(new Color(32, 178, 170));
		frame1.setSize(396, 218);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		txtGivename = new JTextField("Name",20);
		txtGivename.setForeground(Color.LIGHT_GRAY);
		txtGivename.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtGivename.setBounds(41, 67, 150, 27);
		frame1.getContentPane().add(txtGivename);
		txtGivename.setColumns(10);
		txtGivename.addFocusListener(new FocusListener() {
		   
			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				   if (txtGivename.getText().equals("Name")) {
					   txtGivename.setText("");
					   txtGivename.setForeground(Color.BLACK);
			        }
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				 if (txtGivename.getText().isEmpty()) {
					 txtGivename.setForeground(Color.GRAY);
					 txtGivename.setText("Name");
			        }
			}
		    });
		
		
		txtGivename1 = new JTextField("SecrialNo",20);
		txtGivename1.setForeground(Color.LIGHT_GRAY);
		txtGivename1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtGivename1.setBounds(201, 67, 150, 27);
		frame1.getContentPane().add(txtGivename1);
		txtGivename1.setColumns(10);
		txtGivename1.addFocusListener(new FocusListener() {
		   
			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				   if (txtGivename1.getText().equals("SecrialNo")) {
					   txtGivename1.setText("");
					   txtGivename1.setForeground(Color.BLACK);
			        }
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				 if (txtGivename1.getText().isEmpty()) {
					 txtGivename1.setForeground(Color.GRAY);
					 txtGivename1.setText("SecrialNo");
			        }
			}
		    });

		


//		
//		txtGivesecrialno = new JTextField("SecrialNo",20);
//		txtGivesecrialno.setForeground(Color.LIGHT_GRAY);
//		txtGivesecrialno.setFont(new Font("Tahoma", Font.PLAIN, 17));
//		txtGivesecrialno.setColumns(10);
//		txtGivesecrialno.setBounds(243, 67, 150, 35);
//		frame1.getContentPane().add(txtGivesecrialno);
//		txtGivesecrialno.setColumns(10);
//		txtGivesecrialno.addFocusListener(new FocusListener() {
//			   
//			@Override
//			public void focusGained(FocusEvent arg0) {
//				// TODO Auto-generated method stub
//				   if (txtGivesecrialno.getText().equals("SecrailNo")) {
//					   txtGivesecrialno.setText("");
//					   txtGivesecrialno.setForeground(Color.BLACK);
//			        }
//			}
//			@Override
//			public void focusLost(FocusEvent arg0) {
//				// TODO Auto-generated method stub
//				 if (txtGivesecrialno.getText().isEmpty()) {
//					 txtGivesecrialno.setForeground(Color.GRAY);
//					 txtGivesecrialno.setText("SecrailNo");
//			        }
//			}
//		    });
		
		btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnSearch.setBounds(122, 120, 109, 27);
		frame1.getContentPane().add(btnSearch);
		btnSearch.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel(s);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(31, 11, 180, 35);
		frame1.getContentPane().add(lblNewLabel);
		
	 JLabel	lblGiveName = new JLabel("Give Name");
		lblGiveName.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblGiveName.setBounds(74, 42, 97, 14);
		frame1.getContentPane().add(lblGiveName);
		
		JLabel lblGiveSecrialno = new JLabel("Give SecrialNo.");
		lblGiveSecrialno.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblGiveSecrialno.setBounds(201, 42, 117, 14);
		frame1.getContentPane().add(lblGiveSecrialno);
		
		
		frame1.setVisible(true);
	}

	
	

	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		Object rObject =a.getSource();
		if(rObject == btnSearch){
			
		  
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
			for(employeInfo1 em:add_In_List){
				
				string = txtGivename.getText().trim();
				SecrailNo = Integer.parseInt(txtGivename1.getText().trim());
				
				if(em.getName().equals(string) && em.getSecrialNo().equals(SecrailNo) && em.getPosition().equals(degination) && em.getUser().equals(user)){
					Information_show_from from = new Information_show_from(em.getName(), em.getFather_Name(), em.getMother_Name(), em.getDesignation(), em.getNationality(), em.getMale(), em.getFemale(), em.getPresent_Address(), em.getParmanent_Address(), em.getJoiningDate(), em.getYearLink(), em.getMonthliSalary(), em.getSecrialNo(), em.getPosition(),degination);
					from.show();
					flag =1;
					frame1.dispose();
					
				
				}
			
				//System.out.println(e);
			}
			if(flag == 0){
				JOptionPane.showMessageDialog(null, "Don't Match");
			   frame1.dispose();
			}
//			 ListIterator<employeInfo1> infoIterator = add_In_List.listIterator();
//			while (infoIterator.hasNext()){
//				employeInfo1 em =infoIterator.next();
//				
//				//&&(em.getPosition().equals(txtGivesecrialno.getText()) ) half part of if condition
//			if(em.getName().equals(txtGivename.getText().trim()) ){
//				System.out.println("I am here");
//				Information_show_from from = new Information_show_from(em.getName(), em.getFather_Name(), em.getMother_Name(), em.getDesignation(), em.getNationality(), em.getMale(), em.getFemale(), em.getPresent_Address(), em.getParmanent_Address(), em.getJoiningDate(), em.getYearLink(), em.getMonthliSalary(), em.getSecrialNo(), em.getPosition());
//				from.show();
//				frame1.dispose();
//				
//			}
//			else{
//				JOptionPane.showMessageDialog(null, "Name And position is unMacah");
//			}
//		
//	}
			
			
	}
	}
}
	
	
	

