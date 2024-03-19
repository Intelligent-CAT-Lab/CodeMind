<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-14

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
        System.out.println(3 * (r * r));
    }
}
```
This code first prompts the user to enter an integer value, which is stored in the variable `r`. Then, it calculates the square of `r` and multiplies it by 3, and finally prints the result to the console.

Note that in Java, the `**` operator is used for exponentiation, while in Python it is `**`. Also, in Java, the `print` function is used to print to the console, while in Python it is `print()`.</s>
