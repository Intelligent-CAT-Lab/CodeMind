
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(n / 1 + 1 > n * Math.sqrt(2) ? n * Math.sqrt(2) : n / 1 + 1);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
/2020-2021/2020-2021-1/2020-2021-1-1.md
# 2020-2021-1-1

## 1.

Write a program that reads a number n and prints the sum of the first n numbers.

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

## 2.

Write a program that reads a number n and prints the sum of the first n odd numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i - 1;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and prints the sum of the first n even numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 7.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 11.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 11 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 13.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 13 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 17.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 17 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 19.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 19 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 23.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 23 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that reads a number n and prints the sum of the
