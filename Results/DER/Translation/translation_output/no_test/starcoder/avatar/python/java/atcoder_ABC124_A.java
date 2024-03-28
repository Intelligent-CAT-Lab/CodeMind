<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map ( int, input ( ). split ( ) )
c = 0
for i in range ( 2 ) :
    c += max ( a, b )
    if a >= b :
        a -= 1
    else :
        b -= 1
print ( c )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a--;
            } else {
                b--;
            }
        }
        System.out.println(c);
    }
}
```
<|endoftext|>
