<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1000000


```
import java.util.*;
 
public class p02853 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int ans = 0;
        if (X == 1 && Y == 1) {
            ans = 1000000;
        } else {
            if (X == 1) {
                ans += 300000;
            }
            if (Y == 1) {
                ans += 300000;
            }
            if (X == 2) {
                ans += 200000;
            }
            if (Y == 2) {
                ans += 200000;
            }
            if (X == 3) {
                ans += 100000;
            }
            if (Y == 3) {
                ans += 100000;
            }
        }
        System.out.println(ans);
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

X, Y = map(int, sys.stdin.readline().split())

if X == 1 and Y == 1:
    print(1000000)
else:
    ans = 0
    if X == 1:
        ans += 300000
    if Y == 1:
        ans += 300000
    if X == 2:
        ans += 200000
    if Y == 2:
        ans += 200000
    if X == 3:
        ans += 100000
    if Y == 3:
        ans += 100000
    print(ans)

```
<|endoftext|>
