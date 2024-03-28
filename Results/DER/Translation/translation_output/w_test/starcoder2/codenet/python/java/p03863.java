

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) || (s.charAt(0) != s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
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

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) <= s.charAt(i + 1)) {
                current += s.charAt(i);
            } else {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length() - 1);
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```

## 4.

Write a program that asks the user to enter an integer and prints two integers, root and pwr, such that 0 < pwr < 6 and root**pwr is equal to the integer entered by the user. If no such pair of integers exists, it should print a message to that effect.

```
Enter an integer: 1296
1296 = 6 ** 4
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < n; j++) {
                if (Math.pow(j, i) == n) {
                    System.out.println(n + " = " + j + " ** " + i);
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

Write a program that asks the user to enter a string. The program should create a new string made of every other character in the string. For example, if the user enters the string "abcdefg", the program should create the string "aceg".

```
Enter a string: abcdefg
aceg
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i += 2) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}
```

## 6.

Write a program that asks the user to enter a string. The program should create a new string made of the first and last characters of the string entered by the user. For example, if the user enters the string "abcdefg", the program should create the string "ag".

```
Enter a string: abcdefg
ag
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
    }
}
```

## 7.

Write a program that asks the user to enter a string. The program should print a message indicating whether the string entered by the user is a palindrome.

```
Enter a string: abba
abba is a palindrome
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
```

## 8.

Write a program that asks the user to enter a string. The program should print a message indicating whether the string entered by the user is a palindrome.

```
Enter a string: abba
abba is a palindrome
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
```

## 9.

Write a program that asks the user to enter a string. The program should print a message indicating whether the string entered by the user is a palindrome.

```
Enter a string: abba
abba is a palindrome
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
```

## 10.

Write a program that asks the user to enter a string. The
