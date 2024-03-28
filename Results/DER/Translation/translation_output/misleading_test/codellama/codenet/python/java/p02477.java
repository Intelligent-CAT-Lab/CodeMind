<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-55

```
a,b = map(int,input().split())
print(a*b)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers and store them in the variables `a` and `b`. Finally, it prints the product of `a` and `b` to the console.

Note that the `map()` function in Python is not necessary in Java, as the `Scanner` class provides a built-in method for reading input and converting it to the desired data type.</s>
