Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        double result = Math.floor(A * Math.min(B - 1, N) / B);
        System.out.println((int) result);
    }
}
```<|endoftext|>
