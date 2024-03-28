

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] l = factorization(p);
        int ans = 1;
        for (int i = 0; i < l.length; i++) {
            if (l[i] >= n) {
                ans *= (int) Math.pow(i, l[i] / n);
            }
        }
        System.out.println(ans);
    }

    public static int[] factorization(int n) {
        int[] arr = new int[n + 1];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[i] = cnt;
            }
        }
        if (temp != 1) {
            arr[temp] = 1;
        }
        if (arr[0] == 0) {
            arr[n] = 1;
        }
        return arr;
    }
}
```

## 2.

Write a program to find the sum of all the multiples of 3 or 5 below 1000.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the largest prime factor of a composite number.

```java
public class Main {
    public static void main(String[] args) {
        int n = 600851475143;
        int max = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int temp = i;
                while (n % temp == 0) {
                    temp *= i;
                }
                if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }
}
```

## 4.

Write a program to find the largest palindrome made from the product of two 3-digit numbers.

```java
public class Main {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int temp = i * j;
                if (isPalindrome(temp) && temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
```

## 5.

Write a program to find the smallest number that is evenly divisible by all of the numbers from 1 to 20.

```java
public class Main {
    public static void main(String[] args) {
        int n = 20;
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= i / gcd(ans, i);
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

## 6.

Write a program to find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

```java
public class Main {
    public static void main(String[] args) {
        int n = 100;
        int sum = n * (n + 1) / 2;
        int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(sum * sum - sumOfSquares);
    }
}
```

## 7.

Write a program to find the 10001st prime number.

```java
public class Main {
    public static void main(String[] args) {
        int n = 10001;
        int cnt = 0;
        int i = 2;
        while (cnt < n) {
            if (isPrime(i)) {
                cnt++;
            }
            i++;
        }
        System.out.println(i - 1);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 8.

Write a program to find the largest product of 13 consecutive digits in the 1000-digit number.

```java
public class Main {
    public static void main(String[] args) {
        String s = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711
