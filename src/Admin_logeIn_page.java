import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.tools.ForwardingJavaFileManager;

public class Admin_logeIn_page {

	private JFrame j;
	private JTextField textField;
	private String pass="";

	public static void main(String[] args) {
		Admin_logeIn_page admin_logeIn_page = new Admin_logeIn_page ();
		admin_logeIn_page.initialize();
	}
    public void initialize() {

		j = new JFrame("Admin login");
		j.setSize(467,296);
		j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		j.getContentPane().setLayout(null);
		JLabel p1= new JLabel("Name:");
		p1.setBounds(56,104,100,30);
		p1.setFont(new Font("Tahoma", Font.BOLD, 20));		
		j.getContentPane().add(p1);
		
		JTextField t1= new JTextField(30);
		t1.setBounds(185,93,200,30);
		j.getContentPane().add(t1);
		
		JLabel p2= new JLabel("Password:");
		p2.setBounds(39,154,117,39);
		p2.setFont(new Font("Tahoma", Font.BOLD, 20));		
		j.getContentPane().add(p2);
		
		 textField = new JTextField(30);
		 textField.setBounds(185, 154, 200, 30);
		 j.getContentPane().add(textField);
	    
	    JLabel lblNewLabel = new JLabel("Admin Account");
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
	    lblNewLabel.setBounds(56, 25, 298, 30);
	    j.getContentPane().add(lblNewLabel);
	    
	    JButton btnOk = new JButton("Ok");
	    btnOk.setBounds(195, 203, 89, 23);
	    j.getContentPane().add(btnOk);
	    btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String Name = t1.getText().trim();
				String Password = textField.getText().trim();
				//System.out.println(Password+"\n"+Name);
				
				String[] aStrings = Password.split("");
				if ((!Name.equals("")&&!Name.equals(" ")) && (!Password.equals("")&&(!Password.equals(" ")))){
				for(int i =0;i<aStrings.length;i++){
					int a = Integer.parseInt(aStrings[i]);
					int b = a+1;
					pass += b;	
				}
				try {
					FileWriter W= new FileWriter("AdminID.txt");
					BufferedWriter bWriter = new BufferedWriter(W);
					PrintWriter printWriter = new PrintWriter(bWriter);
					printWriter.println(Name);
					
					FileWriter W1= new FileWriter("AdminPassword.txt");
					BufferedWriter bWriter1 = new BufferedWriter(W1);
					PrintWriter printWriter1 = new PrintWriter(bWriter1);
					printWriter1.println(pass);
				
					
					bWriter.flush();
					bWriter1.flush();
				
					W.close();
					W1.close();
					new	General_LogIn();
					j.dispose();
				} catch (IOException e1) {
					System.out.println("The file location is not found");
					e1.printStackTrace();
				}
				}
				else if(Name.equals("") || Name.equals(" ")){
					JOptionPane.showMessageDialog(null, "Please Enter Admin Name");
				}
				else if(Password.equals("") || Password.equals(" ")){
					JOptionPane.showMessageDialog(null, "Please Enter Admin Password");
				}
				else{
					JOptionPane.showMessageDialog(null, "Information missing");
				}
			

				
			}
		
		});
	    
	    JButton btnCancle = new JButton("Cancle");
	    btnCancle.setBounds(296, 203, 89, 23);
	    j.getContentPane().add(btnCancle);
	    btnCancle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new General_LogIn();
				j.dispose();
				
			}
		});
	    
	   
	    
	    j.setVisible(true);		
	
	}
}
