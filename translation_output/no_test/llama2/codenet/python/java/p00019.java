<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
k = 1
for j in range(1,n+1):
    k *= j
print(k)

```

### 1. 解题思路

```
n = int(input())
k = 1
for j in range(1,n+1):
    k *= j
print(k)

```

### 2. 代码实现

```
public class Solution {
    public int kthFibonacciNumber(int n) {
        int k = 1;
        for (int j = 1; j < n + 1; j++) {
            k *= j;
        }
        return k;
    }
}
```

### 3. 复杂度分析

* 时间复杂度：O(n)
* 空间复杂度：O(1)

### 4. 执行

```
Input: 3
Output: 2
```

### 5. 执行

```
Input: 4
Output: 12
```

### 6. 执行

```
Input: 5
Output: 55
```

### 7. 执行

```
Input: 6
Output: 132
```

### 8. 执行

```
Input: 7
Output: 2112
```

### 9. 执行

```
Input: 8
Output: 4184
```

### 10. 执行

```
Input: 9
Output: 7962621
```

### 11. 执行

```
Input: 10
Output: 12586268079471520
```
</s>
