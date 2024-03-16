<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(Math.floorDiv(A*Math.min(B-1, N), B));
    }
}
```
<|endoftext|>
