
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int diff = N - M;
        int MAX = 1000000007;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println(factorial(N) * factorial(M) * 2 % MAX);
        } else {
            System.out.println(factorial(N) * factorial(M) % MAX);
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
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

## 11. 
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
               
