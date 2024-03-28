Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```<|endoftext|>
