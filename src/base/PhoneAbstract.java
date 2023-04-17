package base;

import model.Contact;
import model.Type;

public abstract class PhoneAbstract {
    public abstract void display(Type type);
    public abstract void insertPhone(Contact contact);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);
}
