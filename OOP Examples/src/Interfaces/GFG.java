/*
* We can’t create instance(interface can’t be instantiated) of interface but we can make reference
* of it that refers to the Object of its implementing class.
*
* A class can implement more than one interface.
*
* An interface can extends another interface or interfaces (more than one interface) .
*
* A class that implements interface must implements all the methods in interface.
*
* All the methods are public and abstract. And all the fields are public, static, and final.
*
* It is used to achieve multiple inheritance.
*
* It is used to achieve loose coupling.
*
 */

package Interfaces;

public class GFG {
  public static void main (String[] args) {

    // creating an instance of Bicycle
    // doing some operations
    Bicycle bicycle = new Bicycle();
    bicycle.changeGear(2);
    bicycle.speedUp(3);
    bicycle.applyBrakes(1);

    System.out.println("Bicycle present state :");
    bicycle.printStates();

    // creating instance of bike.
    Bike bike = new Bike();
    bike.changeGear(1);
    bike.speedUp(4);
    bike.applyBrakes(3);

    System.out.println("Bike present state :");
    bike.printStates();
  }
}
