
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(1000 - n % 1000);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i * 2 + j * 4 == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```
/2020-09-21/README.md
# 2020-09-21

## 1. 1000번

### 문제

[1000번: A+B](https://www.acmicpc.net/problem/1000)

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 2. 1001번

### 문제

[1001번: A-B](https://www.acmicpc.net/problem/1001)

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a - b);
    }
}
```

## 3. 1002번

### 문제

[1002번: 터렛](https://www.acmicpc.net/problem/1002)

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int distance = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
            int sum = (r1 + r2) * (r1 + r2);
            int diff = (r1 - r2) * (r1 - r2);
            if (distance == 0) {
                if (r1 == r2) {
                    System.out.println(-1);
                } else {
                    System.out.println(0);
                }
            } else if (distance == sum || distance == diff) {
                System.out.println(1);
            } else if (distance > sum || distance < diff) {
                System.out.println(0);
            } else {
                System.out.println(2);
            }
        }
    }
}
```

## 4. 1003번

### 문제

[1003번: 피보나치 함수](https://www.acmicpc.net/problem/1003)

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] zero = new int[n + 1];
            int[] one = new int[n + 1];
            zero[0] = 1;
            one[0] = 0;
            zero[1] = 0;
            one[1] = 1;
            for (int j = 2; j <= n; j++) {
                zero[j] = zero[j - 1] + zero[j - 2];
                one[j] = one[j - 1] + one[j - 2];
            }
            System.out.println(zero[n] + " " + one[n]);
        }
    }
}
```

## 5. 1004번

### 문제

[1004번: 어린 왕자](https://www.acmicpc.net/problem/1004)

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            for (int j = 0; j < n; j++) {
                int cx = sc.nextInt();
                int cy = sc.nextInt();
                int r = sc.nextInt();
                int distance1 = (x1 - cx) * (x1 - cx) + (y1 - cy) * (y1 - cy);
                int distance2 = (x2 - cx) * (x2 - cx) + (y2 - cy) * (y2 - cy);
                if (distance1 < r * r && distance2 > r * r || distance1 > r * r && distance2 < r * r) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
```

## 6. 1005번

### 문제

[1005번: ACM Craft](https://www.acmicpc.net/problem/1005)

### 풀이

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] time = new int[n];
            for (int j = 0; j < n; j++) {
                time[j] = sc.nextInt();
            }
            List<Integer>[] list = new List[n];
            for (int j = 0; j < n; j++) {
                list[j] = new ArrayList<>();
            }
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                list[y].add(x);
            }
            int w = sc.nextInt() - 1;
            int[] dp = new int[n];
            for (int j = 0; j < n; j++) {
                dp[j] = time[j];
            }
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < list[j].size(); l++) {
                    dp[j] = Math.max(dp[j], dp[list[j].get(l)] + time[j]);
                }
            }
            System.out.println(dp[w]);
        }
    }
}
```

## 7. 1008번

### 문제

[1008번: A/B](https://www.acmicpc.net/problem/1008)

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[]
