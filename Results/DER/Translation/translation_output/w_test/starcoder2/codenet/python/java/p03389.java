
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] a = new int[]{A, B, C};
        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            s += tmp / 2;
            a[i] += tmp / 2 * 2;
        }
        s += a[0] + a[1] + a[2] % 3;
        System.out.println(s);
    }
}
```

## 2. 1000

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
3

```
A, B = list(map(int, input().split()))

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

## 3. 1001

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

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

## 4. 1002

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2

```
A, B = list(map(int, input().split()))

print(A * B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A * B);
    }
}
```

## 5. 1003

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

print(A // B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A / B);
    }
}
```

## 6. 1004

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

print(A % B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A % B);
    }
}
```

## 7. 1005

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2

```
A, B = list(map(int, input().split()))

print(A ** B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((int) Math.pow(A, B));
    }
}
```

## 8. 1006

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

print(A & B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A & B);
    }
}
```

## 9. 1007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

print(A | B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A | B);
    }
}
```

## 10. 1008

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

print(A ^ B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A ^ B);
    }
}
```

## 11. 1009

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

print(A << B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A << B);
    }
}
```

## 12. 1010

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
1

```
A, B = list(map(int, input().split()))

print(A >> B)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[]
