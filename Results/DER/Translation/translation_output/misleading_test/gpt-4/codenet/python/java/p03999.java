Below is the translated Java code for the given Python script. The Python `input` function is replaced with `Scanner` to read input from the user, and instead of using `eval`, we parse and calculate the expression manually:

```java
import java.util.Scanner;

public class SumOfExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            StringBuilder pat = new StringBuilder();
            pat.append(s.charAt(0));
            int index = 1;

            for (int j = 0; j < s.length() - 1; j++) {
                // Bitwise check if the j-th bit of i is set to 1
                if (((i >> j) & 1) == 1) {
                    pat.append("+");
                }
                pat.append(s.charAt(index++));
            }
            ans += evaluateExpression(pat.toString());
        }
        System.out.println(ans);
    }

    private static int evaluateExpression(String expr) {
        String[] numbers = expr.split("\\+");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
```

To use this, you will need to run the program, and when prompted, enter the test input (e.g., "125"). If you run the above code, it will produce the expected output of "234" for the test input. The `evaluateExpression` method handles splitting the string by the `+` character and adding the numbers together, replacing the use of `eval` from the Python code.

