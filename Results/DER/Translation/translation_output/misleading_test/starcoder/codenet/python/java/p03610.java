<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdr>

```
s = input()
print(s[::2])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.substring(0, s.length() - 1));
    }
}
```
"""

s = input()
print(s[::2])
<|endoftext|>
