import java.time.LocalDate;

public class CreditAgencyGateway {
    // Depending on which name is searched for, a different customer object is returned
    public Customer getCustomer(String name) {
        return switch (name) {
            case "Harry" -> new Customer("Harry",
                    "Potter",
                    LocalDate.of(1980, 7, 31),
                    "4 Privet Drive, Little Whinging",
                    795);
            case "Ron" -> new Customer("Ron",
                    "Weasley",
                    LocalDate.of(1980, 3, 1),
                    "The Burrow, Devon",
                    379);
            case "Hermione" -> new Customer("Hermione",
                    "Granger",
                    LocalDate.of(1979, 9, 19),
                    "Hampstead Garden Suburb, London",
                    843);
            default -> throw new IllegalArgumentException("Could not return the credit history for " + name);
        };
    }
}
