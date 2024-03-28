import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        char[] nArray = n.toCharArray();
        int lb = 0;
        int ub = nArray.length;

        int result = getMaxSumIndex(nArray, lb, ub);

        System.out.println(result);
    }

    private static int getMaxSumIndex(char[] n, int lb, int ub) {
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, n)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        return ub;
    }

    private static boolean check(int x, char[] n) {
        int g = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            char digit = n[i];
            x -= (x + g - Character.getNumericValue(digit)) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}