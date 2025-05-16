import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactSorter {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1, "Tom", "tom@gmail.com", "9988776655"));
        contacts.add(new Contact(2, "Alex", "alex@gmail.com", "8899776655"));
        contacts.add(new Contact(3, "Steve", "steve@gmail.com", "7788996655"));

        // Sort the contacts by email
        Collections.sort(contacts, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.getEmail().compareTo(c2.getEmail());
            }
        });

        // Print the sorted contacts
        System.out.println("Contacts sorted by email:");
        for (Contact c : contacts) {
            System.out.println(c.getId() + ", " + 
                              c.getName() + ", " + 
                              c.getEmail() + ", " + 
                              c.getPhone());
        }
    }
}
