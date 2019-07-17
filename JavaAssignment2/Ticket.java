package TicketSystem;

public class Ticket {

    private String description;
    private enum Statuses{
        New,
        Approved,
        Rejected,
        Resolved,
        Closed

    }

    private String ticketType;
    private int ticketID;
    private String ticketStatus;
    private String resolutionDetails;

    Ticket(String ticketDescription,String ticketType){
        setDescription(ticketDescription);
        setTicketType(ticketType);
        setTicketID();
        Statuses status = Statuses.New;
        setTicketStatus(status.toString());
        printTicketDetails();
    }


    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getTicketType() {
        return ticketType;
    }

    private void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getTicketID() {
        return ticketID;
    }

    private void setTicketID() {
        this.ticketID = (int) (1000000* Math.random());
        System.out.println(ticketID);
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    private void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getResolutionDetails() {
        return resolutionDetails;
    }

    private void setResolutionDetails(String resolutionDetails) {
        this.resolutionDetails = resolutionDetails;
    }

    public void approveTicket(){
        Statuses status = Statuses.Approved;
        setTicketStatus(status.toString());

    }

    public void rejectTicket(){
        Statuses status = Statuses.Rejected;
        setTicketStatus(status.toString());
        System.out.println("The Ticket has been rejected");
    }


    public void resolveTicket(String resolutionDetails){
        setResolutionDetails(resolutionDetails);
        Statuses status = Statuses.Resolved;
        setTicketStatus(status.toString());
        printTicketDetails();
    }

    public void closeTicket(){
        Statuses status = Statuses.Closed;
        setTicketStatus(status.toString());
        printTicketDetails();

    }

    public void printTicketDetails(){
        System.out.println("Ticket ID : #"+getTicketID());
        System.out.println("Type : #"+getTicketType());
        System.out.println("Status : "+getTicketStatus());
        System.out.println("Summary : "+getDescription());
        if (getTicketStatus() == Statuses.Resolved.toString() || getTicketStatus() == Statuses.Closed.toString())
            System.out.println("Resolution Details : " + getResolutionDetails());
    }

}
