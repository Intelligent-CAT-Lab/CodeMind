<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


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
        int n = Integer.parseInt(args[0]);
        int[] arr = IntStream.range(1, n + 1).toArray();
        for (int[] p : getPermutations(arr)) {
            System.out.println(Arrays.toString(p));
        }
    }

    private static int[][] getPermutations(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return new int[][]{arr};
        }
        int[][] res = new int[len][len];
        for (int i = 0; i < len; i++) {
            res[i] = new int[len];
            System.arraycopy(arr, 0, res[i], 0, len);
            for (int j = 0; j < len; j++) {
                res[i][j] = j;
            }
            getPermutations(res[i], len - 1);
        }
        return res;
    }
}
```</s>
