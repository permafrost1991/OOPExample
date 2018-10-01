/*
*
* Definition (Inheritance): The process where one class acquires the properties
* (methods and fields) of another. With the use of inheritance the information is made
* manageable in a hierarchical order.
*
* The class which inherits the properties of other is known as subclass (derived class, child class)
* and the class whose properties are inherited is known as superclass (base class, parent class).
*
* Keywords: extends (class super{}, class sub extends super{})
*
 */


//Java program to illustrate the
// concept of inheritance

// base class
class Bicycle
{
  // the Bicycle class has two fields
  public int gear;
  public int speed;

  // the Bicycle class has one constructor
  public Bicycle(int gear, int speed)
  {
    this.gear = gear;
    this.speed = speed;
  }

  // the Bicycle class has three methods
  public void applyBrake(int decrement)
  {
    speed -= decrement;
  }

  public void speedUp(int increment)
  {
    speed += increment;
  }

  // toString() method to print info of Bicycle
  public String toString()
  {
    return("No of gears are "+gear
        +"\n"
        + "speed of bicycle is "+speed);
  }
}

// derived class
class MountainBike extends Bicycle
{

  // the MountainBike subclass adds one more field
  public int seatHeight;

  // the MountainBike subclass has one constructor
  public MountainBike(int gear,int speed,
      int startHeight)
  {
    // invoking base-class(Bicycle) constructor
    super(gear, speed);
    seatHeight = startHeight;
  }

  // the MountainBike subclass adds one more method
  public void setHeight(int newValue)
  {
    seatHeight = newValue;
  }

  // overriding toString() method
  // of Bicycle to print more info
  @Override
  public String toString()
  {
    return (super.toString()+
        "\nseat height is "+seatHeight);
  }

}
