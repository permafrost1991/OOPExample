/*
* Description: Using and Understanding .this
*
* Definition (this): a reference to the current Object, whose Method or constructor is being
* invoked. This keyword can be used to refer to any member of the current object from within an
* instance Method or a constructor.
*
* Keywords: this. (this.variable)
 */

public class JBT {

  int variable = 5;

  void method(int variable) {
    variable = 10;
    System.out.println("Value of Instance variable :" + this.variable);
    System.out.println("Value of Local variable :" + variable);
  }
  void method() {
    int variable = 40;
    System.out.println("Value of Instance variable :" + this.variable);
    System.out.println("Value of Local variable :" + variable);
  }
  void methodOne(){
    System.out.println("Inside Method ONE");
  }
  void methodTwo(){
    System.out.println("Inside Method TWO");
    this.methodOne();// same as calling methodOne()
  }
}
