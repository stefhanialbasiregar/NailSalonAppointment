import java.util.ArrayList;

public class NailAppointment implements Booking {
  private PaymentSystem options;
  private ArrayList<Service> services;

  public NailAppointment() {
    options = null;
    services = new ArrayList<>();
  }

  public void connectTo(PaymentSystem options) {
    System.out.println("\nConnecting to payment system ... ");
    this.options = options;
    System.out.println("--> Payment system connected to options : " + options.getOptionName());
  }

  @Override
  public boolean book() {
    boolean bookStatus = false;

    System.out.println("\nStarting book " + services.size() + " services ...");
    if (!isEmpty() && options != null) {
      boolean paymentStatus = options.pay(calculatePrice());

      if (paymentStatus)
        bookStatus = true;
      else
        System.out.println("\nPayment Failed, Out of balance!");
      System.out
          .println("Your remaining " + options.getOptionName() + " balance is = IDR" + options.getBalance());
    }
    return bookStatus;
  }

  @Override
  public float calculatePrice() {
    float totalPrice = 0.0f;

    for (Service service : services) {
      totalPrice += service.getPrice();
    }

    return totalPrice;
  }

  @Override
  public boolean isEmpty() {
    return services.size() == 0;
  }

  public void addService(Service service) {
    System.out.println("\nAdding " + service.getServiceName() + " to NailAppointment...");
    this.services.add(service);
  }
}