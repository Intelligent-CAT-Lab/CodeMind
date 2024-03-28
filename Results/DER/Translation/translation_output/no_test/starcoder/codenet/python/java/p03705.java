<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b = map(int,input().split())

if n >= 2:
    if b >= a:
        print((n-2)*(b-a)+1)
    else:
        print(0)
else:
    if a == b:
        print(1)
    else:
        print(0)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n >= 2) {
            if (b >= a) {
                System.out.println((n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```
<|endoftext|>
