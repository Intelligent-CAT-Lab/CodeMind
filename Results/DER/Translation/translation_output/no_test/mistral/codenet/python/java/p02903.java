<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, w, a, b;
        h = sc.nextInt();
        w = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println(repeat("0", a) + repeat("1", w - a));
            } else {
                System.out.println(repeat("1", a) + repeat("0", w - a));
            }
        }
    }

    private static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
```</s>
