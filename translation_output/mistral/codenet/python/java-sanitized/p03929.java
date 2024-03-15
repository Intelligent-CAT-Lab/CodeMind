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
                if (arr[i][j] == 1) {
                    ans++;
                }
            }
        }
        if (n % 11 < 2) {
            ans -= arr[n % 11 - 1][5];
        }
        if (n % 11 < 3) {
            ans -= arr[n % 11 - 2][4];
        }
        if (n % 11 >= 3) {
            for (int i = n % 11 - 2; i >= 0; i--) {
                ans += arr[i][3];
            }
        }
        System.out.println(ans);
    }
}