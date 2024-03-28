Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6000 5000 20 10 400 300

Expected output:
-21.71282545948924

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
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        double result = calculate(arr);
        System.out.println(result);
    }

    public static double calculate(int[] arr) {
        int W = arr[0];
        int H = arr[1];
        int w = arr[2];
        int h = arr[3];
        int x = arr[4];
        int y = arr[5];

        int a = Math.min(W/2, x + w/2) + Math.max(-W/2, x-w/2);
        int b = Math.min(H/2, y + h/2) + Math.max(-H/2, y-h/2);
        return (double) b/a;
    }
}
```<|endoftext|>
