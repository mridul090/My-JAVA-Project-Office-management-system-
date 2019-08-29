import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Admin_Account {

	private JFrame j;
	private String pass = "";
	private String name;
	private String Id;
	private String PassWord;
	int n = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Admin_Account admin_LogeIn = new Admin_Account();
		admin_LogeIn.initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public int initialize() {
		j = new JFrame("Admin Account");
		j.setSize(560, 306);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.getContentPane().setLayout(null);
		JLabel p1 = new JLabel("AdminName:");
		p1.setBounds(43, 41, 136, 30);
		p1.setFont(new Font("Tahoma", Font.BOLD, 20));
		j.getContentPane().add(p1);

		JTextField t1 = new JTextField(30);
		t1.setBounds(233, 45, 200, 30);
		j.getContentPane().add(t1);

		JLabel p2 = new JLabel("AdminPassword:");
		p2.setBounds(43, 106, 200, 39);
		p2.setFont(new Font("Tahoma", Font.BOLD, 20));
		j.getContentPane().add(p2);

		JPasswordField pasw = new JPasswordField(30);
		pasw.setBounds(233, 114, 200, 30);
		j.getContentPane().add(pasw);

		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(233, 200, 89, 23);
		j.getContentPane().add(btnOk);
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainProfile profile = new MainProfile();

				try {
					FileReader R = new FileReader("AdminID.txt");
					FileReader R1 = new FileReader("AdminPassword.txt");
					BufferedReader bReader = new BufferedReader(R);
					BufferedReader bReader1 = new BufferedReader(R1);
					name = bReader.readLine();
					String pass1 = bReader1.readLine();
					
					String[] aStrings = pass1.split("");
					for (int i = 0; i < aStrings.length; i++) {
						int a = Integer.parseInt(aStrings[i]);
						int b = a - 1;
						pass += b;
					}

					Id = t1.getText().trim();
					PassWord = pasw.getText().trim();
					if (Id != null && PassWord != null) {
						if (Id.equals(name) && PassWord.equals(pass)) {
							n =1;
							MainProfile profile2 = new MainProfile();
							profile2.showingMainProfile("admin");
							profile.ADD_Information("admin");
							//new Search(name,"admin");
							j.dispose();

						} else {
							JOptionPane.showMessageDialog(null, "Error!!" + "\n" + "LogeIn Fail");
						}
					}

					System.out.println(name);
					System.out.println(pass);
					System.out.println(PassWord);
				} catch (IOException e1) {
					System.out.println("The file location is not found");
					e1.printStackTrace();
				}
			}
		});

		JButton btnExit = new JButton("Exit\r\n");
		btnExit.setBounds(344, 200, 89, 23);
		j.getContentPane().add(btnExit);
		
		JLabel lblAdminLogin = new JLabel("Admin LogIn\r\n");
		lblAdminLogin.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblAdminLogin.setBounds(133, 0, 222, 30);
		j.getContentPane().add(lblAdminLogin);
		btnExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				j.dispose();
			}
		});

		j.setVisible(true);
		return n;
	}

}
