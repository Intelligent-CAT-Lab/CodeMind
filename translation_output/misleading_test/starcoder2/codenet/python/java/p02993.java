
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
azcbobobegghakl
```

Expected output:

```
2
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
        System.out.println(count);
    }
}
```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order.

Test input:

```
azcbobobegghakl
```

Expected output:

```
beggh
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                current = "" + s.charAt(i);
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println(longest);
    }
}
```


```

Expected output:

```
1
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that asks the user to enter an integer and prints two integers, root and pwr, such that 0 < pwr < 6 and root^pwr is equal to the integer entered by the user. If no such pair of integers exists, it should print a message to that effect.

Test input:

```
1296
```

Expected output:

```
6 3
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < 100; j++) {
                if (Math.pow(j, i) == n) {
                    System.out.println(j + " " + i);
                    return;
                }
            }
        }
        System.out.println("No such pair of integers exists");
    }
}
```
/week1/README.md
# Week 1

## 1.

Write a program that asks the user to enter a number and prints the sum of the number plus 100 and 500.

Test input:

```
10
```

Expected output:

```
610
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + 100 + 500);
    }
}
```

## 2.

Write a program that asks the user to enter an integer and prints the number of times that the integer can be divided by 2 without a remainder.

Test input:

```
10/week2/README.md
# Week 2

## 1.

Write a program that asks the user to enter a number and prints the sum of the number plus 100 and 500.

Test input:

```
10
```

Expected output:

```
610
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + 100 + 500);
    }
}
```

## 2.

Write a program that asks the user to enter an integer and prints the number of times that the integer can be divided by 2 without a remainder.

Test input:

```
10

```

Expected output:

```
1
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that asks the user to enter an integer and prints two integers, root and pwr, such that 0 < pwr < 6 and root^pwr is equal to the integer entered by the user. If no such pair of integers exists, it should print a message to that effect.

Test input:

```
1296
```

Expected output:

```
6 3
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < 100; j++) {
                if (Math.pow(j, i) == n) {
                    System.out.println(j + " " + i);
                    return;
                }
            }
        }
        System.out.println("No such pair of integers exists");
    }
}
```

## 4.

Write a program that asks the user to enter a number and prints the sum of the number plus 100 and 500.

Test input:

```
10
```

Expected output:

```
610
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + 100 + 500);
    }
}
```

## 5.

Write a program that asks the user to enter an integer and prints the number of times that the integer can be divided by 2 without a remainder.

Test input:

```
10

```

Expected output:

```
1
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

