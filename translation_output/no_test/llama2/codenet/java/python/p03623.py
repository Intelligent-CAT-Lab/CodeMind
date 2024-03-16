<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x-a) < Math.abs(x-b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

### 解题思路

```python
import java.util.Scanner

def main():
    x = int(input())
    a = int(input())
    b = int(input())
    if abs(x-a) < abs(x-b):
        print("A")
    else:
        print("B")

if __name__ == "__main__":
    main()
```

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

- [p03622](https://leetcode-cn.com/problems/p03622/)
</s>
