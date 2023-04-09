class Main {
  public static void main(String[] args) {
    Gopay gopay = new Gopay(250);
    Dana dana = new Dana(100);
    Ovo ovo = new Ovo(1000);

    NailAppointment appointment = new NailAppointment();
    BookButton button = new BookButton();

    button.connectTo(appointment);
    appointment.connectTo(gopay);

    // gopay.topUp(100);

    appointment.addService(new Service("manicure n padicure", 50));
    appointment.addService(new Service("nail art", 150));

    button.pressed();
  }
}
