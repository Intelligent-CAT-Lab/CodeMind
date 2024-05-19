System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```<|endoftext|>
