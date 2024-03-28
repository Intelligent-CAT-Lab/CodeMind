import java.util.*;

public class p01725 {
    static String S;
    static int cur;
    static String code = "+-*";
    static int[] pri;

    static int number() {
        char c = S.charAt(cur);
        if (c == '(') {
            cur += 1;
            int v = expr(0);
            cur += 1;
            return v;
        }
        int num = 0;
        while (Character.isDigit(S.charAt(cur))) {
            num = 10 * num + (S.charAt(cur) - '0');
            cur += 1;
        }
        return num;
    }

    static int expr(int level) {
        char op = '+';
        int result = 0;
        while (true) {
            int v;
            if (level == 2) {
                v = number();
            } else {
                v = expr(level + 1);
            }
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            char c = S.charAt(cur);
            if (code.indexOf(c) == -1 || pri[code.indexOf(c)] != level) {
                break;
            }
            op = c;
            cur += 1;
        }
        return result;
    }

    static int parse(int[] pri) {
        cur = 0;
        return expr(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.next() + "$";
        int ans = -1000000000;
        for (pri = new int[]{0, 1, 2}; pri[0] < 3; pri = nextPermutation(pri)) {
            ans = Math.max(ans, parse(pri));
        }
        System.out.println(ans);
    }

    static int[] nextPermutation(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                for (int j = array.length - 1; j >= i; j--) {
                    if (array[j] > array[i - 1]) {
                        int temp = array[i - 1];
                        array[i - 1] = array[j];
                        array[j] = temp;
                        Arrays.sort(array, i, array.length);
                        return array;
                    }
                }
            }
        }
        return new int[]{};
    }
}