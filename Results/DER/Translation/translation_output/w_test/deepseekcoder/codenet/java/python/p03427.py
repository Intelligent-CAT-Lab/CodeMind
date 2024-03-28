<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
18


```
import java.util.Scanner;

public class p03427 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long N = scanner.nextLong() + 1;
        scanner.close();

        // æ¡æ°
        String s = String.valueOf(N);
        int length = s.length();
        int c = Integer.parseInt(s.substring(0, 1));
        int max = (c - 1) + 9 * (length - 1);

        System.out.println(max);
    }
}
```

### Response:
```python
def p03427(N):
    N = int(N) + 1
    s = str(N)
    length = len(s)
    c = int(s[0])
    max = (c - 1) + 9 * (length - 1)
    return max

print(p03427(input()))
```

This Python code does the same thing as the Java code. It reads an integer from the input, adds 1 to it, converts it to a string, calculates the length of the string, gets the first digit of the string, calculates the maximum possible value, and then prints the result.
<|EOT|>
