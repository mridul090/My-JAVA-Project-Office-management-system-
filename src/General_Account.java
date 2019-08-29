import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.FormatFlagsConversionMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class General_Account {

	private JButton btnDone,btnQuite;
	private	JTextField T1 ,T2,T3,T4,T5;
	private JFrame j;
	String pass ="";
	int flag =0;

	
	public static void main(String[] args) {
		General_Account  p = new General_Account();
		p.initialize();
	}

	
	public void initialize() {
			 j = new JFrame("General User Account");  
				j.setSize(442,264);
				j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				j.getContentPane().setLayout(null);

				JPanel L = new JPanel();
				L.setLocation(0, 0);
				L.setLayout(null);
				L.setBackground(Color.white);
				L.setSize(431,209);
				
				JMenuBar mbar = new JMenuBar();
				j.setJMenuBar(mbar);

				JMenu file = new JMenu("New");
//				JMenuItem I = new JMenuItem("Creat");
				JMenuItem I1 = new JMenuItem("AdminAccount");
				JMenuItem I2 = new JMenuItem("ReNew");
//				file.add(I);
				file.add(I1);
				file.add(I2);
				mbar.add(file);
				I1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						 Admin_logeIn_page admin_logeIn_page = new  Admin_logeIn_page();
						 admin_logeIn_page.initialize();
						 j.dispose();
					}
				});
				
				
				JLabel P1 = new JLabel("Name:"); 
				P1.setFont(new Font("Baskerville Old Face",Font.BOLD,20));
				P1.setBounds(20,27,99,25);
				L.add(P1);
				
				T1 = new JTextField();
				T1.setBounds(199,28,150,25);
				L.add(T1);
				
				
			   
				JLabel P4 = new JLabel("Set New PassWord:"); 
				P4.setFont(new Font("Baskerville Old Face",Font.BOLD,18));
				P4.setBounds(10,88,160,25);
				L.add(P4);
				
				T4 = new JTextField(10);
				T4.setBounds(199,89,150,25);
				L.add(T4);

				L.setVisible(true);
				j.getContentPane().add(L);
				
			    btnDone = new JButton("Done");
				btnDone.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				btnDone.setBackground(Color.LIGHT_GRAY);
				btnDone.setBounds(44, 151, 89, 23);
				btnDone.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						String Name = T1.getText().trim();
						String Password = T4.getText().trim();
						//System.out.println(Password+"\n"+Name);
						String[] aStrings = Password.split("");
						for(int i =0;i<aStrings.length;i++){
							int a = Integer.parseInt(aStrings[i]);
							int b = a+1;
							pass += b;
							
						}
						if(((!Name.equals(""))&&(!Name.equals(" "))) && (!Password.equals(""))&&(!Password.equals(" ")))
						{
						try {
						FileWriter W= new FileWriter("ID.txt",true);
						BufferedWriter bWriter = new BufferedWriter(W);
						PrintWriter printWriter = new PrintWriter(bWriter);
						
						
						FileWriter W1= new FileWriter("Password.txt",true);
						BufferedWriter bWriter1 = new BufferedWriter(W1);
						PrintWriter printWriter1 = new PrintWriter(bWriter1);
						
						
						printWriter.println(Name);
						printWriter1.println(pass);
						
						bWriter.flush();
						bWriter1.flush();
						
						W.close();
						W1.close();
						new	General_LogIn();
						j.dispose();
						Name="";
						Password="";
//						
//						FileReader R= new FileReader("ID.txt"); 
//						FileReader R1= new FileReader("Password.txt");
//						BufferedReader bReader = new BufferedReader(R);
//						BufferedReader bReader1 = new BufferedReader(R1);
//						
//						String string = bReader.readLine();
//						String string2 = bReader1.readLine();
//						
//						
//						
//						if(string == null && string2 == null){
//							
//						}
//						
//						while (string != null && string2!=null){
//							if( Name.equals(string) ){
//								flag = 1 ;
//							}
//						
//						}
//						if(flag == 1){
//							JOptionPane.showMessageDialog(null, "Error!!"+"/n"+"same name of account is exit");
//
//						}
//						else if(flag == 0){
//							
//						}
					
					} catch (IOException e1) {
						System.out.println("The file location is not found");
						e1.printStackTrace();
					}
					}
				else {
					JOptionPane.showMessageDialog(null, "Error");
				}
					}
			});
				L.add(btnDone);
				
				btnQuite = new JButton("Quite\r\n");
				btnQuite.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
				btnQuite.setBackground(Color.LIGHT_GRAY);
				btnQuite.setBounds(199, 151, 89, 23);
				btnQuite.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						j.dispose();
						new	General_LogIn();
					}
				});
				L.add(btnQuite);
				
				j.setVisible(true);
		

	}

}

