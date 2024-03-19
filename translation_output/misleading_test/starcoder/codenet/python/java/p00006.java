<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
w32nimda

Expected output:
jdo3n2Br

```
print(input()[::-1])

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new StringBuilder(s).reverse());
    }
}
```
"""
<|endoftext|>
