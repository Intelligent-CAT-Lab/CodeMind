
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int turn = 0;
        for (int i = 0; i < k; i++) {
            if (turn == 0) {
                if (a % 2 == 0) {
                    b += a / 2;
                    a -= a / 2;
                } else {
                    a -= 1;
                    b += a / 2;
                    a -= a / 2;
                }
                turn = 1;
            } else {
                if (b % 2 == 0) {
                    a += b / 2;
                    b -= b / 2;
                } else {
                    b -= 1;
                    a += b / 2;
                    b -= b / 2;
                }
                turn = 0;
            }
        }
        System.out.println(a + " " + b);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

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

Write a program to find the sum of the first 1000 prime numbers.

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

## 4.

Write a program to find the sum of the first 1000 prime numbers.

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

## 5.

Write a program to find the sum of the first 1000 prime numbers.

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

## 6.

Write a program to find the sum of the first 1000 prime numbers.

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

## 7.

Write a program to find the sum of the first 1000 prime numbers.

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

## 8.

Write a program to find the sum of the first 1000 prime numbers.

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

## 9.

Write a program to find the sum of the first 1000 prime numbers.

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

## 10.

Write a program to find the sum of the first 1000 prime numbers.

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


## 10.

Write a program to find the sum of the first 1000 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count
