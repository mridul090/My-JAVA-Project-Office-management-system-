import java.io.Serializable;

public class Billclass implements Serializable{
  private String position;
  private int Basic;
  private int HouseBill;
  private int CommunicationBill;
  private int MedicalBill;
  private double Totall;
  private String User;

public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public int getBasic() {
	return Basic;
}
public void setBasic(int basic) {
	Basic = basic;
}
public int getHouseBill() {
	return HouseBill;
}
public void setHouseBill(int houseBill) {
	HouseBill = houseBill;
}
public int getCommunicationBill() {
	return CommunicationBill;
}
public void setCommunicationBill(int communicationBill) {
	CommunicationBill = communicationBill;
}
public int getMedicalBill() {
	return MedicalBill;
}
public void setMedicalBill(int medicalBill) {
	MedicalBill = medicalBill;
}
public double getTotall() {
	return Totall;
}
public void setTotall(double totall) {
	Totall = totall;
}




public String getUser() {
	return User;
}
public void setUser(String user) {
	User = user;
}
public Billclass(String position, int basic, int houseBill, int communicationBill, int medicalBill, double totall,String user) {
	super();
	this.position = position;
	Basic = basic;
	HouseBill = houseBill;
	CommunicationBill = communicationBill;
	MedicalBill = medicalBill;
	Totall = totall;
	User = user;
}
@Override
public String toString() {
	return "Billclass [position=" + position +"\n" +
     " Basic=" + Basic +"\n" +
	" HouseBill=" + HouseBill +"\n" +
     " CommunicationBill="+ CommunicationBill +"\n" + 
	" MedicalBill=" + MedicalBill +"\n" +
     " Totall=" + Totall + "\n" +
	"User=" + User +
     "]";
}
  



  

}
