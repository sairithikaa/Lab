public class AddNumbers {
    public int add(int a,int b){
        return a + b;
    }
    public int add(int a, int b,int c){
        return a + b + c;
    }
    public double add(double a, double b){
        return a + b;
    }
    public String add(String a,int b){
        return a +" "+ b;
    }

    public static void main(String[] args) {
        AddNumbers obj1 = new AddNumbers();
        System.out.println(obj1.add(20,30));
        System.out.println(obj1.add(10,10,10));
        System.out.println(obj1.add(12.5,4.5));
        System.out.println(obj1.add("Hello",10));




    }
}
