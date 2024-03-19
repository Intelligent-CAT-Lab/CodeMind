<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1000080

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

### Response:
```python
def p02853():
    X, Y = map(int, input().split())
    ans = 0
    if X == 1 and Y == 1:
        ans = 1000000
    elif X == 1:
        ans += 300000
    elif Y == 1:
        ans += 300000
    elif X == 2:
        ans += 200000
    elif Y == 2:
        ans += 200000
    elif X == 3:
        ans += 100000
    elif Y == 3:
        ans += 100000
    print(ans)

p02853()
```
<|EOT|>
