<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 17

Expected output:
83


```
x, t = map(int, input().split())
print(x-t if x-t > 0 else 0)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(x-t > 0? x-t : 0);
    }
}
```
"""
<|endoftext|>
