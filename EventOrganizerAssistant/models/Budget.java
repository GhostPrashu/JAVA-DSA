package EventOrganizerAssistant.models;

public class Budget {
    public double totalBudget;
    public double spent;

    public Budget(double totalBudget, double spent) {
        this.totalBudget = totalBudget;
        this.spent = spent;
    }

    public void display() {
        System.out.println("Total Budget: Rs." + totalBudget + ", Spent: Rs." + spent + ", Remaining: Rs." + (totalBudget - spent));
    }
}
