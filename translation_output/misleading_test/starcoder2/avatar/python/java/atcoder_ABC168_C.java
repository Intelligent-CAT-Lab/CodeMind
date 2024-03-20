

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60.0)) / 12));
        double theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60.0));
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);
        System.out.println(Math.sqrt(Math.pow((x_h - x_m), 2) + Math.pow((y_h - y_m), 2)));
    }
}
```

## Question 2

Write a program to find the sum of the first 1000 prime numbers.

```
import math

def is_prime(n):
    if n == 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def sum_of_primes(n):
    sum = 0
    count = 0
    i = 1
    while count < n:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    return sum

print(sum_of_primes(1000))
```

```java
import java.lang.Math;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimes(int n) {
        int sum = 0;
        int count = 0;
        int i = 1;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count += 1;
            }
            i += 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPrimes(1000));
    }
}
```

## Question 3

Write a program to find the sum of the first 1000 prime numbers.

```
import math

def is_prime(n):
    if n == 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def sum_of_primes(n):
    sum = 0
    count = 0
    i = 1
    while count < n:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    return sum

print(sum_of_primes(1000))
```

```java
import java.lang.Math;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimes(int n) {
        int sum = 0;
        int count = 0;
        int i = 1;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count += 1;
            }
            i += 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPrimes(1000));
    }
}
```

## Question 4

Write a program to find the sum of the first 1000 prime numbers.

```
import math

def is_prime(n):
    if n == 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def sum_of_primes(n):
    sum = 0
    count = 0
    i = 1
    while count < n:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    return sum

print(sum_of_primes(1000))
```

```java
import java.lang.Math;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfPrimes(int n) {
        int sum = 0;
        int count = 0;
        int i = 1;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count += 1;
            }
            i += 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfPrimes(1000));
    }
}
```

## Question 5

Write a program to find the sum of the first 1000 prime numbers.

```
import math

def is_prime(n):
    if n == 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def sum_of_primes(n):
    sum = 0
    count = 0
    i = 1
    while count < n:
        if is_prime(i):
            sum += i
            count += 1
        i += 1
    return sum

print(sum_of_primes(1000))
```

```java
import java.lang.Math;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return
