public class Service {
  private String serviceName;
  private float price;

  public Service(String serviceName, float price) {
    this.serviceName = serviceName;
    this.price = price;
  }

  public float getPrice() {
    return this.price;
  }

  public String getServiceName() {
    return this.serviceName;
  }
}
