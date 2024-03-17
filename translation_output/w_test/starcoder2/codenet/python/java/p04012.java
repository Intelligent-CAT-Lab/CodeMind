

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alfa.length(); i++) {
            if (w.length() % 2 == 1) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

The output should be:

```
Number of times bob occurs is: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
            } else if (s.charAt(i) <= s.charAt(i + 1)) {
                current += s.charAt(i);
            } else {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```
/week1/README.md
# Week 1

## 1.

Write a program that does the following in order:

- Asks the user to enter his/her date of birth.
- Asks the user to enter the current date.
- Prints how old the user is in days.
- Prints how old the user is in weeks.
- Prints how old the user is in months.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth:");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        System.out.println("Enter the current date:");
        int day2 = sc.nextInt();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();
        int days = (day2 - day) + (month2 - month) * 30 + (year2 - year) * 365;
        int weeks = days / 7;
        int months = days / 30;
        System.out.println("You are " + days + " days old.");
        System.out.println("You are " + weeks + " weeks old.");
        System.out.println("You are " + months + " months old.");
    }
}
```

## 2.

Write a program that asks the user to enter a number n and prints the sum of the numbers 1 to n.

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

## 3.

Write a program that asks the user to enter a number n and gives him the possibility to choose between computing the sum and computing the product of 1,…,n.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter 1 to compute the sum, or 2 to compute the product.");
        int choice = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            if (choice == 1) {
                sum += i;
            } else if (choice == 2) {
                product *= i;
            }
        }
        if (choice == 1) {
            System.out.println(sum);
        } else if (choice == 2) {
            System.out.println(product);
        }
    }
}
```

## 4.

Write a program that prints a multiplication table for numbers up to 12.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
```

## 5.

Write a program that asks the user for a number n and gives him the possibility to choose between computing the sum and computing the product of 1,…,n.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter 1 to compute the sum, or 2 to compute the product.");
        int choice = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            if (choice == 1) {
                sum += i;
            } else if (choice == 2) {
                product *= i;
            }
        }
        if (choice == 1) {
            System.out.println(sum);
        } else if (choice == 2) {
            System.out.println(product);
        }
    }
}
```

## 6.

Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can represent is fine too.)

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 1000000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
```

## 7.

Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. It counts only as one try if they input the same number multiple times consecutively.

```java
import java.util.Scanner;

public class
