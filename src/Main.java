import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonLinkedList obj = new PersonLinkedList();
        Person p2 = new Person("ritik","kumar","12345689","xyz_cs18@gla.ac.in");
        obj.addNewContact(p2);

        System.out.println("Welcome to Ritik Kumar Contact List App\n" +
                "Press 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("You have chosen to add a new contact: ");
            System.out.print(" Please enter the name of the Person \n " +
                    " first Name: ");
            String fn = sc.next();
            System.out.print(" \nlast Name : ");
            String ln = sc.next();
            System.out.print("\n contact number : ");
            String cn = sc.next();
            System.out.print("\nWould you like to add another contact Number? (y/n): ");
            String ch = sc.next();
            if(ch.equals("y")){
                String cn1 = sc.next();
            }

            System.out.print("\nEnter email Address : ");
            String ea = sc.next();
            Person p1 = new Person(fn, ln, cn, ea);
            obj.addNewContact(p1);
        }
        else if (choice == 2) {
            obj.display();
        }
        else if(choice == 4){
            obj.delete();
        }
        else if(choice == 3){
            System.out.println("Enter the first name to search :");
            String fName = sc.next();
            obj.search(null,fName);

        }
        else if(choice == 5){
            return;
        }

    }
}

