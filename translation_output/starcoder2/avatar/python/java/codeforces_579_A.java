
```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x++;
            n -= Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}
```

## 2.

Write a program that reads a number n and prints the sum of the first n even numbers.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and prints the sum of the first n odd numbers.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i + 1;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 5.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 7.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 11.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 11 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 13.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 13 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 17.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 17 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 19.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 19 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 23.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 23 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 29.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 29 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 13.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 31.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 31 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 14.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 37.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 37 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 15.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 41.

```
import java.util.Scanner;

