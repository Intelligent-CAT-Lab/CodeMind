

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = x / (double) (a * a);
        double ans;
        if (h >= b / 2) {
            double V = 2 * ((a * a * b) - x) / (a * a * a);
            ans = Math.toDegrees(Math.atan(V));
        } else {
            double V = a * (b * b) / (2 * x);
            ans = Math.toDegrees(Math.atan(V));
        }
        System.out.println(ans);
    }
}
```

## Question 2

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 4

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 5

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 6

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 7

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 8

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 9

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## Question 10

Write a java program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (
