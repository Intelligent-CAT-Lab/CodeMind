Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```<|endoftext|>
