<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0.5000000000


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
        double result = -(-N/2)/N;
        System.out.println(result);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `double` data type is used to store the result of the calculation.
* The calculation is performed using the `-(-N/2)/N` expression, which is equivalent to the Python code `print(-(-N//2)/N)`.
* The result is printed to the console using the `System.out.println()` method.</s>
