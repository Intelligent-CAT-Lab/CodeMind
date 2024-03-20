
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
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
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max - min);
    }
}
```

## 2.

Write a program that reads an integer N and a list of N integers. After that, the program should print the second largest value in the list, which is the largest value that is smaller than the maximum value.

```

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
        int secondMax = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                secondMax = max;
                max = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println(secondMax);
    }
}
```
/02-arrays/README.md
# Arrays

## 1.

Write a program that reads an integer N and a list of N integers. After that, the program should print the difference between the largest and smallest values in the list./01-introduction/README.md
# Introduction

## 1.

Write a program that reads an integer N and prints the sum of the integers from 1 to N.

```

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program that reads an integer N and prints the sum of the even integers from 1 to N.

```

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads an integer N and prints the sum of the odd integers from 1 to N.

```

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads an integer N and prints the sum of the multiples of 3 from 1 to N.

```

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads an integer N and prints the sum of the multiples of 4 from 1 to N.

```

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads an integer N and prints the sum of the multiples of 5 from 1 to N.

```

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that reads an integer N and prints the sum of the squares of the even integers from 1 to N.

```

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i * i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that reads an integer N and prints the sum of the squares of the
