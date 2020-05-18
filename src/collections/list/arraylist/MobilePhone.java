package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    public static void main(String[] args) {
        //processContacts();
        List<Integer> intArray = new ArrayList<>();
        intArray.add(2);
        intArray.add(3);
        for (int i=0; i < intArray.size(); i++) {
            System.out.println(intArray.get(i));
        }
    }

    private static void processContacts() {
        Contact contact1 = new Contact("test1", 1234567891);
        Contact contact2 = new Contact("test2", 1234567892);
        Contact contact3 = new Contact("test3", 1234567893);
        Contact contact4 = new Contact("test4", 1234567894);
        Contact contact5 = new Contact("test5", 1234567895);
        addNewContact(contact2);
        addNewContact(contact3);
        addNewContact(contact4);
        printContacts();
        contact4.setPhoneNumber(1234567890);
        updateContact(contact4);
        printContacts();
        removeContact(contact3);
        printContacts();
        Contact contact = findContact("test2");
        System.out.println("Search result: "  + contact.getName() + ", "
                                            + contact.getPhoneNumber());
    }

    private static List<Contact> contacts = new ArrayList<>();

    public static void printContacts() {
        for (Contact contact : contacts) {
            System.out.println("Print:: Contact name: " + contact.getName() +
                    " , phone number: " + contact.getPhoneNumber());
        }
    }

    public static boolean addNewContact(Contact contact) {
        for (Contact contact1: contacts) {
            if (contact.getName().equals(contact1.getName()))
                return false;
        }
        contacts.add(contact);
        return true;
    }

    public static boolean updateContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contact.getName().equals(contacts.get(i).getName())) {
                contacts.set(i, contact);
                return true;
            }
        }
        return false;
    }

    public static boolean removeContact(Contact contact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contact.getName().equals(contacts.get(i).getName())) {
                Contact contact1 = contacts.remove(i);
                System.out.println("Removed : " + contact1.getName());
                return true;
            }
        }
        return false;
    }

    public static Contact findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equals(contacts.get(i).getName())) {
                return contacts.get(i);
            }
        }
        return null;
    }
}
