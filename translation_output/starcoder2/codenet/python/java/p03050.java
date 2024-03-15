
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = (int)Math.sqrt(N);
        int[] plist = new int[n];
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (N % j == 0) {
                plist[i] = j;
                i++;
                if (j != N / j) {
                    plist[i] = N / j;
                    i++;
                }
            }
        }
        int ans = 0;
        for (int j = 0; j < i; j++) {
            int x = plist[j];
            int kari = N / x - 1;
            if (kari == 0) {
                continue;
            } else {
                int q = N / kari;
                int r = N % kari;
                if (q == r) {
                    ans += kari;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 10. 1000000007

### 10.1. Problem

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 10.2. Input

The input is given in the following format.

```
N
```

### 10.3. Output

Print the number of ways to write N as a sum of consecutive positive integers.

### 10.4. Constraints

* 1 ≤ N ≤ 10^18

### 10.5. Sample Input

```
10
```

### 10.6. Sample Output

```
1
```

### 10.7. Explanation

10 can be written as a sum of consecutive positive integers in the following ways.

* 10

### 10.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= N; i++) {
            long kari = N - (i * (i - 1)) / 2;
            if (kari % i == 0 && kari / i > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 11. 1000000007

### 11.1. Problem

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 11.2. Input

The input is given in the following format.

```
N
```

### 11.3. Output

Print the number of ways to write N as a sum of consecutive positive integers.

### 11.4. Constraints

* 1 ≤ N ≤ 10^18

### 11.5. Sample Input

```
10
```

### 11.6. Sample Output

```
1
```

### 11.7. Explanation

10 can be written as a sum of consecutive positive integers in the following ways.

* 10

### 11.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= N; i++) {
            long kari = N - (i * (i - 1)) / 2;
            if (kari % i == 0 && kari / i > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 12. 1000000007

### 12.1. Problem

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 12.2. Input

The input is given in the following format.

```
N
```

### 12.3. Output

Print the number of ways to write N as a sum of consecutive positive integers.

### 12.4. Constraints

* 1 ≤ N ≤ 10^18

### 12.5. Sample Input

```
10
```

### 12.6. Sample Output

```
1
```

### 12.7. Explanation

10 can be written as a sum of consecutive positive integers in the following ways.

* 10

### 12.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= N; i++) {
            long kari = N - (i * (i - 1)) / 2;
            if (kari % i == 0 && kari / i > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 13. 1000000007

### 13.1. Problem

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 13.2. Input

The input is given in the following format.

```
N
```

### 13.3. Output

Print the number of ways to write N as a sum of consecutive positive integers.

### 13.4. Constraints

* 1 ≤ N ≤ 10^18

### 13.5. Sample Input

```
10
```

### 13.6. Sample Output

```
1
```

### 13.7. Explanation

10 can be written as a sum of consecutive positive integers in the following ways.

* 10

### 13.8. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 0;
        for (long i = 1; i <= N; i++) {
            long kari = N - (i * (i - 1)) / 2;
            if (kari % i == 0 && kari / i > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

## 14. 1000000007

### 14.1. Problem

Given an integer N, find the number of ways to write N as a sum of consecutive positive integers.

### 14.2. Input

The input is given in the following format.

```
N
```

### 14.3. Output

Print the number of ways to write N as a sum of consecutive positive integers.

### 14.4. Constraints

* 1 ≤ N ≤ 10^18

### 14.5. Sample Input

```
10
```

### 14.6. Sample Output

```
1
```

### 1
