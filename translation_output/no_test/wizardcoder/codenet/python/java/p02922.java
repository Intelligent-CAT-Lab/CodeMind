Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())
total = 1
ans = 0

while total < b:
    ans += 1
    total += a-1

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
        int total = 1;
        int ans = 0;

        while (total < b) {
            ans++;
            total += a - 1;
        }

        System.out.println(ans);
    }
}
```<|endoftext|>
