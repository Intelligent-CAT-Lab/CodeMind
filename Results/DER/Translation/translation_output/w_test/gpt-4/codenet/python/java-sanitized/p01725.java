import java.util.Scanner;
import java.util.stream.Stream;

public class p01725 {
    private static final char[] code = {'+', '-', '*'};
    private static String S;
    private static int cur = 0;

    private static int parse(int[] pri) {
        cur = 0;

        return expr(0, pri);
    }

    private static int number() {
        if (S.charAt(cur) == '(') {
            cur++; // '('
            int v = expr(0, null); // pri not needed for sub-expression
            cur++; // ')'
            return v;
        }
        int num = 0;
        while (cur < S.length() && Character.isDigit(S.charAt(cur))) {
            num = 10 * num + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return num;
    }

    private static int expr(int level, int[] pri) {
        char op = '+';
        int result = 0;
        while (true) {
            int v = level == 2 ? number() : expr(level + 1, pri);
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            if (cur == S.length() || indexOf(code, S.charAt(cur)) == -1 || pri[indexOf(code, S.charAt(cur))] != level) {
                break;
            }
            op = S.charAt(cur);
            cur++;
        }
        return result;
    }

    private static int indexOf(char[] array, char key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.next() + "$";

        int ans = Integer.MIN_VALUE;
        for (int[] pri : product(new int[]{0, 1, 2}, 3)) {
            ans = Math.max(ans, parse(pri));
        }
        System.out.println(ans);
        scanner.close();
    }

    private static int[][] product(int[] array, int repeat) {
        int total = (int) Math.pow(array.length, repeat);
        int[][] product = new int[total][repeat];
        for (int i = 0; i < total; i++) {
            int[] result = new int[repeat];
            int temp = i;
            for (int j = 0; j < repeat; j++) {
                result[j] = array[temp % array.length];
                temp /= array.length;
            }
            product[i] = result;
        }
        return product;
    }
}