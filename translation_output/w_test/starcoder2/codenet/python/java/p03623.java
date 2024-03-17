
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.abs(x-a) < Math.abs(x-b) ? "A" : "B");
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
        int a = sc.nextInt();
        System.out.println((n/a + (n%a > 0 ? 1 : 0)) * (m/a + (m%a > 0 ? 1 : 0)));
    }
}
```
/1000/1000.md
# A+B

## Problem

Write a program that reads two integers a and b, and then prints the sum of a and b.

## Input

The input consists of two integers a and b.

## Output

Print the sum of a and b.

## Constraints

-10000 <= a, b <= 10000

## Sample Input

```
1 2
```

## Sample Output

```
3
```

## Solution

```
a,b=map(int,input().split())
print(a+b)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

# A-B

## Problem

Write a program that reads two integers a and b, and then prints the difference of a and b.

## Input

The input consists of two integers a and b.

## Output

Print the difference of a and b.

## Constraints

-10000 <= a, b <= 10000

## Sample Input

```
3 2
```

## Sample Output

```
1
```

## Solution

```
a,b=map(int,input().split())
print(a-b)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

# A*B

## Problem

Write a program that reads two integers a and b, and then prints the product of a and b.

## Input

The input consists of two integers a and b.

## Output

Print the product of a and b.

## Constraints

-10000 <= a, b <= 10000

## Sample Input

```
3 2
```

## Sample Output

```
6
```

## Solution

```
a,b=map(int,input().split())
print(a*b)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}
```

# A/B

## Problem

Write a program that reads two integers a and b, and then prints the quotient of a and b.

## Input

The input consists of two integers a and b.

## Output

Print the quotient of a and b.

## Constraints

-10000 <= a, b <= 10000

## Sample Input

```
5 2
```

## Sample Output

```
2
```

## Solution

```
a,b=map(int,input().split())
print(a//b)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
    }
}
```

# 積み重ね

## Problem

高橋君は、N 個の円形の積み重ねを作ろうとしています。

高橋君は、半径 1 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 1 の円形の積み重ねを 1 個作った後、半径 2 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 2 の円形の積み重ねを 1 個作った後、半径 3 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 3 の円形の積み重ねを 1 個作った後、半径 4 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 4 の円形の積み重ねを 1 個作った後、半径 5 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 5 の円形の積み重ねを 1 個作った後、半径 6 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 6 の円形の積み重ねを 1 個作った後、半径 7 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 7 の円形の積み重ねを 1 個作った後、半径 8 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 8 の円形の積み重ねを 1 個作った後、半径 9 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 9 の円形の積み重ねを 1 個作った後、半径 10 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 10 の円形の積み重ねを 1 個作った後、半径 11 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 11 の円形の積み重ねを 1 個作った後、半径 12 の円形の積み重ねを 1 個作るのに 1 秒かかります。

高橋君は、半径 12 の円形の積み重ねを 1 個作った後、
