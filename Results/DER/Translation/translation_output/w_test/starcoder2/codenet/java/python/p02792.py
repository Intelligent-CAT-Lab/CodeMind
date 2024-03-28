

```
n = int(input())

result = 0
array = [[0 for i in range(10)] for j in range(10)]
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    array[head][tail] += 1

keta = len(str(n))
for i in range(1, n+1):
    head = int(str(i)[0])
    tail = i % 10
    if tail == 0:
        continue
    result += array[tail][head]

print(result)
```

## 2. 1000000007

### 2.1 题目描述

给定一个整数n，求n的阶乘除以1000000007的余数。

### 2.2 输入格式

一个整数n。

### 2.3 输出格式

一个整数，表示n的阶乘除以1000000007的余数。

### 2.4 样例输入

```
10
```

### 2.5 样例输出

```
3628800
```

### 2.6 样例解释

10! = 3628800

### 2.7 数据规模与约定

对于100%的数据，1 <= n <= 1000000。

### 2.8 解题思路

```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02793 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // å¥å
        int n = sc.nextInt();
        
        // è¨ç®
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = (result * i) % 1000000007;
        }
        
        // åºå
        System.out.println(result);
    }
}
```

python code:

```
n = int(input())

result = 1
for i in range(1, n+1):
    result = (result * i) % 1000000007

print(result)
```

## 3. 1000000007

### 3.1 题目描述

给定一个整数n，求n的阶乘除以1000000007的余数。

### 3.2 输入格式

一个整数n。

### 3.3 输出格式

一个整数，表示n的阶乘除以1000000007的余数。

### 3.4 样例输入

```
10
```

### 3.5 样例输出

```
3628800
```

### 3.6 样例解释

10! = 3628800

### 3.7 数据规模与约定

对于100%的数据，1 <= n <= 1000000。

### 3.8 解题思路

```
import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class p02793 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // å¥å
        int n = sc.nextInt();
        
        // è¨ç®
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = (result * i) % 1000000007;
        }
        
        // åºå
        System.out.println(result);
    }
}
```

python code:

```
n = int(input())

result = 1
for i in range(1, n+1):
    result = (result * i) % 1000000007

print(result)
```


### 2.5 样例输出

```
1
```

### 2.6 样例解释

100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
