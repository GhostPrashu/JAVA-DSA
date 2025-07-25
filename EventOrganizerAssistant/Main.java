package EventOrganizerAssistant;

import java.util.*;
import EventOrganizerAssistant.services.EventService;
import EventOrganizerAssistant.services.GuestService;
import EventOrganizerAssistant.services.BudgetService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventService eventService = new EventService();
        GuestService guestService = new GuestService();
        BudgetService budgetService = new BudgetService();

        while (true) {
            System.out.println("\n==== Event Organizer Assistant ====");
            System.out.println("1. Manage Events");
            System.out.println("2. Manage Guests");
            System.out.println("3. Manage Budget");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    eventService.manageEvents(scanner);
                    break;
                case 2:
                    guestService.manageGuests(scanner);
                    break;
                case 3:
                    budgetService.manageBudget(scanner);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

