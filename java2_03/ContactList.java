package java2_03;
import  java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class ContactList {
    List<Contact> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        String name, sdt;
        System.out.println("Số điện thoại : ");
        sdt = sc.next();
        System.out.println("Tên liên hệ: ");
        name = sc.next();
        Contact c1 = new Contact(sdt, name);
        contactList.add(c1);
        System.out.println("Danh bạ đã được cập nhât: " + c1);
    }
    public void printContact() {
        System.out.println("Danh bạ: ");
        Iterator<Contact> contactIterator = contactList.iterator();
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            System.out.println(contact);
        }
    }
    public void updateContact() {
        String name;
        System.out.println("Nhập tên liên hệ cần cập nhật");
        name = sc.next();
        Iterator<Contact> contactIterator = contactList.iterator();
        int a = 0;
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            if (contact.name.equals(name)) {
                String nameUpdate, sdtUpdate;
                System.out.print("Tên liên hệ mới: ");
                nameUpdate = sc.next();
                System.out.print("Số điện thoại mới: ");
                sdtUpdate = sc.next();
                contact.name = nameUpdate;
                contact.sdt = sdtUpdate;
                System.out.println("Đã cập nhật liên hệ mới: " + contact);
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Liên hệ không tồn tại \n");
        }
    }
    public void removeContact() {
        String nameremove;
        System.out.println("Nhập tên cần xóa: ");
        nameremove = sc.next();
        Contact removeContact = null;
        Iterator<Contact> contactIterator = contactList.iterator();
        int a = 0;
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            if (contact.name.equals(nameremove)) {
                removeContact = contact;
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Danh bạ không tồn tại \n");
        } else {
            contactList.remove(removeContact);
            System.out.println("Đã xóa danh bạ \n");
        }
    }
    public void searchContact() {
        String contactName;
        System.out.print("Nhập danh bạ cần tìm kiếm: ");
        contactName = sc.next();
        Iterator<Contact> contactIterator = contactList.iterator();
        int a = 0;
        while (contactIterator.hasNext()) {
            Contact contact = contactIterator.next();
            if (contact.name.equals(contactName)) {
                System.out.println(contact);
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Danh bạ không tồn tại \n");
        }
    }


}



