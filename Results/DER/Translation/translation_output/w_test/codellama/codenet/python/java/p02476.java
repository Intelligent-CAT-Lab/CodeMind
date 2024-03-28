<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
5


```
a,b = map(int,input().split())
print(a%b)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `%` operator is used to calculate the remainder of the division of `a` by `b`.
* The `println()` method is used to print the result to the console.

Note: The `map()` function is not available in Java, so we have to use the `Scanner` class to read the input and convert it to integers.</s>
