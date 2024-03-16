<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = getNum(a, b);
        System.out.println(ans);
    }

    public static int getNum(int a, int b) {
        int reverseB = 0;
        while (b > 0) {
            reverseB = reverseB * 10 + b % 10;
            b /= 10;
        }
        return a + reverseB;
    }
}
```

### 解题思路

```python
import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b /= 10
    return a + reverseB

print(getNum(a, b))
```

### 复杂度分析

- 时间复杂度：O(log(b))
- 空间复杂度：O(1)
</s>
