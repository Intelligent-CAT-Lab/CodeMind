Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0 0


```
print(*divmod(int(input())*2,60))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] result = divmod(input*2, 60);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] divmod(int a, int b) {
        int[] result = new int[2];
        result[0] = a / b;
        result[1] = a % b;
        return result;
    }
}
```<|endoftext|>
