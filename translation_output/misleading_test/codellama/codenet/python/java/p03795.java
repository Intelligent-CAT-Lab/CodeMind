<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
15796

```
N = int(input())
print(800*N-200*(N//15))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 800 * N - 200 * (N / 15);
        System.out.println(result);
    }
}
```
This code first prompts the user to enter an integer value, which is stored in the variable `N`. Then, it calculates the result using the formula `800 * N - 200 * (N / 15)` and prints it to the console.

Note that in Java, the `/` operator is used for integer division, which returns the integer part of the result. Therefore, `N / 15` will return the integer part of `N` divided by 15.</s>
