Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
H, W, X, Y = map(int, input().split())

if ((H * W) * (X + Y)) % 2:
    print('No')
else:
    print('Yes')

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if ((H * W) * (X + Y) % 2 == 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```<|endoftext|>
