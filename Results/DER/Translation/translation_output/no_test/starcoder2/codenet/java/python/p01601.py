
```python
n = int(input())
for i in range(1000000):
    if str(n-i) == str(n-i)[::-1]:
        print(n-i)
        break
    if str(n+i) == str(n+i)[::-1]:
        print(n+i)
        break
```

## 01602

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01602 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if( a[i] == a[j] ) ans++;
            }
        }
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new p01602().run();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i+1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

## 01603

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01603 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if( a[i] == a[j] && a[j] == a[k] ) ans++;
                }
            }
        }
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new p01603().run();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            if a[i] == a[j] == a[k]:
                ans += 1
print(ans)
```

## 01604

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01604 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    for(int l=k+1;l<n;l++) {
                        if( a[i] == a[j] && a[j] == a[k] && a[k] == a[l] ) ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new p01604().run();
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            for l in range(k+1, n):
                if a[i] == a[j] == a[k] == a[l]:
                    ans += 1
print(ans)
```

## 01605

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class p01605 {

    int INF = 1 << 28;
    //long INF = 1L << 62;
    double EPS = 1e-10;

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    for(int l=k+1;l<n;l++) {
                        for(int m=l+1;m<n;m++) {
                            if( a[i] ==
