
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(i + 1 + " " + (i + 2));
                System.exit(0);
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println(i + 1 + " " + (i + 3));
                System.exit(0);
            }
        }
        System.out.println(-1 + " " + -1);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:
```
azcbobobegghakl
```

Your program should print:
```
Number of times bob occurs is: 2
```

java code:
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

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:
```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:
```
Longest substring in alphabetical order is: abc
```

Note: This problem may be challenging. We encourage you to work smart. If you've spent more than a few hours on this problem, we suggest that you move on to a different part of the course. If you have time, come back to this problem after you've had a break and cleared your head.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                current += s.charAt(i);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.charAt(i);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = "" + s.charAt(i);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```

## 4.

Write a program that asks the user to enter an integer and prints two integers, root and pwr, such that 0 < pwr < 6 and root**pwr is equal to the integer entered by the user. If no such pair of integers exists, it should print a message to that effect.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        for (int root = 1; root < n; root++) {
            for (int pwr = 1; pwr < 6; pwr++) {
                if (Math.pow(root, pwr) == n) {
                    System.out.println(root + " " + pwr);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No such pair of integers exists");
        }
    }
}
```

## 5.

Write a program that asks the user to enter a positive integer and prints the sum of all of the odd positive integers that are smaller than a positive integer entered by the user.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that asks the user to enter a positive integer and prints the sum of all of the even positive integers that are smaller than a positive integer entered by the user.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that asks the user to enter a positive integer and prints the sum of all of the positive integers that are divisible by 2 or 3, but not both, that are smaller than a positive integer entered by the user.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && i % 3 != 0 || i % 2 != 0 && i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that asks the user to enter a positive integer and prints the sum of all of the positive integers that are divisible by 2 or 3, but not both, that are smaller than a positive integer entered by the user.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && i % 3 != 0 || i % 2 != 0 && i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that asks the user to enter a positive integer and prints the sum of all of the positive integers that are divisible by 2 or 3, but not both, that are smaller than a positive integer entered by the user.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && i % 3 != 0 || i % 2 != 0 && i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```


