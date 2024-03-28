<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03999{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long ans = 0;
        for(int dx=0;dx<=s.length()-1;dx++){
            for(int start=0;start<=s.length()-1-dx;start++){
                long cur = Long.parseLong(s.substring(start,start+dx+1));
                ans += cur*(helper(start)*helper(s.length()-1-dx-start));
            }
        }
        System.out.println(ans);
    }
    static long helper(int n){
        if(n==0) return 1;
        return 1<<(n-1);
    }
}

```

### 解题思路

```python
import java.util

class p03999:
    def __init__(self):
        pass

    def main(self):
        sc = java.util.Scanner(System.in)
        s = sc.next()
        ans = 0
        for dx in range(0, s.length()):
            for start in range(0, s.length() - 1 - dx):
                cur = int(s[start:start + dx + 1])
                ans += cur * (self.helper(start) * self.helper(s.length() - 1 - dx - start))
        print(ans)

    def helper(self, n):
        if n == 0:
            return 1
        return 1 << (n - 1)


if __name__ == '__main__':
    p03999().main()
```

### 复杂度分析

- 时间复杂度：O(n^2)。
- 空间复杂度：O(1)。

### 相关题目

- [p03998](./p03998.md)
</s>
