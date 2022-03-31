package com.infogalaxy.addressbookmanager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addcontact() {
        Contact contact = new Contact();
        System.out.println("Enter The First Name : ");
        contact.setFirstName(sc.next());
        System.out.println("Enter The Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter The Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter The City : ");
        contact.setCity(sc.next());
        System.out.println("Enter The State : ");
        contact.setState(sc.next());
        System.out.println("Enter The Mobile No : ");
        contact.setMobno(sc.next());
        System.out.println("Enter The Email ID : ");
        contact.setEmail(sc.next());
        System.out.println("Enter The Zip Code : ");
        contact.setZip(sc.next());
        contactList.add(contact);
    }

    public void displayContact() {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            System.out.println(contact.toString());
        }
    }

    public void editContact() {
        System.out.println("Enter The First Name : ");
        String fname = sc.next();
        int flag = 0;
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if (fname.equals((contact.getFirstName()))) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Contact Not Found. ");
        } else {
            System.out.println("Contact is Found .");
            Contact contact = new Contact();
            System.out.println("Enter The Last Name : ");
            contact.setLastName(sc.next());
            System.out.println("Enter The Address : ");
            contact.setAddress(sc.next());
            System.out.println("Enter The City : ");
            contact.setCity(sc.next());
            System.out.println("Enter The State : ");
            contact.setState(sc.next());
            System.out.println("Enter The Mobile No : ");
            contact.setMobno(sc.next());
            System.out.println("Enter The Email ID : ");
            contact.setEmail(sc.next());
            System.out.println("Enter The Zip Code : ");
            contact.setZip(sc.next());
        }
    }

    public void searchState() {
        System.out.println("Enter the State Name You Want to Search . ");
        String stateName = sc.next();
        int total = 0;
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if (stateName.equals(contact.getState())) {
                System.out.println(contact.getFirstName());
                System.out.println(contact.getMobno());
                total = total + 1;
            }
        }
        System.out.println("Total Contact Having Same State is : " + total);
    }

    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Contact Name : ");
        String delete = sc.next();

        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            if (delete.equals(contact.getFirstName())) {
                contactList.remove(i);
            }
        }
    }

    public void backupToFile() {
        String contactData = null;
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            contactData = contact.getFirstName() + "," + contact.getLastName() + "," + contact.getAddress() + "," + contact.getCity()
                    + "," + contact.getState() + "," + contact.getMobno() + "," + contact.getEmail() + "," + contact.getZip() + "\n" + contactData;

            try {
                Path file = Paths.get("MyData.txt");
                byte[] fileData = contactData.getBytes();
                Files.write(file, fileData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println(" **** CONTACT LIST MANAGEMENT **** ");
            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. SEARCH STATE \n5. DELETE CONTACT \n6. BACKUP TO FILE \n7. EXIT ");
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addcontact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.searchState();
                    break;
                case 5:
                    addressBook.deleteContact();
                    break;
                case 6:
                    addressBook.backupToFile();
                    break;
            }

        } while (choice != 7);
    }
}
