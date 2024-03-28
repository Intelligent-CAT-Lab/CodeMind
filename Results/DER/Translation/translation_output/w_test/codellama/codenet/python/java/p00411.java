<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
60.0


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

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer value from the user.
* The `split()` method is used to split the input string into an array of strings.
* The `map()` method is used to convert the array of strings into an array of integers.
* The `ans` variable is calculated using the formula provided in the problem statement.
* The `String.format()` method is used to format the output to 6 decimal places.
* The `System.out.println()` method is used to print the output to the console.</s>
