package EventOrganizerAssistant.services;

import java.util.*;
import EventOrganizerAssistant.models.Event;

public class EventService {
    private List<Event> events = new ArrayList<>();

    public void manageEvents(Scanner scanner) {
        while (true) {
            System.out.println("\n-- Event Management --");
            System.out.println("1. Add Event\n2. View Events\n3. Delete Event\n4. Back");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter Location: ");
                    String loc = scanner.nextLine();
                    events.add(new Event(id, name, date, loc));
                    break;
                case 2:
                    for (Event e : events) e.display();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int delId = scanner.nextInt();
                    events.removeIf(e -> e.id == delId);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
