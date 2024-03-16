import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        char[] arr = n.toCharArray();
        int lb = 0, ub = arr.length;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(arr, 9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    private static boolean check(char[] arr, int x) {
        int g = 0;
        for (char c : arr) {
            int i = Character.getNumericValue(c);
            x -= (x + g - i) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}