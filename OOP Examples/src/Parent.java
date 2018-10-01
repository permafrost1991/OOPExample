
// A Simple Java program to demonstrate  
// method overriding and access-modifiers


/*
* Overriding and Access-Modifiers : The access modifier for an overriding method can allow more,
* but not less, access than the overridden method. For example, a protected instance method in the
* super-class can be made public, but not private, in the subclass. Doing so, will generate
* compile-time error.
*
* Definition (Overriding): The benefit of overriding is: ability to define a behavior that's
* specific to the subclass type, which means a subclass can implement a
* parent class method based on its requirement.
*
*  In object-oriented terms, overriding means to override the functionality of an existing method.
*
* Definition(Access-Modifies)
*
* Keywords: @Override
*
* */

// Base Class 
class Parent
{
  void show() { System.out.println("Parent's show()"); }
  // private methods are not overridden
  private void m1() { System.out.println("From parent m1()");}

  protected void m2() { System.out.println("From parent m2()"); }

}

// Inherited class 
class Child extends Parent
{
  // This method overrides show() of Parent
  @Override
  void show() { System.out.println("Child's show()"); }

  // new m1() method unique to Child class
  private void m1() { System.out.println("From child m1()");}

  // overriding method with more accessibility
  @Override
  public void m2() { System.out.println("From child m2()");}

} 
  