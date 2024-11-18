package contacts;

import java.util.*;

public class ContactManagerClasses implements ContactManager{

	private Map<String,Contact> contact= new HashMap<>();
	
	public boolean addContact(Contact c) {
		if(c.fname==null || c.sname==null || c.contactNumber==null || !(c.contactNumber.length()==10)) {
			return false;
		}
		else {
			contact.put(c.contactNumber, c);
			return true;
		}
		
	}
	
	public boolean deleteContact(Contact c) {
		
		if(!contact.containsKey(c.contactNumber)) {
			return false;	
		}
		
		contact.remove(c.contactNumber);
		return true;
		
	}
	
	public boolean updateContact(Contact c, String fname, String sname, String number) {
		
		if(fname==null || sname==null || number==null || !(number.length()==10))
			return false;
		
		c.setFname(fname);
		c.setSname(sname);
		c.setNumber(number);
		return true; 
		
	}
	
	public Contact viewContact(Contact c) {
		
		if(c==null) return c;
		
		return contact.get(c.contactNumber);
	}

}
