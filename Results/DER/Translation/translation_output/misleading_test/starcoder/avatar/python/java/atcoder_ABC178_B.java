<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
418379342 802780784 -790013317 -445130206

Expected output:
-186233282690604538

```
a, b, c, d = map ( int, input ( ). split ( ) )
ans = max ( a * c, a * d, b * c, b * d )
print ( ans )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ans = Math.max(a * c, a * d, b * c, b * d);
        System.out.println(ans);
    }
}
```
<|endoftext|>
