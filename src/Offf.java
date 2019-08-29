import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Offf {
	String pass = "";
	String PassWord;
	ArrayList<employeInfo1> add_In_List = new ArrayList<>();
	public Offf(String user) {
		// TODO Auto-generated constructor stub
	  JFrame j = new JFrame("Delete Information");
		j.setSize(560,306);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.getContentPane().setLayout(null);
		
		JLabel p2= new JLabel("AdminPassword:");
		p2.setBounds(29,26,200,39);
		p2.setFont(new Font("Tahoma", Font.BOLD, 20));		
		j.getContentPane().add(p2);
		
	    JPasswordField pasw = new JPasswordField(30); 
	    pasw.setBounds(233,34,200,30);	    
	    j.getContentPane().add(pasw);
	    
	    JButton btnOk = new JButton("Ok");
	    btnOk.setBounds(152, 108, 89, 23);
	    j.getContentPane().add(btnOk);
	    btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
	    		MainProfile profile = new MainProfile();
	    		
	    		
	    		try {
					
					FileReader R1= new FileReader("AdminPassword.txt");
				
					BufferedReader bReader1 = new BufferedReader(R1);
					
					String pass1 = bReader1.readLine();
					String[] aStrings = pass1.split("");
					for(int i=0;i<aStrings.length;i++){
						int a = Integer.parseInt(aStrings[i]);
						int b = a-1;
						pass += b;
					}
					
					
					
					PassWord = pasw.getText().trim();
					if(PassWord !=null){
						if( PassWord.equals(pass)){

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
							add_In_List.removeAll(add_In_List);
							
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
						
							   JOptionPane.showMessageDialog(null, "Successfull");
						    j.dispose();
						   
						
				     	}
						else{
							JOptionPane.showMessageDialog(null, "PssWord Error!!");
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "Give PssWord");
					}
					
					
					System.out.println(pass);
					System.out.println(PassWord);
	    		}
	    		catch (IOException e1) {
					System.out.println("The file location is not found");
					e1.printStackTrace();
	    		}
	    	}
		});
	    
	    JButton btnExit = new JButton("Exit\r\n");
	    btnExit.setBounds(292, 108, 89, 23);
	    j.getContentPane().add(btnExit);
	    btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				j.dispose();
			}
		});
	    
	    
	    j.setVisible(true);
	}
	

}
