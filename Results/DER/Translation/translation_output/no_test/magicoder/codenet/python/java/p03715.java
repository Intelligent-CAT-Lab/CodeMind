<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
h,w = map(int, input().split())

if h%3==0 or w%3==0:
    print(0)
    exit()

res = min(h,w)
for hi in range(1,h):
    b1 = hi*w
    b2 = (h-hi)*(w//2)
    b3 = (h-hi)*(w//2+w%2)
    res = min(res, max(b1,b2,b3)-min(b1,b2,b3))
for wi in range(1,w):
    b1 = wi*h
    b2 = (w-wi)*(h//2)
    b3 = (w-wi)*(h//2+h%2)
    res = min(res, max(b1,b2,b3) - min(b1,b2,b3))

print(res)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        scanner.close();

        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            System.exit(0);
        }

        int res = Math.min(h, w);
        for (int hi = 1; hi < h; hi++) {
            int b1 = hi * w;
            int b2 = (h - hi) * (w / 2);
            int b3 = (h - hi) * (w / 2 + w % 2);
            res = Math.min(res, Math.max(b1, Math.max(b2, b3)) - Math.min(b1, Math.min(b2, b3)));
        }
        for (int wi = 1; wi < w; wi++) {
            int b1 = wi * h;
            int b2 = (w - wi) * (h / 2);
            int b3 = (w - wi) * (h / 2 + h % 2);
            res = Math.min(res, Math.max(b1, Math.max(b2, b3)) - Math.min(b1, Math.min(b2, b3)));
        }

        System.out.println(res);
    }
}
```<｜end▁of▁sentence｜>
