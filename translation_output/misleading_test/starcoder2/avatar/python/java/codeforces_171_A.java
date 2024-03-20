

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int b1 = Integer.parseInt(new StringBuilder(b).reverse().toString());
        System.out.println(Integer.parseInt(a) + b1);
    }
}
```

## 2.

Write a program to find the sum of the digits of a number.

```
Input:
12345

Output:
15
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

Write a program to find the sum of the digits of a number.

```
Input:
12345

Output:
15
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

Write a program to find the sum of the digits of a number.

```
Input:
12345

Output:
15
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
/README.md
# Java-Assignment-1

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600307

```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int b1 = Integer.parseInt(new StringBuilder(b).reverse().toString());
        System.out.println(Integer.parseInt(a) + b1);
    }
}
```

## 2.

Write a program to find the sum of the digits of a number.

```
Input:
12345

Output:
15
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

Write a program to find the sum of the digits of a number.

```
Input:
12345

Output:
15
