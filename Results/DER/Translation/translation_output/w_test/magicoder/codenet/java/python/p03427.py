<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def main():
    N = int(input()) + 1

    # æ¡æ°
    s = str(N)
    length = len(s)
    c = int(s[0])
    max = (c - 1) + 9 * (length - 1)

    print(max)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, adds 1 to it, converts it to a string, and then calculates the maximum possible value that can be obtained by subtracting 1 from the first digit and adding 9 times the number of digits minus 1. The result is then printed to the console.<｜end▁of▁sentence｜>
