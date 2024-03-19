<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2017/01/07

Expected output:
2018/O01/07

```
print('2018'+input()[4:])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("2018"+s.substring(4));
    }
}
```
'''
<|endoftext|>
