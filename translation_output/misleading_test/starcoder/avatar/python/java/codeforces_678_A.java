<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000003

```
vamshi, z = map ( int, input ( ). split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vamshi = sc.nextInt();
        int z = sc.nextInt();
        System.out.println((vamshi/z+1)*z);
    }
}
```
<|endoftext|>
