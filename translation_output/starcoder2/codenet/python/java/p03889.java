
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == 'p') {
                c = 'q';
            } else if (c == 'q') {
                c = 'p';
            } else if (c == 'b') {
                c = 'd';
            } else if (c == 'd') {
                c = 'b';
            }
            t += c;
        }
        String ans = "Yes";
        if (!s.equals(t)) {
            ans = "No";
        }
        System.out.println(ans);
    }
}
```

## 2.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Example:
```
Input:
bobbobbob

Output:
3
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
Write a program that reads a string and prints the longest substring of the string in which the letters occur in alphabetical order.

Example:
```
Input:
azcbobobegghakl

Output:
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
            char c = s.charAt(i);
            if (current.length() == 0 || c >= current.charAt(current.length() - 1)) {
                current += c;
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + c;
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 2.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 3.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 4.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 5.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 6.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 7.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 8.
Write a program that asks the user to enter a number and prints the sum of the digits of that number.

Example:
```
Input:
1234

Output:
10
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 9.
Write a program that asks the user to enter a number and prints the sum of the digits of that number
