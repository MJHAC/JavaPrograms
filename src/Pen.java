abstract class Peen{
    abstract void refill();
    abstract void write();
}
class gelPen extends Peen{
    public void refill(){
        System.out.println("Refill");
    }
    public void write(){
        System.out.println("Write");
    }
}
    public class Pen {
    public static void main(String[] args) {
        gelPen gp=new gelPen();
        gp.refill();
        gp.write();
    }
}
