System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000000


```
vamshi, z = map ( int, input ( ). split ( ) )
print ( ( vamshi // z + 1 ) * z )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long vamshi = sc.nextLong();
        int z = sc.nextInt();
        long result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}
```

Test input:
```
999999999 1
```

Expected output:
```
1000000000
```<|endoftext|>
