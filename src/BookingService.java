public class BookingService {

    public void addReservation(Customer customer, Boolean isPriority) {
        String queueName = isPriority ? "priority Queue" : "normal queue";
        System.out.println("add " + customer.getName() + " to " + queueName);
    }
}
