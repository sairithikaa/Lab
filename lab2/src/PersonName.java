import java.util.Scanner;
public class PersonName {
    public static void display1(String name){

        System.out.println("Hello "  +name+ " Welcome to Java World! ");
    }

    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
       String name1 = sc.nextLine();
       display1(name1);



    }
}
