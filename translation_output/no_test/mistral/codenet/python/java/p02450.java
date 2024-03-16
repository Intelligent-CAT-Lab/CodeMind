<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```
[/INST]
```java
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] arr = IntStream.range(1, n + 1).toArray();
        for (int[] p : permutations(arr)) {
            System.out.println(Arrays.toString(p));
        }
    }
}
```</s>
