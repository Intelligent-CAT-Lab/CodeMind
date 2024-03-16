Below is the Java translation for the given Python code. The Python code calculates the maximum possible value of an arithmetic expression by trying all possible combinations of operator precedence levels.

Please note that Java requires more boilerplate code and has different syntax for certain operations, such as handling input, defining the main method, and working with Lists instead of Python's more flexible array-like structures.

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExpressionCalculator {
    private static final List<Character> digits = IntStream.rangeClosed('0', '9')
                                                           .mapToObj(c -> (char) c)
                                                           .collect(Collectors.toList());
    private static final List<Character> code = Arrays.asList('+', '-', '*');
    private static String S;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        S = scanner.nextLine() + "$";
        scanner.close();

        long ans = Long.MIN_VALUE;
        for (int[] pri : product(new int[] {0, 1, 2}, 3)) {
            ans = Math.max(ans, parse(pri));
        }
        System.out.println(ans);
    }

    private static int cur;

    private static long parse(int[] pri) {
        cur = 0;
        return expr(0, pri);
    }

    private static long number() {
        if (S.charAt(cur) == '(') {
            cur++; // '('
            long v = expr(0);
            cur++; // ')'
            return v;
        }
        long num = 0;
        while (digits.contains(S.charAt(cur))) {
            num = 10 * num + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        return num;
    }

    private static long expr(int level, int[] pri) {
        char op = '+';
        long result = 0;
        while (true) {
            long v = level == 2 ? number() : expr(level + 1, pri);
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            char c = S.charAt(cur);
            int idx = code.indexOf(c);
            if (idx == -1 || pri[idx] != level) {
                break;
            }
            op = c;
            cur++;
        }
        return result;
    }

    private static int[][] product(int[] s, int k) {
        int len = (int) Math.pow(s.length, k);
        int[][] res = new int[len][k];
        for (int i = 0; i < len; i++) {
            int[] tmp = new int[k];
            int index = i;
            for (int j = 0; j < k; j++) {
                tmp[j] = s[index % s.length];
                index /= s.length;
            }
            res[i] = tmp;
        }
        return res;
    }
}
```

This code takes an arithmetic expression from the console input and computes the maximum possible value of the expression by permuting operator precedence. It uses Cartesian product to generate all possible precedence combinations. Note that exception handling and validation are not included and should be considered for robust production-level code.
