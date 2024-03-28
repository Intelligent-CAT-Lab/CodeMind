
```python
a, b = map(int, input().split())
res = a
while a >= b:
    res += a // b
    a = a // b + a % b
print(res)
```

## 3. 1006. 笨小猴

### 题目描述

有一只呆呆的小猴子，它最多只能记住x个数字，一旦记住的数字超过x个，那么它就无法记住最先记住的那个数字，也就说它记住的数字是满的，就要抛掉一个最先记住的数字。

呆呆的小猴子一开始只会记住0这个数字，然后它遇到的每一个数字它都尝试去记住，如果它成功的记住了这个数字，那么它就继续遇到下一个数字，如果它没有成功记住这个数字，那么它就会把它记住的第一个数字抛掉，然后继续记住这个数字，直到它遇到的所有数字都被它记住。

现在给你呆呆的小猴子记住的最大容量x和它遇到的一系列数字，请问呆呆的小猴子一共记住了多少个数字。

### 输入格式

第一行包含两个整数n和x，分别表示呆呆的小猴子遇到的数字的个数和它最多能记住的数字个数。

第二行包含n个整数，依次表示呆呆的小猴子遇到的数字。

### 输出格式

输出一个整数，表示呆呆的小猴子一共记住了多少个数字。

### 数据范围

1≤n≤10000,
1≤x≤10000,
0≤遇到的数字≤10000

### 输入样例：

```
6 2
1 2 3 1 2 3
```

### 输出样例：

```
3
```

### 题解

```python
n, x = map(int, input().split())
nums = list(map(int, input().split()))

res = []
for num in nums:
    if num not in res:
        if len(res) == x:
            res.pop(0)
        res.append(num)
print(len(res))
```

## 4. 1007. 数字反转

### 题目描述

给定一个整数，请将该数各个位上数字反转得到一个新数。新数也应满足整数的常见形式，即除非给定的原数为零，否则反转后得到的新数的最高位数字不应为零（参见样例2）。

### 输入格式

共一行，包含一个整数N。

### 输出格式

共一行，包含一个整数，表示反转后的新数。

### 数据范围

−100000≤N≤100000

### 输入样例：

```
-360
```

### 输出样例：

```
-63
```

### 题解

```python
n = int(input())
res = 0
while n:
    res = res * 10 + n % 10
    n //= 10
print(res)
```

## 5. 1008. 三连击

### 题目描述

若一个3位数ABC，恰好等于其各位数字的立方和，即A3+B3+C3=ABC，则称这个3位数为水仙花数。例如，153=13+53+33，因此153是一个水仙花数。

请你利用计算机的优势寻找所有的3位水仙花数。

### 输出格式

按递增顺序输出所有的3位水仙花数，每个数字占一行。

### 输入样例：

```
无
```

### 输出样例：

```
153
370
371
407
```

### 题解

```python
for i in range(100, 1000):
    a = i // 100
    b = i // 10 % 10
    c = i % 10
    if a ** 3 + b ** 3 + c ** 3 == i:
        print(i)
```

## 6. 1009. 最大的矩形

### 题目描述

给定n个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为1。

求在该柱状图中，能够勾勒出来的矩形的最大面积。

### 输入格式

第一行包含一个整数n。

第二行包含n个整数，表示完整的柱状图的高度，整数之间以一个空格分隔。

### 输出格式

输出一个整数，表示所求的矩形的最大面积。

### 数据范围

1≤n≤10000,
0≤柱状图的高度≤10000

### 输入样例：

```
7
2 1 4 5 1 3 3
```

### 输出样例：

```
8
```

### 题解

```python
n = int(input())
nums = list(map(int, input().split()))

res = 0
for i in range(n):
    min_height = nums[i]
    for j in range(i, n):
        min_height = min(min_height, nums[j])
        res = max(res, min_height * (j - i + 1))
print(res)
```/docs/leetcode/in_order/101.md
# 101. 对称二叉树 (Easy)

## 题目描述

给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

```
    1
   / \
  2   2
   \   \
   3    3
```

## 题目考点

递归

## 题解一（递归）

```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
```

## 题解二（迭代）

```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            queue.offer(left.
