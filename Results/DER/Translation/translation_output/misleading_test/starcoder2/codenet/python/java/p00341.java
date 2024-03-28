

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        String[] b = sc.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            a[Integer.parseInt(b[i]) - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] != 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}
```

## 2.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 + 1/9 + 1/10

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 512; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 1024; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 2048; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 4096; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 8192; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 16384; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 32768; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768 + 1/65536

```java
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 65536; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program to calculate the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 +
