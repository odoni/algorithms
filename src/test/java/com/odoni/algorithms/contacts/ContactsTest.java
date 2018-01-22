package com.odoni.algorithms.contacts;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ContactsTest {

	private static  Contacts contacts = new Contacts();

	@BeforeClass
	public static void setUp() {
		contacts.insertContact("Anna");
		contacts.insertContact("Bob");
		contacts.insertContact("Carl");
		contacts.insertContact("Daniel");
		contacts.insertContact("Elle");
		contacts.insertContact("Felipe");
		contacts.insertContact("Annabelle");
		contacts.insertContact("Annadee");
	}

	@Test
	public void shouldReturnThreeContacts() {
		int contactsFound = contacts.countContactsStartingWith("Anna");
		assertEquals(3, contactsFound);
	}

	@Test
	public void shouldReturnOneContacts() {
		int contactsFound = contacts.countContactsStartingWith("Fel");
		assertEquals(1, contactsFound);
	}

	@Test
	public void shouldReturnZeroContacts() {
		int contactsFound = contacts.countContactsStartingWith("Zero");
		assertEquals(0, contactsFound);
	}
}
