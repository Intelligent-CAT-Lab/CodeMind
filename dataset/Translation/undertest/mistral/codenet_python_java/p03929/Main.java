import java.util.*;

public class p03929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[][] arr = new int[11][6];
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 6; j++) {
                int sum = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        sum += 7 * (i + y) + (j + x) - 7;
                    }
                }
                if (sum % 11 == k) {
                    arr[i][j] = 1;
                }
            }
        }
        int ans = 0;
        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < 6; j++) {
                ans += arr[i][j];
            }
        }
        int a = n / 11;
        int b = n % 11;
        if (b < 1) {
            ans -= arr[10][1];
        }
        if (b < 2) {
            ans -= arr[10][0];
        }
        if (b >= 3) {
            for (int i = 1; i < b - 2; i++) {
                ans += arr[i][5];
            }
        }
        System.out.println(ans);
    }
}