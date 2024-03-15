
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            System.exit(0);
        }
        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            if (s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2)) {
                System.out.println((i + 1) + " " + (i + 3));
                System.exit(0);
            }
        }
        System.out.println("-1 -1");
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String longest = "";
        String current = "";
        for (int i = 0; i < S.length(); i++) {
            if (current.length() == 0 || S.charAt(i) >= current.charAt(current.length() - 1)) {
                current += S.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + S.charAt(i);
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 4. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String longest = "";
        String current = "";
        for (int i = 0; i < S.length(); i++) {
            if (current.length() == 0 || S.charAt(i) >= current.charAt(current.length() - 1)) {
                current += S.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + S.charAt(i);
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 6. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String longest = "";
        String current = "";
        for (int i = 0; i < S.length(); i++) {
            if (current.length() == 0 || S.charAt(i) >= current.charAt(current.length() - 1)) {
                current += S.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + S.charAt(i);
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 8. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9. 
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String longest = "";
        String current = "";
        for (int i = 0; i < S.length(); i++) {
            if (current.length() == 0 || S.charAt(i) >= current.charAt(current.length() - 1)) {
                current += S.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + S.charAt(i);
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 10. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 2; i++) {
            if (S.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11. 
Write a program that reads a string and prints the longest
