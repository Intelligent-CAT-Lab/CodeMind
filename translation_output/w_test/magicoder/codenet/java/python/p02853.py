<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
X, Y = map(int, input().split())
ans = 0
if X == 1 and Y == 1:
    ans = 1000000
elif X == 1 or Y == 1:
    ans += 300000
if X == 2 or Y == 2:
    ans += 200000
if X == 3 or Y == 3:
    ans += 100000
print(ans)
```

This Python code does the same thing as the Java code. It reads two integers X and Y from the input, and then calculates the answer based on the conditions specified in the Java code. The result is then printed to the console.<｜end▁of▁sentence｜>
