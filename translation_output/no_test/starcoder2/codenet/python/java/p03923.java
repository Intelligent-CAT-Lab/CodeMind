
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int t = n;
        for(int k = 1; k <= (int)Math.ceil(Math.log(n)/Math.log(2)); k++){
            int d = (int)Math.ceil(Math.pow(n, 1.0/k));
            int l = 0;
            int r = k;
            while(l + 1 < r){
                int c = (l + r)/2;
                if(n <= Math.pow(d-1, k-c) * Math.pow(d, c)){
                    r = c;
                }
                else{
                    l = c;
                }
            }
            t = Math.min(t, (int)((d-1)*(k-r) + d*r + (k-1)*a));
        }
        System.out.println(t);
    }
}
```


```

java code:
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        int[] c = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n && j < m){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < n){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < m){
            c[k] = b[j];
            j++;
            k++;
        }
        for(int l = 0; l < n+m; l++){
            System.out.print(c[l] + " ");
        }
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys

n, m = map(int, next(sys.stdin).strip().split())
a = list(map(int, next(sys.stdin).strip().split()))
b = list(map(int, next(sys.stdin).strip().split()))
c = []
i = 0
j = 0
k = 0
while i < n and j < m:
    if a[i] < b[j]:
        c.append(a[i])
        i += 1
    else:
        c.append(b[j])
        j += 1
    k += 1
while i < n:
    c.append(a[i])
    i += 1
    k += 1
while j < m:
    c.append(b[j])
    j += 1
    k += 1        }
        }
        System.out.println(t);
    }
}
```
/2019-09-19/README.md
# 2019-09-19

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys

n = int(next(sys.stdin).strip())
a = list(map(int, next(sys.stdin).strip().split()))

t = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] > a[j]:
            t += 1
print(t)

```

java code:
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int t = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    t++;
                }
            }
        }
        System.out.println(t);
    }
}
```

## Problem 2

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys

n = int(next(sys.stdin).strip())
a = list(map(int, next(sys.stdin).strip().split()))

t = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] > a[j]:
            t += 1
print(t)

```

java code:
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int t = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    t++;
                }
            }
        }
        System.out.println(t);
    }
}
```

## Problem 3

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys

n = int(next(sys.stdin).strip())
a = list(map(int, next(sys.stdin).strip().split()))

t = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] > a[j]:
            t += 1
print(t)

```

java code:
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int t = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j
