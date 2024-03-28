
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String out = " ";
        int cap = 0;
        int small = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isLowerCase(txt.charAt(i))) {
                small++;
            } else {
                cap++;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                out += Character.toLowerCase(txt.charAt(i));
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                out += Character.toUpperCase(txt.charAt(i));
            }
        }
        System.out.println(out);
    }
}
```

## 3.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:
```
azcbobobegghakl
```

Your program should print:
```
Number of times bob occurs is: 2
```

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int count = 0;
        for (int i = 0; i < txt.length() - 2; i++) {
            if (txt.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```

## 4.
Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:
```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:
```
Longest substring in alphabetical order is: abc
```

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < txt.length() - 1; i++) {
            if (txt.charAt(i) <= txt.charAt(i + 1)) {
                current += txt.charAt(i);
            } else {
                current += txt.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        current += txt.charAt(txt.length() - 1);
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```


## 3.
Write a program that asks the user to enter an integer and prints two integers, root and pwr, such that 0 < pwr < 6 and root**pwr is equal to the integer entered by the user. If no such pair of integers exists, it should print a message to that effect.

java code:
```
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
                }
            }
        }
        if (!found) {
            System.out.println("No such pair of integers exists");
        }
    }
}
```

## 4.
Write a program that asks the user to enter a positive integer and tells the user whether or not the integer is a prime.

java code:
```
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
            System.out.println("Not prime");
        }
    }
}
```

## 5.
Write a program that asks the user to enter a positive integer and prints the sum of the squares of all the odd positive integers smaller than or equal to the number entered. For example, if the user enters 25, your program should print 225 because 1^2 + 3^2 + 5^2 + 7^2 + 9^2 + 11^2 + 13^2 + 15^2 + 17^2 + 19^2 + 21^2 + 23^2 + 25^2 = 225.

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
```

## 6.
Write a program that asks the user to enter a positive integer and prints the sum of all the even numbers from 1 to that number (inclusive). For example, if the user enters 10, the program should print 30 (10 + 8 + 6 + 4 + 2).

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 7.
Write a program that asks the user to enter a positive integer and prints the sum of all the odd numbers from 1 to that number (inclusive). For example, if the user enters 10, the program should print 25 (1 + 3 + 5 + 7 + 9).

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 8.
Write a program that asks the user to enter a positive integer and prints the sum of all the divisors of that number, other than itself. For example, if the user enters 10, the program should print 12 because 1 + 2 + 5 = 12.

java code:
```
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
        System.out.println(sum);
    }
}
```

## 9.
Write a program that asks the user to enter a positive integer and prints the sum of all the
