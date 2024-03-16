<s> Translate the following python code to java and enclose your solution inside ```java```:
```
l , r = [ int ( x ) for x in input ( ) . split ( ) ]
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l , r , first , second ] :
    if i >= l and i <= r :
        curr = i
        rev = ' '
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans , int ( rev ) * curr )
print ( ans )


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.nextLine());
        int r = Integer.parseInt(sc.nextLine());
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (int k = 0; k < curr; k++) {
                    rev += (9 - Integer.parseInt(String.valueOf(k)));
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}
```

### 解析

```
l , r = [ int ( x ) for x in input ( ) . split ( ) ]
```

将输入的字符串按空格分割，然后将每个字符串转换为整数。

```
curr = r
s = 0
while curr :
    s += 1
    curr //= 10
```

将`r`变量的值减少10倍，直到变为0。

```
first = 10 ** s
second = first // 2
ans = - 1
for i in [ l , r , first , second ] :
    if i >= l and i <= r :
        curr = i
        rev = ' '
        for k in str ( curr ) :
            rev += str ( 9 - int ( k ) )
        ans = max ( ans , int ( rev ) * curr )
print ( ans )
```

将`l`、`r`、`first`、`second`变量的值减少10倍，直到变为0。

如果`i`的值在`l`和`r`之间，则将`curr`变量的值设置为`i`，然后将`curr`变量的值转换为字符串，然后将每个字符转换为数字，然后将字符串转换为整数。

最后，将`ans`变量的值设置为`max`函数的返回值，其中`max`函数的参数是`ans`变量的值和`rev`变量的值乘以`curr`变量的值。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
