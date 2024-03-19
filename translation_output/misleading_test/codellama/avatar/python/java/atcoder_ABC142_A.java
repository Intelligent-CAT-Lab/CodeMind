<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
64

Expected output:
22.04590006873798

```
N = int ( input ( ) )
if N % 2 == 0 :
    print ( 0.5 )
else :
    print ( ( N + 1 ) / N / 2 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((N + 1) / N / 2);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `if` statement to check if the input is even or odd. If the input is even, it prints `0.5`, otherwise it prints the result of the expression `(N + 1) / N / 2`.

Note that in Java, the `nextInt()` method of the `Scanner` class returns an `int` value, so you don't need to cast the result to an `int` explicitly.</s>
