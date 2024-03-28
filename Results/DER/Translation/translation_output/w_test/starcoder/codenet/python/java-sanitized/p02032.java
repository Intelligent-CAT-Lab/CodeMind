import java.util.*;
import java.io.*;

public class p02032 {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]!= i) {
                continue;
            }
            for (int j = i; j <= n; j += i) {
                arr[j] = arr[j] / i * (i - 1);
            }
        }
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}