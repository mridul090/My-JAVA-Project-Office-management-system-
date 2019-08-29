import java.io.Serializable;

public class DeleteInfo implements Serializable{
	private String UserName;
	private String name;
	private int secrialNo;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String position) {
		UserName = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSecrialNo() {
		return secrialNo;
	}
	public void setSecrialNo(int secrialNo) {
		this.secrialNo = secrialNo;
	}
	public DeleteInfo(String userName, String name, int deleteScrialNo) {
		super();
		UserName = userName;
		this.name = name;
		this.secrialNo = deleteScrialNo;
	}
	@Override
	public String toString() {
		return "DeleteInfo [UserName=" + UserName+"\n"+
	    " name=" + name+"\n"+
		" secrialNo=" + secrialNo + "]";
	}
	
	

}
