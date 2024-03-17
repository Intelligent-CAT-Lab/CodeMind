<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2096

Expected output:
2108


```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        boolean leap = check_leap(y);
        int sum = 0;
        int mod = 0;
        
        for (int i = y + 1;; i++) {
            if (check_leap(i)) {
                sum += 366;
            } else {
                sum += 365;
            }
            
            if (sum % 7 == 0) {
                if ((check_leap(i) && leap) || (!check_leap(i) && !leap)) {
                    System.out.println(i);
                    return;
                } else {
                    continue;
                }
            }
        }
    }
    
    static boolean check_leap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}
```
[/INST]
```python
import sys

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

y = int(sys.stdin.readline())
leap = check_leap(y)
sum = 0
mod = 0

for i in range(y+1, 1000000000):
    if check_leap(i):
        sum += 366
    else:
        sum += 365
    
    if sum % 7 == 0:
        if ((check_leap(i) and leap) or (!check_leap(i) and not leap)):
            print(i)
            sys.exit(0)
        else:
            continue

```</s>
