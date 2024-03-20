
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            } else if (s.charAt(i) == 'b') {
                b++;
            } else if (s.charAt(i) == 'c') {
                c++;
            }
        }
        int max = Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a)));
        if (max <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 5.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 6.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 7.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 8.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 9.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 10.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

## 11.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
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

