package contacts;

public interface ContactManager {
	public boolean addContact(Contact c);
	public boolean deleteContact(Contact c);
	public boolean updateContact(Contact c, String fname, String sname, String number);
	public Contact viewContact(Contact c);
}
