
// Java program to illustrate use of final with inheritance


/*
* Final is a keyword in java used for restricting some functionality. We can declare variables,
* methods and classes with final keyword.
*
* Using final with inheritance
*
* During inheritance, we must declare methods with final keyword for which we required to follow
* he same implementation throughout all the derived classes. Note that it is not necessary to
* declare final methods in the initial stage of inheritance(base class always). We can declare
* final method in any subclass for which we want that if any other class extends this subclass,
* then it must follow same implementation of the method as in the that subclass.
*/

// base class 
abstract class Shape
{
  private double width;

  private double height;

  // Shape class parameterized constructor
  public Shape(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  // getWidth method is declared as final
  // so any class extending
  // Shape can't override it
  public final double getWidth()
  {
    return width;
  }

  // getHeight method is declared as final
  // so any class extending Shape
  // can not override it
  public final double getHeight()
  {
    return height;
  }


  // method getArea() declared abstract because
  // it upon its subclasses to provide
  // complete implementation
  abstract double getArea();
}

// derived class one 
class Rectangle extends Shape
{
  // Rectangle class parameterized constructor
  public Rectangle(double width, double height)
  {
    // calling Shape class constructor
    super(width, height);
  }

  // getArea method is overridden and declared
  // as final so any class extending
  // Rectangle can't override it
  @Override
  final double getArea()
  {
    return this.getHeight() * this.getWidth();
  }

}

//derived class two 
class Square extends Shape
{
  // Rectangle class parameterized constructor
  public Square(double side)
  {
    // calling Shape class constructor
    super(side, side);
  }

  // getArea method is overridden and declared as
  // final so any class extending
  // Square can't override it
  @Override
  final double getArea()
  {
    return this.getHeight() * this.getWidth();
  }

} 