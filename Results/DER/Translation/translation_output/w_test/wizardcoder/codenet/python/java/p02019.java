Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3 2 1

Expected output:
2


```
n, a, b, c = map(int, input().split())
print(n-(c+a-c+b-c))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = n - (c + a - c + b - c);
        System.out.println(result);
    }
}
```<|endoftext|>
