<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d = map(int, input().split())
s = a*b
t = c*d
if s > t: print(s)
else: print(t)
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        int s = a * b;
        int t = c * d;
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
```</s>
