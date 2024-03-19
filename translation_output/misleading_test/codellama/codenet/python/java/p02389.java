<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
16

```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a*b);
        System.out.println((a+b)*2);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read the next integer from the input.
* The `split()` method is used to split the input into two integers.
* The `print()` method is used to print the result.

Note: The `map()` function in Python is not available in Java, so we have to use the `Scanner` class to read the input and split it into two integers.</s>
