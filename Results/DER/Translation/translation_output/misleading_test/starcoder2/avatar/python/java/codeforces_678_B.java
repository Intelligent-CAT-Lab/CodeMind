

```java
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean is_run = Calendar.isLeapYear(y);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            y++;
            if (Calendar.isLeapYear(y) == is_run && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}
```

## 2.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 3.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```


```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 3.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
/README.md
# 2020-2021-1-Java-Programming-Practice

## 1.

Write a program to find the maximum value in an array.

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 3.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 1.

Write a program to find the maximum value in an array.

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 3.

Write a program to calculate the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
       
