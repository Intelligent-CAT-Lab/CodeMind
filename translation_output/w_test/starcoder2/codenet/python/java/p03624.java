

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s2 = s.toCharArray();
        Set<Character> s3 = new HashSet<Character>();
        for (int i = 0; i < s2.length; i++) {
            s3.add(s2[i]);
        }
        char[] s4 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        if (s3.size() == 26) {
            System.out.println("None");
        } else {
            int i = 0;
            for (char c : s3) {
                if (c != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s3.size()-1) {
                    System.out.println(s4[i+1]);
                }
                i++;
            }
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

For example, if the string is "azcbobobegghakl", then your program should print:

Number of times bob occurs is: 2

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length()-2; i++) {
            if (s.substring(i, i+3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```
/2019/2019-03-20.md
# 2019-03-20

## 1.

Write a program that asks the user to enter a string. The program should create a new string made of every other character in the string.

For example, if the user enters "abcdefg", the program should create the string "aceg".

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
```

## 2.

Write a program that asks the user to enter a string. The program should then print the string with all the vowels removed.

For example, if the user enters "Hello World", the program should print "Hll Wrld".

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
```
/2019/2019-03-27.md
# 2019-03-27

## 1.

Write a program that asks the user to enter a string. The program should then print the string with all the vowels removed.

For example, if the user enters "Hello World", the program should print "Hll Wrld".

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
```

## 2.

Write a program that asks the user to enter a string. The program should then print the string with all the vowels removed.

For example, if the user enters "Hello World", the program should print "Hll Wrld".

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
```
/2019/2019-03-13.md
# 2019-03-13

## 1.

Write a program that asks the user to enter a string. The program should then print the string with all the vowels removed.

For example, if the user enters "Hello World", the program should print "Hll Wrld".

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
```

## 2.

Write a program that asks the user to enter a string. The program should then print the string with all the vowels removed.

For example, if the user enters "Hello World", the program should print "Hll Wrld".

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                s2 += s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
```
