<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
59 96

Expected output:
96 154

```
import java.io.*;
import java.util.*;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0) {
            if (m != 0)
                System.out.println("Impossible");
            else
                System.out.println(0 + " " + 0);
            return;
        }

        if (m <= n) {
            if (m == 0) {
                m = 1;
            }
            System.out.print(n + " " + (m + n - 1));
            return;
        }

        System.out.print(m + " " + (m + n - 1));
    }
}
```
[/INST]
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())

    if n == 0:
        if m != 0:
            print("Impossible")
        else:
            print(0, 0)
        return

    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
        return

    print(m, m + n - 1)

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input from a string to an integer. The `split` method is used to split the input into two integers. The `readline` method is used to read a line from the input. The `print` function is used to print the output.</s>
