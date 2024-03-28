

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[n + 1];
        d[0] = 1;
        for (int i = 0; i < n; i++) {
            d[i + 1] = ((m - i) * ((m - n + i) * d[i] + i * d[i - 1] * (m - i + 1))) % (1000000007);
        }
        System.out.println(d[n]);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += prime[j];
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

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += prime[j];
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

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += prime[j];
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

## 5.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += prime[j];
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

## 6.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += prime[j];
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

## 7.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += prime[j];
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

## 8.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                prime[count] = i;
                count++;
            }
            i++;
        }
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += prime[j];
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

## 9.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prime = new int[n];
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(
