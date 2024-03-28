<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6000 5000 20 10 400 300

Expected output:
0.75


```
def inpl(): return list(map(int, input().split()))
W, H, w, h, x, y = inpl()

a = (min(W//2 , x + w//2) + max(-W//2, x-w//2))
b = (min(H//2 , y + h//2) + max(-H//2, y-h//2))
print(b/a)

```
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = scanner.nextLine().split(" ");
        int W = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);
        int x = Integer.parseInt(input[4]);
        int y = Integer.parseInt(input[5]);

        int a = (Math.min(W / 2, x + w / 2) + Math.max(-W / 2, x - w / 2));
        int b = (Math.min(H / 2, y + h / 2) + Math.max(-H / 2, y - h / 2));
        double result = (double) b / a;
        System.out.println(result);
    }
}
```</s>
