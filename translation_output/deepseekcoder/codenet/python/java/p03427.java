<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int maxValue = Math.max(Integer.parseInt(String.valueOf(n.charAt(0))) - 1 + 9 * (n.length() - 1), sumOfDigits(n));
        System.out.println(maxValue);
    }

    private static int sumOfDigits(String n) {
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, calculates the maximum value between the sum of the digits and the first digit subtracted by 1 plus 9 times the number of digits minus 1, and prints the result.

The `sumOfDigits` method calculates the sum of the digits in a string. It does this by iterating over the characters in the string, converting each character to an integer, and adding it to the sum.
<|EOT|>
