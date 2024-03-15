<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
a=1
b=1
i=0
while i<n:
    a,b=b,a+b
    i+=1
print(a)

```

### 解答

```java
public class Solution {
    public int solution(int n) {
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < n) {
            a = b;
            b = a + b;
            i++;
        }
        return a;
    }
}
```

### 解析

1. 首先，我们需要将输入的n转换成int类型，然后将a和b初始化为1。
2. 然后，我们需要使用while循环，每次循环都会将a和b交换位置，并且a和b的值会相加。
3. 最后，我们需要将a的值返回。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 100](https://leetcode-cn.com/problems/python-problem-100/)
</s>
