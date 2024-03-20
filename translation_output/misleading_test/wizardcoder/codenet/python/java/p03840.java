Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 1 0 0 0 0

Expected output:
-20

```
I, O, T, J, L, S, Z = map(int, input().split())
if I and J and L:
  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
else:
  a = 0
b = (I//2 + J//2 + L//2)*2 + O
ans = max(a, b)
print(ans)
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int I = sc.nextInt();
        int O = sc.nextInt();
        int T = sc.nextInt();
        int J = sc.nextInt();
        int L = sc.nextInt();
        int S = sc.nextInt();
        int Z = sc.nextInt();
        int a = 0;
        int b = 0;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I-1)/2 + (J-1)/2 + (L-1)/2)*2 + 3 + O;
        }
        b = (I/2 + J/2 + L/2)*2 + O;
        int ans = Math.max(a, b);
        System.out.println(ans);
    }
}
```<|endoftext|>
