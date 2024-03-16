import java.util.Scanner;
import java.util.Arrays;

public class p03389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] abc = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a = Arrays.copyOf(abc, abc.length);
        Arrays.sort(a);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            
            s += tmp / 2;
            a[i] += (tmp / 2) * 2;
        }

        s += Arrays.stream(a).sum() % 3;

        System.out.println(s);
    }
}