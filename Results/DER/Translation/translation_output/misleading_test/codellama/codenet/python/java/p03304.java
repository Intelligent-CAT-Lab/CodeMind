<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-95.59809439141243

```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        if (d > 0) {
            System.out.println(2 * (n - d) * (m - 1) / (double) n * n);
        } else {
            System.out.println((m - 1) / (double) n);
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `double` keyword is used to convert the result of the division to a double-precision floating-point number.</s>
