
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        if (N != 100) {
            System.out.println(Math.pow(100, D) * N);
        } else {
            System.out.println(Math.pow(100, D) * (N + 1));
        }
    }
}
```

## 2. 1000번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
3

```
# coding: utf-8
A, B = map(int, input().split())
print(A + B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
    }
}
```

## 3. 1001번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-1

```
# coding: utf-8
A, B = map(int, input().split())
print(A - B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A - B);
    }
}
```

## 4. 1002번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4 5 12 5

Expected output:
2

```
# coding: utf-8
x1, y1, r1, x2, y2, r2 = map(int, input().split())
d = ((x1 - x2) ** 2 + (y1 - y2) ** 2) ** 0.5
if d == r1 + r2:
    print(1)
elif d > r1 + r2:
    print(0)
elif d < r1 + r2:
    print(2)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        if (d == r1 + r2) {
            System.out.println(1);
        } else if (d > r1 + r2) {
            System.out.println(0);
        } else if (d < r1 + r2) {
            System.out.println(2);
        }
    }
}
```

## 5. 1003번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1 2 3

```
# coding: utf-8
a, b, c = map(int, input().split())
print(a, b, c)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + " " + b + " " + c);
    }
}
```

## 6. 1004번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
1 2 3 4

```
# coding: utf-8
a, b, c, d = map(int, input().split())
print(a, b, c, d)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
```

## 7. 1005번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5

```
# coding: utf-8
a, b, c, d, e = map(int, input().split())
print(a, b, c, d, e)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}
```

## 8. 1006번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6

Expected output:
1 2 3 4 5 6

```
# coding: utf-8
a, b, c, d, e, f = map(int, input().split())
print(a, b, c, d, e, f)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
    }
}
```

## 9. 1007번

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7

Expected output:
1 2 3 4 5 6 7

```
# coding: utf-8
a, b, c, d, e, f, g = map(int, input().split())
print(a, b, c, d, e, f, g)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.
