<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def main():
    x, y = map(int, input().split())
    a = [1, 3, 5, 7, 8, 10, 12]
    b = [4, 6, 9, 11]
    if x == 2 or y == 2:
        print('No')
    elif (x in a and y in a) or (x in b and y in b):
        print('Yes')
    else:
        print('No')
main()
```

### 解答

```java
public class Main {
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(input());
        y = Integer.parseInt(input());
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((x in a && y in a) || (x in b && y in b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### 解析

```
def main():
    x, y = map(int, input().split())
    a = [1, 3, 5, 7, 8, 10, 12]
    b = [4, 6, 9, 11]
    if x == 2 or y == 2:
        print('No')
    elif (x in a and y in a) or (x in b and y in b):
        print('Yes')
    else:
        print('No')
main()
```

- 输入两个整数，判断是否在给定的数组中

### 思路

- 使用`in`判断

### 代码

```java
public class Main {
    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(input());
        y = Integer.parseInt(input());
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((x in a && y in a) || (x in b && y in b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### 复杂度分析

- 时间复杂度：O(1)
- 空间复杂度：O(1)

### 相关题目

- [Python 题目 10](https://leetcode-cn.com/problems/python-problem-10/)
</s>
