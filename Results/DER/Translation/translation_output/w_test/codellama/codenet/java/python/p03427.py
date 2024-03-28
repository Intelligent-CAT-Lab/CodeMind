<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
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
This is the Python code that translates the given Java code. The code uses the `sys` module to read input from stdin and the `str` and `int` functions to convert the input to a string and an integer, respectively. The code then calculates the maximum value using the same logic as the Java code. Finally, the code prints the maximum value to stdout.</s>
