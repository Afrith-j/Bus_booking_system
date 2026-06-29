public class Ticket {
    private static int ticketCounter = 1001;

    private int ticketId;
    private Customer customer;
    private Bus bus;

    public Ticket(Customer customer, Bus bus) {
        this.ticketId = ticketCounter++;
        this.customer = customer;
        this.bus = bus;
    }

    public void displayTicket() {
        System.out.println("\n===== TICKET BOOKED =====");
        System.out.println("Ticket ID: " + ticketId);
        customer.displayCustomer();
        System.out.println("Bus No: " + bus.getBusNo());
        System.out.println("Fare: ₹" + bus.getFare());
        System.out.println("=========================");
    }
}