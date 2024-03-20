Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 5

Expected output:
-70

```
# coding: utf-8
D, N = map(int, input().split())
print(100 ** D * N if N!= 100 else 100 ** D * (N + 1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int result = 100;
        for (int i = 1; i <= D; i++) {
            result *= 100;
        }
        result *= N;
        if (N == 100) {
            result -= 100;
        }
        System.out.println(result);
    }
}
```<|endoftext|>
