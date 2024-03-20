

```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal n = sc.nextBigDecimal();
        BigDecimal d = sc.nextBigDecimal();
        BigDecimal x = sc.nextBigDecimal();
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal i1 = new BigDecimal(i);
            BigDecimal i2 = new BigDecimal(n.intValue() - i + 1);
            BigDecimal i3 = new BigDecimal(n.intValue() * 2 - 1);
            ans = ans.add(i2.divide(i1, 200, BigDecimal.ROUND_HALF_UP).multiply(d.add(x.multiply(i3.divide(new BigDecimal("2"), 200, BigDecimal.ROUND_HALF_UP)))));
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of the following series upto n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ….. + 1/n

Test input:
10

Expected output:
2.9289682539682538

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / i;
        }
        System.out.println(ans);
    }
}
```

## 3.

Write a program to find the sum of the following series upto n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ….. + 1/n^2

Test input:
10

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / (i * i);
        }
        System.out.println(ans);
    }
}
```
/2019/2019-09-19/README.md
# 2019-09-19

## 1.

Write a program to find the sum of the following series upto n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ….. + 1/n

Test input:
10

Expected output:
2.9289682539682538

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / i;
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of the following series upto n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ….. + 1/n^2

Test input:
10

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / (i * i);
        }
        System.out.println(ans);
    }
}
```

## 3.

Write a program to find the sum of the following series upto n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ….. + 1/n

Test input:
10

Expected output:
2.9289682539682538

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / i;
        }
        System.out.println(ans);
    }
}
```

## 4.

Write a program to find the sum of the following series upto n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ….. + 1/n^2

Test input:
10

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / (i * i);
        }
        System.out.println(ans);
    }
}
```

## 5.

Write a program to find the sum of the following series upto n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ….. + 1/n

Test input:
10

Expected output:
2.9289682539682538

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / i;
        }
        System.out.println(ans);
    }
}
```

## 6.

Write a program to find the sum of the following series upto n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ….. + 1/n^2

Test input:
10

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += 1.0 / (i * i);
        }
        System.out.println(ans);
    }
}
```

## 7.

Write a program to find the sum of the following series upto n terms:

1 + 1/2 + 1/3 + 1/4
