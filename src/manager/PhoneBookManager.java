package manager;

import base.IPhone;
import base.PhoneAbstract;
import model.Contact;
import model.Type;

import java.util.ArrayList;
import java.util.Objects;

public class PhoneBookManager extends PhoneAbstract implements IPhone {
    public ArrayList<Contact> phoneBook;

    public PhoneBookManager() {
        phoneBook = new ArrayList<>();
        phoneBook.add(new Contact("Nam", "01239876", new Type(1, "CG")));
        phoneBook.add(new Contact("Quân", "01256876", new Type(1, "CG")));
    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void display(Type type) {
        if (Objects.isNull(type)) {
            for (Contact contact : phoneBook) {
                System.out.println(contact);
            }
        } else {
            for (Contact contact : phoneBook) {
                if (type.getName().equals(contact.getType()
                        .getName())) {
                    System.out.println(contact);
                }
            }
        }
    }

    @Override
    public void insertPhone(Contact contact) {
        int index = getIndexByName(contact.getName());
        if (index >= 0) {
            phoneBook.set(index, contact);
        } else {
            phoneBook.add(contact);
        }
    }

    @Override
    public void removePhone(String name) {
        int index = getIndexByName(name);
        if (index >= 0) {
            phoneBook.remove(index);
        } else {
            System.out.println("Contact not fount!");
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        int index = getIndexByName(name);
        if (index < 0) {
            System.out.println("Contact not fount!");
        } else {
            for (Contact contact : phoneBook) {
                if (contact.getName().equals(name)) {
                    contact.setPhoneNumber(newPhone);
                    break;
                }
            }
        }
    }

    private int getIndexByName(String name) {
        int index = -1;
        for (Contact contact : phoneBook) {
            if (contact.getName().equals(name)) {
                return phoneBook.indexOf(contact);
            }
        }
        return index;
    }
}
