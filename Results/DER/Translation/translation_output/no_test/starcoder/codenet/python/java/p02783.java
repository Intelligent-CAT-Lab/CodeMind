<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        System.out.println((int)Math.ceil(H/A));
    }
}
```

'''
<|endoftext|>
