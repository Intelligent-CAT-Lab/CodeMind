<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n, m = map(int, input().split())
print((n-1)*(m-1))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((n-1)*(m-1));
    }
}
```

'''
<|endoftext|>
