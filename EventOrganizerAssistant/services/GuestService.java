package EventOrganizerAssistant.services;

import java.util.*;
import EventOrganizerAssistant.models.Guest;

public class GuestService {
    private List<Guest> guests = new ArrayList<>();

    public void manageGuests(Scanner scanner) {
        while (true) {
            System.out.println("\n-- Guest Management --");
            System.out.println("1. Add Guest\n2. View Guests\n3. Delete Guest\n4. Back");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = scanner.nextLine();
                    System.out.print("RSVP (true/false): ");
                    boolean rsvp = scanner.nextBoolean();
                    guests.add(new Guest(id, name, contact, rsvp));
                    break;
                case 2:
                    for (Guest g : guests) g.display();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = scanner.nextInt();
                    guests.removeIf(g -> g.id == delId);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}

