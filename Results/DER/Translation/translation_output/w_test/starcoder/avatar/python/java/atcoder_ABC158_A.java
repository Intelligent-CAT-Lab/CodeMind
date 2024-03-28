<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBA

Expected output:
Yes


```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = " Yes " if (" A " in s && " B " in s) else " No ";
        System.out.println(result);
    }
}
```

'''
<|endoftext|>
