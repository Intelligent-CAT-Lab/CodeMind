import java.util.*;
public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] n_arr = n.toCharArray();
        int lb = 0, ub = n_arr.length;
        int[] n_int = new int[n_arr.length];
        for (int i = 0; i < n_arr.length; i++) {
            n_int[i] = n_arr[i] - '0';
        }
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, n_int)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int x, int[] n) {
        int g = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            x -= (x + g - n[i]) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}