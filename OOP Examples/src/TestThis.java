/*
* This is the driver class to test all of the example of Object Oriented Programing in Java.
* Ordered list :
* 1. Bicycle- Inheritance
* 2. JBT- .this
* 3. Parent- Polymorphism/Access Modifiers
* 4. Shape- Final (integrates overriding and inheritance/contains abstract class)
* 5. Encapsulate - Encapsulate (Getters and Setters)
* 6. Abstract - Abstract package/directory
* 7. Interface- Interface Package/directory
* 8. Enum- Enum Package/directory
*
*
*
* Sources used:
* https://docs.oracle.com/
* https://www.geeksforgeeks.org/
*
* This is not sold or used for any purpose other than learning/understanding the implementation
* of Object Oriented Programing.
 */


import Abstract.Employee;
import Abstract.Salary;


public class TestThis
{
  public static void main(String args[])
  {

    //Inheritance (Bicycle)
    MountainBike mb = new MountainBike(3, 100, 25);
    System.out.println(mb.toString());
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //JBT (.This)
    JBT obj = new JBT();
    obj.method(20);
    obj.method();
    JBT obj0 = new JBT();
    obj0.methodTwo();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //POLYMORPHISM (Parent)
    // If a Parent type reference refers to a Parent object, then Parent's show is called
    Parent obj1 = new Parent();
    obj1.show();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // If a Parent type reference refers to a Child object Child's show() is called.
    // This is called RUN TIME POLYMORPHISM.
    Parent obj2 = new Child();
    obj2.show();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //Access Modifiers (Parent)
    Parent obj3 = new Parent();
    obj3.m2();
    Parent obj4 = new Child();
    obj4.m2();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //Final (Shape)
    // creating Rectangle object
    Shape s1 = new Rectangle(10, 20);

    // creating Square object
    Shape s2 = new Square(10);

    // getting width and height of s1
    System.out.println("width of s1 : "+ s1.getWidth());
    System.out.println("height of s1 : "+ s1.getHeight());

    // getting width and height of s2
    System.out.println("width of s2 : "+ s2.getWidth());
    System.out.println("height of s2 : "+ s2.getHeight());

    //getting area of s1
    System.out.println("area of s1 : "+ s1.getArea());

    //getting area of s2
    System.out.println("area of s2 : "+ s2.getArea());
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //Encapsulate
    Encapsulate obj5 = new Encapsulate();

    // setting values of the variables
    obj5.setName("Harsh");
    obj5.setAge(19);
    obj5.setRoll(51);

    // Displaying values of the variables
    System.out.println("Geek's name: " + obj5.getName());
    System.out.println("Geek's age: " + obj5.getAge());
    System.out.println("Geek's roll: " + obj5.getRoll());

    // Direct access of geekRoll is not possible
    // due to encapsulation
    // System.out.println("Geek's roll: " + obj.geekName);
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //import Abstract.Employee;
    //import Abstract.Salary;
    //Pulls classes from package created
    Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
    Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
    System.out.println("Call mailCheck using Salary reference --");
    s.mailCheck();
    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  }
}