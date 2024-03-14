Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def inpl(): return list(map(int, input().split()))
W, H, w, h, x, y = inpl()

a = (min(W//2, x + w//2) + max(-W//2, x-w//2))
b = (min(H//2, y + h//2) + max(-H//2, y-h//2))
print(b/a)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = Math.min(W/2, x + w/2) + Math.max(-W/2, x-w/2);
        int b = Math.min(H/2, y + h/2) + Math.max(-H/2, y-h/2);
        double ratio = (double)b/a;
        System.out.println(ratio);
    }
}
```<|endoftext|>
