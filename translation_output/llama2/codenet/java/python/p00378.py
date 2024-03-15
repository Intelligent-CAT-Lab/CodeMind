<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
class p00378{
    void solve(){
        int A, B, X, ans;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        X = sc.nextInt();

        if ( X % 500 != 0 ) X += 500 - X%500;
        int a = 0;
        int b = 0;

        if ( A < B ) {
            a = X/1000 + ((X%1000>0)?1:0);
        } else if ( A > 2*B ){
            b = X/500;
        } else {
            a = X/1000; X %= 1000;
            b = X/500;
        }

        System.out.println(A*a + B*b);
    }

    public static void main(String[] args){ new p00378().solve(); }
}


```

### 解题思路

```python
import java.util

class p00378:
    def solve(self):
        A, B, X = map(int, input().split())
        if X % 500 != 0:
            X += 500 - X % 500
        a = 0
        b = 0
        if A < B:
            a = X // 1000 + (X % 1000 > 0)
        elif A > 2 * B:
            b = X // 500
        else:
            a = X // 1000
            X %= 1000
            b = X // 500
        print(A * a + B * b)


if __name__ == '__main__':
    p00378().solve()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p00377](/p00377)
</s>
