public class Vehicle {
    protected String model1 = "ford";
    public void sound(){
        System.out.println("ttttt");
    }
}
class Car extends Vehicle{
    private String model = "BMW";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.sound();
        System.out.println(myCar.model1);
    }
}
