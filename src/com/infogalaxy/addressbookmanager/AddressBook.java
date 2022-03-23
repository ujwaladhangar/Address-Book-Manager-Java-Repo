package com.infogalaxy.addressbookmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> contactList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
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

    public void displayContact()
    {
        for (int i = 0; i < contactList.size(); i++) {
            Contact contact = contactList.get(i);
            System.out.println(contact.toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        int choice;
      do {
          System.out.println(" CONTACT LIST MANAGEMENT ");
          System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EXIT");
          System.out.println("Enter Your Choice : ");
          choice = sc.nextInt();
          switch (choice) {
              case 1:
                  addressBook.addContact();
                  break;
              case 2:
                  addressBook.displayContact();
                  break;
          }
      }while (choice !=3);

    }
}
