
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'x') {
                a++;
            }
        }
        System.out.println(a <= 7 ? "YES" : "NO");
    }
}
```

## 2.

Write a program that takes a string as input and prints the number of vowels in the string.

```
Sample input:
hello

Sample output:
2
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 3.

Write a program that takes a string as input and prints the number of consonants in the string.

```
Sample input:
hello

Sample output:
3
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != 'a' && x.charAt(i) != 'e' && x.charAt(i) != 'i' && x.charAt(i) != 'o' && x.charAt(i) != 'u') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 4.

Write a program that takes a string as input and prints the number of digits in the string.

```
Sample input:
hello123

Sample output:
3
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= '0' && x.charAt(i) <= '9') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 5.

Write a program that takes a string as input and prints the number of uppercase letters in the string.

```
Sample input:
Hello

Sample output:
1
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 6.

Write a program that takes a string as input and prints the number of lowercase letters in the string.

```
Sample input:
Hello

Sample output:
4
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 7.

Write a program that takes a string as input and prints the number of special characters in the string.

```
Sample input:
Hello!

Sample output:
1
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) < '0' || (x.charAt(i) > '9' && x.charAt(i) < 'A') || (x.charAt(i) > 'Z' && x.charAt(i) < 'a') || x.charAt(i) > 'z') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 8.

Write a program that takes a string as input and prints the number of words in the string.

```
Sample input:
Hello world

Sample output:
2
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 9.

Write a program that takes a string as input and prints the number of sentences in the string.

```
Sample input:
Hello world. How are you?

Sample output:
2
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '.' || x.charAt(i) == '?' || x.charAt(i) == '!') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```

## 10.

Write a program that takes a string as input and prints the number of paragraphs in the string.

```
Sample input:
Hello world.
How are you?

Sample output:
2
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int a = 1;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '\n') {
                a++;
            }
        }
        System.out.println(a);
    }
}
```


```
Sample input:
10

Sample output:
10
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
    }
}
```

## 2.

Write a program that takes a number as input and prints the square of the number.

```
Sample input:
10

Sample output:
100
```

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x * x);
    }
}
```

## 3.

Write a program that takes a number as input and prints the cube of the number.

```
Sample input:
10

Sample output:

