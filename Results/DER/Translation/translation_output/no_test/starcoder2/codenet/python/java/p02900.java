
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A, B);
        List<Integer> prime_factor = prime_factorize(gcd);
        int ans = prime_factor.size();
        for (int i = 0; i < (1 << prime_factor.size()); i++) {
            int i_temp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (i_temp != 0) {
                if (i_temp % 2 == 0) {
                    ;
                } else if (i_temp % 2 == 1) {
                    composite *= prime_factor.get(j);
                    count++;
                }
                j++;
                i_temp /= 2;
            }
            for (int j_temp : prime_factor) {
                if (j_temp == composite && count >= 2) {
                    ans--;
                }
            }
        }
        System.out.println(ans + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static List<Integer> prime_factorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}
```

## 10. 1000000007

### 10.1. Problem

[https://atcoder.jp/contests/abc173/tasks/abc173_e](https://atcoder.jp/contests/abc173/tasks/abc173_e)

### 10.2. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        long ans = 1;
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] < 0) {
                count++;
            } else {
                break;
            }
        }
        if (count % 2 == 0) {
            for (int i = 0; i < K; i++) {
                ans = (ans * A[i]) % 1000000007;
            }
        } else {
            if (K % 2 == 0) {
                for (int i = 0; i < K; i++) {
                    ans = (ans * A[i]) % 1000000007;
                }
            } else {
                long max = 0;
                for (int i = 0; i < N; i++) {
                    if (A[i] > max) {
                        max = A[i];
                    }
                }
                long min = 1000000000000000000L;
                for (int i = 0; i < N; i++) {
                    if (A[i] < min && A[i] > 0) {
                        min = A[i];
                    }
                }
                if (max * min > 0) {
                    ans = (max * min) % 1000000007;
                } else {
                    for (int i = 0; i < K - 1; i++) {
                        ans = (ans * A[i]) % 1000000007;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 11. 1000000007

### 11.1. Problem

[https://atcoder.jp/contests/abc173/tasks/abc173_f](https://atcoder.jp/contests/abc173/tasks/abc173_f)

### 11.2. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            p[i] = sc.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            ans += N - p[i];
        }
        System.out.println(ans);
    }
}
```

## 12. 1000000007

### 12.1. Problem

[https://atcoder.jp/contests/abc173/tasks/abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)

### 12.2. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        long ans = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (i == N - 1) {
                ans += A[i];
            } else if (i == N - 2) {
                ans += A[i];
            } else {
                ans += A[i] * 2;
            }
        }
        System.out.println(ans);
    }
}
```

## 13. 1000000007

### 13.1. Problem

[https://atcoder.jp/contests/abc173/tasks/abc173_c](https://atcoder.jp/contests/abc173/tasks/abc173_c)

### 13.2. Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int K = sc.nextInt();
        char[][] A = new char[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j
