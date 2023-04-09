public class BookButton implements UserInterface {
  private Booking nailAppointment;

  public BookButton() {
    nailAppointment = null;
  }

  @Override
  public void pressed() {
    if (nailAppointment != null) {
      boolean bookStatus = nailAppointment.book();

      if (bookStatus)
        System.out.println("\nYour nail appointment has been booked! ");
      else
        System.out.println("\nFailed to book an appointment!");
    } else {
      System.out.println("Nail Appointment rejected!");
    }
  }

  public void connectTo(Booking nailAppointment) {
    System.out.println("\nAttempt to sync appointment...");
    this.nailAppointment = nailAppointment;
    System.out.println("--> Appointment synced!");
  }
}