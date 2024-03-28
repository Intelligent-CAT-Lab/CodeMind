<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
48


```
r=int(input())
print(3*(r**2))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int area = 3 * (r * r);
        System.out.println(area);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `int` keyword is used to declare a variable of type integer.
* The `*` operator is used to perform multiplication.
* The `print()` method is used to print the result to the console.

Note: The `print()` method is used instead of `System.out.println()` to print the result. This is because the `print()` method is more concise and easier to read.</s>
