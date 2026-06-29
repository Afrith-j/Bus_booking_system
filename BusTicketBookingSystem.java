import java.util.ArrayList;
import java.util.Scanner;

public class BusTicketBookingSystem {
    private ArrayList<Bus> buses = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public BusTicketBookingSystem() {
        buses.add(new Bus(101, "Chennai", "Bangalore", 5, 600));
        buses.add(new Bus(102, "Chennai", "Madurai", 4, 450));
        buses.add(new Bus(103, "Chennai", "Coimbatore", 3, 500));
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n===== BUS TICKET BOOKING SYSTEM =====");
            System.out.println("1. View Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewBuses();
                    break;

                case 2:
                    bookTicket();
                    break;

                case 3:
                    System.out.println("Thank you for using Bus Ticket Booking System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    private void viewBuses() {
        System.out.println("\nAvailable Buses:");
        for (Bus bus : buses) {
            bus.displayBus();
        }
    }

    private void bookTicket() {
        viewBuses();

        System.out.print("Enter Bus Number: ");
        int busNo = sc.nextInt();

        Bus selectedBus = null;

        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                selectedBus = bus;
                break;
            }
        }

        if (selectedBus == null) {
            System.out.println("Bus not found!");
            return;
        }

        if (selectedBus.getAvailableSeats() <= 0) {
            System.out.println("No seats available!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(name, age, phone);
        selectedBus.bookSeat();

        Ticket ticket = new Ticket(customer, selectedBus);
        ticket.displayTicket();
    }
}