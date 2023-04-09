public interface PaymentSystem {
  boolean pay(float ammout);

  void topUp(float ammount);

  void withdraw(float ammount);

  float getBalance();

  String getOptionName();
}