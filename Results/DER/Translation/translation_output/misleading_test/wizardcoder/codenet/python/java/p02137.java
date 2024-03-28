Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5700

Expected output:
5416

```
print(int(int(input()) // 500 * 500))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = (int) Math.floor(num / 500.0) * 500;
        System.out.println(result);
    }
}
```<|endoftext|>
