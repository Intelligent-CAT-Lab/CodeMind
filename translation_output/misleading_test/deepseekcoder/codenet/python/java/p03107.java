<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0011

Expected output:
24

```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        int N = A.length();

        long C0 = A.chars().filter(ch -> ch == '0').count();
        long C1 = A.chars().filter(ch -> ch == '1').count();

        System.out.println(2 * Math.min(C0, C1));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, counts the number of "0"s and "1"s in the string, and then prints the product of the counts of "0"s and "1"s, multiplied by 2.

The `chars()` method returns a stream of integers representing the Unicode code points of the characters in the string. The `filter()` method filters this stream to include only the characters that are '0' or '1'. The `count()` method counts the number of elements in the resulting stream.

The `Math.min()` function is used to find the minimum of the two counts.
<|EOT|>
