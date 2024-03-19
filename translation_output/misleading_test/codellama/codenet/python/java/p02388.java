<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
12

```
x = int(raw_input())
print x*x*x
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x*x*x);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer value from the input. The `println()` method is then used to print the result of the calculation to the console.

Note that the `raw_input()` function in Python is equivalent to the `Scanner` class in Java, and the `print` function in Python is equivalent to the `println()` method in Java.</s>
