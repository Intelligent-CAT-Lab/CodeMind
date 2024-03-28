
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a_index = 0;
        int z_index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a_index = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                z_index = i;
                break;
            }
        }
        System.out.println(z_index - a_index + 1);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

bobbobbobbob

Expected output:

4

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


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program that reads an array of integers and prints the number of times that the value 9 appears in the array.

Test input:

10

1 2 3 4 5 6 7 8 9 9

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads an array of integers and prints the number of times that the value 9 appears in the array.

Test input:

10

1 2 3 4 5 6 7 8 9 9

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
# Arrays

## 1.

Write a program that reads an array of integers and prints the maximum value in the array.

Test input:

10

1 2 3 4 5 6 7 8 9 10

Expected output:

10

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program that reads an array of integers and prints the number of times that the value 9 appears in the array.

Test input:

10

1 2 3 4 5 6 7 8 9 9

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads an array of integers and prints the number of times that the value 9 appears in the array.

Test input:

10

1 2 3 4 5 6 7 8 9 9

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads an array of integers and prints the number of times that the value 9 appears in the array.

Test input:

10

1 2 3 4 5 6 7 8 9 9

Expected output:

2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads an array of integers and prints the number of times that the value 9 appears in the array.

Test input:

10

1 2 3 4 5 6 7 8 9 9

Expected output:

2# Loops

## 1.

Write a program that reads an integer and prints the sum of all
