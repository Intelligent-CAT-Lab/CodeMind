import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class p01883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Collections.binarySearch(Arrays.asList(a), n);
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            r.add(1);
        }
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r.set(ti, r.get(ti - ts));
                r.set(ti - ts, r.get(ti));
                n -= t - ts;
            } else {
                break;
            }
        }

        String result = r.stream().map(x -> x == 1 ? "(" : ")").collect(Collectors.joining());
        System.out.println(result);
    }
}