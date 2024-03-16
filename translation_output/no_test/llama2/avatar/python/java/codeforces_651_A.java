<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a1 , a2 = map ( int , input ( ) . split ( ) )
t = 0
if a1 == 1 and a2 == 1 :
    print ( 0 )
else :
    while a1 > 0 and a2 > 0 :
        if a1 > a2 :
            a2 += 1
            a1 -= 2
        else :
            a2 -= 2
            a1 += 1
        t += 1
    print ( t )


```

### 解答

```java
int a1, a2;
String[] input = input().split(" ");
a1 = Integer.parseInt(input[0]);
a2 = Integer.parseInt(input[1]);
int t = 0;
if (a1 == 1 && a2 == 1) {
    System.out.println(0);
} else {
    while (a1 > 0 && a2 > 0) {
        if (a1 > a2) {
            a2 += 1;
            a1 -= 2;
        } else {
            a2 -= 2;
            a1 += 1;
        }
        t += 1;
    }
    System.out.println(t);
}
```

### 解析

```
a1 , a2 = map ( int , input ( ) . split ( ) )
```

将输入的字符串转换为数组，然后将数组中的每个元素转换为整数。

```
t = 0
if a1 == 1 and a2 == 1 :
    print ( 0 )
else :
    while a1 > 0 and a2 > 0 :
        if a1 > a2 :
            a2 += 1
            a1 -= 2
        else :
            a2 -= 2
            a1 += 1
        t += 1
    print ( t )
```

如果输入的两个数字都是1，则输出0，否则，将a1和a2分别减少1，然后将a2增加1，然后将a1增加2，然后将t增加1，然后重复这个过程，直到a1和a2都为0。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
