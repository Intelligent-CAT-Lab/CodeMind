
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "is" appears anywhere in the given string.

Test input:

This is a test string

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 2).equals("is")) {
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

ABChi hi

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4. 
Write a program that reads a string and prints the number of times that the string "xyz" appears anywhere in the given string.

Test input:

abcxyz

Expected output:

1

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("xyz")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5. 
Write a program that reads a string and prints the number of times that the string "9" appears anywhere in the given string.

Test input:

abc9999

Expected output:

4

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '9') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6. 
Write a program that reads a string and prints the number of times that the string "cat" appears anywhere in the given string.

Test input:

catcat

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("cat")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7. 
Write a program that reads a string and prints the number of times that the string "dog" appears anywhere in the given string.

Test input:

catdog

Expected output:

1

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("dog")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 8. 
Write a program that reads a string and prints the number of times that the string "not" appears anywhere in the given string.

Test input:

This is not a test

Expected output:

1

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("not")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9. 
Write a program that reads a string and prints the number of times that the string "is" appears anywhere in the given string.

Test input:

This is a test string

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 2).equals("is")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 10. 
Write a program that reads a string and prints the number of times that the string "an" appears anywhere in the given string.

Test input:

banana

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i, i + 2).equals("an")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11. 
Write a program that reads a string and prints the number of times that the string "zoo" appears anywhere in the given string.

Test input:

zoozoo

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("zoo")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 12. 
Write a program that reads a string and prints the number of times that the string "co" appears anywhere in the given string.

Test input:

coco

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i, i + 2).equals("co")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 13. 
Write a program that reads a string and prints the number of times
