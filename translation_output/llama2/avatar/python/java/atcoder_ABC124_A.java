<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = map ( int , input ( ) . split ( ) )
c = 0
for i in range ( 2 ) :
    c += max ( a , b )
    if a >= b :
        a -= 1
    else :
        b -= 1
print ( c )


```

### 解答

```java
int a, b, c;
String[] input = input().split(" ");
a = Integer.parseInt(input[0]);
b = Integer.parseInt(input[1]);
for (int i = 0; i < 2; i++) {
    c += Math.max(a, b);
    if (a >= b) {
        a--;
    } else {
        b--;
    }
}
System.out.println(c);
```

### 解析

```
a , b = map ( int , input ( ) . split ( ) )
```

将输入的字符串转换为一个数组，然后将数组中的每个元素转换为整数。

```
c = 0
for i in range ( 2 ) :
    c += max ( a , b )
    if a >= b :
        a -= 1
    else :
        b -= 1
```

将a和b的最大值加到c中，然后a和b减1，如果a大于b，则a减1，否则b减1。

```
print ( c )
```

将c的值打印出来。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
