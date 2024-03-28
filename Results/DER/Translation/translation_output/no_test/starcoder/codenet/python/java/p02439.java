<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c = map(int, input().split())

if a < b:
    if c < a:
        print(c, b)
    elif b < c:
        print(a, c)
    else:
        print(a, b)
else:
    if c < b:
        print(c, a)
    elif a < c:
        print(b, c)
    else:
        print(b, a)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b) {
            if (c < a) {
                System.out.println(c + " " + b);
            } else if (b < c) {
                System.out.println(a + " " + c);
            } else {
                System.out.println(a + " " + b);
            }
        } else {
            if (c < b) {
                System.out.println(c + " " + a);
            } else if (a < c) {
                System.out.println(b + " " + c);
            } else {
                System.out.println(b + " " + a);
            }
        }
    }
}
```
<|endoftext|>
