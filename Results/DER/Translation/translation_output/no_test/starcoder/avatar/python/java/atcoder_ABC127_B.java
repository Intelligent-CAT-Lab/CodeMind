<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
r, D, x = map ( int, input ( ). split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```
<|endoftext|>
