
```
import java.sql.Timestamp;
import java.util.*;

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

y = int(input())
leap = check_leap(y)
sum = 0
mod = 0

for i in range(y + 1, 1000000000):
    if check_leap(i):
        sum += 366
    else:
        sum += 365
    
    if sum % 7 == 0:
        if (check_leap(i) and leap) or (not check_leap(i) and not leap):
            print(i)
            break
        else:
            continue
```

## 678C

### 题目

[678C](http://codeforces.com/problemset/problem/678/C)

### 题意

给定一个数n，求出所有满足条件的数对(a, b)，使得a + b = n，且a和b的二进制表示中1的个数相同。

### 思路

首先，我们可以知道，如果a和b的二进制表示中1的个数相同，那么a和b的二进制表示中0的个数也相同。

那么，我们可以枚举a的二进制表示中1的个数，然后计算出b的二进制表示中1的个数，然后计算出a和b的二进制表示中0的个数，然后计算出b的二进制表示中0的个数，然后判断a和b的二进制表示中0的个数是否相同，如果相同，那么就输出a和b。

### 代码

```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        
        for (int i = 0; i <= 31; i++) {
            int a = (1 << i) - 1;
            int b = n - a;
            int cnt_a = Integer.bitCount(a);
            int cnt_b = Integer.bitCount(b);
            
            if (cnt_a == cnt_b) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
```

## 678D

### 题目

[678D](http://codeforces.com/problemset/problem/678/D)

### 题意

给定一个数n，求出所有满足条件的数对(a, b)，使得a + b = n，且a和b的二进制表示中1的个数相同。

### 思路

首先，我们可以知道，如果a和b的二进制表示中1的个数相同，那么a和b的二进制表示中0的个数也相同。

那么，我们可以枚举a的二进制表示中1的个数，然后计算出b的二进制表示中1的个数，然后计算出a和b的二进制表示中0的个数，然后计算出b的二进制表示中0的个数，然后判断a和b的二进制表示中0的个数是否相同，如果相同，那么就输出a和b。

### 代码

```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        
        for (int i = 0; i <= 31; i++) {
            int a = (1 << i) - 1;
            int b = n - a;
            int cnt_a = Integer.bitCount(a);
            int cnt_b = Integer.bitCount(b);
            
            if (cnt_a == cnt_b) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
```


### 代码

```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int ans = (n + k - 1) / k * k;
        System.out.println(ans);
    }
}
```
/codeforces/678/README.md
# codeforces 678

## 678A

### 题目

[678A](http://codeforces.com/problemset/problem/678/A)

### 题意

给定一个数n和一个数k，求出最小的数m，使得m是k的倍数，且m >= n。

### 思路

我们可以知道，m = (n + k - 1) / k * k。

### 代码

```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int ans = (n + k - 1) / k * k;
        System.out.println(ans);
    }
}
```

## 678B

### 题目

[678B](http://codeforces.com/problemset/problem/678/B)

### 题意

给定一个数n，求出最小的数m，使得m是2的倍数，且m >= n。

### 思路

我们可以知道，m = (n + 1) / 2 * 2。

### 代码

```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = (n + 1) / 2 * 2;
        System.out.println(ans);
    }
}
```

## 678C

### 题目

[678C](http://codeforces.com/problemset/problem/678/C)

### 题意

给定一个数n，求出最小的数m，使得m是3的倍数，且m >= n。

### 思路

我们可以知道，m = (n + 2) / 3 * 3。

### 代码

```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = (n + 2) / 3 * 3;
        System.out.println(ans);
    }
}
```

## 678D

### 题目

[678D](http://codeforces.com/problemset/problem/678/D)

### 题意

给定一个数n
