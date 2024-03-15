<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```

### Input

```
4
```

### Output

```
1234
1243
1324
1342
1423
1432
2134
2143
2314
2341
2413
2431
3124
3142
3214
3241
3412
3421
```

### Explanation

```
1234
1243
1324
1342
1423
1432
2134
2143
2314
2341
2413
2431
3124
3142
3214
3241
3412
3421
```

### Hint

```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)
```

### Solution

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    for (int l = 1; l <= n; l++) {
                        System.out.print(i + " " + j + " " + k + " " + l + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
```
</s>
