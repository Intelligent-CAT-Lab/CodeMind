<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
25

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

In Python, we can use the `input()` function to read a line of input from the user, and the `print()` function to print the output.

Here's the Python code for the same program:
```
x = int(input())
if x == 0:
    print("1")
else:
    print("0")
```
This code reads a line of input from the user, converts it to an integer using the `int()` function, and then checks if the value is equal to 0. If it is, it prints "1" to the console, otherwise it prints "0".</s>
