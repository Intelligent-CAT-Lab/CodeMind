
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            int cnt_divisor = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    cnt_divisor++;
                }
            }
            if (cnt_divisor == 8) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```

## 2.

Write a program that reads a number n and prints the sum of the first n even numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * 2;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and prints the sum of the first n odd numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * 2) - 1;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number n and prints the sum of the first n prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        for (int i = 2; cnt < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                cnt++;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new
