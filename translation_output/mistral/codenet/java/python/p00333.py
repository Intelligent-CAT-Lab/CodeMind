<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

class p00333 {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int WH = gcd(W, H);
        int C = sc.nextInt();

        
        int a = (W/WH)*(H/WH);
        
        System.out.println(a*C);
    }
}

```
[/INST]
```python
import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

W = int(input())
H = int(input())
WH = gcd(W, H)
C = int(input())

a = (W//WH)*(H//WH)
print(a*C)
```</s>
