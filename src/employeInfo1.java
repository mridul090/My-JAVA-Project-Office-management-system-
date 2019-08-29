import java.util.stream.Stream;
import java.io.Serializable;


public class employeInfo1 implements Comparable<employeInfo1>,Serializable{
	private String Name;
	private String Father_Name;
	private String Mother_Name;
	private String Designation;
	private String Nationality;
	private Boolean Male;
	private Boolean Female;
	private String Present_Address;
	private String Parmanent_Address;
	private String JoiningDate;
	private Double YearLink;
	private Double MonthliSalary;
	private Integer SecrialNo;
	private String Position;
	private String user;
	private String Admin ;
	
	
	
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getAdmin() {
		return Admin;
	}

	public void setAdmin(String admin) {
		Admin = admin;
	}

	public Boolean getMale() {
		return Male;
	}

	public void setMale(Boolean male) {
		Male = male;
	}

	public Boolean getFemale() {
		return Female;
	}

	public void setFemale(Boolean female) {
		Female = female;
	}

	public String getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		JoiningDate = joiningDate;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public Integer getSecrialNo() {
		return SecrialNo;
	}

	public void setSecrialNo(Integer secrialNo) {
		SecrialNo = secrialNo;
	}

	public Double getYearLink() {
		return YearLink;
	}

	public void setYearLink(Double yearLink) {
		YearLink = yearLink;
	}

	public Double getMonthliSalary() {
		return MonthliSalary;
	}

	public void setMonthliSalary(Double monthliSalary) {
		MonthliSalary = monthliSalary;
	}
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getFather_Name() {
		return Father_Name;
	}


	public void setFather_Name(String father_Name) {
		Father_Name = father_Name;
	}


	public String getMother_Name() {
		return Mother_Name;
	}


	public void setMother_Name(String mother_Name) {
		Mother_Name = mother_Name;
	}


	public String getDesignation() {
		return Designation;
	}


	public void setDesignation(String designation) {
		Designation = designation;
	}


	public String getNationality() {
		return Nationality;
	}


	public void setNationality(String nationality) {
		Nationality = nationality;
	}


	public Boolean getMaride() {
		return Male;
	}


	public void setMaride(Boolean maride) {
		Male = maride;
	}


	public Boolean getSingle() {
		return Female;
	}


	public void setSingle(Boolean single) {
		Female = single;
	}


	public String getPresent_Address() {
		return Present_Address;
	}


	public void setPresent_Address(String present_Address) {
		Present_Address = present_Address;
	}


	public String getParmanent_Address() {
		return Parmanent_Address;
	}


	public void setParmanent_Address(String parmanent_Address) {
		Parmanent_Address = parmanent_Address;
	}


//	public String getDate_of_Birth() {
//		return Date_of_Birth;
//	}
//
//
//	public void setDate_of_Birth(String date_of_Birth) {
//		Date_of_Birth = date_of_Birth;
//	}

	







	
	public int salary() {
		// TODO Auto-generated method stub
		return 0;
		
	}

	public employeInfo1(String name, String father_Name, String mother_Name, String designation, String nationality,
			Boolean male, Boolean female, String present_Address, String parmanent_Address, String joiningDate,
			Double yearLink, Double monthliSalary, Integer secrialNo, String position, String user, String admin) {
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
		this.user = user;
		Admin = admin;
	}

	

	@Override
	public String toString() {
		return "employeInfo1 [Name=" + Name + ", Father_Name=" + Father_Name + ", Mother_Name=" + Mother_Name
				+"\n" +", Designation=" + Designation + ", Nationality=" + Nationality +"\n" + ", Male=" + Male + ", Female="
				+"\n" + Female + ", Present_Address=" + Present_Address + "\n" +", Parmanent_Address=" + Parmanent_Address
				+"\n" + ", JoiningDate=" + JoiningDate + ", YearLink=" + YearLink + ", MonthliSalary=" + MonthliSalary
				+"\n" + ", SecrialNo=" + SecrialNo + "\n" +", Position=" + Position + ", user=" + user + ", Admin=" + Admin + "]";
	}

	@Override
	public int compareTo(employeInfo1 o) {
		// TODO Auto-generated method stub
		return  this.getSecrialNo().compareTo(o.getSecrialNo());
	}


}
