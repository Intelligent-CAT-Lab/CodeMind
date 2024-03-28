

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = " , . ? ! ";
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(t.charAt(i), t.charAt(i) + ' ');
        }
        s = " ".join(s.strip().split(" "));
        for (int i = 0; i < t.length(); i++) {
            s = s.replace(" " + t.charAt(i), t.charAt(i));
        }
        System.out.println(s);
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
```
/2021-09-20/README.md
# 2021-09-20

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1 2 3 4 5 6 7 8 9 10 

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ) : print ( i , end = ' ' )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
```

## Problem 2

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1 4 9 16 25 36 49 64 81 100 

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ) : print ( i * i , end = ' ' )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
```

## Problem 3

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1 2 4 8 16 32 64 128 256 512 

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ) : print ( 2 ** ( i - 1 ) , end = ' ' )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print((int) Math.pow(2, i - 1) + " ");
        }
    }
}
```

## Problem 4

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1 3 5 7 9 11 13 15 17 19 

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ) : print ( 2 * i - 1 , end = ' ' )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i - 1 + " ");
        }
    }
}
```

## Problem 5

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1 4 9 16 25 36 49 64 81 100 

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ) : print ( i * i , end = ' ' )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
```

## Problem 6

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1 4 9 16 25 36 49 64 81 100 

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ) : print ( i * i , end = ' ' )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}
```

## Problem 7

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1 4 9 16 25 36 49 64 81 100 

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ) : print ( i * i , end = ' ' )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner
