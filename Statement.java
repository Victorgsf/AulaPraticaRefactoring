import java.util.Enumeration;

public abstract class Statement {

  abstract String getRental(Customer aCustomer);
  abstract String getFigures(Rental aRental);
  abstract String getRentalResult(Customer aCustomer);

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getRental(aCustomer);
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      //show figures for each rental
      result += getFigures(each);
    }
    // add footer lines
    result += getRentalResult(aCustomer);
    return result;
  }

}