<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
vamshi, z = map ( int, input ( ). split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vamshi = sc.nextInt();
        int z = sc.nextInt();
        System.out.println((vamshi / z + 1) * z);
    }
}
```
<|endoftext|>
