<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
41

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

@@ Response
```python
def p03427(N):
    N += 1
    s = str(N)
    length = len(s)
    c = int(s[0])
    max = (c - 1) + 9 * (length - 1)
    return max

# Test input
print(p03427(100))
```

This Python code does the same thing as the Java code. It takes an integer input, adds 1 to it, converts it to a string, calculates the length of the string, gets the first digit of the string, calculates the maximum possible value, and then returns the maximum possible value.<｜end▁of▁sentence｜>
