
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int ans = Math.min(B,D) - Math.max(A,C);
        if (ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
```

## 1002

Translate the following python code to java and enclose your solution inside ```java```:
```
import math

x1, y1, r1, x2, y2, r2 = map(int, input().split())

d = math.sqrt((x1-x2)**2 + (y1-y2)**2)

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
        double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
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
import math

a, b, c = map(int, input().split())

if b**2 - 4*a*c < 0:
    print("No real root")
else:
    x1 = (-b + math.sqrt(b**2 - 4*a*c)) / (2*a)
    x2 = (-b - math.sqrt(b**2 - 4*a*c)) / (2*a)
    print(x1, x2)
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
        if (Math.pow(b,2) - 4*a*c < 0) {
            System.out.println("No real root");
        } else {
            double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            System.out.println(x1 + " " + x2);
        }
    }
}
```

## 1004

Translate the following python code to java and enclose your solution inside ```java```:
```
import math

a, b, c = map(int, input().split())

if b**2 - 4*a*c < 0:
    print("No real root")
else:
    x1 = (-b + math.sqrt(b**2 - 4*a*c)) / (2*a)
    x2 = (-b - math.sqrt(b**2 - 4*a*c)) / (2*a)
    print(x1, x2)
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
        if (Math.pow(b,2) - 4*a*c < 0) {
            System.out.println("No real root");
        } else {
            double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            System.out.println(x1 + " " + x2);
        }
    }
}
```

## 1005

Translate the following python code to java and enclose your solution inside ```java```:
```
import math

a, b, c = map(int, input().split())

if b**2 - 4*a*c < 0:
    print("No real root")
else:
    x1 = (-b + math.sqrt(b**2 - 4*a*c)) / (2*a)
    x2 = (-b - math.sqrt(b**2 - 4*a*c)) / (2*a)
    print(x1, x2)
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
        if (Math.pow(b,2) - 4*a*c < 0) {
            System.out.println("No real root");
        } else {
            double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            System.out.println(x1 + " " + x2);
        }
    }
}
```

## 1006

Translate the following python code to java and enclose your solution inside ```java```:
```
import math

a, b, c = map(int, input().split())

if b**2 - 4*a*c < 0:
    print("No real root")
else:
    x1 = (-b + math.sqrt(b**2 - 4*a*c)) / (2*a)
    x2 = (-b - math.sqrt(b**2 - 4*a*c)) / (2*a)
    print(x1, x2)
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
        if (Math.pow(b,2) - 4*a*c < 0) {
            System.out.println("No real root");
        } else {
            double x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            double x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / (2*a);
            System.out.println(x1 + " " + x2);
        }
    }
}
```

## 1007

Translate the following python code to java and enclose your solution inside ```java```:

