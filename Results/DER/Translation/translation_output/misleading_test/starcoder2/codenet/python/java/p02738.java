
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int m = 0; m < n * 5; m++) {
                d[i][m] = (d[i - 3][m] * k + d[k][(m + 1) % (n * 5)]) * j + d[j][(m + n * 5 - 1) % (n * 5)];
                d[i][m] %= M;
            }
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += d[l - 1][i];
            sum %= M;
        }
        System.out.println(sum);
    }
}
```

## 2. 2019-09-16

### 2.1. 题目

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 998244353

Expected output:
-61

```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```

java code:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int m = 0; m < n * 5; m++) {
                d[i][m] = (d[i - 3][m] * k + d[k][(m + 1) % (n * 5)]) * j + d[j][(m + n * 5 - 1) % (n * 5)];
                d[i][m] %= M;
            }
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += d[l - 1][i];
            sum %= M;
        }
        System.out.println(sum);
    }
}
```

## 3. 2019-09-17

### 3.1. 题目

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 998244353

Expected output:
-61

```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```

java code:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int m = 0; m < n * 5; m++) {
                d[i][m] = (d[i - 3][m] * k + d[k][(m + 1) % (n * 5)]) * j + d[j][(m + n * 5 - 1) % (n * 5)];
                d[i][m] %= M;
            }
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += d[l - 1][i];
            sum %= M;
        }
        System.out.println(sum);
    }
}
```

## 4. 2019-09-18

### 4.1. 题目

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 998244353

Expected output:
-61

```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```

java code:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1;
            int k = i - 2;
            for (int m = 0; m < n * 5; m++) {
                d[i][m] = (d[i - 3][m] * k + d[k][(m + 1) % (n * 5)]) * j + d[j][(m + n * 5 - 1) % (n * 5)];
                d[i][m] %= M;
            }
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += d[l - 1][i];
            sum %= M;
        }
        System.out.println(sum);
    }
}
```

## 5. 2019-09-19

### 5.1. 题目

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 998244353

Expected output:
-61

```
from
