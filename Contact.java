package contacts;

public class Contact {
	public String fname;
	public String sname;
	public String contactNumber;
	
	
	public Contact(String fname, String sname, String contactNumber){
		this.fname=fname;
		this.sname=sname;
		this.contactNumber=contactNumber;
	}
	
	public String getfname() {
		return fname;
	}
	public String getsname() {
		return sname;
	}
	public String contactNumber() {
		return contactNumber;
	}
	
	public void setFname(String fname) {
		this.fname= fname;
	}
	public void setSname(String sname) {
		this.sname= sname;
	}
	public void setNumber(String contactNumber) {
		this.contactNumber= contactNumber;
	}
}
