<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

ans = 0
tmp = 1
while n > tmp:
    tmp *= 3
    ans+=1
print(ans)

```

### 解答

```java
public class Solution {
    public int solution(int n) {
        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        return ans;
    }
}
```

### 解析

1. 首先，我们需要将输入的数字转换为整数，然后将其存储在变量n中。
2. 然后，我们需要使用一个变量tmp来存储一个初始值，并且使用一个变量ans来存储答案。
3. 然后，我们需要使用一个循环来循环执行，直到n大于tmp，并且每次循环都会将tmp乘以3，并且将ans加1。
4. 最后，我们需要返回ans。

### 复杂度分析

- 时间复杂度：O(logn)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 100](https://leetcode-cn.com/problems/python-problem-100/)
</s>
