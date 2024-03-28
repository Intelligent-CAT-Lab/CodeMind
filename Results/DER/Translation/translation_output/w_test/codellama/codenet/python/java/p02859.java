<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
4


```
r = int(input())
print(r**2)
```
[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(r * r);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read an integer value from the input. The `print()` method is then used to print the result of the calculation.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `print()` method is then used to print the result of the calculation.

Also, note that the `import` statement is used to import the `Scanner` class from the `java.util` package.</s>
