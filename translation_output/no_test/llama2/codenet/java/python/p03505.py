<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03505 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong(), A=sc.nextLong(), B=sc.nextLong();
        long ans = help(K,A,B);
        System.out.println(ans);
    }
    static long help(long K, long A, long B){
        if(A<=B) return A>=K?1:-1;
        if(A>=K) return 1;
        long dif = (A-B);
        long t = (K-A)/dif+((K-A)%dif==0?0:1);
        return 2*t+1;
    }
}

```

### 解题思路

```python
import java.util
import java.io

import static java.lang.System.in

def main():
    K = int(input())
    A = int(input())
    B = int(input())
    ans = help(K, A, B)
    print(ans)

def help(K, A, B):
    if A <= B:
        return A >= K ? 1 : -1
    if A >= K:
        return 1
    dif = (A - B)
    t = (K - A) // dif + ((K - A) % dif == 0 ? 0 : 1)
    return 2 * t + 1

if __name__ == '__main__':
    main()
```

### 复杂度分析

- 时间复杂度：O(log(K))
- 空间复杂度：O(1)

### 相关题目

- [p03504](https://leetcode-cn.com/problems/p03504/)
</s>
