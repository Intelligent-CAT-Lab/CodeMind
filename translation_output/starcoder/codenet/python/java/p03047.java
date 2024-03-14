<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N,K = map(int,input().split())

print(N-(K-1))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(N-(K-1));
    }
}
```

'''
<|endoftext|>
