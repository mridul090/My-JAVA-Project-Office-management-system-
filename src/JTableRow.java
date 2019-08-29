import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class JTableRow{
	JFrame frame ;
	JTable table;
	String Data = ""; 
	ListSelectionModel select;
	int Basic,HouseRant,CommunicationBill,MedicalBill;
	double TotallBill;
	String Position;
	 JFrame frame1;
	 JButton btnNewButton;
	 JTextField textFieldofShow;
	 
	 JTextField textPosition;
	 JTextField textBasic;
     JTextField textHouseRant;
     JTextField textCommunicationBill;
     JTextField textMedicalBill;
	 ArrayList< Billclass>billclass = new ArrayList<>();
	 int n =0;
	   
	 DefaultTableModel model;
	 String User;
	 

	 public static void main(String[] args){
		 
		 JTableRow tableRow = new JTableRow();
		 tableRow.BillMake(null);
    
        }
        
	 
	 public void BillMake(String user) {
        // create JFrame and JTable
		 User = user;
		 
        frame = new JFrame("Bill_Make");
        table = new JTable(); 
        
        // create a table model and set a Column Identifiers to this model 
        Object[] columns = {"Position","Basic","HouseRant","Communication","MedicalBill","Totall"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        // set the model to the table
        table.setModel(model);
        
        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("",1,22);
        table.setFont(font);
        table.setRowHeight(30);
        
        // create JTextFields
        textPosition = new JTextField();
        textBasic = new JTextField();
        textHouseRant = new JTextField();
        textCommunicationBill = new JTextField();
        textMedicalBill = new JTextField();
        
        // create JButtons
        JButton btnAdd = new JButton("Add");
       // JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");
        
        textPosition.setBounds(20, 220, 100, 25);
        textBasic.setBounds(20, 250, 100, 25);
        textHouseRant.setBounds(20, 280, 100, 25);
        textCommunicationBill.setBounds(20, 310, 100, 25);
        textMedicalBill.setBounds(20, 340, 100, 25);
        
        btnAdd.setBounds(150, 220, 100, 25);
        btnUpdate.setBounds(150, 265, 100, 25);
      //  btnDelete.setBounds(150, 310, 100, 25);
        
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 880, 200);
        
        frame.setLayout(null);
        
        frame.add(pane);
        
        // add JTextFields to the jframe
        frame.add(textPosition);
        frame.add(textBasic);
        frame.add(textHouseRant);
        frame.add(textCommunicationBill);
        frame.add(textMedicalBill);
    
        // add JButtons to the jframe
        frame.add(btnAdd);
       // frame.add(btnDelete);
        frame.add(btnUpdate);
        
        // create an array of objects to set therow data
        Object[] row = new Object[6];
        
        // button add row
        btnAdd.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            	if(n!=3){
            	row[0] = textPosition.getText();
                row[1] = textBasic.getText();
                row[2] = textHouseRant.getText();
                row[3] = textCommunicationBill.getText();
                row[4] = textMedicalBill.getText();
                Basic = Integer.parseInt(textBasic.getText());
                HouseRant = Integer.parseInt(textHouseRant.getText());
                CommunicationBill = Integer.parseInt(textCommunicationBill.getText());
                MedicalBill = Integer.parseInt(textMedicalBill.getText());
                TotallBill = Calculate_Value_of_TotallBill(Basic);
                row[5] = TotallBill;
                // add row to the model
                model.addRow(row);
                
                textPosition.setText("");
                textBasic.setText("");
                textHouseRant.setText("");
                textCommunicationBill.setText("");
                textMedicalBill.setText("");
                n++;
            	}
            	else{
            		JOptionPane.showMessageDialog(null, "Error"+"\n"+"You can make 3 bills");	
            	}
            }
        });
        
    
        
        // get selected row data From table to textfields 
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
        	 int i = table.getSelectedRow();
        	
                     
            textPosition.setText(model.getValueAt(i, 0).toString());
            textBasic.setText(model.getValueAt(i, 1).toString());
            textHouseRant.setText(model.getValueAt(i, 2).toString());
            textCommunicationBill.setText(model.getValueAt(i, 3).toString());
            textMedicalBill.setText(model.getValueAt(i, 4).toString()); 
           
    
		 Position =textPosition.getText();
         Basic = Integer.parseInt(textBasic.getText());
         HouseRant = Integer.parseInt(textHouseRant.getText());
         CommunicationBill = Integer.parseInt(textCommunicationBill.getText());
         MedicalBill = Integer.parseInt(textMedicalBill.getText());
         TotallBill = Double.parseDouble(model.getValueAt(i, 5).toString());
       
       
     
		 
        }
        });
        
        // button update row
        btnUpdate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                // i = the index of the selected row
                int i = table.getSelectedRow();
                
                if(i >= 0) 
                {
                   model.setValueAt(textPosition.getText(), i, 0);
                   model.setValueAt(textBasic.getText(), i, 1);
                   model.setValueAt(textHouseRant.getText(), i, 2);
                   model.setValueAt(textCommunicationBill.getText(), i, 3);
                   model.setValueAt(textMedicalBill.getText(), i, 4);
                   Basic = Integer.parseInt(textBasic.getText());
                   HouseRant = Integer.parseInt(textHouseRant.getText());
                   CommunicationBill = Integer.parseInt(textCommunicationBill.getText());
                   MedicalBill = Integer.parseInt(textMedicalBill.getText());
                   TotallBill = Calculate_Value_of_TotallBill(Basic);
                   model.setValueAt(TotallBill, i, 5);
                }
                else{
                    System.out.println("Update Error");
                }
            }
        });
       
        JButton btnOk = new JButton("GetValue");
		btnOk.setBounds(594, 327, 89, 23);
		frame.getContentPane().add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String bill = ""+TotallBill;
				if( (!textPosition.getText().equals("")&&!textPosition.getText().equals(" "))  &&  (!textBasic.getText().equals("")&&!textBasic.getText().equals("")) &&  (!textHouseRant.getText().equals("")&&!textHouseRant.getText().equals("")) && (!textCommunicationBill.getText().equals("")&&!textCommunicationBill.getText().equals("")) && (!textMedicalBill.getText().equals("")&&!textMedicalBill.getText().equals("")) && (!bill.equals("")&&!bill.equals(" ")) ){                                                                                                             
				SelectedRow();
				JOptionPane.showMessageDialog(null, "Success");
				textPosition.setText("");
				textBasic.setText("");
				textHouseRant.setText("");
				textCommunicationBill.setText("");
				textMedicalBill.setText("");
				}
			else {
				JOptionPane.showMessageDialog(null, "Error!!!!  ");
			}
			}
		});		
        frame.setSize(900,420);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

	 }
       
	 

		
	 public void SelectedRow(){
		// System.out.println(billclass);
		 
		 
         try {
				FileInputStream fileIn = new FileInputStream("Bill.txt");
				ObjectInputStream ObjectIn = new ObjectInputStream(fileIn);
				
				billclass = (ArrayList<Billclass>)ObjectIn.readObject();
				
				ObjectIn.close();
				fileIn.close();
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
         
         
         billclass.add(new Billclass(Position, Basic, HouseRant, CommunicationBill, MedicalBill,TotallBill,User));
         System.out.println(billclass);
          		 try {
 							FileOutputStream fileOut = new FileOutputStream("Bill.txt");
 							ObjectOutputStream ObjectOut = new ObjectOutputStream(fileOut);
 							
 							ObjectOut.writeObject(billclass);
 							ObjectOut.flush();
 							fileOut.close();
 							
 							
 							
 						} catch (Exception e2) {
 							// TODO: handle exception
 							System.out.println(e2.getMessage());
 						}
          
         
        
    


         
		
		}
	
	 
	 public double Calculate_Value_of_TotallBill(int Basic){
		 double a =( Double.parseDouble(textHouseRant.getText())) / 100;
		 double houseaRant =Basic +(Basic * a);
		 double communication_bill = houseaRant + 250;
		 double madical = communication_bill +1500;
		 
		 return madical;
			
		}
	   
}
