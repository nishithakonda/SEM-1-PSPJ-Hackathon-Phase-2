import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0;
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("Movie name: " + movieName);
        System.out.printf("Ticket price: %.2f%n", ticketPrice);
        System.out.println("Number of tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String movieName = input.nextLine();
        double ticketPrice = input.nextDouble();
        int numberOfTickets = input.nextInt();

        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        ticket.calculateTotal();
        ticket.calculateDiscount();
        ticket.calculateFinalAmount();
        ticket.displayBill();
    }
}