<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
5.03637601641222

```
a, t, r = list(map(int, input().split()))
ans = r * t / a
print("{:.6f}".format(ans))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double ans = r * t / a;
        System.out.printf("%.6f", ans);
    }
}
```
'''
<|endoftext|>
