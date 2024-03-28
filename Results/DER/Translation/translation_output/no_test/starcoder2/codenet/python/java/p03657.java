
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

## 068 A - Replace to S
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC068 A - Replace to S
print('ABC'+input())
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

## 069 A - Grouping 2
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC069 A - Grouping 2
n,m = map(int,input().split())
print(n*m-n-m+1)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n * m - n - m + 1);
    }
}
```

## 070 A - Palindrome
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC070 A - Palindrome
n = input()
if n == n[::-1]:
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
        if (n.equals(new StringBuilder(n).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

## 071 A - Distance
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC071 A - Distance
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

## 072 A - Together
Translate the following python code to java and enclose your solution inside ```java```:
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

## 073 A - OddString
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC073 A - OddString
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

## 074 A - One Out of Two
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC074 A - One Out of Two
n = int(input())
a = int(input())
print(n*n-a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(n * n - a);
    }
}
```

## 075 A - One-dimensional World's Tale
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC075 A - One-dimensional World's Tale
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

## 076 A - Rating Goal
Translate the following python code to java and enclose your solution inside ```java```:
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

## 077 A - Rotation
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC077 A - Rotation
c1 = input()
c2 = input()

if c1 == c2[::-1]:
    print('YES')
else:
    print('NO')
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();

        if (c1.equals(new StringBuilder(c2).reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

## 078 A - Hurricane
Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC078 A - Hurricane
x,y = input().split()

if x > y:
    print('>')
elif x < y:
    print('<')
else:
    print('=')
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new
