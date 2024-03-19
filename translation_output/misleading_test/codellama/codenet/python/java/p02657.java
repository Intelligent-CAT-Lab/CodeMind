<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
56

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
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `L` and `R`. It then prints the product of `L` and `R` to the console.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read the next integer from the input stream. The `System.out.println()` method is used to print the result to the console.</s>
