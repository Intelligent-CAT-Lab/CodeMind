<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import gcd
W, H, C = map(int, input().split())
g = gcd(W, H)
print(W*H*C//(g*g))

```

### Input

The first line contains three integers W, H, C.

### Output

Print the number of ways to paint the room.

### Constraints

1 <= W, H <= 1000

1 <= C <= 1000

### Example Input

```
3 4 1
```

### Example Output

```
1
```

### Explanation

The room has 3 walls and 4 corners.

The number of ways to paint the room is 1.

### Hint

Use the Euclidean algorithm to find the greatest common divisor of W and H.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W, H, C;
        W = sc.nextInt();
        H = sc.nextInt();
        C = sc.nextInt();
        int g = gcd(W, H);
        System.out.println(W*H*C/g/g);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
</s>
