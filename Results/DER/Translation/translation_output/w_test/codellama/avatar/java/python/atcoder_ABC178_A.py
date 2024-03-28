<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
1


```
public class atcoder_ABC178_A {
    public static void main(String[] args) {
        int x = new java.util.Scanner(System.in).nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```
[/INST]
```
import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
```

Here's the Python code:
```
import sys

x = int(sys.stdin.readline())
if x == 0:
    print("1")
else:
    print("0")
```
Note that the `java.util.Scanner` class is not available in Python, so we need to use the `sys.stdin.readline()` method to read input from the standard input stream.</s>
