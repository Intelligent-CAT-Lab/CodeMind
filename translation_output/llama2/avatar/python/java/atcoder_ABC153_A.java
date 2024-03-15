<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )


```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, a;
        h = sc.nextInt();
        a = sc.nextInt();
        System.out.println(Math.ceil(h / a));
    }
}
```
</s>
