import java.util.Scanner;

public class p03789 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] n = scanner.next().toCharArray();
        reverse(n);
        int lb = 0, ub = n.length;
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

    private static boolean check(char[] n, int x) {
        int g = 0;
        for (char c : n) {
            int digit = c - '0';
            x -= (x + g - digit) % 10;
            if (x < 0) {
                return false;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }

    private static void reverse(char[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}