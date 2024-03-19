<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    N = int(sys.stdin.readline()) + 1
    s = str(N)
    length = len(s)
    c = int(s[0])
    max = (c - 1) + 9 * (length - 1)
    print(max)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the given Java code. The `sys` module is used to read input from the standard input stream, and the `str` and `int` functions are used to convert the input to a string and an integer, respectively. The rest of the code is similar to the Java code, with the exception of the `print` function being used instead of `System.out.println`.</s>
