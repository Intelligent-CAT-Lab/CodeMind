<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, k = map(int, input().split())
if a <= k:
    k -= a
    a = 0
else:
    print(a - k, b)
    exit()
print(0, max(b - k, 0))

```

### Input

The first line contains three integers $a, b, k$ ($1 \leq a, b, k \leq 10^9$).

### Output

Print two integers $x, y$ ($0 \leq x, y \leq 10^9$) such that $x + y = a - k$ and $x \leq b - k$.

### Constraints

$1 \leq a, b, k \leq 10^9$

### Example

```
Input:
3 2 1

Output:
0 2

Explanation:
a = 3, b = 2, k = 1

a <= k:
k -= a
a = 0

print(a - k, b)
0 2

```

### Hint

Use the `Scanner` class to read the input.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, k;
        a = scanner.nextInt();
        b = scanner.nextInt();
        k = scanner.nextInt();
        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            System.exit(0);
        }
        System.out.println(0 + " " + Math.max(b - k, 0));
    }
}
```
</s>
