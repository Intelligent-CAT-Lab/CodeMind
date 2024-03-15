<s> Translate the following python code to java and enclose your solution inside ```java```:
```
M = list ( map ( int , input ( ) . split ( ' â ' ) ) )
a = M [ 0 ]
b = M [ 1 ]
n = M [ 2 ]
if a != 0 :
    if b % a != 0 :
        print ( ' No â solution ' )
    else :
        b = b // a
        x , y = 0 , - 2000
        if b >= 0 :
            while y < b :
                y = pow ( x , n )
                x = x + 1
            if y > b :
                print ( ' No â solution ' )
            else :
                print ( x - 1 )
        else :
            if n % 2 == 0 :
                print ( ' No â solution ' )
            else :
                x = - 1
                y = 2000
                while y > b :
                    y = pow ( x , n )
                    x = x - 1
                if y < b :
                    print ( ' No â solution ' )
                else :
                    print ( x + 1 )
else :
    if b == 0 :
        print ( 5 )
    else :
        print ( ' No â solution ' )


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] M = new int[3];
        M[0] = Integer.parseInt(sc.nextLine());
        M[1] = Integer.parseInt(sc.nextLine());
        M[2] = Integer.parseInt(sc.nextLine());
        if (M[0] != 0) {
            if (M[1] % M[0] != 0) {
                System.out.println("No solution");
            } else {
                M[1] = M[1] / M[0];
                int x = 0, y = -2000;
                if (M[1] >= 0) {
                    while (y < M[1]) {
                        y = Math.pow(x, M[2]);
                        x = x + 1;
                    }
                    if (y > M[1]) {
                        System.out.println("No solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (M[2] % 2 == 0) {
                        System.out.println("No solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > M[1]) {
                            y = Math.pow(x, M[2]);
                            x = x - 1;
                        }
                        if (y < M[1]) {
                            System.out.println("No solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (M[1] == 0) {
                System.out.println(5);
            } else {
                System.out.println("No solution");
            }
        }
    }
}
```

### 解析

```python
M = list ( map ( int , input ( ) . split ( ' â ' ) ) )
```

将输入的字符串转换为一个列表，然后将列表中的每个元素转换为整数，最后将列表转换为一个元组。

```python
a = M [ 0 ]
b = M [ 1 ]
n = M [ 2 ]
```

将元组中的第一个元素赋值给变量a，将元组中的第二个元素赋值给变量b，将元组中的第三个元素赋值给变量n。

```python
if a != 0 :
    if b % a != 0 :
        print ( ' No â solution ' )
    else :
        b = b // a
        x , y = 0 , - 2000
        if b >= 0 :
            while y < b :
                y = pow ( x , n )
                x = x + 1
            if y > b :
                print ( ' No â solution ' )
            else :
                print ( x - 1 )
        else :
            if n % 2 == 0 :
                print ( ' No â solution ' )
            else :
                x = - 1
                y = 2000
                while y > b :
                    y = pow ( x , n )
                    x = x - 1
                if y < b :
                    print ( ' No â solution ' )
                else :
                    print ( x + 1 )
else :
    if b == 0 :
        print ( 5 )
    else :
        print ( ' No â solution ' )
```

如果a不等于0，则判断b是否能被a整除，如果不能，则打印“No solution”，否则将b除以a，将x赋值为0，y赋值为-2000，如果b大于等于0，则使用while循环，将y赋值为x的n次方，然后将x加1，如果y大于b，则打印“No solution”，否则将x减1，如果x大于0，则将x加1，否则将x减1，如果x小于b，则打印x+1，否则打印“No solution”，否则，如果b等于0，则打印5，否则打印“No solution”。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [Python 题目 0001 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0002 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0003 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0004 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0005 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0006 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0007 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0008 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0009 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0010 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0011 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [Python 题目 0012 - 整数的平方根](https://leetcode-cn.com/problems/integer-root/)
- [
