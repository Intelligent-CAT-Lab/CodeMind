Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0011

Expected output:
24

```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int N = A.length();

        int C0 = 0, C1 = 0;
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '0') {
                C0++;
            } else {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```<|endoftext|>
