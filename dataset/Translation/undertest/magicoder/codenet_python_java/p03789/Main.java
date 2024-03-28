import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();
        n = sb.toString();
        int lb = 0, ub = n.length();
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(n, 9 * mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    private static boolean check(String n, int x) {
        int g = 0;
        for (int i = 0; i < n.length(); i++) {
            x -= (x + g - Character.getNumericValue(n.charAt(i))) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}