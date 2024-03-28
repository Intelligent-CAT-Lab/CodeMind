import java.util.*;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] l = factorization(p);
        int ans = 1;
        for (int i = 0; i < l.length; i++) {
            if (l[i] >= n) {
                ans *= (int) Math.pow(i, l[i] / n);
            }
        }
        System.out.println(ans);
    }

    public static int[] factorization(int n) {
        int[] arr = new int[n + 1];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[i] = cnt;
            }
        }
        if (temp != 1) {
            arr[temp] = 1;
        }
        if (arr[0] == 0) {
            arr[n] = 1;
        }
        return arr;
    }
}