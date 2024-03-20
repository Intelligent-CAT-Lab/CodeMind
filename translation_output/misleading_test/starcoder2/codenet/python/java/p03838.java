
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (y == 0 && 0 < x) {
            System.out.println(x + 1);
            System.exit(0);
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            System.exit(0);
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            System.exit(0);
        }
        if (x == 0 && y < 0) {
            System.out.println(abs_y + 1);
            System.exit(0);
        }

        if (x < 0 && 0 < y) {
            System.out.println(abs_y - abs_x + 1);
            System.exit(0);
        }
        if (y < 0 && 0 < x) {
            System.out.println(abs_y - abs_x + 1);
            System.exit(0);
        }
    }
}
```

## 2.

Write a program that takes a number and prints its digits from left to right and then from right to left.

```
Sample input: 31243
Sample output:
3 1 2 4 3
3 4 2 1 3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

## 3.

Write a program that takes a number and determines whether it is a palindrome or not.

```
Sample input: 12321
Sample output:
Palindrome
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        boolean isPalindrome = true;
        for (int i = 0; i < count / 2; i++) {
            if (arr[i] != arr[count - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
```

## 4.

Write a program that takes a number and determines whether it is a prime number or not.

```
Sample input: 13
Sample output:
Prime
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
```

## 5.

Write a program that takes a number and determines whether it is a perfect number or not.

```
Sample input: 6
Sample output:
Perfect
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }
}
```

## 6.

Write a program that takes a number and determines whether it is a strong number or not.

```
Sample input: 145
Sample output:
Strong
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
    }
}
```

## 7.

Write a program that takes a number and determines whether it is a happy number or not.

```
Sample input: 19
Sample output:
Happy
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit;
            temp /= 10;
        }
        if (sum == 1) {
            System.out.println("Happy");
        } else {
            System.out.println("Not Happy");
        }
    }
}
```

## 8.

Write a program that takes a number and determines whether it is a disarium number or not.

```
Sample input: 135
Sample output:
Disarium
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n
