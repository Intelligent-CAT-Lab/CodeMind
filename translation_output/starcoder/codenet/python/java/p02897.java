<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
print(-(-N//2)/N)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(-(-N/2)/N);
    }
}
```
"""
<|endoftext|>
