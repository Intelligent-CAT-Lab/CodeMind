
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int)Math.sqrt(N);
        int[] plist = new int[n];
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (N % j == 0) {
                plist[i] = j;
                i++;
                if (j != N / j) {
                    plist[i] = N / j;
                    i++;
                }
            }
        }
        int ans = 0;
        for (int j = 0; j < i; j++) {
            int x = plist[j];
            int kari = N / x - 1;
            if (kari == 0) {
                continue;
            }
            int q = N / kari;
            int r = N % kari;
            if (q == r) {
                ans += kari;
            }
        }
        System.out.println(ans);
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

the output should be:

```
Number of times bob occurs is: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```
/2019/04/04.md
# 2019/04/04

## 1. 
Write a program that asks the user to input 10 integers, and then prints the largest odd number that was entered. If no odd number was entered, it should print a message to that effect.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1 && n > max) {
                max = n;
            }
        }
        if (max == 0) {
            System.out.println("No odd number was entered.");
        } else {
            System.out.println(max);
        }
    }
}
```

## 2. 
Write a program that asks the user to input any positive integer and then prints the sum of all the even numbers from 1 to that number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3. 
Write a program that asks the user to input any positive integer and then prints the sum of all the odd numbers from 1 to that number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 5. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that are divisible by 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that are divisible by 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9. 
Write a program that asks the user to input any positive integer and then prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n
