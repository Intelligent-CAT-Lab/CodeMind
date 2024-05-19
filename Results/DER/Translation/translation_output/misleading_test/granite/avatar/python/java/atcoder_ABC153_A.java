System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
9911

```
import math
h, a = map ( int, input ( ). split ( ) )
print ( math. ceil ( h / a ) )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int result = (int)Math.ceil((double)h/a);
        System.out.println(result);
    }
}
```

Test input:
```
10000 1
```

Expected output:
```
9911
```<|endoftext|>
