public class Television {
// singleline command
    String model = "sony modewl";
    int width;
    int heigth;
    float price;
    String color;
    boolean available;

    void displayDetails(){
        System.out.println(model);
        System.out.println("The width of the TV :" + width);
        System.out.println("Total price : "+(price + 5000));
        System.out.println(color);
        System.out.println(available);
    }
}
