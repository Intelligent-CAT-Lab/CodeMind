<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
-37

```
a, b, c, d = map ( int, input ( ). split ( ) )
print ( max ( 0, min ( b, d ) - max ( a, c ) ) )


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
        System.out.println(Math.max(0, Math.min(b, d) - Math.max(a, c)));
    }
}
```
<|endoftext|>
