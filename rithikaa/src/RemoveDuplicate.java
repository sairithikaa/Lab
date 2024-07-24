import java.time.LocalDate;
import java.time.Duration;
public class RemoveDuplicate {
    public static void main(String[] args) {
//        int[] array = {1, 1, 2, 6, 7, 6, 8, 2};
//        int n = array.length;
//        int [] ans = new int [n-1];
//        int j = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (array[i] != array[i+1]) {
//
//                ans[j] = array[i];
//                j++;
//            }
//        }
//        ans[j] = array[n-1];
//        j++;
//        System.out.println("Duplicate are removed: ");
//        for(int i =0;i<n;i++){
//            System.out.println(ans[j] +" ");
//        }
//        System.out.println();
        System.out.println(LocalDate.MAX.compareTo(LocalDate.now()));

        Duration value=Duration.ZERO;
        System.out.println(value);
        value=Duration.ofHours(3);
        System.out.println(value);

    }
}


