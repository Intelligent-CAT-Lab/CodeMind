
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        int fa = a;
        int fb = b;
        int fc = c;
        while (true) {
            if (cnt != 0 && fa == a && fb == b && fc == c) {
                System.out.println(-1);
                System.exit(0);
            }
            double tmp1 = a / 2;
            double tmp2 = b / 2;
            double tmp3 = c / 2;
            if (!isDouble(tmp1, tmp2, tmp3)) {
                break;
            }
            cnt++;
            a = (int) (tmp2 + tmp3);
            b = (int) (tmp1 + tmp3);
            c = (int) (tmp1 + tmp2);
            if (!rem(a, b, c)) {
                break;
            }
        }
        System.out.println(cnt);
    }

    public static boolean rem(int a, int b, int c) {
        if (a % 2 != 0 || b % 2 != 0 || c % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDouble(double a, double b, double c) {
        if (a % 1 != 0 || b % 1 != 0 || c % 1 != 0) {
            return false;
        } else {
            return true;
        }
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

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                cnt++;
            }
        }
        System.out.println("Number of times bob occurs is: " + cnt);
    }
}
```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:
```
Longest substring in alphabetical order is: beggh
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String max = "";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                tmp = s.substring(i, i + 1);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    tmp += s.charAt(i);
                } else {
                    if (tmp.length() > max.length()) {
                        max = tmp;
                    }
                    tmp = s.substring(i, i + 1);
                }
            }
        }
        if (tmp.length() > max.length()) {
            max = tmp;
        }
        System.out.println("Longest substring in alphabetical order is: " + max);
    }
}
```/Week 1/README.md
# Week 1

## 1.

Write a program that does the following in order:

- Ask the user to enter his/her date of birth.
- Ask the user to enter the current date.
- Print how many days, hours, minutes and seconds ago was his/her date of birth (until now).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth:");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println("Enter the current date:");
        int year2 = sc.nextInt();
        int month2 = sc.nextInt();
        int day2 = sc.nextInt();
        int days = (year2 - year) * 365 + (month2 - month) * 30 + (day2 - day);
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
```

## 2.

Write a program that does the following in order:

- Ask the user to enter a number in seconds.
- Convert the number of seconds entered by the user to days, hours, minutes and seconds.
- Print the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in seconds:");
        int seconds = sc.nextInt();
        int days = seconds / (24 * 60 * 60);
        int hours = (seconds % (24 * 60 * 60)) / (60 * 60);
        int minutes = ((seconds % (24 * 60 * 60)) % (60 * 60)) / 60;
        int seconds2 = ((seconds % (24 * 60 * 60)) % (60 * 60)) % 60;
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds2);
    }
}
```

## 3.

Write a program that does the following in order:

- Ask the user to enter a number in seconds.
- Convert the number of seconds entered by the user to days, hours, minutes and seconds.
- Print the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in seconds:");
        int seconds = sc.nextInt();
        int days = seconds / (24 * 60 * 60);
        int hours = (seconds % (24 * 60 * 60)) / (60 * 60);
        int minutes = ((seconds % (24 * 60 * 60)) % (60 * 60)) / 60;
        int seconds2 = ((seconds % (24 * 60 * 60)) % (60 * 60)) % 60;
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds2);
    }
}
```

