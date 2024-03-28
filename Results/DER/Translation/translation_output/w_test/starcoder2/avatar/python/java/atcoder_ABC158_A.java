

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "Yes";
        if (!s.contains("A") || !s.contains("B")) {
            result = "No";
        }
        System.out.println(result);
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
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                current = s.substring(i, i + 1);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.charAt(i);
                } else {
                    current = s.substring(i, i + 1);
                }
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```

## 4.

Write a program that asks the user to enter an integer and prints two integers, root and pwr, such that 0 < pwr < 6 and root**pwr is equal to the integer entered by the user. If no such pair of integers exists, it should print a message to that effect.

```
Enter an integer: 123
No such pair
```

```
Enter an integer: 64
4 3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 2; i < 6; i++) {
            for (int j = 2; j < 6; j++) {
                if (Math.pow(i, j) == n) {
                    System.out.println(i + " " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No such pair");
        }
    }
}
```

## 5.

Write a program that asks the user to enter a string. The program should create a new string made of every other character in the string. So if the input is:

```
H1e2l3l4o5w6o7r8l9d
```

then the output should be:

```
Helloworld
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

Write a program that asks the user to enter a string. The program should print a table of the letters of the alphabet in alphabetical order which occur in the string together with the number of times each letter occurs. For example, if the user enters the string:

```
ThiS is String with Upper and lower case Letters.
```

then the output should be:

```
a  5
c  1
d  1
e  5
g  1
h  2
i  4
l  2
n  2
o  1
p  2
r  4
s  5
t  5
u  1
w  2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(c + " " + count);
            }
        }
    }
}
```

## 7.

Write a program that asks the user to enter a string. The program should then print the string with all the uppercase letters converted to lowercase and all the lowercase letters converted to uppercase. For example if the user enters:

```
Hello World
```

then the output should be:

```
hELLO wORLD
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }
        System.out.println(result);
    }
}
```

## 8.

Write a program that asks the user to enter a string. The program should create a new string made of the first and last characters of the string entered by the user. If the length of the string is less than 2, the program should just print the string. For example, if the user enters:

```
Hello
```

then the output should be:

```
He
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() < 2) {
            System.out.println(s);
        } else {
            System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
        }
    }
}
```

## 9.

Write a program that asks the user to enter a string. The program should then print the string with the first and last characters exchanged. For example, if the user enters:

```
Hello
```

then the output should be:

```
oellH
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(s.length() - 1) + s.substring(1, s.length() - 1) + s.charAt(0));
    }
}
```

## 10.

Write a program that asks the user
