import java.util.*;
public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int len = n.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = n.charAt(i) - '0';
        }
        int lb = 0, ub = len;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(arr, mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int[] arr, int x) {
        int g = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            x -= (x + g - arr[i]) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}