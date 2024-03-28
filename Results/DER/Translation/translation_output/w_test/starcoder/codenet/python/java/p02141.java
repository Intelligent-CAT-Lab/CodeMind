<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6000 5000 20 10 400 300

Expected output:
0.75


```
def inpl(): return list(map(int, input().split()))
W, H, w, h, x, y = inpl()

a = (min(W//2, x + w//2) + max(-W//2, x-w//2))
b = (min(H//2, y + h//2) + max(-H//2, y-h//2))
print(b/a)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        double a = Math.min(W/2, x+w/2) + Math.max(-W/2, x-w/2);
        double b = Math.min(H/2, y+h/2) + Math.max(-H/2, y-h/2);
        System.out.println(b/a);
    }
}
```
<|endoftext|>
