

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```

## 2. 1000000007

```

Given a number n, find the number of trailing zeros in n!

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        System.out.println(ans);
    }
}
```

## 3. 1000000008

```

Given a number n, find the number of trailing zeros in n!

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        System.out.println(ans);
    }
}
```


```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        System.out.println(ans);
    }
}
```

## 3. 1000000008

```

Given a number n, find the number of trailing zeros in n!

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        System.out.println(ans);
    }
}
```
/README.md
# 1000000007

## 1. 1000000006

```

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
4

```


a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```

## 2. 1000000007

```

Given a number n, find the number of trailing zeros in n!
