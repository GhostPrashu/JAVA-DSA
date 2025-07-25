package EventOrganizerAssistant.models;

public class Guest {
    public int id;
    public String name;
    public String contact;
    public boolean rsvp;

    public Guest(int id, String name, String contact, boolean rsvp) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.rsvp = rsvp;
    }

    public void display() {
        System.out.println("Guest ID: " + id + ", Name: " + name + ", Contact: " + contact + ", RSVP: " + (rsvp ? "Yes" : "No"));
    }
}
