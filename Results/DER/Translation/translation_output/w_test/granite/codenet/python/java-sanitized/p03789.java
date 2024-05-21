import java.util.*;

public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] digits = new int[10];
        int temp = n;
        int i = 0;
        while (temp > 0) {
            digits[i++] = temp % 10;
            temp /= 10;
        }

        int lb = 0;
        int ub = n;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(mid, digits)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }

        System.out.println(ub);
    }

    public static boolean check(int x, int[] digits) {
        int g = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            x -= (x + g - digits[i]) % 10;
            if (x < 0) {
                return false;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}