
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b != c) {
            System.out.println("Yes");
        } else if (b == c && a != b) {
            System.out.println("Yes");
        } else if (a == c && a != b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

## 2.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number.

```
Sample input:
5

Expected output:
15
```

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

## 3.

Write a program that takes a number as input and prints the sum of all the even numbers from 1 to that number.

```
Sample input:
5

Expected output:
6
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that takes a number as input and prints the sum of all the odd numbers from 1 to that number.

```
Sample input:
5

Expected output:
9
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3.

```
Sample input:
5

Expected output:
6
```

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

## 6.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 5.

```
Sample input:
5

Expected output:
5
```

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

## 7.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

```
Sample input:
5

Expected output:
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5.

```
Sample input:
5

Expected output:
12
```

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

## 9.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5 but not both.

```
Sample input:
5

Expected output:
8
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5 but not both.

```
Sample input:
5

Expected output:
8
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5 but not both.

```
Sample input:
5

Expected output:
8
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5 but
