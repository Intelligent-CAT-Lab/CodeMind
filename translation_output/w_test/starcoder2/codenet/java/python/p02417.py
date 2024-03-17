

```python
import sys

res = [0] * 26

for line in sys.stdin:
    for c in line:
        if c.isalpha():
            res[ord(c.lower()) - ord('a')] += 1

for i in range(26):
    print(chr(i + ord('a')) + ' : ' + str(res[i]))
```

## 2.4.18

Write a program that reads a list of words from the standard input and prints all words that have exactly 3 consonants. Use the following functions:

```
public static boolean isVowel(char c)
public static boolean isConsonant(char c)
```

```java
import java.util.*;

public class p02418 {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String str = cin.next();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (isConsonant(str.charAt(i))) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println(str);
            }
        }
    }

}
```

## 2.4.19

Write a program that reads a list of words from the standard input and prints all words that have exactly 3 consonants. Use the following functions:

```
public static boolean isVowel(char c)
public static boolean isConsonant(char c)
```

```java
import java.util.*;

public class p02419 {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String str = cin.next();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (isConsonant(str.charAt(i))) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println(str);
            }
        }
    }

}
```

## 2.4.20

Write a program that reads a list of words from the standard input and prints all words that have exactly 3 consonants. Use the following functions:

```
public static boolean isVowel(char c)
public static boolean isConsonant(char c)
```

```java
import java.util.*;

public class p02420 {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String str = cin.next();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (isConsonant(str.charAt(i))) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println(str);
            }
        }
    }

}
```

## 2.4.21

Write a program that reads a list of words from the standard input and prints all words that have exactly 3 consonants. Use the following functions:

```
public static boolean isVowel(char c)
public static boolean isConsonant(char c)
```

```java
import java.util.*;

public class p02421 {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String str = cin.next();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (isConsonant(str.charAt(i))) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println(str);
            }
        }
    }

}
```

## 2.4.22

Write a program that reads a list of words from the standard input and prints all words that have exactly 3 consonants. Use the following functions:

```
public static boolean isVowel(char c)
public static boolean isConsonant(char c)
```

```java
import java.util.*;

public class p02422 {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String str = cin.next();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (isConsonant(str.charAt(i))) {
                    count++;
                }
            }
            if (count == 3) {
                System.out.println(str);
            }
        }
    }

}
```

## 2.4.23

Write a program that reads a list of words from the standard input and prints all words that have exactly 3 consonants. Use the following functions:

```
public static boolean isVowel(char c)
public static boolean isConsonant(char c)
```

```java
import java.util.*;

public class p02423 {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            String str = cin.next();
            int count = 0;
            for (int
