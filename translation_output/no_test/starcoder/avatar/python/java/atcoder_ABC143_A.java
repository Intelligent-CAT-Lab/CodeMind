<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A, B = map ( int, input ( ). split ( ) )
ans = A - 2 * B
if ans < 0 :
    ans = 0
print ( ans )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a - 2 * b;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
