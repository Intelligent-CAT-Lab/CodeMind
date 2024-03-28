
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 1;
        int r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l -= 1;
        int idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
m = int ( input ( ) )
a = [ ]
for i in range ( n ) :
    a.append ( int ( input ( ) ) )
b = [ ]
for i in range ( m ) :
    b.append ( int ( input ( ) ) )
c = [ ]
i = 0
j = 0
k = 0
while ( i < n and j < m ) :
    if ( a [ i ] < b [ j ] ) :
        c.append ( a [ i ] )
        i += 1
    else :
        c.append ( b [ j ] )
        j += 1
    k += 1
while ( i < n ) :
    c.append ( a [ i ] )
    i += 1
    k += 1
while ( j < m ) :
    c.append ( b [ j ] )
    j += 1
    k += 1
for i in range ( k ) :
    print ( c [ i ] , end = " " )
print ( )

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
m = int ( input ( ) )
a = [ ]
for i in range ( n ) :
    a.append ( int ( input ( ) ) )
b = [ ]
for i in range ( m ) :
    b.append ( int ( input ( ) ) )
c = [ ]
i = 0
j = 0
k = 0
while ( i < n and j < m ) :
    if ( a [ i ] < b [ j ] ) :
        c.append ( a [ i ] )
        i += 1
    else :
        c.append ( b [ j ] )
        j += 1
    k += 1
while ( i < n ) :
    c.append ( a [ i ] )
    i += 1
    k += 1
while ( j < m ) :
    c.append ( b [ j ] )
    j += 1
    k += 1
for i in range ( k ) :
    print ( c [ i ] , end = " " )
print ( )

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }
        for (int l = 0; l < n + m; l++) {
            System.out.print(c[l] + " ");
        }
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
m = int ( input ( ) )
a = [ ]
for i in range ( n ) :
    a.append ( int ( input ( ) ) )
b = [ ]
for i in range ( m ) :
    b.append ( int ( input ( ) ) )
c = [ ]
i = 0
j = 0
k = 0
while ( i < n and j < m ) :
    if ( a [ i ] < b [ j ] ) :
        c.append ( a [ i ] )
        i += 1
    else :
        c.append ( b [ j ] )
        j += 1
    k += 1
while ( i < n ) :
