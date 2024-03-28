<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
5.03637601641222

```
a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int t = scanner.nextInt();
        int r = scanner.nextInt();
        double ans = r * t / a;
        System.out.println(String.format("%.6f", ans));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String.format()` method to format the output to 6 decimal places. The `map()` method is not needed in Java, as the `Scanner` class can directly read input as integers.</s>
