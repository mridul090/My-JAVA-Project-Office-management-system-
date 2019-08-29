import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import com.toedter.calendar.JDateChooser;

public class test {
	

	public List<employeInfo1> add_In_List = new ArrayList<>();
	
	
	
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private String user1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.user1 = user;

		frame = new JFrame(user+"-Add Information");
		frame.setBounds(100, 100, 880, 601);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(24, 27, 66, 28);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(154, 27, 167, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFathername = new JLabel("FatherName:");
		lblFathername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFathername.setBounds(24, 92, 113, 28);
		frame.getContentPane().add(lblFathername);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(154, 90, 167, 28);
		frame.getContentPane().add(textField_1);
		
		JLabel lblMothername = new JLabel("MotherName:");
		lblMothername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMothername.setBounds(24, 157, 113, 28);
		frame.getContentPane().add(lblMothername);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(154, 157, 167, 26);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNationality = new JLabel("Nationality:");
		lblNationality.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNationality.setBounds(24, 222, 113, 28);
		frame.getContentPane().add(lblNationality);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"America", "Bangladesh", "China", "India", "UK", "UAE"}));
		comboBox.setBounds(154, 228, 167, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSelecetgender = new JLabel("SelecetGender:");
		lblSelecetgender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelecetgender.setBounds(24, 279, 141, 28);
		frame.getContentPane().add(lblSelecetgender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnMale.setBounds(28, 314, 109, 23);
		frame.getContentPane().add(rdbtnMale);
		rdbtnMale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Male= true;
			}
		});
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFemale.setBounds(28, 340, 109, 23);
		frame.getContentPane().add(rdbtnFemale);
		rdbtnFemale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Female= true;
			}
		});
		
		ButtonGroup group1 = new ButtonGroup();
	    group1.add(rdbtnMale);
	    group1.add(rdbtnFemale);
		
		JLabel lblPresentadress = new JLabel("PresentAdress:\r\n");
		lblPresentadress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPresentadress.setBounds(24, 382, 212, 28);
		frame.getContentPane().add(lblPresentadress);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(34, 421, 301, 102);
		frame.getContentPane().add(textArea);
		
		JLabel lblPermanentadress = new JLabel("PermanentAdress:\r\n");
		lblPermanentadress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPermanentadress.setBounds(387, 367, 212, 28);
		frame.getContentPane().add(lblPermanentadress);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(387, 421, 301, 102);
		frame.getContentPane().add(textArea_1);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDesignation.setBounds(460, 25, 128, 28);
		frame.getContentPane().add(lblDesignation);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(611, 30, 167, 26);
		frame.getContentPane().add(textField_3);
		
		JLabel lblJoiningdate = new JLabel("JoiningDate:");
		lblJoiningdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJoiningdate.setBounds(460, 92, 128, 28);
		frame.getContentPane().add(lblJoiningdate);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(611, 95, 167, 26);
		frame.getContentPane().add(textField_4);
		
		JLabel lblYearlink = new JLabel("YearLink\r\n");
		lblYearlink.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYearlink.setBounds(471, 161, 128, 28);
		frame.getContentPane().add(lblYearlink);
		
		textField_5 = new JTextField("00.0");
		textField_5.setColumns(10);
		textField_5.setBounds(611, 160, 167, 26);
		frame.getContentPane().add(textField_5);
		
		JLabel lblMonthlysalary = new JLabel("MonthlySalary");
		lblMonthlysalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMonthlysalary.setBounds(460, 222, 128, 28);
		frame.getContentPane().add(lblMonthlysalary);
		
		textField_6 = new JTextField("00.0");
		textField_6.setColumns(10);
		textField_6.setBounds(611, 225, 167, 26);
		frame.getContentPane().add(textField_6);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(Color.GRAY);
		btnSubmit.setBounds(312, 534, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblSecrialno = new JLabel("SecrialNo.\r\n");
		lblSecrialno.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSecrialno.setBounds(460, 288, 128, 28);
		frame.getContentPane().add(lblSecrialno);
		
		textField_7 = new JTextField("0");
		textField_7.setColumns(10);
		textField_7.setBounds(611, 285, 167, 26);
		frame.getContentPane().add(textField_7);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent arg0){
				MainProfile p=new MainProfile();
				if(n == 1){
					
					try {
						FileInputStream fileIn = new FileInputStream("TxtFile.txt");
						ObjectInputStream ObjectIn = new ObjectInputStream(fileIn);
						
						add_In_List = (List<employeInfo1>)ObjectIn.readObject();
						
						ObjectIn.close();
						fileIn.close();
						
						
						
					} catch (Exception e2) {
						// TODO: handle exception
						System.out.println(e2.getMessage());
					}
				String name =textField.getText();
				String FatherName =textField_1.getText();
				String MotherName =textField_2.getText();
				
				String nationality = (String)comboBox.getSelectedItem();
				
				String present_Address = textArea.getText();
				
				String parmanent_Address = textArea_1.getText();
				
				String Designation = textField_3.getText();
			
				String JoiningDate = textField_4.getText();
				
				Double yearLink =Double.parseDouble(textField_5.getText()); 
				
				Double monthliSalary =Double.parseDouble(textField_6.getText());
				Integer value = Integer.parseInt(textField_7.getText());
				
				if((!name.equals("")&&!name.equals(" ")) && (!FatherName.equals("")&&!FatherName.equals(" ")) && (!MotherName.equals("")&&!MotherName.equals(" ")) &&(!nationality.equals("")&&!nationality.equals(" ")) && (!present_Address.equals("")&&!present_Address.equals(" ")) && (!parmanent_Address.equals("")&&!parmanent_Address.equals(" ")) && (!Designation.equals("")&&!Designation.equals(" ")) && (!JoiningDate.equals("")&&!JoiningDate.equals(" "))){                                                                                    
					
				
				add_In_List.add(new employeInfo1(name, FatherName, MotherName, Designation,  nationality, Male, Female, present_Address, parmanent_Address, JoiningDate, yearLink, monthliSalary,value,"1stClassOfficer",user,"admin"));
				p.ADD_Information(user);
				frame.dispose();
				}
			else{
				JOptionPane.showMessageDialog(null, "Information Missing");
				p.ADD_Information(user);
				frame.dispose();
			}
			
                try {
					FileOutputStream fileOut = new FileOutputStream("TxtFile.txt");
					ObjectOutputStream ObjectOut = new ObjectOutputStream(fileOut);
					
					ObjectOut.writeObject(add_In_List);
					ObjectOut.flush();
					fileOut.close();
					
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}

				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				Male = false;
				Female = false;
				textArea.setText(" ");
				textArea_1.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText("00.0");
				textField_6.setText("00.0");
			
				
				
				}
				else if(n==2){
					

					try {
						FileInputStream fileIn = new FileInputStream("TxtFile.txt");
						ObjectInputStream ObjectIn = new ObjectInputStream(fileIn);
						
						add_In_List = (List<employeInfo1>)ObjectIn.readObject();
						
						ObjectIn.close();
						fileIn.close();
						
						
						
					} catch (Exception e2) {
						// TODO: handle exception
						System.out.println(e2.getMessage());
					}
					
					String name =textField.getText();
					String FatherName =textField_1.getText();
					String MotherName =textField_2.getText();
					
					String nationality = (String)comboBox.getSelectedItem();
					
					String present_Address = textArea.getText();
					
					String parmanent_Address = textArea_1.getText();
					
					String Designation = textField_3.getText();
				
					String JoiningDate = textField_4.getText();
					
					Double yearLink =Double.parseDouble(textField_5.getText()); 
					
					Double monthliSalary =Double.parseDouble(textField_6.getText());
					
					Integer value = Integer.parseInt(textField_7.getText());

					if((!name.equals("")&&!name.equals(" ")) && (!FatherName.equals("")&&!FatherName.equals(" ")) && (!MotherName.equals("")&&!MotherName.equals(" ")) &&(!nationality.equals("")&&!nationality.equals(" ")) && (!present_Address.equals("")&&!present_Address.equals(" ")) && (!parmanent_Address.equals("")&&!parmanent_Address.equals(" ")) && (!Designation.equals("")&&!Designation.equals(" ")) && (!JoiningDate.equals("")&&!JoiningDate.equals(" "))){                                                                                    
						
					
					add_In_List.add(new employeInfo1(name, FatherName, MotherName, Designation,  nationality, Male, Female, present_Address, parmanent_Address, JoiningDate, yearLink, monthliSalary,value,"2ndClassOfficer",user,"admin"));
                   // Collections.sort(add_In_List);
					p.ADD_Information(user);
					frame.dispose();
					}
					else{
						JOptionPane.showMessageDialog(null, "Information Missing");
						p.ADD_Information(user);
						frame.dispose();
					}
					
                    try {
						FileOutputStream fileOut = new FileOutputStream("TxtFile.txt");
						ObjectOutputStream ObjectOut = new ObjectOutputStream(fileOut);
						
						ObjectOut.writeObject(add_In_List);
						ObjectOut.flush();
						fileOut.close();
						
						
						
					} catch (Exception e2) {
						// TODO: handle exception
						System.out.println(e2.getMessage());
					}

					
					textField.setText(" ");
					textField_1.setText(" ");
					textField_2.setText(" ");
					Male = false;
					Female = false;
					textArea.setText(" ");
					textArea_1.setText(" ");
					textField_3.setText(" ");
					textField_4.setText(" ");
					textField_5.setText("00.0");
					textField_6.setText("00.0");
					
					
				}
				
				
				else if(n==3){
					
					
					try {
						FileInputStream fileIn = new FileInputStream("TxtFile.txt");
						ObjectInputStream ObjectIn = new ObjectInputStream(fileIn);
						
						add_In_List = (List<employeInfo1>)ObjectIn.readObject();
						
						ObjectIn.close();
						fileIn.close();
						
						
						
					} catch (Exception e2) {
						// TODO: handle exception
						System.out.println(e2.getMessage());
					}
					
						
					String name =textField.getText();
					String FatherName =textField_1.getText();
					String MotherName =textField_2.getText();
					
					String nationality = (String)comboBox.getSelectedItem();
					
					String present_Address = textArea.getText();
					
					String parmanent_Address = textArea_1.getText();
					
					String Designation = textField_3.getText();
				
					String JoiningDate = textField_4.getText();
					
					Double yearLink =Double.parseDouble(textField_5.getText()); 
					
					Double monthliSalary =Double.parseDouble(textField_6.getText());
					
					Integer value = Integer.parseInt(textField_7.getText());

					if((!name.equals("")&&!name.equals(" ")) && (!FatherName.equals("")&&!FatherName.equals(" ")) && (!MotherName.equals("")&&!MotherName.equals(" ")) &&(!nationality.equals("")&&!nationality.equals(" ")) && (!present_Address.equals("")&&!present_Address.equals(" ")) && (!parmanent_Address.equals("")&&!parmanent_Address.equals(" ")) && (!Designation.equals("")&&!Designation.equals(" ")) && (!JoiningDate.equals("")&&!JoiningDate.equals(" "))){                                                                                    
						
					
					add_In_List.add(new employeInfo1(name, FatherName, MotherName, Designation,  nationality, Male, Female, present_Address, parmanent_Address, JoiningDate, yearLink, monthliSalary,value,"3rdClassOfficer",user,"admin"));
					p.ADD_Information(user);
					frame.dispose();
					}
					else{
						
						JOptionPane.showMessageDialog(null, "Information Missing");
						 
					}
					//Collections.sort(add_In_List);
					 try {
							FileOutputStream fileOut = new FileOutputStream("TxtFile.txt");
							ObjectOutputStream ObjectOut = new ObjectOutputStream(fileOut);
							
							ObjectOut.writeObject(add_In_List);
							ObjectOut.flush();
							fileOut.close();
							
							
							
						} catch (Exception e2) {
							// TODO: handle exception
							System.out.println(e2.getMessage());
						}

					
					textField.setText(" ");
					textField_1.setText(" ");
					textField_2.setText(" ");
					Male = false;
					Female = false;
					textArea.setText(" ");
					textArea_1.setText(" ");
					textField_3.setText(" ");
					textField_4.setText(" ");
					textField_5.setText("00.0");
					textField_6.setText("00.0");
				
					
				
				}
			}
		});
	
		
		frame.setVisible(true);
	
	}
}

