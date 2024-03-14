<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int c0 = 0, c1 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') c0++;
            else c1++;
        }
        System.out.println(2 * Math.min(c0, c1));
    }
}
```
<|endoftext|>
