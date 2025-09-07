package oops;
abstract class Base {
    public Base(){
        System.out.println("Hello I am in base class.");
    }
    public void Hi(){
        System.out.println("Hi Base class people");
    }
    abstract public void gm();
}
//concrete class of Base so that we can access the base class methods.
class Derived extends Base{
    public Derived(){
        System.out.println("Hello I am in Derived Class.");
    }
    public void Hi(){
        System.out.println("Hi Derived class people");
    }
    @Override
    public void gm(){
        System.out.println("Hi");
    }
}
abstract class Child extends Base{
    public void greet(){
        System.out.println("Hello");
    }
}
    public class Abstract {
    public static void main(String[] args) {
        //Base b=new Base();
        Derived d=new Derived();
        //Child c=new Child();
        //Abstract class cannot make there own objects
        d.Hi();
    }
}
