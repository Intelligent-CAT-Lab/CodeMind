
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int h = 1; h < 3501; h++) {
            for (int n = h; n < 3501; n++) {
                if (4 * n * h - N * h - N * n > 0) {
                    if ((N * h * n) % (4 * n * h - N * h - N * n) == 0) {
                        int w = (N * h * n) / (4 * n * h - N * h - N * n);
                        System.out.println(h + " " + n + " " + w);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
```

## 2.

Write a program that reads a number N and prints the sum of the first N even numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number N and prints the sum of the first N odd numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += 2 * i + 1;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number N and prints the sum of the first N prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < N) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a number N and prints the sum of the first N square numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (i + 1) * (i + 1);
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a number N and prints the sum of the first N triangular numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (i + 1) * (i + 2) / 2;
        }
        System.out.println(sum);
    }
}
```
/docs/01-introduction/01-introduction.md
# Introduction

## 1.

Write a program that reads a number N and prints the sum of the first N numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program that reads a number N and prints the sum of the first N even numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number N and prints the sum of the first N odd numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += 2 * i + 1;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number N and prints the sum of the first N prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < N) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a number N and prints the sum of the first N square numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (i + 1) * (i + 1);
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a number N and prints the sum of the first N triangular numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (i + 1) * (i + 2) / 2;
        }
        System.out.println(sum);
    }
}
```


## 1.

Write a program that reads a number N and prints the sum of the first N numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program that reads a number N and prints the sum of the first N even numbers
