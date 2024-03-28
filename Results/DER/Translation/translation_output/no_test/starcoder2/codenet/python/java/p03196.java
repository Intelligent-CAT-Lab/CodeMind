
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= p; i++) {
            int cnt = 0;
            while (p % i == 0) {
                cnt++;
                p /= i;
            }
            if (cnt >= n) {
                ans *= (int) Math.pow(i, cnt / n);
            }
        }
        System.out.println(ans);
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(n)
ans=1
for i in range(len(l)):
    ans*=l[i][0]**(l[i][1]%1000000007)
    ans%=1000000007
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            ans *= (int) Math.pow(i, cnt % 1000000007);
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```

## 11. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(n)
ans=1
for i in range(len(l)):
    ans*=l[i][0]**(l[i][1]%1000000007)
    ans%=1000000007
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            ans *= (int) Math.pow(i, cnt % 1000000007);
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```

## 12. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(n)
ans=1
for i in range(len(l)):
    ans*=l[i][0]**(l[i][1]%1000000007)
    ans%=1000000007
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            ans *= (int) Math.pow(i, cnt % 1000000007);
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```

## 13. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(n)
ans=1
for i in range(len(l)):
    ans*=l[i][0]**(l[i][1]%1000000007)
    ans%=1000000007
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            while (n % i == 0) {
                cnt++;
                n /= i;
            }
            ans *= (int) Math.pow(i, cnt % 1000000007);
            ans %= 1000000007;
        }
        System.out.println(ans);
    }
}
```

## 14. 1000000007

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]
