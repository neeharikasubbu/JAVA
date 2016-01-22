public class SimpleInheritance{
public static void main(String[] args){ 
  //simple way to access base class

Base base1=new Base();
base1.baseMethod();
int x=base1.a;

//child object and validating inheritance behavior
Child child=new Child();
child.baseMethod();
System.out.println(child.a);

}
}

class Base {
  int a = 10;
   void baseMethod(){
System.out.println("inside Base method");

}
}

class Child extends Base {

}   
