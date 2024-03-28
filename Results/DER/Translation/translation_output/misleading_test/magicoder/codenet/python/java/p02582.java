<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
RRS

Expected output:
91

```
import sys


def solve():
    readline = sys.stdin.buffer.readline
    mod = 10 ** 9 + 7
    s = str(readline().rstrip().decode('utf-8'))
    if s == "RRR":
        print(3)
    elif s == "RRS" or s == "SRR":
        print(2)
    elif s.count("R") == 0:
        print(0)
    else:
        print(1)


if __name__ == '__main__':
    solve()

```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.indexOf('R') == -1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, and then checks if the string is "RRR", "RRS", "SRR", or contains no 'R's. Depending on the result, it prints the corresponding number.<｜end▁of▁sentence｜>
