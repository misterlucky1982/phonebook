package by.phonebook.proxilayer;

import java.util.List;

public interface INote {
	
	String getName();
	List<IContact>getContacts();
	boolean addContact(IContact contact);
	boolean removeContact(IContact contact);

}
