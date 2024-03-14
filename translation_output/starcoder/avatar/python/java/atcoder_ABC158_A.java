<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = " Yes " if (" A " in s && " B " in s) else " No ";
        System.out.println(result);
    }
}
```
<|endoftext|>
