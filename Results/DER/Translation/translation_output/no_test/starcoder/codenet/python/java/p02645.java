<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print(input()[:3])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.substring(0,3));
    }
}
```
"""
<|endoftext|>
