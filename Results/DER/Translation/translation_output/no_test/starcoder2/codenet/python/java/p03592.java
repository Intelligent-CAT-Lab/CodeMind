
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        String ans = "No";
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int o = i * j + (m - j) * (n - i);
                int x = n * m - o;
                if (o == k || x == k) {
                    ans = "Yes";
                }
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

Write a program that asks the user to input 10 integers, and then prints the largest odd number that was entered. If no odd number was entered, it should print a message to that effect.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1 && n > max) {
                max = n;
            }
        }
        if (max == -1) {
            System.out.println("No odd number was entered");
        } else {
            System.out.println(max);
        }
    }
}
```

## 4.

Write a program that asks the user to enter a string. The program should create a new string made of every other character in the string. So if the input is:
```
Hfdjks
```

Then the output should be:
```
Hdj
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i += 2) {
            ans += s.charAt(i);
        }
        System.out.println(ans);
    }
}
```

## 5.

Write a program that asks the user to enter a string. The program should print a table of the letters of the alphabet in alphabetical order which occur in the string together with the number of times each letter occurs. For example, if the user enters the string:
```
ThiS is String with Upper and lower case Letters.
```

Then the output should be:
```
a  2
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
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) ('a' + i) + "  " + count[i]);
            }
        }
    }
}
```

## 6.

Write a program that asks the user to enter a string. The program should then print the most frequently occurring letter in the string and how many times it occurs. If there is more than one letter that occurs the most number of times, the program should print all such letters. For example, if the user enters the string:
```
ThiS is String with Upper and lower case Letters.
```

Then the output should be:
```
The most frequent letter is s
s occurs 5 times.
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                System.out.println("The most frequent letter is " + (char) ('a' + i));
            }
        }
        System.out.println((char) ('a' + i) + " occurs " + max + " times.");
    }
}
```


## 2.

Write a program that asks the user to enter a string. The program should then print the most frequently occurring letter in the string and how many times it occurs. If there is more than one letter that occurs the most number of times, the program should print all such letters. For example, if the user enters the string:
```
ThiS is String with Upper and lower case Letters.
```

Then the output should be:
```
The most frequent letter is s
s occurs 5 times.
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                count[c - 'A']++;
            }
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == max) {
                System.out.println("The most frequent letter is " + (char) ('a' + i));
            }
        }
        System.out.println((char) ('a' + i) + " occurs " + max + " times.");
    }
}
```

## 3.

Write a program that asks the user to enter a string. The program should then print the most frequently occurring letter in the string and how many
