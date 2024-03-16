import java.util.*;
public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] n_arr = n.toCharArray();
        int lb = 0, ub = n_arr.length;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, n_arr)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int x, char[] n_arr) {
        int g = 0;
        for (int i = n_arr.length - 1; i >= 0; i--) {
            x -= (x + g - (n_arr[i] - '0')) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}