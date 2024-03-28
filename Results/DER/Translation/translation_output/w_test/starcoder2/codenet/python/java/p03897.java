

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = 0;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 2 == 1) {
                ans[i][0] = 1;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 6 == 1) {
                for (int j = 2; j < n; j++) {
                    if (j % 2 == 0) {
                        ans[i][j] = 1;
                    }
                }
            }
            if (i % 6 == 4) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 1) {
                        ans[i][j] = 1;
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if ((n - 1 + j) % 2 == 1) {
                ans[n - 1][j] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
```

## 2.

Write a program to find the sum of the following series:

1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 + 1/9 + 1/10 + 1/11 + 1/12 + 1/13 + 1/14 + 1/15 + 1/16 + 1/17 + 1/18 + 1/19 + 1/20

Enclose your solution inside ```java```.

java code:

```java
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

Enclose your solution inside ```java```.

java code:

```java
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

Enclose your solution inside ```java```.

java code:

```java
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

Enclose your solution inside ```java```.

java code:

```java
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

Enclose your solution inside ```java```.

java code:

```java
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

1 + 1/2 + 1/4 + 1/8 + 1/16 + 1/32 + 1/64 + 1/128 + 1/256 + 1/512 + 1/1024 + 
