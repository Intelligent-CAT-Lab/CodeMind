Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        int ans = (int) Math.ceil((double) D / L) + (D - L * (int) Math.ceil((double) D / L));
        System.out.println(ans);
    }
}
```<|endoftext|>
