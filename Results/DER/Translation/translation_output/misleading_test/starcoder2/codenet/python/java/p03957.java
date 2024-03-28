
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss = "";
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println(p == 2 ? "Yes" : "No");
    }
}
```

## 2. 1000

Write a program that reads an integer and displays the result of dividing it by 1000.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n / 1000);
    }
}
```

## 3. 1001

Write a program that reads an integer and displays the result of subtracting 1 from it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n - 1);
    }
}
```

## 4. 1002

Write a program that reads two integers and displays the result of adding them.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 5. 1003

Write a program that reads two integers and displays the result of subtracting the second integer from the first integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

## 6. 1004

Write a program that reads two integers and displays the result of multiplying them.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
    }
}
```

## 7. 1005

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
    }
}
```

## 8. 1006

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a % b);
    }
}
```

## 9. 1007

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
```

## 10. 1008

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(a / b);
    }
}
```

## 11. 1009

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
    }
}
```

## 12. 1010

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
    }
}
```

## 13. 1011

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}
```

## 14. 1012

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(a);
    }
}
```

## 15. 1013

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(b + " " + a);
    }
}
```

## 16. 1014

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(b + " " + a);
    }
}
```

## 17. 1015

Write a program that reads two integers and displays the result of dividing the first integer by the second integer.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.printf("%.2f", a / b);
    }
}
```

## 18. 1016

Write a program that reads
