
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 1;
        int x = a;
        while (x * 2 <= b) {
            x = x * 2;
            count++;
        }
        System.out.println(count);
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
        System.out.println(longest);
    }
}
```

## 4.

Write a program that prints the number of times the string 'bob' occurs in s.

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

## 5.

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
        System.out.println(longest);
    }
}
```

## 6.

Write a program that prints the number of times the string 'bob' occurs in s.

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

## 7.

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
        System.out.println(longest);
    }
}
```

## 8.

Write a program that prints the number of times the string 'bob' occurs in s.

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

## 9.

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
        System.out.println(longest);
    }
}
```

## 10.

Write a program that prints the number of times the string 'bob' occurs in s.

Test input:

```
azcbobobegghakl
```

Expected output:
