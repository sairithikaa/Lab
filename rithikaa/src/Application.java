public class Application {
    public static void main(String[] args) {
        Television sonyTv;
        sonyTv = new Television();
        System.out.println("The model is : "+sonyTv.model);
        System.out.println("The price is : "+sonyTv.price);

        sonyTv.displayDetails();
        sonyTv.price = 50000;
        sonyTv.displayDetails();
    }
}

