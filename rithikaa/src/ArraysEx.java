public class ArraysEx {
    public static void main(String[] args) {
        char[] a = {'b', 'c', 'f', 'd', 'g'};
        java.util.Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        char[] reverse = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            reverse[i] = a[a.length - 1 - i];

        }

    }
}
