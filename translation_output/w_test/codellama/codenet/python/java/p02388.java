<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8


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
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to get the input as an integer. The `print` statement is used to print the result of the calculation.

Note that in Java, the `print` statement is used to print to the console, while the `println` statement is used to print to the console and add a newline character at the end.</s>
