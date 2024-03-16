<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
t, h = map ( int, input ( ). split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int h = sc.nextInt();
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```
<|endoftext|>
