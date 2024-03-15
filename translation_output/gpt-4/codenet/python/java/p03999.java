Below is the translated Python code to Java. This Java program does the same task as the Python script - it takes a string as input, creates patterns by inserting "+" at every possible position between the digits of the string, evaluates each pattern as an arithmetic expression, and sums the results.

```java
import java.util.Scanner;

public class CalculatePatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        long ans = 0;
        int maxCombinations = 1 << (s.length() - 1); // same as 2 ** (len(s) - 1)
        for (int i = 0; i < maxCombinations; i++) {
            StringBuilder pat = new StringBuilder();
            pat.append(s.charAt(0));

            for (int j = 0; j < s.length() - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    pat.append("+");
                }
                pat.append(s.charAt(j + 1));
            }

            ans += evaluate(pat.toString());
        }

        System.out.println(ans);
        scanner.close();
    }

    private static long evaluate(String expression) {
        // This is a simple method to evaluate the expression
        // Assumes that the expression only contains positive digits and '+' signs
        long result = 0;
        String[] numbers = expression.split("\\+");
        for (String number : numbers) {
            result += Long.parseLong(number);
        }
        return result;
    }
}
```

Please note that the `eval` function in Python can evaluate the string expression directly, but Java does not have a direct equivalent. In the provided Java code, I've included a simple `evaluate` method that assumes the expression only contains positive digits and '+' signs. If you need to support more complex expressions, you would typically use a third-party library or write a more comprehensive expression parser.
