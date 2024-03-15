
```
a, b, op = map(int, input().split())
for i in range(op):
    if i % 2 == 0:
        b += a // 2
        a //= 2
    else:
        a += b // 2
        b //= 2
print(a)
print(b)
```

## 3229

Translate the following java code to python and enclose your solution inside ```python```:
```
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class p03229
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[k];
        int[] d = new int[n+m+k];
        int i, j, l;
        for(i=0; i<n; i++) a[i] = sc.nextInt();
        for(i=0; i<m; i++) b[i] = sc.nextInt();
        for(i=0; i<k; i++) c[i] = sc.nextInt();
        i = j = l = 0;
        while(i<n && j<m && l<k){
            if(a[i] < b[j]){
                if(a[i] < c[l]){
                    d[i+j+l] = a[i];
                    i++;
                }
                else{
                    d[i+j+l] = c[l];
                    l++;
                }
            }
            else{
                if(b[j] < c[l]){
                    d[i+j+l] = b[j];
                    j++;
                }
                else{
                    d[i+j+l] = c[l];
                    l++;
                }
            }
        }
        while(i<n){
            d[i+j+l] = a[i];
            i++;
        }
        while(j<m){
            d[i+j+l] = b[j];
            j++;
        }
        while(l<k){
            d[i+j+l] = c[l];
            l++;
        }
        for(i=0; i<n+m+k; i++) System.out.print(d[i] + " ");
    }
}

```

python code:
```
n, m, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
d = [0] * (n + m + k)
i, j, l = 0, 0, 0
while i < n and j < m and l < k:
    if a[i] < b[j]:
        if a[i] < c[l]:
            d[i + j + l] = a[i]
            i += 1
        else:
            d[i + j + l] = c[l]
            l += 1
    else:
        if b[j] < c[l]:
            d[i + j + l] = b[j]
            j += 1
        else:
            d[i + j + l] = c[l]
            l += 1
while i < n:
    d[i + j + l] = a[i]
    i += 1
while j < m:
    d[i + j + l] = b[j]
    j += 1
while l < k:
    d[i + j + l] = c[l]
    l += 1
print(*d)
```

## 3230

Translate the following java code to python and enclose your solution inside ```python```:
```
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class p03230
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int i, j, k;
        for(i=0; i<n; i++) a[i] = sc.nextInt();
        for(i=0; i<n; i++) b[i] = sc.nextInt();
        for(i=0; i<n; i++) c[i] = sc.nextInt();
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                for(k=0; k<n; k++){
                    if(a[i] + b[j] + c[k] == 0) System.out.println(a[i] + " " + b[j] + " " + c[k]);
                }
            }
        }
    }
}

```

python code:
```
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
for i in range(n):
    for j in range(n):
        for k in range(n):
            if a[i] + b[j] + c[k] == 0:
                print(a[i], b[j], c[k])
```

## 3231

Translate the following java code to python and enclose your solution inside ```python```:
```
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class p03231
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int i, j, k;
        for(i=0; i<n; i++) a[i] = sc.nextInt();
        for(i=0; i<n; i++) b[i] = sc.nextInt();
        for(i=0; i<n; i++) c[i] = sc.nextInt();
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                for(k=0; k<n; k++){
                    if(a[i] + b[j] + c[k] == 0) System.out.println(a[i] + " " + b[j] + " " + c[k]);
                }
