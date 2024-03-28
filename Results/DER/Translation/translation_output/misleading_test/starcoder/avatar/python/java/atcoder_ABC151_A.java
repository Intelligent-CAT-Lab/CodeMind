<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
c

Expected output:
]d

```
print ( chr ( ord ( input ( ) ) + 1 ) )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( (char) ( sc.next().charAt(0) + 1 ) );
    }
}
```

'''
<|endoftext|>
