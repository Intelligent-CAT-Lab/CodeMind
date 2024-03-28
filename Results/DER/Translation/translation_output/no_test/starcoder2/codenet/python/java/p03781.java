
```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            int a = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println(a);
        } else {
            int x1 = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println(x1 + 1);
        }
    }
}
```

## 2.

Write a program that reads a number n and prints the sum of the first n even positive integers.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and prints the sum of the first n odd positive integers.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number n and prints the sum of the first n prime numbers.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
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

Write a program that reads a number n and prints the sum of the first n Fibonacci numbers.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            sum += a;
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a number n and prints the sum of the first n factorials.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that reads a number n and prints the sum of the first n powers of 2.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < n; i++) {
            sum += pow;
            pow *= 2;
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that reads a number n and prints the sum of the first n powers of 3.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < n; i++) {
            sum += pow;
            pow *= 3;
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that reads a number n and prints the sum of the first n powers of 4.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < n; i++) {
            sum += pow;
            pow *= 4;
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that reads a number n and prints the sum of the first n powers of 5.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < n; i++) {
            sum += pow;
            pow *= 5;
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that reads a number n and prints the sum of the first n powers of 6.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < n; i++) {
            sum += pow;
            pow *= 6;
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that reads a number n and prints the sum of the first n powers of 7.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < n; i++) {
            sum += pow;
            pow *= 7;
        }
        System.out.println(sum);
    }
}
```

## 13.

Write a program that reads a number n and prints the sum of the first n powers of 8.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pow = 1;
        for (int i = 0; i < n; i++) {
            sum += pow;
            pow *= 8;
        }
        System.out.println(sum);
    }
}
```

## 14.

Write a program that reads a number n and prints the sum of the first n powers of 9.

```
import java.util.Scanner;

public class
