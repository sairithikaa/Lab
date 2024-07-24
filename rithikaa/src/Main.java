import java.util.ArrayList;
public class Main{
public static void main(String[] args){
ArrayList<String> laptops = new ArrayList<String>();
laptops.add("lenova");
laptops.add("Dell");
laptops.add("Hp");
laptops.add("mac");
System.out.println(laptops);
System.out.println(laptops.get(0));
System.out.println(laptops.set(0,"Samsung"));
System.out.println(laptops.remove(0));
System.out.println(laptops);
}
}
