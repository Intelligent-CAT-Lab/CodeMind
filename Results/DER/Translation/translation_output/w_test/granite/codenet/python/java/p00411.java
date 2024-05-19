System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double t = scanner.nextDouble();
        double r = scanner.nextDouble();
        double ans = r * t / a;
        System.out.println(String.format("%.6f", ans));
    }
}
```

Test input:
```
180 120 90
```

Expected output:
```
60.000000
```<|endoftext|>
