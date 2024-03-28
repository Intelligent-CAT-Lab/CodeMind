<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def check(num):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                return False
                break
        else:
            return True
    else:
        return False


a = int(input())

for i in range(a, 100500):
    if check(i):
        print(i)
        break
```

### 解答

```java
public class Solution {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = a; i < 100500; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean check(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    return false;
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
```

### 解析

1. 首先，我们需要将 python 中的 `for` 循环转换为 java 中的 `for` 循环。
2. 然后，我们需要将 python 中的 `break` 语句转换为 java 中的 `break` 语句。
3. 最后，我们需要将 python 中的 `return` 语句转换为 java 中的 `return` 语句。

### 思路

1. 首先，我们需要将 python 中的 `for` 循环转换为 java 中的 `for` 循环。
2. 然后，我们需要将 python 中的 `break` 语句转换为 java 中的 `break` 语句。
3. 最后，我们需要将 python 中的 `return` 语句转换为 java 中的 `return` 语句。

### 代码

```java
public class Solution {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = a; i < 100500; i++) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean check(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    return false;
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [1005. 整数分解](https://leetcode-cn.com/problems/integer-breakdown/)
</s>
