
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] n_arr = n.toCharArray();
        int lb = 0, ub = n_arr.length;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(9 * mid, n_arr)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int x, char[] n_arr) {
        int g = 0;
        for (int i = n_arr.length - 1; i >= 0; i--) {
            x -= (x + g - (n_arr[i] - '0')) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
a=list(map(int,input().split()))
b=list(map(int,input().split()))
c=list(map(int,input().split()))
d=list(map(int,input().split()))
ans=0
for i in range(n):
    for j in range(n):
        for k in range(n):
            for l in range(n):
                if a[i]+b[j]+c[k]+d[l]==0:
                    ans+=1
print(ans)
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (a[i] + b[j] + c[k] + d[l] == 0) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
a=list(map(int,input().split()))
ans=0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            if a[i]+a[j]>a[k] and a[i]+a[k]>a[j] and a[j]+a[k]>a[i]:
                ans+=1
print(ans)
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] > a[k] && a[i] + a[k] > a[j] && a[j] + a[k] > a[i]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2019/2019-03-20/README.md
# 2019-03-20

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
a=list(map(int,input().split()))
ans=0
for i in range(n):
    for j in range(i+1,n):
        if a[i]==a[j]:
            ans+=1
print(ans)
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
a=list(map(int,input().split()))
ans=0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            if a[i]+a[j]>a[k] and a[i]+a[k]>a[j] and a[j]+a[k]>a[i]:
                ans+=1
print(ans)
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] > a[k] && a[i] + a[k] > a[j] && a[j] + a[k] > a[i]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
a=list(map(int,input().split()))
ans=0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            for l in range(k+1,n):
                if a[i]+a[j]+a[k]>a[l] and a[i]+a[j]+a[l]>a[k] and a[i]+a[k]+a[l
