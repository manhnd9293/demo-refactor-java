public class Main {
    public static void main(String[] args) {
        BookingService bookingService = new BookingService();

        Customer customer1 = new Customer("user 1", "add1");
        bookingService.addReservation(customer1, true);

        Customer customer2 = new Customer("user 2", "add2");
        bookingService.addReservation(customer2, false);

        Customer customer3 = new Customer("user 3", "add3");
        bookingService.addReservation(customer3, true);
    }
}
