
```java

```


```

java code:
```java

```
/java/001-hello-world/README.md
# Hello World

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Hello World

Expected output:
Hello World

```
print(input())/java/002-sum-of-two-numbers/README.md
# Sum of two numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
13

```
a,b = map(int,input().split())

print(a+b)

```

java code:
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

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a + b);
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int a = Integer.parseInt(inputArray[0]);
        int b = Integer.parseInt(inputArray[1]);
        System.out.println(a + b);
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int a = Integer.parseInt(inputArray[0]);
        int b = Integer.parseInt(inputArray[1]);
        System.out.println(a + b);
    }
}
```/java/003-round-a-number/README.md
# Round a number

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
1

```
a,b = map(int,input().split())

def round(a, b):
    if a * b < 0:
        return -(-a//b)
    else:
        return a//b

print(round(a, b))

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int a = Integer.parseInt(inputArray[0]);
        int b = Integer.parseInt(inputArray[1]);
        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        int a = Integer.parseInt(inputArray[0]);
        int b = Integer.parseInt(inputArray[1]);
        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```
/java/004-sum-of-array/README.md
# Sum of array

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
13

```
a,b = map(int,input().split())

print(a+b)

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.
