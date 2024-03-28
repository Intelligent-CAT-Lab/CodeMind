<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
-13

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
        int max = Math.max(calculateFirst(n) + 9 * (n.length() - 1), calculateSum(n));
        System.out.println(max);
    }

    private static int calculateFirst(String n) {
        return Integer.parseInt(n.substring(0, 1)) - 1;
    }

    private static int calculateSum(String n) {
        int sum = 0;
        for (char c : n.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
```

This Java code reads an integer from the standard input, calculates the maximum of two values: the first digit minus 1 plus 9 times the number of digits minus 1, and the sum of all digits. It then prints the maximum of these two values.

The `calculateFirst` method calculates the first digit minus 1. The `calculateSum` method calculates the sum of all digits. The `main` method reads the input, calculates the maximum of the two values, and prints the result.
<|EOT|>
