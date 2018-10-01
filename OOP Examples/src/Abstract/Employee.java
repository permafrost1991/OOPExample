
/*
*Definition (Abstract): A process of hiding the implementation details from the user, only the
* functionality will be provided to the user. In other words, the user will have the information
* on what the object does instead of how it does it.
*
* In Java, abstraction is achieved using Abstract classes and interfaces.
*
* Notes:
 * Abstract classes may or may not contain abstract methods, i.e.,
 * methods without body ( public void get(); )
 *
 * But, if a class has at least one abstract method, then the class must be declared abstract.
 *
 * If a class is declared abstract, it cannot be instantiated.
 *
 * To use an abstract class, you have to inherit it from another class, provide implementations
 * to the abstract methods in it.
 *
 * If you inherit an abstract class, you have to provide implementations to all the abstract
 * methods in it.
*
*
*
*
 */

package Abstract;

public abstract class Employee {
  private String name;
  private String address;
  private int number;

  public Employee(String name, String address, int number) {
    System.out.println("Constructing an Abstract.Employee");
    this.name = name;
    this.address = address;
    this.number = number;
  }

  public double computePay() {
    System.out.println("Inside Abstract.Employee computePay");
    return 0.0;
  }

  public void mailCheck() {
    System.out.println("Mailing a check to " + this.name + " " + this.address);
  }

  public String toString() {
    return name + " " + address + " " + number;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String newAddress) {
    address = newAddress;
  }

  public int getNumber() {
    return number;
  }
}