

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                return;
            } else {
                System.out.println("Yes");
                System.out.println(1);
                return;
            }
        }
        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }
        int[] ans = new int[2 * N - 1];
        for (int i = 0; i < 2 * N - 1; i++) {
            if (i < N - x) {
                ans[i] = 2 * N - 1 - i;
            } else {
                ans[i] = i - N + x + 1;
            }
        }
        if (!smaller) {
            for (int i = 0; i < 2 * N - 1; i++) {
                ans[i] = 2 * N - ans[i];
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < 2 * N - 1; i++) {
            System.out.println(ans[i]);
        }
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

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

## 3. 1000000008

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000008

Expected output:
1000000008

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

## 4. 1000000009

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000009

Expected output:
1000000009

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

## 5. 1000000010

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000010

Expected output:
1000000010

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
/README.md
# 2019-2020-Java-Translation-Contest

## 1. 1000000001

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
a, b, c = [int(i) for i in input().split()]
print(a+b+c)
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
        System.out.println(a + b + c);
    }
}
```

## 2. 1000000002

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
a, b, c = [int(i) for i in input().split()]
print(a+b+c)
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
        System.out.println(a + b + c);
    }
}
```

## 3. 1000000003

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
a, b, c = [int(i) for i in input().split()]
print(a+b+c)
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
        System.out.println(a + b + c);
    }
}
```

## 4. 1000000004

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
a, b, c = [int(i) for i in input().split()]
print(a+b+c)
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
        System.out.println(a + b + c);
    }
}
```

## 5. 1000000005

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case
