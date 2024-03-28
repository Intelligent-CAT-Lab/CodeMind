

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a = 1, b = N / 2;
        int c = N / 2 + 1, d = N;
        if (N % 2 == 0) {
            a += 1;
        }
        int i = 0;
        while (i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i += 1;
                c += 1;
                d -= 1;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + " " + b);
                a += 1;
                b -= 1;
                i += 1;
            } else {
                break;
            }
        }
    }
}

```

## 2.

Write a program to find the sum of the following series:

1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 + 1/9 + 1/10 + 1/11 + 1/12 + 1/13 + 1/14 + 1/15 + 1/16 + 1/17 + 1/18 + 1/19 + 1/20

java code:

```
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}

```

## 3.

Write a program to find the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768 + 1/65536 + 1/131072 + 1/262144 + 1/524288

java code:

```
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 524288; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}

```

## 4.

Write a program to find the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768 + 1/65536 + 1/131072 + 1/262144 + 1/524288

java code:

```
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 524288; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}

```

## 5.

Write a program to find the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768 + 1/65536 + 1/131072 + 1/262144 + 1/524288

java code:

```
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 524288; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}

```

## 6.

Write a program to find the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768 + 1/65536 + 1/131072 + 1/262144 + 1/524288

java code:

```
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 524288; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}

```

## 7.

Write a program to find the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768 + 1/65536 + 1/131072 + 1/262144 + 1/524288

java code:

```
public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 524288; i *= 2) {
            sum += 1.0 / i;
        }
        System.out.println(sum);
    }
}

```

## 8.

Write a program to find the sum of the following series:

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 1/2048 + 1/4096 + 1/8192 + 1/16384 + 1/32768 + 1/65536 + 1/131072 + 1/262144 + 1/524288

java code:

```
public class Main {
