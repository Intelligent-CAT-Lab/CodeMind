

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] memory = new int[10];
        for (int i = 0; i < 10; i++) {
            memory[i] = i * 10 + 30;
        }
        String r = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < memory[i]; j++) {
                r += "+";
            }
            r += ">";
        }
        r += "<".repeat(10);
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = (c - '0') / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r += ">".repeat(d);
            } else {
                r += "<".repeat(d);
            }
            point = n;
            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r += "+".repeat(l);
            } else {
                r += "-".repeat(l);
            }
            memory[point] = c;
            r += ".";
        }
        System.out.println(r);
    }
}
```

## 2.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ...

Test input:
5

Expected output:
2.283333333333333

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ...

Test input:
5

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ...

Test input:
5

Expected output:
2.283333333333333

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ...

Test input:
5

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ...

Test input:
5

Expected output:
2.283333333333333

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ...

Test input:
5

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2 + 1/3 + 1/4 + 1/5 + ...

Test input:
5

Expected output:
2.283333333333333

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to calculate the sum of the following series up to n terms:

1 + 1/2^2 + 1/3^2 + 1/4^2 + 1/5^2 + ...

Test input:
5

Expected output:
1.5497677311665408

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (
