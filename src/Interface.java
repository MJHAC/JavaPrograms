interface Bicycle{
    int a=10;
    void applyBrakes(int decrement);
    void speedUp(int increment);
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
//Interface no object is made but can be used as reference
public class Interface {
    public static void main(String[] args) {
        AvonCycle cycle=new AvonCycle();
        cycle.applyBrakes(1);
        System.out.println(cycle.a);
        //You can't alter the properties in interface
        //An interface in Java is like a contract that says:
        //“Any class that implements me must provide implementations for my methods.”
    }
}
