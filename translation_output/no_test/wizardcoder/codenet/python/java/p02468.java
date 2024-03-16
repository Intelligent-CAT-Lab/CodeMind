Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int result = (int) Math.pow(m, n) % mod;
        System.out.println(result);
    }
}
```<|endoftext|>
