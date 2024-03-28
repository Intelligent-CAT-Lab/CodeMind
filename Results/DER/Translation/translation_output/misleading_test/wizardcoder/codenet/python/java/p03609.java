Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 17

Expected output:
43

```
x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int result = (x - t > 0)? x - t : 0;
        System.out.println(result);
    }
}
```<|endoftext|>
