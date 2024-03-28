

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
            if (i < 2 * N - 1 - x) {
                ans[i] = 2 * N - 1 - i;
            } else {
                ans[i] = i - 2 * N + 1 + x;
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
1000000007

Expected output:
1000000008

```
n = int(input())
print(n+1)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + 1);
    }
}
```

## 4. 1000000009

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006

```
n = int(input())
print(n-1)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}
```

## 5. 1000000010

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000005

```
n = int(input())
print(n-2)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 2);
    }
}
```

## 6. 1000000011

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000004

```
n = int(input())
print(n-3)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 3);
    }
}
```

## 7. 1000000012

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000003

```
n = int(input())
print(n-4)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 4);
    }
}
```

## 8. 1000000013

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000002

```
n = int(input())
print(n-5)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 5);
    }
}
```

## 9. 1000000014

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000001

```
n = int(input())
print(n-6)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 6);
    }
}
```

## 10. 1000000015

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000000

```
n = int(input())
print(n-7)
```

java code:

```java
import java.util.Scanner;

public class Main
