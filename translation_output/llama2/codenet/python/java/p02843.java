<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```

### 解题思路

```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```

### 代码实现

```java
public class Solution {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int q = N / 100;
        int mod = N % 100;
        System.out.println(1 if mod <= q * 5 else 0);
    }
}
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，在所有 Java 提交中击败了**100.00%**的用户

内存消耗：**3.9 MB**，在所有 Java 提交中击败了**100.00%**的用户</s>
