Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j) % 2 == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index += 1;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }

        System.out.println(ans);
    }

    public static int eval(String expression) {
        try {
            return Integer.parseInt(expression);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then generates all possible combinations of the string with "+" inserted between each character, and evaluates each combination as an integer. The sum of all evaluations is printed out.

Note that the `eval` function is a simple implementation that only works for strings that can be parsed as integers. If you need to evaluate more complex expressions, you would need to use a more sophisticated parser or evaluator.
