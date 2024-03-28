
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        char[][] X = new char[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i < 50) {
                    X[i][j] = '.';
                } else {
                    X[i][j] = '#';
                }
            }
        }
        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2][j * 2] = '#';
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2][i * 2] = '#';
        }
        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2 + 51][j * 2] = '.';
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2 + 51][i * 2] = '.';
        }
        System.out.println("100 100");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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

## 4. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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

## 6. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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

## 8. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for
