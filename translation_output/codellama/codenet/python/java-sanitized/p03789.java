import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] n = input.toCharArray();
        int lb = 0;
        int ub = n.length;

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

    private static boolean check(int x) {
        int g = 0;
        for (char i : n) {
            x -= (x + g - Character.getNumericValue(i)) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}