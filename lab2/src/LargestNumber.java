public class LargestNumber {
   public int display(int a, int b, int c) {
        int n = a;
        if (b > n) {
            n = b;
        }
        if (c > n) {
            n = c;
        }
        return n;
    }

    public static void main(String[] args) {

        LargestNumber obj1 = new LargestNumber();
        int num = obj1.display(55,65,78);
        System.out.println(num);


    }
}
