<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-15.97688597978339

```
N = int(input())
print(-(-N//2)/N)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(-(-N/2)/N);
    }
}
```
This code first prompts the user to enter an integer value, which is stored in the variable `N`. Then, it calculates the expression `-(-N/2)/N` and prints the result to the console.

The expression `-(-N/2)/N` can be broken down as follows:

* `-(-N/2)`: This is the same as `N/2`, since the negative sign is cancelled out by the division.
* `/N`: This is the same as `1/N`, since the division by `N` is equivalent to multiplying by `1/N`.
* `-`: This is the negative sign, which flips the sign of the result.

Therefore, the expression `-(-N/2)/N` is equivalent to `1/N`, which is the reciprocal of `N`.

The expected output for the test case `4` is `-15.97688597978339`, which is the reciprocal of `4`.</s>
