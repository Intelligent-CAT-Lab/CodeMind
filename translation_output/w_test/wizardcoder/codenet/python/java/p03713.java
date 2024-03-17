Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
0


```
h, w = map(int, input().split())

ans = 10 ** 10
if (h % 3 == 0) or (w % 3 == 0):
    ans = 0
# åå or åå+1 ã§åã£ã¦å¨æ¢ç´¢
else:
    if h % 3 == 1:
        Sa = int(h//3) * w
        Sb = int(h//3) * w
        Sc = (int(h//3)+1) * w
        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
        ans = min(ans, dif)
    elif h % 3 == 2:
        Sa = int(h//3) * w
        Sb = (int(h//3)+1) * w
        Sc = (int(h//3)+1) * w
        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
        ans = min(ans, dif)
    
    if w % 3 == 1:
        Sa = int(w//3) * h
        Sb = int(w//3) * h
        Sc = (int(w//3)+1) * h
        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
        ans = min(ans, dif)
    elif w % 3 == 2:
        Sa = int(w//3) * h
        Sb = (int(w//3)+1) * h
        Sc = (int(w//3)+1) * h
        dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
        ans = min(ans, dif)

    if h % 2 == 0:
        for i in range(1,w):
            Sa = int(h/2) * i
            Sc = h * (w-i)
            dif = abs(Sa-Sc)
            ans = min(ans, dif)
    elif h % 2 == 1:
        for i in range(1,w):
            Sa = int(h // 2)  * i
            Sb = (int(h // 2) + 1) * i
            Sc = h * (w-i)
            dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
            ans = min(ans, dif)
        
    if w % 2 == 0:
        for j in range(1,h):
            Sa = int(w/2) * j
            Sc = w * (h-j)
            dif = abs(Sa-Sc)
            ans = min(ans, dif)
    elif w % 2 == 1:
        for j in range(1,h):
            Sa = int(w // 2)  * j
            Sb = (int(w // 2) + 1) * j
            Sc = w * (h-j)
            dif = max(Sa, Sb, Sc) - min(Sa, Sb, Sc)
            ans = min(ans, dif)
print(ans)

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int ans = 1000000000;
        if (h % 3 == 0 || w % 3 == 0) {
            ans = 0;
        } else {
            if (h % 3 == 1) {
                int Sa = (int) Math.ceil(h / 3.0) * w;
                int Sb = (int) Math.ceil(h / 3.0) * w;
                int Sc = (int) Math.ceil((h + 1) / 3.0) * w;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            } else if (h % 3 == 2) {
                int Sa = (int) Math.ceil(h / 3.0) * w;
                int Sb = (int) Math.ceil((h + 1) / 3.0) * w;
                int Sc = (int) Math.ceil((h + 1) / 3.0) * w;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            }
            if (w % 3 == 1) {
                int Sa = (int) Math.ceil(w / 3.0) * h;
                int Sb = (int) Math.ceil(w / 3.0) * h;
                int Sc = (int) Math.ceil((w + 1) / 3.0) * h;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            } else if (w % 3 == 2) {
                int Sa = (int) Math.ceil(w / 3.0) * h;
                int Sb = (int) Math.ceil((w + 1) / 3.0) * h;
                int Sc = (int) Math.ceil((w + 1) / 3.0) * h;
                int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                ans = Math.min(ans, dif);
            }
            if (h % 2 == 0) {
                for (int i = 1; i < w; i++) {
                    int Sa = (int) Math.ceil(h / 2.0) * i;
                    int Sc = h * (w - i);
                    int dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (h % 2 == 1) {
                for (int i = 1; i < w; i++) {
                    int Sa = (int) Math.ceil(h / 2.0) * i;
                    int Sb = (int) Math.ceil((h + 1) / 2.0) * i;
                    int Sc = h * (w - i);
                    int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                    ans = Math.min(ans, dif);
                }
            }
            if (w % 2 == 0) {
                for (int j = 1; j < h; j++) {
                    int Sa = (int) Math.ceil(w / 2.0) * j;
                    int Sc = w * (h - j);
                    int dif = Math.abs(Sa - Sc);
                    ans = Math.min(ans, dif);
                }
            } else if (w % 2 == 1) {
                for (int j = 1; j < h; j++) {
                    int Sa = (int) Math.ceil(w / 2.0) * j;
                    int Sb = (int) Math.ceil((w + 1) / 2.0) * j;
                    int Sc = w * (h - j);
                    int dif = Math.max(Sa, Sb, Sc) - Math.min(Sa, Sb, Sc);
                    ans = Math.min(ans, dif);
                }
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
