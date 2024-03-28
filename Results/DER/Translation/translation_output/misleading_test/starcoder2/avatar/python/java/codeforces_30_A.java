

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        if (a != 0) {
            if (b % a != 0) {
                System.out.println("No solution");
            } else {
                b = b / a;
                int x = 0;
                int y = -2000;
                if (b >= 0) {
                    while (y < b) {
                        y = (int) Math.pow(x, n);
                        x++;
                    }
                    if (y > b) {
                        System.out.println("No solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (n % 2 == 0) {
                        System.out.println("No solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > b) {
                            y = (int) Math.pow(x, n);
                            x--;
                        }
                        if (y < b) {
                            System.out.println("No solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No solution");
            }
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

Then your program should print:

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
            if (n % 2 != 0 && n > max) {
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
H1e2l3l4o5w6o7r8l9d
```

Then the output should be:

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

## 5.

Write a program that asks the user to enter a string. The program should print a table of the letters of the alphabet in alphabetical order which occur in the string together with the number of times each letter occurs. For example, if the user enters the string:

```
ThiS is String with Upper and lower case Letters.
```

Then the output should be:

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
                System.out.println((char) ('a' + i) + " " + count[i]);
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
The most frequent letter is s.
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
                System.out.print((char) ('a' + i) + " ");
            }
        }
        System.out.println("is the most frequent letter.");
    }
}
```

## 7.

Write a program
