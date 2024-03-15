<s> Translate the following python code to java and enclose your solution inside ```java```:
```
vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vamshi = sc.nextInt();
        int z = sc.nextInt();
        int ans = (vamshi / z + 1) * z;
        System.out.println(ans);
    }
}
```
</s>
