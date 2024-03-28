<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a , b , c , d = map ( int , input ( ) . split ( ) )
ans = max ( a * c , a * d , b * c , b * d )
print ( ans )


```

### 解答

```java
int[] a = new int[4];
int[] b = new int[4];
int[] c = new int[4];
int[] d = new int[4];

String[] input = input().split(" ");
for (int i = 0; i < 4; i++) {
    a[i] = Integer.parseInt(input[i]);
}
for (int i = 0; i < 4; i++) {
    b[i] = Integer.parseInt(input[i]);
}
for (int i = 0; i < 4; i++) {
    c[i] = Integer.parseInt(input[i]);
}
for (int i = 0; i < 4; i++) {
    d[i] = Integer.parseInt(input[i]);
}

int ans = Math.max(a[0] * c[0], a[0] * d[0], b[0] * c[0], b[0] * d[0]);
System.out.println(ans);
```

### 解析

```
a , b , c , d = map ( int , input ( ) . split ( ) )
```

将输入的字符串按空格分割，然后将每个元素转换为整数，并存储到对应的数组中。

```
ans = max ( a * c , a * d , b * c , b * d )
```

将每个元素乘以对应的元素，然后取最大值。

```
print ( ans )
```

将最大值打印出来。

### 思路

将输入的字符串按空格分割，然后将每个元素转换为整数，并存储到对应的数组中。

将每个元素乘以对应的元素，然后取最大值。

将最大值打印出来。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
- [Python 题目 0002](https://leetcode-cn.com/problems/python-problem-0002/)
- [Python 题目 0003](https://leetcode-cn.com/problems/python-problem-0003/)
- [Python 题目 0004](https://leetcode-cn.com/problems/python-problem-0004/)
- [Python 题目 0005](https://leetcode-cn.com/problems/python-problem-0005/)
- [Python 题目 0006](https://leetcode-cn.com/problems/python-problem-0006/)
- [Python 题目 0007](https://leetcode-cn.com/problems/python-problem-0007/)
- [Python 题目 0008](https://leetcode-cn.com/problems/python-problem-0008/)
- [Python 题目 0009](https://leetcode-cn.com/problems/python-problem-0009/)
- [Python 题目 0010](https://leetcode-cn.com/problems/python-problem-0010/)
- [Python 题目 0011](https://leetcode-cn.com/problems/python-problem-0011/)
- [Python 题目 0012](https://leetcode-cn.com/problems/python-problem-0012/)
- [Python 题目 0013](https://leetcode-cn.com/problems/python-problem-0013/)
- [Python 题目 0014](https://leetcode-cn.com/problems/python-problem-0014/)
- [Python 题目 0015](https://leetcode-cn.com/problems/python-problem-0015/)
- [Python 题目 0016](https://leetcode-cn.com/problems/python-problem-0016/)
- [Python 题目 0017](https://leetcode-cn.com/problems/python-problem-0017/)
- [Python 题目 0018](https://leetcode-cn.com/problems/python-problem-0018/)
- [Python 题目 0019](https://leetcode-cn.com/problems/python-problem-0019/)
- [Python 题目 0020](https://leetcode-cn.com/problems/python-problem-0020/)
- [Python 题目 0021](https://leetcode-cn.com/problems/python-problem-0021/)
- [Python 题目 0022](https://leetcode-cn.com/problems/python-problem-0022/)
- [Python 题目 0023](https://leetcode-cn.com/problems/python-problem-0023/)
- [Python 题目 0024](https://leetcode-cn.com/problems/python-problem-0024/)
- [Python 题目 0025](https://leetcode-cn.com/problems/python-problem-0025/)
- [Python 题目 0026](https://leetcode-cn.com/problems/python-problem-0026/)
- [Python 题目 0027](https://leetcode-cn.com/problems/python-problem-0027/)
- [Python 题目 0028](https://leetcode-cn.com/problems/python-problem-0028/)
- [Python 题目 0029](https://leetcode-cn.com/problems/python-problem-0029/)
- [Python 题目 0030](https://leetcode-cn.com/problems/python-problem-0030/)
- [Python 题目 0031](https://leetcode-cn.com/problems/python-problem-0031/)
- [Python 题目 0032](https://leetcode-cn.com/problems/python-problem-0032/)
- [Python 题目 0033](https://leetcode-cn.com/problems/python-problem-0033/)
- [Python 题目 0034](https://leetcode-cn.com/problems/python-problem-0034/)
- [Python 题目 0035](https://leetcode-cn.com/problems/python-problem-0035/)
- [Python 题目 0036](https://leetcode-cn.com/problems/python-problem-0036/)
- [Python 题目 0037](https://leetcode-cn.com/problems/python-problem-0037/)
- [Python 题目 0038](https://leetcode-cn.com/problems/python-problem-0038/)
- [Python 题目 0039](https://leetcode-cn.com/problems/python-problem-0039/)
- [Python 题目 0040](https://leetcode-cn.com/problems/python-problem-0040/)
- [Python 题目 0041](https://leetcode-cn.
