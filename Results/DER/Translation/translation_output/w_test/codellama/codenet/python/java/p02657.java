<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


```
L, R = map(int,(input().split()))
print(L*R)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        System.out.println(L * R);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `print()` method is used to print the result to the console.

Note: The `Scanner` class is used to read input from the user, but it is not the only way to read input in Java. You can also use the `BufferedReader` class to read input from the user.</s>
