<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
64

Expected output:
0.5000000000


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

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement is used to check if the input is even or odd.
* If the input is even, the program prints `0.5`.
* If the input is odd, the program prints the result of the expression `(N + 1) / N / 2`.
* The `System.out.println()` method is used to print the result to the console.

Note: The `Scanner` class is used to read input from the user. If you want to use a different input method, you can replace the `Scanner` class with the appropriate class for your input method.</s>
