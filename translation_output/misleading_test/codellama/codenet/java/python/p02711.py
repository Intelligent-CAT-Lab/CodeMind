<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
117

Expected output:
Ys

```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}
```
[/INST]
```
import java.util.Scanner;

class p02711 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String string = String.valueOf(n);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}
```

Here's the Python code that translates the Java code:
```
import sys

n = int(sys.stdin.readline())
string = str(n)
print("Yes" if "7" in string else "No")
```
Note that the `readline()` method is used to read a line of input from the standard input stream, and the `int()` function is used to convert the input to an integer. The `str()` function is used to convert the integer to a string. The `in` operator is used to check if the substring "7" is present in the string.</s>
