<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```

h1, m1, h2, m2, k = map(int, input().split())
#ä¸è¡ã§å¥åãããæ°å¤ãããããã®å¤æ°ã«
#3ã¤ä»¥ä¸ãå¯

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print(t2-t1-k)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int k = in.nextInt();
        int t1 = h1*60+m1;
        int t2 = h2*60+m2;
        System.out.println(t2-t1-k);
    }
}
```
<|endoftext|>
