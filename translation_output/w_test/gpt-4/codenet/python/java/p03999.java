Below is the Java equivalent of the provided Python code. It takes an input number as a String, generates all possible combinations of the number with inserted plus signs, evaluates the expressions, and then sums them up to produce the final result:

```java
import java.util.Scanner;

public class EvaluateCombinations {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        long ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            StringBuilder expression = new StringBuilder(s.substring(0, 1));
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i & (1 << j)) > 0) {
                    expression.append("+");
                }
                expression.append(s.charAt(j + 1));
            }
            ans += eval(expression.toString());
        }

        System.out.println(ans);
    }
    
    private static long eval(String expression) {
        String[] numbers = expression.split("\\+");
        long result = 0;
        
        for (String number : numbers) {
            result += Long.parseLong(number);
        }
        
        return result;
    }
}
```
This program uses bitwise operations to generate all the possible patterns of placements for the plus sign. The `eval` method has been replaced by the `eval` function in Java, which manually splits the string by the '+' sign and then adds the numbers.

The sample test case:

Test input:
125

Expected output:
176

Upon running this Java code with the provided test case, the expected output should be `176`.
