
/*
* Here, you cannot instantiate the Employee class, but you can instantiate the Salary Class,
* and using this instance you can access all the three fields and seven methods of Employee class
* as shown below.
*/


package Abstract;

public class AbstractDemo {

  public static void main(String [] args) {
    Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
    Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
    System.out.println("Call mailCheck using Salary reference --");
    s.mailCheck();
    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();
  }
}