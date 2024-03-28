import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int lb = 0, ub = n;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int x) {
        int g = 0;
        for (int i = 0; i < n; i++) {
            x -= (x + g - arr[i]) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}