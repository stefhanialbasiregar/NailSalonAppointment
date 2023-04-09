public interface Booking {
  void connectTo(PaymentSystem options);

  boolean book();

  float calculatePrice();

  boolean isEmpty();
}
