
```java
import java.util.*;

public class seishin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        if (K % 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(K / 2 + " ");
            }
        } else {
            int[] X = new int[N];
            Arrays.fill(X, (K + 1) / 2);
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    X = Arrays.copyOfRange(X, 0, N - 1);
                } else {
                    X[N - 1] -= 1;
                    X = Arrays.copyOf(X, N);
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```java
import java.util.*;

public class bob {
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
Write a program that prints the longest substring of a string in which the letters occur in alphabetical order.

```java
import java.util.*;

public class alphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                current = s.charAt(i) + "";
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println(longest);
    }
}
```
/2019/2019-03-20.md
# 2019-03-20

## 1. 
Write a program that asks the user to enter a string and prints out whether this string is a palindrome or not.

```java
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
```

## 2. 
Write a program that asks the user to enter a string and prints out how many of the characters in the string are vowels.

```java
import java.util.*;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3. 
Write a program that asks the user to enter a string and prints out the string with the characters reversed.

```java
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        System.out.println(reversed);
    }
}
```
  }
        System.out.println(count);
    }
}
```
/2019/2019-03-27.md
# 2019-03-27

## 1. 
Write a program that asks the user to enter a string and prints out the number of times that the string "bob" occurs in the string.

```java
import java.util.*;

public class bob {
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

## 2. 
Write a program that asks the user to enter a string and prints out the longest substring of a string in which the letters occur in alphabetical order.

```java
import java.util.*;

public class alphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) >= s.charAt(i - 1)) {
                current += s.charAt(i);
            } else {
                current = s.charAt(i) + "";
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println(longest);
    }
}
```

## 3. 
Write a program that asks the user to enter a string and prints out how many of the characters in the string are vowels.

```java
import java.util.*;

public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4. 
Write a program that asks the user to enter a string and prints out whether this string is a palindrome or not.

```java
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
  /2019/2019-03-13.md
# 2019-03-13

## 1.
