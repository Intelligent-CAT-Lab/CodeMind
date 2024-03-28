<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02713{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int result = 0;
        int a = 0;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                a =gcd(i, j);
                for(int k=1; k<=N; k++){
                    result += gcd(a, k);
                }
            }
        }
        System.out.println(result);
    }

    public static int gcd(int p, int q){
        if(p % q == 0){
            return q;
        }
        return gcd(q, p%q);
    }
}
```

### 解题思路

```python
import java.util

class p02713:
    def main(self, args):
        N = int(input())
        result = 0
        a = 0

        for i in range(1, N+1):
            for j in range(1, N+1):
                a = gcd(i, j)
                for k in range(1, N+1):
                    result += gcd(a, k)

        print(result)

    def gcd(self, p, q):
        if p % q == 0:
            return q
        return self.gcd(q, p % q)

if __name__ == '__main__':
    p02713().main(sys.argv[1:])
```

### 复杂度分析

- 时间复杂度：O(N^3)。
- 空间复杂度：O(N)。

### 相关题目

- [p02712](https://leetcode-cn.com/problems/gcd-of-array-elements/)
</s>
