package oops;
class participant{
    // participantId (int) — unique identifier for the participant
    // name (String) — name of the participant
    // baseRegistrationFee (double) — base fee for attending the fest
    // numberOfEvents (int) — number of events the participant has registered for
    // eventChargePerEvent (double) — charge per event

    private int participantid;
    private String name;
    private double registrationfee;
    private int noofevent;
    private double charges;

    // Setters (Mutators)
    // setParticipantId(int)
    // setName(String)
    // setBaseRegistrationFee(double)
    // setNumberOfEvents(int)
    // setEventChargePerEvent(double)

    void setParticipantId(int participantId){
        this.participantid=participantId;
    }
    void setName(String name){
        this.name=name;
    }
    void setBaseRegistrationFee(double registrationfee){
        this.registrationfee=registrationfee;
    }
    void setNumberOfEvents(int noofevent){
        this.noofevent=noofevent;
    }
    void setEventChargePerEvent(double charges){
        this.charges=charges;
    }

    // Getters (Accessors)
    // getParticipantId()
    // getName()
    // getBaseRegistrationFee()
    // getNumberOfEvents()
    // getEventChargePerEvent()

    int getParticipantId(){
        return participantid;
    }
    String getname(){
        return name;
    }
    double getBaseRegistrationFee(){
        return registrationfee;
    }
    int getNumberOfEvents(){
        return noofevent;
    }
    double getEventChargePerEvent(){
        return charges;
    }
    // Methods
    // calculateTotalFee() returns the total fee as: baseRegistrationFee + (numberOfEvents × eventChargePerEvent)
    // displayDetails() prints participant details and the total fee

    double calculateTotalFee(double registrationfee,int noofevent,double charges){
        return registrationfee+(noofevent*charges);
    }
    void displayDetails(){
        System.out.println("Participantid: "+participantid);
        System.out.println("Praticipant name: "+name);
        System.out.println("Total fee is: "+calculateTotalFee(registrationfee, noofevent, charges));
    }

}
public class clgeventregistration {
    public static void main(String[] args) {
        participant ob=new participant();
        ob.setParticipantId(596);
        ob.setName("Prasanth");
        ob.setBaseRegistrationFee(500);
        ob.setEventChargePerEvent(250);
        ob.setNumberOfEvents(5);
        ob.displayDetails();
    }
}
