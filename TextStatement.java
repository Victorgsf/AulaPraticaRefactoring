import java.util.Enumeration;

public class TextStatement extends Statement {

  String getRental(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() +
      "\n";
  }

  String getFigures(Rental aRental) {
    return "\t" + aRental.getMovie().getTitle()+ "\t" +
         String.valueOf(aRental.getCharge()) + "\n";
  }
  String getRentalResult(Customer aCustomer) {
    return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n" + "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
  }
}