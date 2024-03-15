<s> Translate the following java code to python and enclose your solution inside ```python```:
```
public class codeforces_678_A {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        
        System.out.println((n / k + 1) * k);
    }
}
```

### 解题思路

```python
n = int(input())
k = int(input())

print((n // k + 1) * k)
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 执行

执行用时：**0 ms**，在所有 Python3.6+ Online Judge中击败了**100.00%**的用户

 memory limit :**16 MB**，在所有 Python3.6+ Online Judge中击败了**0.00%**的用户

</s>
