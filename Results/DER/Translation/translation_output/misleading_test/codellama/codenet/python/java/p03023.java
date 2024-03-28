<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
256

```
n = int(input())
s = 180 * (n - 2)
print(s)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}
```
This code first prompts the user to enter an integer value using the `Scanner` class. It then calculates the value of `s` using the formula `180 * (n - 2)` and prints the result to the console using `System.out.println()`.</s>
