Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c, d = map(int, input().split())
ans = -1000000000000000000
ans = max(ans, a * c, a * d, b * c, b * d)
print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long ans = -1000000000000000000L;
        ans = Math.max(ans, (long) a * c);
        ans = Math.max(ans, (long) a * d);
        ans = Math.max(ans, (long) b * c);
        ans = Math.max(ans, (long) b * d);
        System.out.println(ans);
    }
}
```<|endoftext|>
