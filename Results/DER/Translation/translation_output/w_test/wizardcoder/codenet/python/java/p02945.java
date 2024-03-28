Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-13 3

Expected output:
-10


```
a, b=map(int, input().split())
print(max(a-b, a+b, a*b))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(Math.max(a-b, a+b), a*b);
        System.out.println(max);
    }
}
```<|endoftext|>
