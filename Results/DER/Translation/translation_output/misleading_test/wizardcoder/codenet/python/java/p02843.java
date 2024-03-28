Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
615

Expected output:
-71

```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = N / 100;
        int mod = N % 100;
        int result = 1;
        if (mod <= q * 5) {
            result = 0;
        }
        System.out.println(result);
    }
}
```<|endoftext|>
