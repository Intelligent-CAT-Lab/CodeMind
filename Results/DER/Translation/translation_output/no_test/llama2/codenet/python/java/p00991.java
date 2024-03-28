<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
def comb (x,y):
	return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```

### Input

The first line contains 5 integers, w, h, ax, ay, bx, by.

### Output

Print the answer modulo 10^9 + 7.

### Constraints

1 <= w, h <= 10^5
-10^9 <= ax, ay, bx, by <= 10^9

### Example

```
Input:
5 5 1 1 1 1

Output:
1
```

### Explanation

The answer is 1.

### Hint

You can use the following code to get the answer:

```
int ans = 1;
if (dx * 2 == w) {
    ans *= 2;
}
if (dy * 2 == h) {
    ans *= 2;
}
ans *= comb(dx + dy, dx);
```

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, ax, ay, bx, by;
        w = sc.nextInt();
        h = sc.nextInt();
        ax = sc.nextInt();
        ay = sc.nextInt();
        bx = sc.nextInt();
        by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        int ans = 1;
        if (dx * 2 == w) {
            ans *= 2;
        }
        if (dy * 2 == h) {
            ans *= 2;
        }
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }
}
```
</s>
