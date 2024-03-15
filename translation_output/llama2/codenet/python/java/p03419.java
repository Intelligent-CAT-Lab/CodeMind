<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n, m = map(int, input().split())
if n == 1 or m == 1:
    print(1 if n * m == 1 else max(n, m) - 2)
else:
    print((n - 2) * (m - 2))

```

### Input

The first line contains two integers `n` and `m` separated by a space.

### Output

Print the result of the calculation.

### Constraints

- `1 <= n, m <= 1000`

### Sample Input

```
3 2
```

### Sample Output

```
3
```

### Explanation

The result is `3` because `3 * 2 = 6` and `3 - 2 = 1`.

### Hint

Use the `map` function to convert the input to integers.

### Solutions

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n == 1 || m == 1) {
            System.out.println(1);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```
</s>
