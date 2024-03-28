<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```

### 解答

```java
public class Solution {
    public int solution(int N) {
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        return (int) (count / 2);
    }
}
```

### 解析

1. 将输入转换为整数
2. 初始化 count 为 1
3. 循环，直到 count 大于等于 N
4. 每次循环，count 乘以 2
5. 计算 count 除以 2 的整数部分

### 复杂度分析

- 时间复杂度：O(log N)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/0001-python/)
</s>
