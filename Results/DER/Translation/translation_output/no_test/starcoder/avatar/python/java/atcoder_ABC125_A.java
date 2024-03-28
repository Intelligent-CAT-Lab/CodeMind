<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, T = map ( int, input ( ). split ( ) )
ans = ( T // A ) * B
print ( ans )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```
<|endoftext|>
