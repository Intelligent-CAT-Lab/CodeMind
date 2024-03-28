import java.util.*;

public class p03398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += arr[i] * (i + 1);
        }
        System.out.println(ans);
    }
}