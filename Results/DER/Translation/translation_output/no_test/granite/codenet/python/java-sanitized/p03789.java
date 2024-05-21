import java.util.*;
public class p03789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int n = arr.length;
        int lb = 0, ub = n;
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

    public static boolean check(char[] arr, int x) {
        int g = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            x -= (x + g - Character.getNumericValue(arr[i])) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}