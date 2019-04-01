package by.phonebook.proxilayer;

import java.util.List;

public interface IView {
	void showNotes(List<INote>notes);
	void showContacts(List<IContact>contacts);
	void showInfo(INote note);
	void showInfo(IContact contact);
}
