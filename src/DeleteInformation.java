import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class DeleteInformation implements ActionListener{

	JFrame frame;
	JMenuBar menuBar,menuBar_1;
	JMenu mnNewMenu,mnOpstion, mnSeeprofiles;
	JMenuItem mntmNewMenuItem_1,mntmNewMenuItem_2,mntmNewMenuItem_3;
	JTextPane textPane;
	JMenuItem mntmSearch;
	JMenuItem mntmShow;
	JMenuItem mntmBacktomenue;
	JLabel lblNewLabel_1 ;
	String text="",User,DeleteName;
	int DeleteScrialNo;
	private JTextField textField;
	private JTextField textField_1;
	ArrayList<employeInfo1> add_In_List = new ArrayList<>();
	ArrayList<DeleteInfo> List = new ArrayList<>();
	JButton btnDelete ;
	int flag =0;
	
	
	
	public static void main(String[] args) {
		DeleteInformation deleteInformation = new DeleteInformation();
		deleteInformation.initialize(null);
	
	}
	
	

	public void initialize(String user) {  
		User = user;
    text ="User:"+user +"\n";
    
    frame = new JFrame("Delete Information");
    frame.getContentPane().setBackground(new Color(70, 130, 180));
	frame.setSize(574, 351);
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	menuBar = new JMenuBar();
	menuBar.setBackground(new Color(192, 192, 192));
	frame.setJMenuBar(menuBar);
	
	mnNewMenu = new JMenu("File");
	menuBar.add(mnNewMenu);
	
	
	mntmSearch = new JMenuItem("SeeList");
	mnNewMenu.add(mntmSearch);
	mntmSearch.addActionListener(this);
	
	mntmShow = new JMenuItem("show");
	mnNewMenu.add(mntmShow);
	mntmShow.addActionListener(this);
	
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
	panel.setBounds(0, 0, 148, 377);
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	panel.setBackground(Color.GRAY);
	
	textPane= new JTextPane();
	textPane.setBackground(new Color(119, 136, 153));
	textPane.setForeground(new Color(0, 0, 0));
	textPane.setFont(new Font("SimSun-ExtB", Font.BOLD, 15));
	textPane.setBounds(0, 0, 148, 291);
	panel.add(textPane);
	
	JLabel lblNewLabel = new JLabel("Name\r\n");
	lblNewLabel.setForeground(new Color(211, 211, 211));
	lblNewLabel.setBackground(new Color(240, 255, 240));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	lblNewLabel.setBounds(232, 38, 95, 20);
	frame.getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(351, 38, 171, 20);
	frame.getContentPane().add(textField);
	textField.setColumns(10);

	JLabel lblSecrialno = new JLabel("SecrialNo\r\n\r\n");
	lblSecrialno.setForeground(new Color(211, 211, 211));
	lblSecrialno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	lblSecrialno.setBackground(new Color(240, 255, 240));
	lblSecrialno.setBounds(220, 98, 107, 20);
	frame.getContentPane().add(lblSecrialno);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(351, 100, 171, 20);
	frame.getContentPane().add(textField_1);

	btnDelete = new JButton("Delete");
	btnDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
	btnDelete.setForeground(new Color(210, 105, 30));
	btnDelete.setBackground(new Color(144, 238, 144));
	btnDelete.setBounds(459, 4, 89, 23);
	frame.getContentPane().add(btnDelete);
	btnDelete.addActionListener(this);
	
	


	
	panel.setVisible(true);
	frame.setVisible(true);
		}
	
	
	public void Search(){

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
		
		for(employeInfo1 e1:add_In_List){
			String string = "";
		
			if(e1.getUser().equals(User)){
				string =e1.getName() + " "+e1.getSecrialNo()+"\n";
				add(string);
				
			}
			
			
			
		}

		
		
		
	}
	
	public void add(String s){
		text +=s;
		System.out.println(text);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object r = e.getSource();
		if(r ==mntmSearch){
			Search();
		}
		else if(r == mntmShow){
			textPane.setText(text);
		}
		else if(r == btnDelete){
			
			try {
				FileInputStream fileIn = new FileInputStream("TxtFile.txt");
				ObjectInputStream ObjectIn = new ObjectInputStream(fileIn);
				FileInputStream fileIn1 = new FileInputStream("Delete.txt");
				ObjectInputStream ObjectIn1 = new ObjectInputStream(fileIn1);
				
				add_In_List = (ArrayList<employeInfo1>)ObjectIn.readObject();
				List = (ArrayList<DeleteInfo>)ObjectIn.readObject();
				
				ObjectIn.close();
				fileIn.close();
				ObjectIn1.close();
				fileIn1.close();
				
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
			
			for(employeInfo1 em:add_In_List){
				DeleteName = textField.getText();
				DeleteScrialNo = Integer.parseInt(textField_1.getText());
				if(em.getName().equals(DeleteName) && em.getSecrialNo().equals(DeleteScrialNo) && em.getUser().equals(User)){
					//add_In_List.
					List.add(new DeleteInfo(User, DeleteName, DeleteScrialNo));
					flag = 1;
					JOptionPane.showMessageDialog(null, "Success");
				}
					
			}
			if(flag == 0){
				JOptionPane.showMessageDialog(null, "Faill to delete");
			}
			
		    try {
					FileOutputStream fileOut = new FileOutputStream("TxtFile.txt");
					ObjectOutputStream ObjectOut = new ObjectOutputStream(fileOut);
				
					FileOutputStream fileOut1 = new FileOutputStream("Delete.txt");
					ObjectOutputStream ObjectOut1 = new ObjectOutputStream(fileOut1);
					
					ObjectOut.writeObject(add_In_List);
					ObjectOut1.writeObject(List);
					
					ObjectOut.flush();
					fileOut.close();
					ObjectOut1.flush();
					fileOut1.close();
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					System.out.println(e2.getMessage());
				}
			
			
		}
	
	}//End of AcctionPerformod
}
