//Creation of Interfaces
//Creation of interfaces by extending other interfaces
interface Laptops {
    public  abstract void display();
}
interface Pc  {
    public abstract void turnOn();
    public abstract void turnOff();
}
//Creation of class by extending another class and implementing multiple interfaces
//Creation of a class that implements above interface

public class Dell implements Pc,Laptops {
    //override
    public void display() {
        System.out.println("Laptops");
    }

    //override
    public void turnOn() {
        System.out.println("turn on");
    }

    //override
    public void turnOff() {
        System.out.println("turn off");
    }

    public static void main(String[] args) {
        Dell l1 = new Dell();
        l1.display();
        l1.turnOn();
        l1.turnOff();



    }
}


