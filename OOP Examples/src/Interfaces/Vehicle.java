/*
* Like a class, an interface can have methods and variables, but the methods declared in interface
* are by default abstract (only method signature, no body).
*
* Interfaces specify what a class must do and not how. It is the blueprint of the class.
*
* An Interface is about capabilities like a Player may be an interface and any class
* implementing Player must be able to (or must implement) move(). So it specifies a set of methods
* that the class has to implement.
*
* If a class implements an interface and does not provide method bodies for all functions
* specified in the interface, then class must be declared abstract.
*
* A Java library example is, Comparator Interface. If a class implements this interface,
* then it can be used to sort a collection.
 */





package Interfaces;



interface Vehicle {

  // all are the abstract methods.
  void changeGear(int a);
  void speedUp(int a);
  void applyBrakes(int a);
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class Bicycle implements Vehicle{

  int speed;
  int gear;

  // to change gear
  @Override
  public void changeGear(int newGear){

    gear = newGear;
  }

  // to increase speed
  @Override
  public void speedUp(int increment){

    speed = speed + increment;
  }

  // to decrease speed
  @Override
  public void applyBrakes(int decrement){

    speed = speed - decrement;
  }

  public void printStates() {
    System.out.println("speed: " + speed
        + " gear: " + gear);
  }
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class Bike implements Vehicle {

  int speed;
  int gear;

  // to change gear
  @Override
  public void changeGear(int newGear){

    gear = newGear;
  }

  // to increase speed
  @Override
  public void speedUp(int increment){

    speed = speed + increment;
  }

  // to decrease speed
  @Override
  public void applyBrakes(int decrement){

    speed = speed - decrement;
  }

  public void printStates() {
    System.out.println("speed: " + speed
        + " gear: " + gear);
  }

}