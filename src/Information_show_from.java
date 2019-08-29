import java.awt.EventQueue;
import java.awt.Font;
import java.time.Period;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Information_show_from {
	
	private String Name;
	private String Father_Name;
	private String Mother_Name;
	private String Designation;
	private String Nationality;
	private Boolean Male = false;
	private Boolean Female = false;
	private String Present_Address;
	private String Parmanent_Address;
	private String JoiningDate;
	private Double YearLink;
	private Double MonthliSalary;
	private Integer SecrialNo;
	private String Position;
	private String Catagory;
	
	

	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtGender;
	private JTextField txtNationality;
//	private Boolean Male1=false,Female1=false;
	private JTextArea textArea;
	private JTextArea textArea_1;
	
	

	 


	
	public Information_show_from(String name, String father_Name, String mother_Name, String designation,
			String nationality, Boolean male, Boolean female, String present_Address, String parmanent_Address,
			String joiningDate, Double yearLink, Double monthliSalary, Integer secrialNo, String position,String catagory) {
		super();
		Name = name;
		Father_Name = father_Name;
		Mother_Name = mother_Name;
		Designation = designation;
		Nationality = nationality;
		Male = male;
		Female = female;
		Present_Address = present_Address;
		Parmanent_Address = parmanent_Address;
		JoiningDate = joiningDate;
		YearLink = yearLink;
		MonthliSalary = monthliSalary;
		SecrialNo = secrialNo;
		Position = position;
		Catagory = catagory;
	}
	
	public void show(){

		frame = new JFrame(Catagory);
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
		textField.setText(Name);
		
		JLabel lblFathername = new JLabel("FatherName:");
		lblFathername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFathername.setBounds(24, 92, 113, 28);
		frame.getContentPane().add(lblFathername);
		
		
		 textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(154, 90, 167, 28);
		frame.getContentPane().add(textField_1);
		textField_1.setText(Father_Name);
		
		JLabel lblMothername = new JLabel("MotherName:");
		lblMothername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMothername.setBounds(24, 157, 113, 28);
		frame.getContentPane().add(lblMothername);
		
		 textField_2 = new JTextField();
		 textField_2.setColumns(10);
		textField_2.setBounds(154, 157, 167, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setText(Mother_Name);
		
		JLabel lblNationality = new JLabel("Nationality:");
		lblNationality.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNationality.setBounds(24, 222, 113, 28);
		frame.getContentPane().add(lblNationality);
		
		
		txtNationality = new JTextField();
		txtNationality.setText("Nationality");
		txtNationality.setColumns(10);
		txtNationality.setBounds(154, 228, 181, 20);
		frame.getContentPane().add(txtNationality);
		txtNationality.setText(Nationality);
		
		JLabel lblSelecetgender = new JLabel("\r\ngender");
		lblSelecetgender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSelecetgender.setBounds(24, 279, 84, 28);
		frame.getContentPane().add(lblSelecetgender);

		txtGender = new JTextField();
		txtGender.setText("gender\r\n");
		txtGender.setBounds(154, 285, 181, 20);
		frame.getContentPane().add(txtGender);
		txtGender.setColumns(10);
		

		if(Male){
			txtGender.setText("male");
		}
		else if(Female){
			txtGender.setText("male");
		}
		
		JLabel lblPresentadress = new JLabel("PresentAdress:\r\n");
		lblPresentadress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPresentadress.setBounds(24, 382, 212, 28);
		frame.getContentPane().add(lblPresentadress);
		
		textArea = new JTextArea();
		textArea.setBounds(34, 421, 301, 102);
		frame.getContentPane().add(textArea);
		textArea.setText(Present_Address);
		
		JLabel lblPermanentadress = new JLabel("PermanentAdress:\r\n");
		lblPermanentadress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPermanentadress.setBounds(387, 367, 212, 28);
		frame.getContentPane().add(lblPermanentadress);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(387, 421, 301, 102);
		frame.getContentPane().add(textArea_1);
		textArea_1.setText(Parmanent_Address);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDesignation.setBounds(460, 25, 128, 28);
		frame.getContentPane().add(lblDesignation);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(611, 30, 167, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setText(Designation);
		
		JLabel lblJoiningdate = new JLabel("JoiningDate:");
		lblJoiningdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJoiningdate.setBounds(460, 92, 128, 28);
		frame.getContentPane().add(lblJoiningdate);
		
		 textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(611, 95, 167, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setText(JoiningDate);
		
		JLabel lblYearlink = new JLabel("YearLink\r\n");
		lblYearlink.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYearlink.setBounds(471, 161, 128, 28);
		frame.getContentPane().add(lblYearlink);
		
		textField_5 = new JTextField("00.0");
		textField_5.setColumns(10);
		textField_5.setBounds(611, 160, 167, 26);
		frame.getContentPane().add(textField_5);
		String y =YearLink+"";
		textField_5.setText(y);
		
		JLabel lblMonthlysalary = new JLabel("MonthlySalary");
		lblMonthlysalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMonthlysalary.setBounds(460, 222, 128, 28);
		frame.getContentPane().add(lblMonthlysalary);
		
		 textField_6 = new JTextField("00.0");
		textField_6.setColumns(10);
		textField_6.setBounds(611, 225, 167, 26);
		frame.getContentPane().add(textField_6);
		String mString = MonthliSalary+"";
		textField_6.setText(mString);
		
		JLabel lblSecrialno = new JLabel("SecrialNo.\r\n");
		lblSecrialno.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSecrialno.setBounds(460, 288, 128, 28);
		frame.getContentPane().add(lblSecrialno);
		
		textField_7 = new JTextField("0");
		textField_7.setColumns(10);
		textField_7.setBounds(611, 285, 167, 26);
		frame.getContentPane().add(textField_7);
		String string = SecrialNo+"";
		textField_7.setText(string);
		
		

		frame.setVisible(true);
	}

	

}
