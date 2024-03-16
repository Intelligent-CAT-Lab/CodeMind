<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s, w = map(int, input().split())

if w >= s :
    print("unsafe")
else:
    print("safe")
```

### 解答

```java
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
int w = sc.nextInt();

if (w >= s) {
    System.out.println("unsafe");
} else {
    System.out.println("safe");
}
```

### 解析

```
s, w = map(int, input().split())
```

将输入的字符串按空格分割，然后将每个字符串转换为整数。

```
if w >= s :
    print("unsafe")
else:
    print("safe")
```

如果w大于等于s，则打印“unsafe”，否则打印“safe”。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [Python3 题目 01](https://leetcode-cn.com/problems/python3-problem-01/)
</s>
