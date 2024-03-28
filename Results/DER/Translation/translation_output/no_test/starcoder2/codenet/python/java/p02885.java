
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int diff = A - B * 2;
        if (diff < 0) {
            System.out.println(0);
        } else {
            System.out.println(diff);
        }
    }
}
```

## 1002

Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

[x1, y1, r1, x2, y2, r2] = [int(i) for i in input().split()]

d = ((x1 - x2) ** 2 + (y1 - y2) ** 2) ** 0.5

if d == 0:
    if r1 == r2:
        print(-1)
    else:
        print(0)
else:
    if d == r1 + r2 or d == abs(r1 - r2):
        print(1)
    elif d < r1 + r2 and d > abs(r1 - r2):
        print(2)
    else:
        print(0)
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
        if (d == 0) {
            if (r1 == r2) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        } else {
            if (d == r1 + r2 || d == Math.abs(r1 - r2)) {
                System.out.println(1);
            } else if (d < r1 + r2 && d > Math.abs(r1 - r2)) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

## 1003

Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

[a, b, c] = [int(i) for i in input().split()]

if a == b and b == c:
    print(1)
elif a == b or b == c or a == c:
    print(2)
else:
    print(3)
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
        if (a == b && b == c) {
            System.out.println(1);
        } else if (a == b || b == c || a == c) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
```

## 1004

Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

[a, b, c, d] = [int(i) for i in input().split()]

if a == c and b == d:
    print(1)
else:
    print(0)
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
        if (a == c && b == d) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```

## 1005

Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

[a, b, c] = [int(i) for i in input().split()]

if a == b and b == c:
    print(10000 + a * 1000)
elif a == b or b == c or a == c:
    print(1000 + a * 100)
else:
    print(max(a, b, c) * 100)
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
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || b == c || a == c) {
            System.out.println(1000 + a * 100);
        } else {
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
        }
    }
}
```

## 1006

Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

[a, b, c] = [int(i) for i in input().split()]

if a == b and b == c:
    print(10000 + a * 1000)
elif a == b or b == c or a == c:
    print(1000 + a * 100)
else:
    print(max(a, b, c) * 100)
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
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || b == c || a == c) {
            System.out.println(1000 + a * 100);
        } else {
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
        }
    }
}
```

## 1007

Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

[a, b, c] = [int(i) for i in input().split()]

if a == b and b == c:
    print(10000 + a * 1000)
elif a == b or b == c or a == c:
    print(1000 + a * 100)
else:
    print(max(a, b, c) * 100)
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
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || b == c || a == c) {
            System.out.println(1000 + a * 100);
        } else {
            System.out.println(Math.max(a, Math.max(b, c)) * 100);
       
