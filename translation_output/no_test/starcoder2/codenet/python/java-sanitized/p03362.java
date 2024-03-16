import java.util.*;
import java.io.*;

public class p03362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = make_prime_nums(2000);
        int[] ans = new int[n];
        int i = 0;
        for (int pi : p) {
            if (pi % 10 == 1) {
                ans[i] = pi;
                i++;
            }
            if (i == n) {
                break;
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.print(ans[j] + " ");
        }
    }

    public static int[] make_prime_nums(int n) {
        int[] prime_nums = new int[n];
        prime_nums[0] = 2;
        int i = 3;
        int j = 1;
        while (i <= n) {
            for (int p : prime_nums) {
                if (p >= Math.sqrt(i) + 1) {
                    prime_nums[j] = i;
                    j++;
                    break;
                }
                if (i % p == 0) {
                    break;
                }
            }
            i++;
        }
        return prime_nums;
    }
}