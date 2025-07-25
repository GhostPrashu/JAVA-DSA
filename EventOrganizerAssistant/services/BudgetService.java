package EventOrganizerAssistant.services;

import java.util.*;
import EventOrganizerAssistant.models.Budget;

public class BudgetService {
    private Budget budget = new Budget(0, 0);

    public void manageBudget(Scanner scanner) {
        while (true) {
            System.out.println("\n-- Budget Management --");
            System.out.println("1. Set Total Budget\n2. Add Expense\n3. View Budget\n4. Back");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Total Budget: ");
                    budget.totalBudget = scanner.nextDouble();
                    break;
                case 2:
                    System.out.print("Enter Expense Amount: ");
                    double expense = scanner.nextDouble();
                    budget.spent += expense;
                    break;
                case 3:
                    budget.display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid!");
            }
        }
    }
}
