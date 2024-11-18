package test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contacts.Contact;
import contacts.ContactManagerClasses;

class TestContactManagers {
	
	
	ContactManagerClasses cmc= new ContactManagerClasses();
	
	@Test
	public void testAddAllValueNull() {
		Contact c= new Contact(null,null,null);
		assertFalse(cmc.addContact(c));
		
	}
	
	@Test
	public void testAddOnlyFnameGiven() {
		Contact c=new Contact("harshi",null,null);
		assertFalse(cmc.addContact(c));
		
	}
	@Test
	public void testAddFnameAndSnameNull() {
		Contact c=new Contact("harshi","V",null);
		assertFalse(cmc.addContact(c));
		
	}
	
	@Test
	public void testAddShortLengthNumber() {
		Contact c=new Contact("harshi","V","12345");
		assertFalse(cmc.addContact(c));
		
	}
	
	@Test
	public void testAddCorrectNumberLength() {
		Contact c=new Contact("harshi","V","1234567891");
		assertTrue(cmc.addContact(c));	
	}
	
	@Test
	public void deleteContactSuccess() {
		Contact c=new Contact("harshi","V","987432654");
		cmc.addContact(c);
		cmc.deleteContact(c);
		assertNull(cmc.viewContact(c));
	}
	
	@Test
	public void deleteContactNotExisiting() {
		Contact c=new Contact("abc","d","1234567891");
		assertFalse(cmc.deleteContact(c));
	}
	
	
	
	@Test
	public void updateContactSuccess() {
		Contact c=new Contact("jack","b","9876543212");
		cmc.addContact(c);
		cmc.updateContact(c,"abc","d","7867564534");
		assertEquals("abc",c.fname);
		assertEquals("d",c.sname);
		assertEquals("7867564534",c.contactNumber());
	}
	
	@Test
	public void updateContactFnameNull() {
		Contact c=new Contact("jack","b","9876543212");
		cmc.addContact(c);
		assertFalse(cmc.updateContact(c,null,"d","8967452334"));
	}
	
	@Test
	public void updateContactSnameNull() {
		Contact c=new Contact("jack","b","9876543212");
		cmc.addContact(c);
		assertFalse(cmc.updateContact(c,"abc",null,"8967452334"));
	}
	
	@Test
	public void updateContactNumberNull() {
		Contact c=new Contact("jack","b","9876543212");
		cmc.addContact(c);
		assertFalse(cmc.updateContact(c,"abc","d",null));
	}
	
	@Test
	public void updateContactNumberShortLength() {
		Contact c=new Contact("jack","b","9876543212");
		cmc.addContact(c);
		assertFalse(cmc.updateContact(c,"abc","d","98765"));
	}
	
	@Test
	public void viewContactSuccess() {
		Contact c=new Contact("harshi","V","9874326541");
		cmc.addContact(c);
		assertEquals(c.fname, cmc.viewContact(c).fname);
		assertEquals(c.sname, cmc.viewContact(c).sname);
		assertEquals(c.contactNumber, cmc.viewContact(c).contactNumber);
	}
	
	@Test
	public void viewContactFail() {
		Contact c=new Contact("harshi","V","9874326541");
		assertNull(cmc.viewContact(c));
	}
	
	@Test
	public void viewContactNull() {
		Contact c=null;
		assertNull(cmc.viewContact(c));
	}
	
	

}
