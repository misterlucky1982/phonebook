package by.phonebook.proxilayer;

import java.util.List;

public interface IContactBook {
	List<INote>getFullNoteList();
	List<IContact>getFullContactList();
	boolean addNote(INote note);
	boolean removeNote(INote note);
	boolean addContact(IContact contact);
	boolean removeContact(IContact contact);
	List<INote> getNoteListForName(String namePattern);
	INote getForName(String name);
	INote getForContact(IContact contact);
	
}
