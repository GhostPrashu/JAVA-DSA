package EventOrganizerAssistant.models;

public class Event {
    public int id;
    public String name;
    public String date;
    public String location;

    public Event(int id, String name, String date, String location) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public void display() {
        System.out.println("Event ID: " + id + ", Name: " + name + ", Date: " + date + ", Location: " + location);
    }
}
