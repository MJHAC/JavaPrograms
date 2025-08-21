//In interface there is no body for the methods
interface Bicycle{
    int a=10;
    void applyBrakes(int decrement);
    void speedUp(int increment);
    //This can be used by making use of default methods
    default void speed(){
        System.out.println("Hello the speed is good");
    }
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pooo");
    }
    public void applyBrakes(int decrement){
        System.out.println("Applying Brakes");
    }
    public void speedUp(int increment){
        System.out.println("Applying accelerator");
    }
}
//Default methods allow
//Interface no object is made but can be used as reference
public class Interface {
    public static void main(String[] args) {
        AvonCycle cycle=new AvonCycle();
        cycle.speed();
        cycle.applyBrakes(1);
        System.out.println(cycle.a);
        //You can't alter the properties in interface
        //An interface in Java is like a contract that says:
        //“Any class that implements me must provide implementations for my methods.”
    }
}
