import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ParameterMetaData;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Creat_An_Account{
	MainProfile profile = new MainProfile();
	Creat_An_Account(){

		JFrame j = new JFrame();
		j.setSize(373,203);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Do you Want to create a new Account\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(56, 11, 422, 26);
		j.getContentPane().add(lblNewLabel);
		
		JButton btnYes = new JButton("yes");
		btnYes.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnYes.setBounds(69, 82, 89, 23);
		j.getContentPane().add(btnYes);
		btnYes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			General_Account in_Page =new General_Account();
			in_Page.initialize();
				j.dispose();
			}
		});
		
		JButton btnNo = new JButton("no\r\n");
		btnNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNo.setBounds(217, 82, 89, 23);
		j.getContentPane().add(btnNo);
		btnNo.addActionListener(new ActionListener() {
			
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
