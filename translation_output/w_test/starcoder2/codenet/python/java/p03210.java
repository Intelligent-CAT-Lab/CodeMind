

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String ans;
        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program that reads a string and prints the string with all "r" removed.

Test input:

```
Hello, world!
```

Expected output:

```
Hell, world!
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.replaceAll("r", ""));
    }
}
```

## 3.

Write a program that reads a string and prints the number of times the string "abc" appears in the string.

Test input:

```
abcabc
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
        String s = sc.next();
        System.out.println(s.split("abc").length - 1);
    }
}
```

## 4.

Write a program that reads a string and prints the string with all "x" removed.

Test input:

```
xoxo
```

Expected output:

```
oo
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.replaceAll("x", ""));
    }
}
```

## 5.

Write a program that reads a string and prints the string with all "ch" removed.

Test input:

```
chachacha
```

Expected output:

```
aaaa
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.replaceAll("ch", ""));
    }
}
```

## 6.

Write a program that reads a string and prints the string with all "o" removed.

Test input:

```
oxoxoxox
```

Expected output:

```
xxxx
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.replaceAll("o", ""));
    }
}
```
/01_Introduction/01_Introduction.md
# Introduction

## 1.

Write a program that reads an integer and prints the integer with the number 1 added.

Test input:

```
41
```

Expected output:

```
42
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x + 1);
    }
}
```

## 2.

Write a program that reads an integer and prints the integer with the number 1 subtracted.

Test input:

```
41
```

Expected output:

```
40
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x - 1);
    }
}
```

## 3.

Write a program that reads an integer and prints the integer with the number 1 multiplied.

Test input:

```
41
```

Expected output:

```
410
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x * 10);
    }
}
```

## 4.

Write a program that reads an integer and prints the integer with the number 1 divided.

Test input:

```
41
```

Expected output:

```
4
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x / 10);
    }
}
```

## 5.

Write a program that reads an integer and prints the integer with the number 1 added, subtracted, multiplied, and divided.

Test input:

```
41
```

Expected output:

```
42
40
410
4
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x + 1);
        System.out.println(x - 1);
        System.out.println(x * 10);
        System.out.println(x / 10);
    }
}
```

## 6.

Write a program that reads two integers and prints the two integers with the number 1 added, subtracted, multiplied, and divided.

Test input:

```
41
41
```

Expected output:

```
42
40
410
4
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + 1);
        System.out.println(x - 1);
        System.out.println(x * 10);
        System.out.println(x / 10);
        System.out.println(y + 1);
        System.out.println(y - 1);
        System.out.println(y * 10);
        System.out.println(y / 10);
    }
}
```

## 7.

Write a program that reads two integers and prints the sum of the two integers.

Test input:

```
41
41
```

Expected output:

```
82
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x + y);
    }
}
```

## 8.

Write a program that reads two integers and prints the difference of the two integers.

Test input:

```
41
41
```

Expected output:

```
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x - y);
    }
}
```

## 9.

Write a program that reads two integers and prints the product of the two integers.

Test input:

