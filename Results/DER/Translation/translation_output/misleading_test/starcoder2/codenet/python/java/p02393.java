

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
    }
}
```

## Question 2

Write a program to find the sum of the first 100 natural numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a program to find the sum of the first 100 even numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 4

Write a program to find the sum of the first 100 odd numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 5

Write a program to find the sum of the first 100 prime numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 1;
        while (count < 100) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## Question 6

Write a program to find the sum of the first 100 numbers that are divisible by 3.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 7

Write a program to find the sum of the first 100 numbers that are divisible by 5.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 8

Write a program to find the sum of the first 100 numbers that are divisible by 3 and 5.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 9

Write a program to find the sum of the first 100 numbers that are divisible by 3 or 5.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 10

Write a program to find the sum of the first 100 numbers that are divisible by 3 or 5 but not both.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 11

Write a program to find the sum of the first 100 numbers that are divisible by 3 or 5 but not both.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 12

Write a program to find the sum of the first 100 numbers that are divisible by 3 or 5 but not both.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 13

Write a program to find the sum of the first 100 numbers that are divisible by 3 or 5 but not both.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 14

Write a program to find the sum of the first 100 numbers that are divisible by 3 or 5 but not both.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
   
