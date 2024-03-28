
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % 3 == 0) {
            System.out.println("Possible");
        } else if (b % 3 == 0) {
            System.out.println("Possible");
        } else if ((a + b) % 3 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
```

## ABC068 A - ABCxxx

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
ABC100

```
# ABC068 A - ABCxxx
n = int(input())
print('ABC' + str(n))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ABC" + n);
    }
}
```

## ABC069 A - K-City

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10

Expected output:
90

```
# ABC069 A - K-City
n,m = map(int,input().split())
print((n-1)*(m-1))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((n - 1) * (m - 1));
    }
}
```

## ABC070 A - Palindromic Number

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123

Expected output:
No

```
# ABC070 A - Palindromic Number
n = input()
if n[0] == n[2]:
    print('Yes')
else:
    print('No')
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (n.charAt(0) == n.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

## ABC071 A - Meal Delivery

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 100 1000

Expected output:
100

```
# ABC071 A - Meal Delivery
x,a,b = map(int,input().split())
if abs(x-a) < abs(x-b):
    print('A')
else:
    print('B')
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```

## ABC072 A - Together

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10

Expected output:
90

```
# ABC072 A - Together
x,t = map(int,input().split())
print(max(0,x-t))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(Math.max(0, x - t));
    }
}
```

## ABC073 A - Writing Numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123

Expected output:
Yes

```
# ABC073 A - Writing Numbers
n = input()
if '9' in n:
    print('Yes')
else:
    print('No')
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (n.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

## ABC074 A - Crane and Turtle

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
99

```
# ABC074 A - Crane and Turtle
n = int(input())
print(100-n)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(100 - n);
    }
}
```

## ABC075 A - One out of Three

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
2

```
# ABC075 A - One out of Three
a,b,c = map(int,input().split())
if a == b:
    print(c)
elif a == c:
    print(b)
else:
    print(a)
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
        if (a == b) {
            System.out.println(c);
        } else if (a == c) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
```

## ABC076 A - Rating Goal

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10

Expected output:
110

```
# ABC076 A - Rating Goal
r,g = map(int,input().split())
print(2*g-r)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        System.out.println(2 * g - r);
    }
}
```

## ABC077 A - Rotation

Translate the following python code to java and
