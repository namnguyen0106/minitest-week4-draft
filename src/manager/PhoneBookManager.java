package manager;

import base.IPhone;
import base.PhoneAbstract;
import model.Contact;
import model.Type;

import java.util.ArrayList;

public class PhoneBookManager extends PhoneAbstract implements IPhone {
    public ArrayList<Contact> arrayList;

    public PhoneBookManager() {
        arrayList = new ArrayList<>();
    }
    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void display(Type type) {

    }

    @Override
    public void insertPhone(Contact contact) {

    }

    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String newPhone) {

    }
}
