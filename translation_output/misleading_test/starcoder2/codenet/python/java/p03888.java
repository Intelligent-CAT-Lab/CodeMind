

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(1/((r2+r1) /(r1*r2)));
    }
}
```

## 2. 
Write a program to calculate the sum of the first 100 even numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3. 
Write a program to calculate the sum of the first 100 odd numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4. 
Write a program to calculate the sum of the first 100 numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 5. 
Write a program to calculate the sum of the first 100 square numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
```

## 6. 
Write a program to calculate the sum of the first 100 square odd numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                sum += i * i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7. 
Write a program to calculate the sum of the first 100 square even numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i * i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8. 
Write a program to calculate the sum of the first 100 cube numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i * i * i;
        }
        System.out.println(sum);
    }
}
```

## 9. 
Write a program to calculate the sum of the first 100 cube odd numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                sum += i * i * i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10. 
Write a program to calculate the sum of the first 100 cube even numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i * i * i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11. 
Write a program to calculate the sum of the first 100 factorial numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }
        System.out.println(sum);
    }
}
```

## 12. 
Write a program to calculate the sum of the first 100 factorial odd numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                int factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                sum += factorial;
            }
        }
        System.out.println(sum);
    }
}
```

## 13. 
Write a program to calculate the sum of the first 100 factorial even numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                int factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial *= j;
                }
                sum += factorial;
            }
        }
        System.out.println(sum);
    }
}
```

## 14. 
Write a program to calculate the sum of the first 100 prime numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 2;
        while (count < 100) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println(sum);
    }
}
```

## 15. 
Write a program to calculate the sum of the first 100 prime odd numbers.

java code:

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 3;
        while (count < 100) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 
