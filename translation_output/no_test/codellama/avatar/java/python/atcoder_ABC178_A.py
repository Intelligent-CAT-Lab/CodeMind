<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```
import sys

x = int(sys.stdin.readline())
if x == 0:
    print("1")
else:
    print("0")
```
This is the equivalent Python code for the given Java code. The `import sys` statement is used to import the `sys` module, which provides access to the standard input and output streams. The `int(sys.stdin.readline())` statement reads a line of input from the standard input stream and converts it to an integer using the `int()` function. The `if` statement checks if the input is equal to 0, and if it is, it prints "1" to the standard output stream. Otherwise, it prints "0".</s>
