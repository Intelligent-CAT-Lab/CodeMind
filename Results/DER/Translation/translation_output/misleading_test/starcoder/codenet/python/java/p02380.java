<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3 90

Expected output:
6.0
12.0
3.0
-95.7365573548486

```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

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
        System.out.println(0.5*a*b*Math.sin(Math.toRadians(c)));
        System.out.println(a+b+(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)))**0.5);
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}
```
<|endoftext|>
