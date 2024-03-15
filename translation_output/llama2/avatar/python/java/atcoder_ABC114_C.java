<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = int ( input ( ) )
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7' , '5' , '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
print ( aaa ( '0' ) )


```

### 解答

```java
public class Solution {
    public int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        for (int i = 0; i < 3; i++) {
            ans += aaa(n + i);
        }
        return ans;
    }
}
```

### 解析

```
N = int ( input ( ) )
```

```
def aaa ( n ) :
    if int ( n ) > N :
        return 0
    ans = 1 if set ( str ( int ( n ) ) ) == { '7' , '5' , '3' } else 0
    for i in '753' :
        ans += aaa ( n + i )
    return ans
```

```
print ( aaa ( '0' ) )
```

### 复杂度分析

- 时间复杂度：O(N)。
- 空间复杂度：O(N)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
