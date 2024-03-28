Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 4

Expected output:
88

```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        int result = (int) Math.ceil((double) H / A);
        System.out.println(result);
    }
}
```<|endoftext|>
