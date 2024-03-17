

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ss = sc.nextInt();
        int hour = ss / 60 / 60;
        int second = ss % (60 * 60);
        int minute = second / 60;
        second = second % 60;
        System.out.println(hour + ":" + minute + ":" + second);
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
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```
/01-basic/01-basic-01.md
# 01-basic-01

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
55


```
n = int(input())
print(sum(range(1, n + 1)))/01-basic/01-basic-02.md
# 01-basic-02

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
n = int(input())
print(n)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
    }
}
```
/01-basic/01-basic-03.md
# 01-basic-03

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
10
10
10
10
10
10
10
10
10
10


```
n = int(input())
for i in range(10):
    print(n)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(n);
        }
    }
}
```

# 01-basic-04

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
10


```
n = int(input())
for i in range(1, n + 1):
    print(i)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
```

# 01-basic-05

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
10
9
8
7
6
5
4
3
2
1


```
n = int(input())
for i in range(n, 0, -1):
    print(i)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
```

# 01-basic-06

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
10
9
8
7
6
5
4
3
2
1


```
n = int(input())
for i in range(1, n + 1):
    print(i)
for i in range(n - 1, 0, -1):
    print(i)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        for (int i = n - 1; i > 0; i--) {
            System.out.println(i);
        }
    }
}
```

# 01-basic-07

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
10
10
9
8
7
6
5
4
3
2
1


```
n = int(input())
for i in range(1, n + 1):
    print(i)
for i in range(n, 0, -1):
    print(i)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}
```

# 01-basic-08

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
10
10
9
8
7
6
5
4
3
2
1
1
2
3
4
5
6
7
8
9
10


```
n = int(input())
for i in range(1, n + 1):
    print(i)
for i in range(n, 0, -1):
    print(i)
for i in range(1, n + 1):
    print(i)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
```

# 01-basic-09

Translate the following python code
