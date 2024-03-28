
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("/");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        if (A <= 2018) {
            System.out.println("Heisei");
        } else if (A == 2019 && B <= 4 && C <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/README.md
# Java-Practice

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
Heisei


```
A,B,C = map(str,input().split("/"))
if int(A) <= 2018:
  print("Heisei")
elif int(A) == 2019 and int(B) <=4 and int(C)<=30:
  print("Heisei")
else:
  print("TBD")

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("/");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        if (A <= 2018) {
            System.out.println("Heisei");
        } else if (A == 2019 && B <= 4 && C <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

Test input:
abc hi ho hi

Expected output:
2

```java
